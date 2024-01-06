package com.aurionpro.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.entity.Comment;
import com.aurionpro.service.CommentService;

@RestController
public class CommentController {

 private  CommentService commentService;
	 
	 public CommentController(  CommentService commentService) {
	        super();
	        this.commentService = commentService;
	    }

	@GetMapping("/comment")
	public ResponseEntity<List<Comment>> getAllComment(){
		 List<Comment> commentList = this.commentService.findAll();
	        return new ResponseEntity<List<Comment>>(commentList,HttpStatus.OK);
	    }
}
