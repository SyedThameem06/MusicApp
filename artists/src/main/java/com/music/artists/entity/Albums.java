package com.music.artists.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Albums {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int albumID;
	private String title;
	private String yearOfRelease;
	@ElementCollection
	@JoinTable(name="ALBUM_GENRES",
			joinColumns = @JoinColumn(name="albumID")	
	)
	private List<Genres> genres;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "artistid")
	private Artists artists;

	public int getAlbumID() {
		return albumID;
	}
	public Albums setAlbumID(int albumID) {
		this.albumID = albumID;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public Albums setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public Albums setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
		return this;
	}

	public List<Genres> getGenres() {
		return genres;
	}
	public Albums setGenres(List<Genres> genres) {
		this.genres = genres;
		return this;
	}
	public Artists getArtists() {
		return artists;
	}
	public Albums setArtists(Artists artists) {
		this.artists = artists;
		return this;
	}
}
