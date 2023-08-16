package com.example.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.Post;
import com.example.workshopmongo.domain.User;
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
}
