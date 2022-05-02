package com.wenderson.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenderson.curso.entities.Product;
import com.wenderson.curso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	// Retornar products do banco de dados
	public List<Product> findAll() {
		return repository.findAll();
	}
	//Procurar por id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
