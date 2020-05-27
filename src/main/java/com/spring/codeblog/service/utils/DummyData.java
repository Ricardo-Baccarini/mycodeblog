package com.spring.codeblog.service.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

public class DummyData {

	@Autowired
	CodeblogRepository codeBlogRepository;
	
	@PostConstruct
	public void savePost() {
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Ricardo Baccarini");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("bla bla bla bla");
		
		Post post2 = new Post();
		post2.setAutor("Ricardo Baccarini");
		post2.setData(LocalDate.now());
		post2.setTitulo("API REST");
		post1.setTexto("TEREREREE");
		
		postList.add(post1);
		postList.add(post2);
		
		// Grava o Post
		for (Post post: postList) {
			Post postSaved = codeBlogRepository.save(post);
			System.out.println(postSaved.getId());
		}

	}
	
	
}
