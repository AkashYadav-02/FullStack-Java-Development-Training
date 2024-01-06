package com.aurionpro.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String creatorName;
	private double duration;
	private String videoUrl;
	private String title;
	private LocalDateTime publishDate;
	private boolean published;
	@OneToMany(mappedBy = "video")
	@JsonManagedReference
	private List<Comment> commentList;
	
	public Video(String creatorName, double duration, String videoUrl, LocalDateTime publishDate,boolean published,String title) {
		super();
		this.creatorName = creatorName;
		this.duration = duration;
		this.videoUrl = videoUrl;
		this.publishDate = publishDate;
		this. published=published;
		this.title=title;
	} 
	
	
	
	

}