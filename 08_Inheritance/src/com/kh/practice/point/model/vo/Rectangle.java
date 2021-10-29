package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	
	// [필드부]
	private int width;
	private int height;
	
	// [생성자부]
	public Rectangle() { // 기본 생성자
		
	}
	
	public Rectangle(int x, int y, int width, int height) { // 매개변수 생성자
		super(x, y);
		this.width = width;
		this.height = height;
	}
		
	// [메소드부]
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() { // 필드에 담긴 데이터를 반환하는 메소드
		return super.toString() + ", 너비 : " + width + ", 높이 : " + height;  
	}

}
