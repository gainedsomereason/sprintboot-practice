package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;

@RestController
public class HelloController {
	@RequestMapping("/jsonParam")
	public String jsonParam(@RequestBody User user) {
		System.out.println(user);
		return "OK";
	}
	
}

/**
http://localhost:8080/jsonParam

Body:json
{
    "name":"Tom",
    "age":10,
    "address":{
        "province":"湖南",
        "city":"长沙"
    }
}

User [name=Tom, age=10, address=Address [province=湖南, city=长沙]]

 */
