package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;

@RestController
public class HelloController {
	@RequestMapping("/path/{id}")
	public String pathParam(@PathVariable("id") Integer identy) {
		System.out.println(identy);
		return "OK";
	}
	
}

/**
http://localhost:8080/path/1024

1024

 */
