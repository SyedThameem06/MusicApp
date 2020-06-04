package com.music.artists.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.artists.entity.Albums;

public interface AlbumRepository extends JpaRepository<Albums, Long> {
	public Albums findByAlbumID(int albumID); 
}
