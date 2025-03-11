package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Async
	public void helloWorld() {
		try {
			Thread.sleep(5000);
			System.out.println("线程名————>"+Thread.currentThread().getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
