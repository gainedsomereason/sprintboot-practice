package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/dateParam")
	public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
		System.out.println(updateTime);
		return "OK";
	}
	
}

/**
http://localhost:8080/dateParam?updateTime=2077-11-10%2020:13:18

2077-11-10T20:13:18

 */
