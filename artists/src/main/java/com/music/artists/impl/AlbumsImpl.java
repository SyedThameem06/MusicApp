package com.music.artists.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.artists.dto.FetchAlbumsResponseDto;
import com.music.artists.dto.StoreAlbumRequestDto;
import com.music.artists.dto.StoreAlbumResponseDto;
import com.music.artists.entity.Albums;
import com.music.artists.entity.Artists;
import com.music.artists.exception.CommonException;
import com.music.artists.repo.AlbumRepository;
import com.music.artists.repo.ArtistsRepository;
import com.music.artists.service.AlbumsService;
import com.music.artists.service.MessageByLocaleService;

@Service
public class AlbumsImpl implements AlbumsService {

	@Autowired
	ArtistsRepository artistRepo;

	@Autowired
	AlbumRepository albumRepo;

	@Autowired
	MessageByLocaleService localResolver;

	@Override
	public StoreAlbumResponseDto storeAlbums(StoreAlbumRequestDto request, int artistId) {
		StoreAlbumResponseDto response = null;
		Artists artistEntity = artistRepo.findByArtistID(artistId);

		if(artistEntity == null) {
			throw new CommonException(-1, "ARTNOF", localResolver.getErrorMessage("ARTNOF"));
		}

		Albums albumEntity = new Albums();
		List<Albums> albumList = new ArrayList<Albums>();

		albumEntity.setTitle(request.getTitle());
		albumEntity.setYearOfRelease(request.getYearOfRelease());
		albumEntity.setGenres(request.getGenres());
		albumEntity.setArtists(artistEntity);
		albumList.add(albumEntity);
		artistEntity.setAlbums(albumList);
		artistRepo.save(artistEntity);

		response = (StoreAlbumResponseDto) new StoreAlbumResponseDto()
				.setTitle(request.getTitle())
				.setYearOfRelease(request.getYearOfRelease())
				.setGenres(request.getGenres())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));

		return response;
	}

	@Override
	public StoreAlbumResponseDto updateAlbums(StoreAlbumRequestDto request, int artistId,int albumId) {
		StoreAlbumResponseDto response = null;
		Artists artistEntity = artistRepo.findByArtistID(artistId);
		Albums albumEntity = albumRepo.findByAlbumID(albumId);

		if(artistEntity == null || albumEntity == null){
			throw new CommonException(-1, "ARTNOF", localResolver.getErrorMessage("ARTNOF"));
		}

		albumEntity.setTitle(request.getTitle());
		albumEntity.setYearOfRelease(request.getYearOfRelease());
		albumEntity.setGenres(request.getGenres());
		albumEntity.setArtists(artistEntity);
		albumRepo.save(albumEntity);

		response = (StoreAlbumResponseDto) new StoreAlbumResponseDto()
				.setTitle(request.getTitle())
				.setYearOfRelease(request.getYearOfRelease())
				.setGenres(request.getGenres())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}

	@Override
	public FetchAlbumsResponseDto fetchAlbums(int artistId) {
		FetchAlbumsResponseDto response = null;
		Artists artistEntity = artistRepo.findByArtistID(artistId);
		if(artistEntity == null) {
			throw new CommonException(-1, "ARTNOF", localResolver.getErrorMessage("ARTNOF"));
		}
		response = (FetchAlbumsResponseDto) new FetchAlbumsResponseDto()
				.setArtistID(artistEntity.getArtistID())
				.setArtistName(artistEntity.getArtistName())
				.setAlbums(artistEntity.getAlbums())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}

}