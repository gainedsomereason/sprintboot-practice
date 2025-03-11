package com.example.demo.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component//将这个配置类添加到容器中
@ConfigurationProperties(prefix="people")//对应yml中的people
public class Person {
	private String name;
	private Integer age;
	private boolean sex;
	private Dog dog;
	private Map<String,Object> maps;
	private List<Object> list;

	@Override
	public String toString() {
		return "Person [name=" + 
				name + ", age=" + 
				age + ", sex=" + 
				sex + ", dog=" + 
				dog + ", maps=" + 
				maps + ", list="
				+ list + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
}
