package com.music.artists.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.music.artists.entity.Artists;

public interface ArtistsRepository extends JpaRepository<Artists, Long>{
	Artists findByArtistID(int artistID);
	List<Artists> findAll();
	Page<Artists> findAll(Pageable pageable);
	List<Artists> findByArtistNameContains(String artistName);
}
