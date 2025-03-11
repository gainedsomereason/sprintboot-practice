package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	@RequestMapping("/listPojo")
	public String simplePojo(@RequestParam List<String> hobby) {
		System.out.println(hobby);
		return "OK";
	}
	
}

/**
http://localhost:8080/listPojo?hobby=ball&hobby=girl

[ball, girl]

 */
