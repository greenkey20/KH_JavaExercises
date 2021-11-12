package com.kh.chap02_abstractAndInterface.part02_family.model.vs;

public class Mother extends Person implements Basic {
	
	private String babyBirth; // String[] 배열로 만들어 = {"출산", "입양", "없음"} 초기화시켜줄 수도 있고..
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother [ " + super.toString() + ", babyBirth : " + babyBirth + "]"; 
	}

	@Override
	public void eat() { // 엄마가 밥을 드시면 몸무게가 증가함
		// 수정 후 몸무게 = 기존 몸무게(부모클래스 필드의 weight) + 증가하는 몸무게
		super.setWeight(super.getWeight() + 0.3);
		// 객체지향에서는 앞에 참조할 객체가 있어서 누구 것인지를 항상 알려줘야 함
		// 메소드는 명령형으로 해석하자
	}
	
	@Override
	public void sleep() { // 엄마가 주무시면 건강해지심
		super.setHealth(super.getHealth() + 5);
	}

}
