package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.Video;
import com.aurionpro.repository.VideoRepository;
@Service
public class VideoServiceImpl implements VideoService{
  
	
	private VideoRepository vrepo;
	public VideoServiceImpl(VideoRepository vrepo) {
		super();
		this.vrepo = vrepo;
	}
	@Override
	public List<Video> findAll() {
		List<Video> video=this.vrepo.findAll();
		return video ;
		// TODO Auto-generated method stub
		
	}

}
