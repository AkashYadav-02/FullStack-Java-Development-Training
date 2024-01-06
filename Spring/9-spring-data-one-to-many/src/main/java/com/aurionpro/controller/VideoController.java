package com.aurionpro.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Video;
import com.aurionpro.service.VideoService;


@RestController
public class VideoController {

	 private   VideoService videoService;
	 
	 public VideoController(  VideoService videoService) {
	        super();
	        this.videoService = videoService;
	    }

	@GetMapping("/video")
	public ResponseEntity<List<Video>> getAllVideo(){
		 List<Video> videoList = this.videoService.findAll();
	        return new ResponseEntity<List<Video>>(videoList, HttpStatus.OK);
	    }
	
}
