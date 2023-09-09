package com.kh.chap02_inherit.model.vo;

public class Vehicle { // 탈 것
	// 탈 것의 공통적인 속성(이름, 거리(mileage), 종류, 속도 등) 및 기능 생각해서 클래스 작성
	
	// [필드부]
	private String name; // 이름
	private double mileage; // 연비
	private String type; // 종류
//	private double volume; // 부피
//	private double speed; // 평균 시속
//	private double maxSpeed; // 최대 속도
//	private String company; // 제조 회사
//	private String engine; // 엔진 종류
//	private int people; // 탑승 인원
	
	
	// [생성자부]
	public Vehicle() {
//		super();
	}

	public Vehicle(String name, double mileage, String type /*, double speed, double volume, int price*/) {
//		super();
		this.name = name;
		this.mileage = mileage;
		this.type = type;
//		this.speed = speed;
//		this.volume = volume;
//		this.price = price;
	}
	
	// [메소드부]
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public double getSpeed() {
//		return speed;
//	}
//
//	public void setSpeed(double speed) {
//		this.speed = speed;
//	}
//
//	public double getVolume() {
//		return volume;
//	}
//
//	public void setVolume(double volume) {
//		this.volume = volume;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 마지막으로 information() 메소드를 선언 -> information() 대신, Object클래스의 기존에 있는 메소드 toString()을 overriding해서 사용
	@Override
	public String toString() {
		return "name : " + name + ", mileage : " + mileage + ", type : " + type;
	}
	
	public void howToMove() {
		System.out.println("움직인다");
	}
	
	// ideas
	// 나: 멤버변수 = 평균 시속 -> 매개변수(부피 등) 받아 운행속도 함수
	// 학생2: 특정 목적지에 가는 방법; 멤버변수 = 수용인원, 가격, 시간
	// 학생3: 뱃고동을 울리는 메소드

}
