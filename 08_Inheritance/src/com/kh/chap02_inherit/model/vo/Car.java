package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle {
	
	// [필드부]
	// name, mileage, type
	private int tire;
	
	// [생성자]
	public Car() {
		
	}

	public Car(String name, double mileage, String type, int tire) {
		super(name, mileage, type); // 상속(클래스명 extends..)을 해줘야지 생성장 super() 사용 가능함
		this.tire = tire;
	}
	
	// [메소드부]
	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public String toString() {
		return super.toString() + ", tire : " + tire;
	}
	
	public void howToMove() {
		System.out.println("바퀴가 굴러서 움직입니다");
	}

}
