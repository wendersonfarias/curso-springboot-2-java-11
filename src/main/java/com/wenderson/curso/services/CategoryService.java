package com.wenderson.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenderson.curso.entities.Category;
import com.wenderson.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//Retornar todos os usurios do banco de dados
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category> obj = repository.findById(id);
		 return obj.get();
	}
}
