package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	// [필드부]
	// 비행기만 가지고 있는 것: 날개 등
//	private boolean isAirForceOne;
	private int wing;
	private int tire; // 타이어 크기
	
	
	// [생성자부]
	public Airplane() {
		
	}
	
	public Airplane(String name, double mileage, String type, int wing, int tire) {
		super(name, mileage, type);
		this.wing = wing;
		this.tire = tire;
	}
	
	// [메소드부]
	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	// toString()
	public String toString() {
		return super.toString() + ", wing : " + wing + ", tire : " + tire; 
	}
	
	public void howToMove() {
		System.out.println("바퀴로 달리다가 날개로 날아요");
	}

}
