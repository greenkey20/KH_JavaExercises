package com.kh.teamwork2.restaurant.model.vo;

public class Chef extends Person {

	public Chef() {
	}

	public Chef(int money) {
		super.setName("국밥 장인 영춘옥");
		super.setMoney(money);
	}

	@Override
	public String order() {
		return super.getName() + "이 국밥을 서빙합니다.";
	}

}
