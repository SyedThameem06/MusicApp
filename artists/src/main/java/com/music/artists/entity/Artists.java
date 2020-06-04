package com.music.artists.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Artists {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int artistID;
	private String artistName;
	@JsonManagedReference
	@OneToMany(mappedBy = "artists",cascade = CascadeType.ALL)
	@OrderBy("yearOfRelease ASC")
	private List<Albums> albums = new ArrayList<Albums>();
	
	public int getArtistID() {
		return artistID;
	}
	public Artists setArtistID(int artistID) {
		this.artistID = artistID;
		return this;
	}
	public String getArtistName() {
		return artistName;
	}
	public Artists setArtistName(String artistName) {
		this.artistName = artistName;
		return this;
	}
	public List<Albums> getAlbums() {
		return albums;
	}
	public Artists setAlbums(List<Albums> albums) {
		this.albums = albums;
		return this;
	}
}
