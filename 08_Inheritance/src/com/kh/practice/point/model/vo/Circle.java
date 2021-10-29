package com.kh.practice.point.model.vo;

public class Circle extends Point {
	
	// [필드부]
	private int radius;
	
	// [생성자부]
	public Circle() { // 기본 생성자
		
	}
	
	public Circle(int x, int y, int radius) { // 매개변수 생성자
		super(x, y);
		this.radius = radius;
	}
		
	// [메소드부]
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() { // 필드에 담긴 데이터를 반환하는 메소드
		return super.toString() + ", 반지름 : " + radius;
	}

}
