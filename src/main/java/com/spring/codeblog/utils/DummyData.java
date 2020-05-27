package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {

	@Autowired //Renderiza
	CodeblogRepository codeblogRepository;
	
	//@PostConstruct // Desabilitar para fazer teste 
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Ricardo Baccarini");
		post1.setTitulo("spring");
		post1.setData(LocalDate.now());
		post1.setTexto("hahahahahahaha blablabla");
		
		Post post2 = new Post();
		post2.setAutor("Celina");
		post2.setTitulo("java");
		post2.setData(LocalDate.now());
		post2.setTexto("terererererere terererere");
		
		postList.add(post2);
		postList.add(post2);
		
		for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
		}
	}
	
}
