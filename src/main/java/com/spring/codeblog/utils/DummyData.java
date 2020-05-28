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
	
	//@PostConstruct // Habilitar para fazer teste 
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Ricardo Baccarini");
		post1.setTitulo("spring pau na versao");
		post1.setData(LocalDate.now());
		post1.setTexto("Caraca tive que mexer no pom.xlm para acertar a versão do spring!!!!! Puta que merda!!!!! Mas vamos lá pra ver no que dá.");
		
		Post post2 = new Post();
		post2.setAutor("Isabella");
		post2.setTitulo("Estudando em casa");
		post2.setData(LocalDate.now());
		post2.setTexto("Tá um saco!!!!!");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
		}
	}
	
}
