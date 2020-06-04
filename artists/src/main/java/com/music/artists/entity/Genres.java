package com.music.artists.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Genres {

	@Column(name="GENRES")
	private String genres;

	public String getGenres() {
		return genres;
	}

	public Genres setGenres(String genres) {
		this.genres = genres;
		return this;
	}
	
}
