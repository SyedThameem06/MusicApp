package com.music.artists.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.music.artists.dto.AlbumResponseDto;
import com.music.artists.dto.discogs.AlbumDetails;
import com.music.artists.dto.discogs.DiscogsObject;
import com.music.artists.entity.Albums;
import com.music.artists.exception.CommonException;
import com.music.artists.repo.AlbumRepository;
import com.music.artists.service.MessageByLocaleService;
import com.music.artists.service.TrackService;

@Service
public class TrackImpl implements TrackService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	AlbumRepository albumRepo;

	@Autowired
	MessageByLocaleService localResolver;

	@Override
	public AlbumResponseDto fetchAlbumTracks(int artistId, int albumId) {
		AlbumResponseDto response = new AlbumResponseDto();
		ObjectMapper mapper = new ObjectMapper();
		String type = "",consumerKey="",secretKey="",url="";
		String trackListUrl ="",title="",discogsUrl="";

		url = localResolver.getErrorMessage("discogs.url");
		consumerKey = localResolver.getErrorMessage("discogs.consumer.key");
		secretKey = localResolver.getErrorMessage("discogs.secret.key");
		type = localResolver.getErrorMessage("discogs.fetchType");

		Albums albumentity = albumRepo.findByAlbumID(albumId);
		response = mapper.convertValue(albumentity, AlbumResponseDto.class);
		response.setArtistID(albumentity.getArtists().getArtistID());
		response.setArtistName(albumentity.getArtists().getArtistName());

		title = albumentity.getArtists().getArtistName() +" - "+ albumentity.getTitle();
		discogsUrl = url + title + "&type="+ type + "&key=" + consumerKey + "&secret=" +secretKey;
		ResponseEntity<DiscogsObject> entityDiscogsObject = restTemplate.getForEntity(discogsUrl, DiscogsObject.class);
		DiscogsObject discogsObject = entityDiscogsObject.getBody();

		if(discogsObject.getResults().size() == 0) {
			throw new CommonException(-1, "TRCNOF", localResolver.getErrorMessage("TRCNOF"));
		}

		trackListUrl = discogsObject.getResults().get(0).getResource_url();
		ResponseEntity<AlbumDetails> entityAlbumDetailsObject = restTemplate.getForEntity(trackListUrl, AlbumDetails.class);
		AlbumDetails albumDetails = entityAlbumDetailsObject.getBody();

		if(albumDetails.getTracklist().size()==0) {
			throw new CommonException(-1, "TRCNOF", localResolver.getErrorMessage("TRCNOF"));
		}
		response.setTracks(albumDetails.getTracklist());
		return response;
	}
}
