package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class ZypjApplicationTests {
	
	@Autowired
	Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}

/**
@ConfigurationProperties注解
springboot应用就是为了不写xml配置文件，尽量运用纯注解的方式。
这个注解的作用就是将一个实体类的属性和一个配置文件（properties，yml）绑定一起，
我们可以通过修改配置文件的值来控制这个实体类的属性值

@ImportResource可以导入xml配置文件，
【@PropertySource可以给配置类导入properties配置文件，@Value可以给单个属性注入properties文件中的值】
<-------这两个通常一起用）
 */
