package com.music.artists.service;

import com.music.artists.dto.StoreArtistsResponseDto;

import com.music.artists.dto.FetchArtistsReponseDto;
import com.music.artists.dto.StoreArtistsRequestDto;

public interface ArtistsService {
	public StoreArtistsResponseDto storeArtistsDetails(StoreArtistsRequestDto artists);
	public StoreArtistsResponseDto updateArtistsDetails(StoreArtistsRequestDto artists,int artistID);
	public FetchArtistsReponseDto fetchArtists();
	public FetchArtistsReponseDto fetchArtists(String artistName);	
	public FetchArtistsReponseDto fetchArtists(int pageIndex,int elementsPerPage);
	public FetchArtistsReponseDto fetchArtists(int pageIndex,int elementsPerPage,String order);
	
}
