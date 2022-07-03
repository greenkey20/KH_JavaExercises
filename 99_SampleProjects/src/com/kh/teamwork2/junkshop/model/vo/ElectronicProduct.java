package com.kh.teamwork2.junkshop.model.vo;

public class ElectronicProduct extends Electronic implements ElectronicPrice, Discount {

	private int stylerPrice;
	private int refrigeratorPrice;
	private int computerPrice;
	private int washingMachinePrice;
	private int dryerPrice; // 외부접근 불가 가격을 구하기 위해 int로 받음

	public ElectronicProduct() {// 기본생성자
		super(); // 조상클래스 호출을 위해 자동생성
	};

	public ElectronicProduct(int styler, int refrigerator, int computer, int washingMachine, int dryer, int stylerPrice,
			int refrigeratorPrice, int computerPrice, int washingMachinePrice, int dryerPrice) {
		super(styler, refrigerator, computer, washingMachine, dryer);
		this.stylerPrice = stylerPrice;
		this.refrigeratorPrice = refrigeratorPrice;
		this.computerPrice = computerPrice;
		this.washingMachinePrice = washingMachinePrice;
		this.dryerPrice = dryerPrice;
	}

	public int getStylerPrice() {
		return stylerPrice; // 호출한 메소드로 되돌아감
	}

	public void setStylerPrice(int stylerPrice) {
		this.stylerPrice = stylerPrice; // 자기 자신의 생성자(입력값)를 호출한다.
	} // 반환타입이 void이므로 return이 생략됨

	public int getRefrigeratorPrice() {
		return refrigeratorPrice; // 호출한 메소드로 되돌아감
	}

	public void setRefrigeratorPrice(int refrigeratorPrice) {
		this.refrigeratorPrice = refrigeratorPrice; // 자기 자신의 생성자(입력값)를 호출한다.
	} // 반환타입이 void이므로 return이 생략됨

	public int getComputerPrice() {
		return computerPrice; // 호출한 메소드로 되돌아감
	}

	public void setComputerPrice(int computerPrice) {
		this.computerPrice = computerPrice; // 자기 자신의 생성자(입력값)를 호출한다.
	} // 반환타입이 void이므로 return이 생략됨

	public int getWashingMachinePrice() {
		return washingMachinePrice; // 호출한 메소드로 되돌아감
	}

	public void setWashingMachinePrice(int washingMachinePrice) {
		this.washingMachinePrice = washingMachinePrice; // 자기 자신의 생성자(입력값)를 호출한다.
	} // 반환타입이 void이므로 return이 생략됨

	public int getDryerPrice() {
		return dryerPrice; // 호출한 메소드로 되돌아감
	}

	public void setDryerPrice(int dryerPrice) {
		this.dryerPrice = dryerPrice; // 자기 자신의 생성자(입력값)를 호출한다.
	} // 반환타입이 void이므로 return이 생략됨

}
