package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
	
	// 필드부
	private int x;
	private int y;
	
	// 생성자부
	public Parent() {
//		super();
	}

	public Parent(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}
	
	// 메소드부
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
	
	public void printParent() {
		System.out.println("나는 부모야~");
	}
	
	public void print() {
		System.out.println("나는 부모야~");
	}

}
