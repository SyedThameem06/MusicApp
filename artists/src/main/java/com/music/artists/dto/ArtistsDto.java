package com.music.artists.dto;

public class ArtistsDto {

	private int artistID;
	private String artistName;

	public int getArtistID() {
		return artistID;
	}

	public ArtistsDto setArtistID(int artistID) {
		this.artistID = artistID;
		return this;
	}

	public String getArtistName() {
		return artistName;
	}

	public ArtistsDto setArtistName(String artistName) {
		this.artistName = artistName;
		return this;
	}
}
