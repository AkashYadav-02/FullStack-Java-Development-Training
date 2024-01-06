package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
