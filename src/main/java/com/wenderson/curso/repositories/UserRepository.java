package com.wenderson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wenderson.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
