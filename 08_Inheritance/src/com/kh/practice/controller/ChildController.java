package com.kh.practice.controller; // 프로그램의 기능(메소드 포함)을 담당할 때 사용하는 패키지; 기능적인 부분 수행

import com.kh.practice.model.vo.Child;

public class ChildController { // Child(value(값)만 있으면 됨/필요함)의 기능적인 부분 수행
	// 3개의 숫자를 사용자로부터 입력받아(Scanner)의 합과 곱을 계산해서 보여주는 프로그램
	// 메소드는 하나의 기능을 수행하도록 작성하는 것이 좋음
	
	// [필드부]
	private Child c = new Child(); // Child라는 자료형의 c라는 변수; 객체 생성 = ChildController의 멤버/인스턴스변수
	
	// [생성자부]
	
	// [메소드부]
	public int calcSum(int x, int y, int z) { // 세 수를 더하는 메소드; 외부에서 접근 가능해야 하므로 public; 반환값 int; 3개의 정수를 매개변수로 받음
		c.setX(x); // Child라는 자료형의 객체 c에 값을 넣음
		c.setY(y);
		c.setZ(z);
		return c.getX() + c.getY() + c.getZ(); // int형 계산 결과를 반환함
	}
	
	public int calcTimes(int x, int y, int z) { // 세 수의 곱을 구하는 메소드
		c.setX(x);
		c.setY(y);
		c.setZ(z);
		return c.getX() * c.getY() * c.getZ();
	}

}
