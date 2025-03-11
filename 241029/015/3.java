package com.example.demo.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class HelloConfig {
	private int corePoolSize=10;
	private int maxPoolSize=200;
	private int queueCapacity=10;

    @Bean
    Executor taskExecutor() {
		ThreadPoolTaskExecutor executor =new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(corePoolSize);
		executor.setMaxPoolSize(maxPoolSize);
		executor.setQueueCapacity(queueCapacity);
		executor.setThreadNamePrefix("自定义异步线程");
		executor.initialize();
		return executor;
	}
}
