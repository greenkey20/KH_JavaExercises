package com.kh.teamwork2.restaurant.model.vo;

public class Guest extends Person {

	private String nickName;

	public Guest(String name, int money, String nickName) {
		super(name, money);
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String order() {
		return nickName + "님이 요리를 주문합니다.";
	}

}
