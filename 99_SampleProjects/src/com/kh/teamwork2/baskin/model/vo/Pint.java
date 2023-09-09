package com.kh.teamwork2.baskin.model.vo;

public class Pint extends Baskin { // 부모클래스 Baskin 상속받음

	// 생성자부
	public Pint() { // 사이즈별로 컨트롤러에서 호출시 아래의 값들이 들어간다.
		super.setName("파인트"); // 사이즈 명
		super.setPrice(8200); // 가격
		super.setIcecreamNum(3); // 맛 순
	}

}
