package com.kh.practice.model.vo; // value object 패키지(값이 들어가는 것; 값을 가지고 있는 패키지)에 들어가 있음 

public class Child extends Parent {
	
	// [필드부]
	private int z;
	
	// [생성자부]
	public Child() {
		
	}

	public Child(int x, int y, int z) {
		super(x, y); // super생성자
		this.z = z;
	}
		
	// [메소드부]
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

}
