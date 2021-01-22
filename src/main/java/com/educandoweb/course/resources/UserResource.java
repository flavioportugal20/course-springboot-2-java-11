package com.educandoweb.course.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		User u1 = new User(1L, "Maria2", "maria2@gmail.com", "99999992", "123452");
		List<User> list = new ArrayList<>();
		list.add(u);
		list.add(u1);
		
		return ResponseEntity.ok().body(list);

	}
	
}
