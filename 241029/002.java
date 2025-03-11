package com.example.springquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")//"/hello"设置请求行为
	public String hello() {
		return "hello world~";
	}
}
