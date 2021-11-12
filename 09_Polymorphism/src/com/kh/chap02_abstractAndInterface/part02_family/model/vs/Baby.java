package com.kh.chap02_abstractAndInterface.part02_family.model.vs;

public class Baby extends Person implements Basic {
	
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// toString = 오버라이딩 ou 확장 기능(-> 추후 Spring에서 많이 봄)
	@Override
	public String toString() {
		return "Baby [ " + super.toString() + "]"; 
	}
	
	@Override
	public void eat() { // 아기가 밥 먹을 때는
		super.setWeight(super.getWeight() + 0.1); // 몸무게 0.1 증가
		super.setHealth(super.getHealth() + 5);// 건강도 5 증가
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 5);// 건강도 5 증가
	}

}
