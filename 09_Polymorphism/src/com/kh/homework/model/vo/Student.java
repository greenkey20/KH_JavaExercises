package com.kh.homework.model.vo;

public abstract class Student {
	
	private String name;
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String homework();
	
}
