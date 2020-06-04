package com.music.artists.dto;

import java.util.List;

import com.music.artists.entity.Artists;

public class FetchArtistsReponseDto extends CommonResponseDto {

	private List<Artists> artists;

	public List<Artists> getArtists() {
		return artists;
	}

	public FetchArtistsReponseDto setArtists(List<Artists> artists) {
		this.artists = artists;
		return this;
	}
}
