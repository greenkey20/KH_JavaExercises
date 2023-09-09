package com.kh.chap02_abstractAndInterface.part02_family.model.vs;

public /*abstract*/ class Person {
	// inter(경계, 사이의)face(면) = 경계면
	
	// C 언어에서 구조체 = 변수 모아둠
	// Java 언어에서 인터페이스 = 추상메소드만 모아둠
	// Java 언어에서 클래스 = 변수와 메서드 모아둠
	
	private String name;
	private double weight;
	private int health; // 건강도?
	
	public Person() {
		
	}
	
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "name : " + name + ", weight : " + weight + ", health : " + health;
	}
	
//	public abstract void eat();
//	public abstract void sleep();

}
