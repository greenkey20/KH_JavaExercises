package com.kh.chap02_beforeVSafter.after.model.vo;

/* 상속: 매 클래스마다 중복된 필드 및 메소드들을 단 한 번 또 하나의 클래스(부모 클래스)로 정의해 둔 후 해당 클래스의 내용을 가져다 쓰는 개념;
 * 기존의/원래있는 클래스(부모 클래스 e.g. Product)를 이용해서 새로운 클래스(자식 클래스; 기존 클래스보다 plus 요소가 있는/뭔가 바뀐/개선된 것이 있는, 원래 적혀있는 것 적지 않고(o) 코드 복사해서 수정(x))(들 e.g. Desktop, SmartPhone, Tv 등)를 만듦
 * 
 * 부모가 있어야 자식이 존재함/될 수 있음
 * 
 * 현재는 많은 단점이 발견되었지만, 그래도 적재적소에 잘 쓰면 좋은 기술..
 * 
 * Desktop, SmartPhone, Tv 클래스에 개발자가 그렇게 짰기 때문에 반복이 많음 + 공통적으로 묶을 수 있는 속성들(가전제품)
 * -> 3개 클래스에 중복되는 codes/부분들(필드 4개 선언, 매개변수 생성자 초기화 4줄, 공통 필드 4개의 setters 및 getters, information 메서드 일부..)을 모아보자
 * -> Desktop, SmartPhone, Tv는 이제 Product 클래스의 내용이 필요하다 -> '상속'
 */

// 부모(parent)-자식(Java에서 많이 사용하는 표현? 설명 놓침) 클래스
// 조상-후손 클래스
// 상위-하위 클래스
// 슈퍼-서브 클래스
// 확장-파생 클래스

public class Product { // 제품/상품
	
	// 공통되는 필드: brand, pCode, pName, price
	// [필드부]
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// [생성자부]
	public Product() {
		System.out.println("부모 객체 생성");
	}

	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// [메소드부]
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() { // 문자열로 반환
		return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price;
	}

}
