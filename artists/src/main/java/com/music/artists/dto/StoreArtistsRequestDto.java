package com.music.artists.dto;

public class StoreArtistsRequestDto {

	private String artistName;

	public String getArtistName() {
		return artistName;
	}

	public StoreArtistsRequestDto setArtistName(String artistName) {
		this.artistName = artistName;
		return this;
	}
}
