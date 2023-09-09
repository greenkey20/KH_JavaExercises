package com.kh.teamwork2.baskin.model.vo;

public class Family extends Baskin { // 부모클래스 Baskin 상속받음

	// 생성자부
	public Family() { // 사이즈별로 컨트롤러에서 호출시 아래의 값들이 들어간다.
		super.setName("패밀리"); // 사이즈명
		super.setPrice(22000); // 가격
		super.setIcecreamNum(5); // 맛 수
	}

}
