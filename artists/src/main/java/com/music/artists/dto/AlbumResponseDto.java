package com.music.artists.dto;

import java.util.List;

import com.music.artists.dto.discogs.Tracklist;
import com.music.artists.entity.Artists;
import com.music.artists.entity.Genres;

public class AlbumResponseDto {
	private int artistID;
	private String artistName;
	private int albumID;
	private String title;
	private String yearOfRelease;
	private List<Genres> genres;
	private List<Tracklist> tracks;
	
	
	public int getArtistID() {
		return artistID;
	}
	public AlbumResponseDto setArtistID(int artistID) {
		this.artistID = artistID;
		return this;
	}
	public String getArtistName() {
		return artistName;
	}
	public AlbumResponseDto setArtistName(String artistName) {
		this.artistName = artistName;
		return this;
	}
	public int getAlbumID() {
		return albumID;
	}
	public AlbumResponseDto setAlbumID(int albumID) {
		this.albumID = albumID;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public AlbumResponseDto setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public AlbumResponseDto setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
		return this;
	}
	public List<Genres> getGenres() {
		return genres;
	}
	public AlbumResponseDto setGenres(List<Genres> genres) {
		this.genres = genres;
		return this;
	}
	public List<Tracklist> getTracks() {
		return tracks;
	}
	public AlbumResponseDto setTracks(List<Tracklist> tracks) {
		this.tracks = tracks;
		return this;
	}
}