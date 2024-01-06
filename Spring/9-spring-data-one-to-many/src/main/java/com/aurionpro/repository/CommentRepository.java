package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
