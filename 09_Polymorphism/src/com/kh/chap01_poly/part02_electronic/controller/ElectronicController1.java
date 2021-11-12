package com.kh.chap01_poly.part02_electronic.controller; // 기능을 담당 -> 전자기기들을 control하겠다

import com.kh.chap01_poly.part02_electronic.model.vo.*;

// 다형성 적용 전: 용산 전자상가에 새로 차린 가게
public class ElectronicController1 {
	
	// [필드부]
	private Desktop desk; // Desktop 자료형의 desk 참조변수 선언 + 외부에서 접근할 수 없도록 캡슐화/은닉
	private NintendoSwitch ns;
	private SmartPhone sp;
	
	// [생성자부]
	// 생략 -> JVM이 기본생성자를 자동으로 생성해줌
	
	// [메소드부]
	// 각 제품의 재고를 추가해주는 메소드 overloading <- 매개변수의 자료형이 다름
	// overloading 전제 조건: 메소드명이 같아야 함 + 매개변수의 자료형, 순서, 갯수가 달라야 함
	public void insert(Desktop desk) { // 매개변수의 모양 = Desktop형/Desktop처럼 생긴 것 -> Desktop 자료형으로 만든 것 = Desktop의 객체 -> String brand, String name, int price, cpu = intel, int ram
									   // 이름(desk)은 임의적인 것
		// Desktop 클래스의 명세
		// 필드: String brand, String name, int price, cpu = intel, int ram
		// 메소드: getter, setter, toString
		this.desk = desk; // 매개변수로 받은 것을 set/ElectronicController1의 Desktop 자료형 필드에 저장
	}
	
//	public void method(int a, char b, double c, String d) {
//		// 메소드 method() 호출하며 arguments (10, 'a', 2.2, "해피야, 안녕!") 넣어주면, 각 자료형에 맞게/생긴대로(정수형, 단일 문자, 실수형, 문자열) 들어감
//	}
	
	public void insert(NintendoSwitch ns) {
		this.ns = ns;
	}

	public void insert(SmartPhone sp) {
		this.sp = sp;
	}
	
	// 내가 갖고 있는 상품은 뭐가 있는가?
	// 매개변수가 없는데 메소드 이름이 같으면 어떤 상품/자료형을 부르는지 모르니까 오버로딩 불가능(반환형은 상관 없지만)
	public Desktop selectDesktop() { // 반환형이 Desktop인/Desktop 자료형을 반환하는 메소드/마법상자 selectDesktop
		return desk; // insert(Desktop desk) 메소드로 set해준 것을 get하는 함수
	}
	
	public NintendoSwitch selectNintendoSwitch() {
		return ns;
	}
	
	public SmartPhone selectSmartPhone() {
		return sp;
	}

}
