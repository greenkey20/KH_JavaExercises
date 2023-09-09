package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {
	
	// 필드부
	// int x, int y 상속 받음
	private int z;
	
	// 생성자부
	public Child1() {
		
	}

	public Child1(int z) {
//		super();
		this.z = z;
	}

	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 메소드부
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("나는 첫번째 자식이야~");
	}
	
	@Override // 개발자들 간의 약속
	public void print() {
		System.out.println("나는 첫번째 자식이야~");
	}

}
