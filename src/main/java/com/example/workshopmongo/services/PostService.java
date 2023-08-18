package com.example.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.exception.ObjectNotFoundException;
import com.example.workshopmongo.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;

	
	public Post findById(String id) {
		Optional<Post> userOptional = repo.findById(id);
		if (userOptional.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}

		return userOptional.get();
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text , Date minDate , Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
	
	
}
