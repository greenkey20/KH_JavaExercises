package com.kh.teamwork2.baskin.model.vo;

public class Guest {

	// 필드부
	private int guestNum; // 인원 수 입력시 담을 변수 선언
	private int money; // 가진 돈 입력시 담을 변수 선언

	// 생성자부
	public Guest() {
	}

	// 메소드부
	public int getGuestNum() {
		return guestNum;
	}

	public void setGuestNum(int guestNum) {
		this.guestNum = guestNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
