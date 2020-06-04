package com.music.artists.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.music.artists.dto.FetchArtistsReponseDto;
import com.music.artists.dto.StoreArtistsRequestDto;
import com.music.artists.dto.StoreArtistsResponseDto;
import com.music.artists.entity.Artists;
import com.music.artists.exception.CommonException;
import com.music.artists.repo.ArtistsRepository;
import com.music.artists.service.ArtistsService;
import com.music.artists.service.MessageByLocaleService;

@Service
public class ArtistsImpl implements ArtistsService {

	@Autowired
	ArtistsRepository artistRepo;

	@Autowired
	MessageByLocaleService localResolver;

	@Override
	public StoreArtistsResponseDto storeArtistsDetails(StoreArtistsRequestDto artists) {
		StoreArtistsResponseDto response = null;
		Artists artistsEntity = new Artists().setArtistName(artists.getArtistName());
		artistRepo.save(artistsEntity);
		response = (StoreArtistsResponseDto) new StoreArtistsResponseDto()
				.setArtistID(artistsEntity.getArtistID())
				.setArtistName(artistsEntity.getArtistName())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}

	@Override
	public StoreArtistsResponseDto updateArtistsDetails(StoreArtistsRequestDto artists,int artistID) {
		StoreArtistsResponseDto response = null;
		Artists artistsEntity = artistRepo.findByArtistID(artistID);
		if(artistsEntity == null){
			throw new CommonException(-1, "NORECF", localResolver.getErrorMessage("NORECF"));
		}
		artistsEntity.setArtistName(artists.getArtistName());
		artistRepo.save(artistsEntity);
		response = (StoreArtistsResponseDto) new StoreArtistsResponseDto()
				.setArtistID(artistsEntity.getArtistID())
				.setArtistName(artistsEntity.getArtistName())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));

		return response;
	}

	@Override
	public FetchArtistsReponseDto fetchArtists() {
		FetchArtistsReponseDto response = null;
		if(artistRepo.count()==0){
			throw new CommonException(-1, "NORECF", localResolver.getErrorMessage("NORECF"));
		}
		List<Artists> artists = artistRepo.findAll();
		response = (FetchArtistsReponseDto) new FetchArtistsReponseDto()
				.setArtists(artists)
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}
	@Override
	public FetchArtistsReponseDto fetchArtists(String artistName) {
		FetchArtistsReponseDto response = null;
		if(artistRepo.count()==0){
			throw new CommonException(-1, "NORECF", localResolver.getErrorMessage("NORECF"));
		}
		List<Artists> artists = artistRepo.findByArtistNameContains(artistName);
		response = (FetchArtistsReponseDto) new FetchArtistsReponseDto()
				.setArtists(artists)
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}
	@Override
	public FetchArtistsReponseDto fetchArtists(int pageIndex,int elementsPerPage) {
		FetchArtistsReponseDto response = null;
		if(artistRepo.count()==0){
			throw new CommonException(-1, "NORECF", localResolver.getErrorMessage("NORECF"));
		}
		Page<Artists> artists = artistRepo.findAll(PageRequest.of(pageIndex, elementsPerPage));
		response = (FetchArtistsReponseDto) new FetchArtistsReponseDto()
				.setArtists(artists.getContent())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}
	@Override
	public FetchArtistsReponseDto fetchArtists(int pageIndex,int elementsPerPage,String order) {
		FetchArtistsReponseDto response = null;
		if(artistRepo.count()==0){
			throw new CommonException(-1, "NORECF", localResolver.getErrorMessage("NORECF"));
		}
		Page<Artists> artists = artistRepo.findAll(PageRequest.of(pageIndex, elementsPerPage, 
				order.equals("asc") ? Sort.by("artistName").ascending() : Sort.by("artistName").descending()));
		response = (FetchArtistsReponseDto) new FetchArtistsReponseDto()
				.setArtists(artists.getContent())
				.setResponseCode(0)
				.setErrorCode("000")
				.setErrorDesc(localResolver.getErrorMessage("000"));
		return response;
	}
}