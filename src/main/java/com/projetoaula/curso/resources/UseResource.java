package com.projetoaula.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoaula.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999999");
		return ResponseEntity.ok().body(u);
	}
}
