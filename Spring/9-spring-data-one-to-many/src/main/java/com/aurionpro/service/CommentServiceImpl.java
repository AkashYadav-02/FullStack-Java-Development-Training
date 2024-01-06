package com.aurionpro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.entity.Comment;
import com.aurionpro.repository.CommentRepository;
@Service
public class CommentServiceImpl implements  CommentService {
	private CommentRepository crepo;
	public CommentServiceImpl(CommentRepository crepo) {
		super();
		this.crepo = crepo;
	}
	@Override
	public List<Comment> findAll() {
		List<Comment> comment=this.crepo.findAll();
		return comment ;
		// TODO Auto-generated method stub
		
	}

}
