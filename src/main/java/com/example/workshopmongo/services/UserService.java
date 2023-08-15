package com.example.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.dto.UserDTO;
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
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User update(User obj) {
	    Optional<User> optionalUser = repo.findById(obj.getId());
	    
	    if (optionalUser.isPresent()) {
	        User newObj = optionalUser.get();
	        updateData(newObj, obj);
	        return repo.save(newObj);
	    } else {
	        // Handle the case where the user with the given ID is not found.
	        throw new RuntimeException("User not found with ID: " + obj.getId());
	    }
	}

	private void updateData(User newObj, User obj) {
	    newObj.setName(obj.getName());
	    newObj.setEmail(obj.getEmail());
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),objDto.getName(),objDto.getEmail());
	}
}
