package com.kh.teamwork2.junkshop.model.vo;

public class Electronic {

	private int styler;
	private int refrigerator;
	private int computer;
	private int washingMachine;
	private int dryer; // 외부접근 불가 가격을 구하기 위해 int로 받음

	public Electronic() { // 기본생성자

	}

	//
	public Electronic(int styler, int refrigerator, int computer, int washingMachine, int dryer) {
		this.styler = styler;
		this.refrigerator = refrigerator;
		this.computer = computer;
		this.washingMachine = washingMachine;
		this.dryer = dryer;
	}

	public int getStyler() {
		return styler; // 호출한 메소드로 되돌아감
	}

	public void setStyler(int styler) {
		this.styler = styler; // 자기 자신의 생성자(입력값)를 호출한다.
	}// 반환타입이 void이므로 return이 생략됨

	public int getRefrigerator() {
		return refrigerator; // 호출한 메소드로 되돌아감
	}

	public void setRefrigerator(int refrigerator) {
		this.refrigerator = refrigerator; // 자기 자신의 생성자(입력값)를 호출한다.
	}// 반환타입이 void이므로 return이 생략됨

	public int getComputer() {
		return computer; // 호출한 메소드로 되돌아감
	}

	public void setComputer(int computer) {
		this.computer = computer; // 자기 자신의 생성자(입력값)를 호출한다.
	}// 반환타입이 void이므로 return이 생략됨

	public int getWashingMachine() {
		return washingMachine; // 호출한 메소드로 되돌아감
	}

	public void setWashingMachine(int washingMachine) {
		this.washingMachine = washingMachine; // 자기 자신의 생성자(입력값)를 호출한다.
	}// 반환타입이 void이므로 return이 생략됨

	public int getDryer() {
		return dryer; // 호출한 메소드로 되돌아감
	}

	public void setDryer(int dryer) {
		this.dryer = dryer; // 자기 자신의 생성자(입력값)를 호출한다.
	}// 반환타입이 void이므로 return이 생략됨

}
