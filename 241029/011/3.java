package com.example.demo.bean;

public class Dog {
	private String name;
	private int dogAge;
	@Override
	public String toString() {
		return "Dog [name=" + name + ", dogAge=" + dogAge + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	
}
