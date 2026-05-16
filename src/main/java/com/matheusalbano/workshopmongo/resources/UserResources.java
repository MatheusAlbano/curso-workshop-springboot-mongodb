package com.matheusalbano.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusalbano.workshopmongo.domain.User;
import com.matheusalbano.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll(){

	    List<User> list = service.findAll();

	    System.out.println("LISTA: " + list.size());

	    return ResponseEntity.ok().body(list);
	}
}
