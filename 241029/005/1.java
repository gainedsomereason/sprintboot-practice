package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	@RequestMapping("/simplePojo")
	public String simplePojo(User user) {
		System.out.println(user);
		return "OK";
	}
	
}

/**
http://localhost:8080/simplePojo?name=bug&age=16&address.province=heaven&address.city=burgen

User [name=bug, age=16, address=Address [province=heaven, city=burgen]]

 */
