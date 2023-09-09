package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	// [필드부]
	private Circle c = new Circle();
	
	// [생성자부]
		
	// [메소드부]
	public String calcArea(int x, int y, int radius) {
		// 받은 매개변수를 이용해서 필드들을 초기화하고,
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * c.getRadius() * c.getRadius(); 
		
		// 초기화한 정보와 면적 반환
		return c.toString() + ", 면적 : " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		// 받은 매개변수를 이용해서 필드들을 초기화하고,
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = Math.PI * c.getRadius() * 2; 
		 
		// 초기화한 정보와 면적 반환
		return c.toString() + ", 면적 : " + circum;
	}

}
