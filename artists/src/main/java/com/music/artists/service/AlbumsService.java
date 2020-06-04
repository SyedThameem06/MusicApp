package com.music.artists.service;

import com.music.artists.dto.FetchAlbumsResponseDto;
import com.music.artists.dto.StoreAlbumRequestDto;
import com.music.artists.dto.StoreAlbumResponseDto;

public interface AlbumsService {

	public StoreAlbumResponseDto storeAlbums(StoreAlbumRequestDto request,int artistId);
	public StoreAlbumResponseDto updateAlbums(StoreAlbumRequestDto request,int artistId,int albumId);
	public FetchAlbumsResponseDto fetchAlbums(int artistId);
}
