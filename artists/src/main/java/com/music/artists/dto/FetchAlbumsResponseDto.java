package com.music.artists.dto;

import java.util.List;

import com.music.artists.entity.Albums;

public class FetchAlbumsResponseDto extends CommonResponseDto {

	private int artistID;
	private String artistName;
	private List<Albums> albums;
	
	public int getArtistID() {
		return artistID;
	}
	public FetchAlbumsResponseDto setArtistID(int artistID) {
		this.artistID = artistID;
		return this;
	}
	public String getArtistName() {
		return artistName;
	}
	public FetchAlbumsResponseDto setArtistName(String artistName) {
		this.artistName = artistName;
		return this;
	}
	public List<Albums> getAlbums() {
		return albums;
	}
	public FetchAlbumsResponseDto setAlbums(List<Albums> albums) {
		this.albums = albums;
		return this;
	}
	
	
}
