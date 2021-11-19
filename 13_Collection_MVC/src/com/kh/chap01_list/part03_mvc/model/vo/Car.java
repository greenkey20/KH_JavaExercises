package com.kh.chap01_list.part03_mvc.model.vo;

public class Car {
	
	// [필드부]
	// int 주차 대수, int 차량번호, String 차량 종류, String 소유자명
	private int parkingNum;
	private int carNum;
	private String carType;
	private String owner;
	
	// [생성자부]
	public Car() {
		super();
	}

	public Car(int parkingNum, int carNum, String carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	// [메소드부]
	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + carType + ", owner=" + owner
				+ "]";
	}

}
