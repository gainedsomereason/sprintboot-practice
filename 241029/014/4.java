package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@PostMapping("/user/add")
	public void add(@RequestBody User user) {
		userRepository.save(user);
	}
	@GetMapping("/user/userList")
	public List<User> findAll(){
		List<User> userList=userRepository.findAll();
		return userList;
	}
	
}
