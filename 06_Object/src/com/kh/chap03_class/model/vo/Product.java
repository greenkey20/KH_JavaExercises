package com.kh.chap03_class.model.vo;

// 클래스에 대해 사용할 수 있는 접근제한자 2가지 = public(외부(다른 패키지)에서 접근 가능한 접근제한자) vs default(package friendly, 패키지에 친화적인; 해당 패키지 안에서만 접근 가능한)
public class Product {
	// 상품명, 상품가격, 브랜드명
	
	// [필드부]
	private String productName; // 캡슐화 단계1) 멤버변수에 대해 사용할 수 있는 접근제한자 private = 클래스 내부에서 클래스의 메소드를 통해 접근
	private int price;
	private String brandName = "애플"; // "애플"로 초기화를 해줌
		
	// [생성자부]
		
	// [메소드부]
	// 캡슐화 단계2)
	// setters
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	// getters
	public String getProductName() {
		return this.productName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String brandName() {
		return this.brandName;
	}
		
	// information(): 필드 모아서 예쁘게 반환하기
	public String information() {
		return "상품명 : " + productName + ", 상품가격 : " + price + ", 브랜드명 : " + brandName;
	}

}
