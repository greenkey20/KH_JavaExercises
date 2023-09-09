package com.kh.practice.point.model.vo;

public class Point {
	
	// [필드부]
	private int x;
	private int y;
	
	// [생성자부]
	public Point() { // 기본 생성자
		
	}
	
	public Point(int x, int y) { // 매개변수 생성자
		this.x = x;
		this.y = y;
	}
	
	// [메소드부]
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() { // 필드에 담긴 데이터를 반환하는 메소드
		return "x 좌표 : " + x + ", y 좌표 : " + y;
	}

}
