package com.kh.practice3.model.vo;

public class Dog extends Animal {
	
	public static final String PLACE = "애견 카페";
	private double weight;
	
	public Dog() {
//		super();
	}

	public Dog(String name, String kinds, double weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg입니다.");
	}

}
