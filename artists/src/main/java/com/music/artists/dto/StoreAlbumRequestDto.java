package com.music.artists.dto;

import java.util.List;

import com.music.artists.entity.Genres;

public class StoreAlbumRequestDto {

	private String title;
	private String yearOfRelease;
	private List<Genres> genres;
	
	public String getTitle() {
		return title;
	}
	public StoreAlbumRequestDto setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public StoreAlbumRequestDto setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
		return this;
	}
	public List<Genres> getGenres() {
		return genres;
	}
	public StoreAlbumRequestDto setGenres(List<Genres> genres) {
		this.genres = genres;
		return this;
	}
	
}
