package com.music.artists.service;

import com.music.artists.dto.AlbumResponseDto;

public interface TrackService {

	public AlbumResponseDto fetchAlbumTracks(int artistId,int albumId);
}
