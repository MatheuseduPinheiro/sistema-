package com.example.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.exception.ObjectNotFoundException;
import com.example.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> userOptional = repo.findById(id);
		if (userOptional.isEmpty()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}

		return userOptional.get();
	}
}
