package com.kh.chap02.objectarray.model.vo;

public class Phone {
	
	// [필드부]
	// 이름, 시리즈, 브랜드명, 가격
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// [생성자부]
	// 기본생성자
	public Phone() {
		
	}
	
	// 모든 필드에 대한 매개변수 생성자 -> 이거 만들면 JVM이 기본생성자 안 만들어주므로, 기본생성자 습관적으로 꼭 만들기
	public Phone(String name, String series, String brand, int price) {
		// 초기화
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
	
	public String information() {
		return name + ", " + series + ", " + brand + ", " + price;
	}

}
