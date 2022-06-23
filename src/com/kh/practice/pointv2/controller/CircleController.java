package com.kh.practice.pointv2.controller;

import com.kh.practice.pointv2.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area = Math.PI * c.getRadius() * c.getRadius(); // 그냥 radius로 써도 되는 듯
		return c.toString() + " / 면적 : " + area; 
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double circum = Math.PI * c.getRadius() * 2;
		return c.toString() + " / 둘레 : " + circum;
	}

}
