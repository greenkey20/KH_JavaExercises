package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {
	
	// [필드부]
	private int propeller; // 배는 기름 넣고 프로펠러로 움직임
	
	// [생성자부]
	public Ship() {
		
	}
	
	public Ship(String name, double mileage, String type, int propeller) {
		super(name, mileage, type);
		this.propeller = propeller;
	}
	
	// [메소드부]
	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	public String toString() {
		return super.toString() + ", propeller : " + propeller;
	}
	
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 떠다닙니다");
	}

}
