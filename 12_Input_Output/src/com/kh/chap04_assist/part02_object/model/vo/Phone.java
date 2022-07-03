package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // Serializable(직렬화) = 인터페이스 -> implements(인터페이스 구현) -> 해당 인터페이스 import -> 직렬화를 하겠다고 옵션 부여
	// 인터페이스 구현 -> 인터페이스 안의 추상메소드를 구현/완성시켜야 함
	// 단, Serializable 인터페이스는 실행 구문만 있는 바, implements만 하면 구현됨
	
	// [필드부]
	// 이름, 시리즈, 브랜드, 가격
	// name, series, brand, price
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// [생성자부]
	public Phone() {
		
	}

	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	// [메소드부]
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// shift + alt + s -> generate toString()
	@Override
	public String toString() {
		return "Phone [name=" + name + ", series=" + series + ", brand=" + brand + ", price=" + price + "]";
	}

}
