package com.kh.chap01_poly.part01_basic.model.vo;

public class GrandChild1 extends Child1 {
	
	// 필드부
	// int z 상속받음 <- int x, int y 상속받음
	private int m;

	// 생성자부
	public GrandChild1() {
//		super();
	}

	public GrandChild1(int m) {
//		super();
		this.m = m;
	}

	public GrandChild1(int z, int m) {
		super(z);
		this.m = m;
	}

	// 메소드부
	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	public void printGrandChild1() {
		System.out.println("나는 첫번째 손녀야~");
	}
	
	@Override
	public void print() {
		System.out.println("나는 첫번째 손녀야~");
	}

}
