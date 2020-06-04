package com.music.artists.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.music.artists.dto.AlbumResponseDto;
import com.music.artists.dto.FetchAlbumsResponseDto;
import com.music.artists.dto.FetchArtistsReponseDto;
import com.music.artists.dto.StoreAlbumRequestDto;
import com.music.artists.dto.StoreAlbumResponseDto;
import com.music.artists.dto.StoreArtistsRequestDto;
import com.music.artists.dto.StoreArtistsResponseDto;
import com.music.artists.service.AlbumsService;
import com.music.artists.service.ArtistsService;
import com.music.artists.service.TrackService;

@RestController
public class AppController {

	@Autowired
	ArtistsService artistService;

	@Autowired
	AlbumsService albumService;

	@Autowired
	TrackService tracservice;
	
	@PostMapping(value="/artists")
	public StoreArtistsResponseDto storeArtists(@RequestBody StoreArtistsRequestDto request) {
		return artistService.storeArtistsDetails(request);
	}

	@PutMapping(value="/artists/{artistId}")
	public StoreArtistsResponseDto updateArtists(@RequestBody StoreArtistsRequestDto request,@PathVariable int artistId) {
		return artistService.updateArtistsDetails(request, artistId);
	}

	@GetMapping(value="/artists")
	public FetchArtistsReponseDto fetchArtists() {
		return artistService.fetchArtists();
	}
	@GetMapping(value="/artists/{artistName}")
	public FetchArtistsReponseDto fetchArtists(@PathVariable String artistName) {
		return artistService.fetchArtists(artistName);
	}
	@GetMapping(value="/artists/{pageIndex}/{elementsPerPage}")
	public FetchArtistsReponseDto fetchArtists(@PathVariable int pageIndex,@PathVariable int elementsPerPage) {
		return artistService.fetchArtists(pageIndex,elementsPerPage);
	}

	@GetMapping(value="/artists/{pageIndex}/{elementsPerPage}/{order}")
	public FetchArtistsReponseDto fetchArtists(@PathVariable int pageIndex,@PathVariable int elementsPerPage,@PathVariable String order ) {
		return artistService.fetchArtists(pageIndex,elementsPerPage,order);
	}
	@PostMapping(value="/artists/{artistId}/albums")
	public StoreAlbumResponseDto storeAlbums(@RequestBody StoreAlbumRequestDto request,@PathVariable int artistId) {
		return albumService.storeAlbums(request, artistId);
	}
	@PutMapping(value="/artists/{artistId}/albums/{albumId}")
	public StoreAlbumResponseDto updateAlbums(@RequestBody StoreAlbumRequestDto request,@PathVariable int artistId,@PathVariable int albumId) {
		return albumService.updateAlbums(request, artistId, albumId);
	}
	@GetMapping(value="/artists/{artistId}/albums")
	public FetchAlbumsResponseDto fetchAlbums(@PathVariable int artistId) {
		return albumService.fetchAlbums(artistId);
	}
	
	@GetMapping(value="/artists/{artistId}/albums/{albumId}")
	public AlbumResponseDto fetchAlbumTracks(@PathVariable int artistId,@PathVariable int albumId) {
		return tracservice.fetchAlbumTracks(artistId, albumId);
	}
}
