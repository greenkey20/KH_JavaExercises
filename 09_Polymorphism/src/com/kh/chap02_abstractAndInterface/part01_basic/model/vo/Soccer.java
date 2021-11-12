package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Soccer extends Sports { // "The type volleyball must implement(구현하다) the inherited abstract method Sports.rule()"

	// 미완성된/추상 클래스를 상속받게 되면 부모클래스에 있는 추상메소드를 강제로 오버라이딩 반드시 해줘야 함
	// 마지막 손자는 미완성된 메소드를 구현
	// 여기서도 완성 안 할 거면
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 만지면 안 됩니다");
	}
}
