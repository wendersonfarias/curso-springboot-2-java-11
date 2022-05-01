package com.wenderson.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenderson.curso.entities.User;
import com.wenderson.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//Retornar todos os usurios do banco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		 Optional<User> obj = repository.findById(id);
		 return obj.get();
	}
}
