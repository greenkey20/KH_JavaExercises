package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

/* 추상클래스
 * 
 * 표현법: 접근제한자 abstract class 클래스이름 {
 * abstract: 예약어; 추상클래스, 추상메소드 선언 시 붙임
 * 
 * 추상메소드가 존재하는 순간 추상클래스로 정의됨 -> abstract라는 예약어를 사용해서 정의해야 함
 * 객체 생성이 불가능함; 부모클래스 구실은 가능 -> 다형성 적용 가능
 * 추상 클래스 = 미완성 설계도
 * 
 * 추상 클래스 == 추상메소드 + 일반필드 + 일반메소드 -> 3가지 모두 생략 가능; 개발자의 역량/판단에 따라 추상 메소드가 없어도 추상 클래스로 정의 가능
 * 
 * 사용 examples)
 * 개념적으로 개발자가 판단했을 때 해당 클래스가 아직 구체적으로 덜 구현된 상태인 것 같을 때
 * 기술적으로 개발자가 판단했을 때 이 클래스는 객체 생성이 불가능해야 할 때
 */

public abstract class Sports {
	
	private int people; // 선수 숫자
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() { // toString을 오버라이딩 받아서 쓴다는 의미; 자식클래스에서는 toString() 안 씀
		return "people : " + people;
	}
	
	// 추상메소드 (vs 구체클래스(구현을 구체적으로 해 둔 것))
	// 표현법: 접근제한자 abstract 반환형 메소드이름();
	public abstract void rule(); // 메소드 선언했는데, 메소드 signature만 있고, 메소드의 몸통(body, code block) 없음
	// 자식들에게 자료형을 나눠주기 위한/다형성을 위한 용도로만 사용; 규칙이 없는 Sports 종목은 없음; Sports의 부모클래스로서만 존재 
	
	/* method body가 존재하지 않는 미완성 메소드 -> 미완성 메소드가 하나라도 포함되는 순간 해당 클래스는 미완성(추상) 클래스가 됨 -> 해당 클래스명 앞에도 abstract 예약어 씀
	 * abstract라는 예약어를 써서 정의해야 함
	 * 구체적인 구현을 빼버리고 추상화만 한 것
	 */

}
