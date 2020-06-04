package com.music.artists.dto;

public class StoreArtistsResponseDto extends CommonResponseDto {

	private int artistID;
	private String artistName;

	public int getArtistID() {
		return artistID;
	}

	public StoreArtistsResponseDto setArtistID(int artistID) {
		this.artistID = artistID;
		return this;
	}

	public String getArtistName() {
		return artistName;
	}

	public StoreArtistsResponseDto setArtistName(String artistName) {
		this.artistName = artistName;
		return this;
	}
}
