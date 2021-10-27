package com.kh.practice.model.vo;

public class Child extends Parent {
	
	// [필드부]
	private int z;
	
	// [생성자부]
	public Child() {
		
	}

	public Child(int x, int y, int z) {
		super(x, y);
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
