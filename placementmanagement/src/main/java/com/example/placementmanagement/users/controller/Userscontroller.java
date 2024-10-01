package com.example.placementmanagement.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.placementmanagement.users.entity.Users;
import com.example.placementmanagement.users.services.Usersservices;

@RestController
public class Userscontroller {
	@Autowired
	private Usersservices us;
@PostMapping("/users")
public Users resisteruser(@RequestBody Users u) {
	return us.registeruser(u);
	
}
@GetMapping("/users")
public List<Users>getUsers()
{
	return us.getuser();
	
}
@DeleteMapping("/user/{id}")
public void deleteuser(@PathVariable("id")Integer id) {
	us.deleteuser(id);
}
@PutMapping("/users/{id}")
public Users particularuser(@PathVariable("id") Integer id,@RequestBody Users e) {
	return us.updateusers(id,e);
}
}



