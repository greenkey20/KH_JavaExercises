package com.kh.teamwork2.baskin.model.vo;

public class HalfGallon extends Baskin { // 부모클래스 Baskin 상속받음

	// 생성자부
	public HalfGallon() { // 사이즈별로 컨트롤러에서 호출시 아래의 값들이 들어간다.
		super.setName("하프갤런"); // 사이즈 명
		super.setPrice(26500); // 가격
		super.setIcecreamNum(6); // 맛 수
	}

}
