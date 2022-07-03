package com.kh.homework.parking.model.vo;

public class Car {
	
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car() {
		super();
	}

	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum; // Controller에서 만들어줌
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	public Car(int carNum, int carType, String owner) {
		// TODO Auto-generated constructor stub
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

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

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	// 출력할 때마다 바뀌어야 하는 carType(int 자료형 대신 문자열 출력)을 여기서 바꿔서 오버라이딩하자..
	@Override
	public String toString() {
		
		String cType = "";
		
		if (carType == 1) {
			cType = "경차";
		} else if (carType == 2) {
			cType = "세단";
		} else if (carType == 3) {
			cType = "SUV";
		} else if (carType == 4) {
			cType = "트럭";
		}
		
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + cType + ", owner=" + owner
				+ "]";
	}

}
