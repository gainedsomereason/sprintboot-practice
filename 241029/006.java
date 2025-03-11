package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	@RequestMapping("/arrayPojo")
	public String simplePojo(String[] hobby) {
		System.out.println(Arrays.toString(hobby));
		return "OK";
	}
	
}

/**
http://localhost:8080/arrayPojo?hobby=ball&hobby=girl

[ball, girl]

 */
