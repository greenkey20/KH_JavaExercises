package com.kh.teamwork2.baskin.model.vo;

public abstract class Baskin { // 추상 클래스 Baskin

	// 필드부
	// 각 맛별 아이스크림 갯수 & 가격
	private int icecreamNum; // 사이즈 별 맛을 담을 변수선언
	private int price; // 사이즈 별 가격을 담을 변수선언
	private String name; // 사이즈의 이름을 담을 변수선언
	private String[] flavor = new String[10]; // 10가지 맛을 담을 배열선언
	{ // 10가지 맛 초기화
		flavor[0] = "뉴욕 치즈 케이크";
		flavor[1] = "엄마는 외계인";
		flavor[2] = "아몬드 봉봉";
		flavor[3] = "바람과 함께 사라지다";
		flavor[4] = "민트 초코";
		flavor[5] = "사랑에 빠진 딸기";
		flavor[6] = "레인보우 샤베트";
		flavor[7] = "그린티";
		flavor[8] = "슈팅스타";
		flavor[9] = "찰떡콩떡";
	}

	// 생성자부
	public Baskin() {
	}

	public Baskin(int icecreamNum, int price) {
		this.icecreamNum = icecreamNum;
		this.price = price;
	}

	// 메소드부
	public int getIcecreamNum() {
		return icecreamNum;
	}

	public void setIcecreamNum(int icecreamNum) {
		this.icecreamNum = icecreamNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String[] getFlavor() {
		return flavor;
	}

	public void setFlavor(String[] flavor) {
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
