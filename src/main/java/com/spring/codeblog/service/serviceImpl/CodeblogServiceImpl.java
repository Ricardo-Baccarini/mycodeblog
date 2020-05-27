package com.spring.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

// @Service mostra ao spring que isso é um Bean gerenciado por ele
@Service  
public class CodeblogServiceImpl implements CodeblogService {

	@Autowired
	CodeblogRepository codeBlogRepository;
	
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeBlogRepository.save(post);
	}

	
}
