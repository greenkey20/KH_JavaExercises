package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// 이름, 연비, 종류, 타이어/날개/프로펠러 크기
		Car c = new Car("미니쿠퍼", 17.3, "경차", 17);
		Ship s = new Ship("오징어잡이배", 2.1, "어선", 15);
		Airplane a = new Airplane("보잉787", 5.4, "여객기", 2, 3);
		
		Vehicle v = new Vehicle("탈것", 1, "이동수단");
		
		// 앞으로 Object클래스의 toString() 메소드를 overriding해서 사용
		// toString(): 해당 객체의 full 클래스명 + @ + 해당 객체 주소값(16진수) 형태로 변환
		
		// Address 클래스와 객체 만들어 주소값 출력하는 것 따라서 못 함..
		
		// 눈에 보이지 않지만/명시되지 않았지만 숨겨져 있는 것; JVM이 하고 있던 일: super() 생성자, toString() 주소값 출력, Object클래스 상속, 반환형 void 메소드의 return;, 기본생성자, 자동형변환, String 참조자료형 사용 시 String 객체 생성.. 
		
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println(a.toString());
		
		// howToMove(); // 어떤 객체의 메소드인지 모르므로 오류; 누가 움직이는지 알려줘야 함
		// 부모클래스의 toString() 메소드 호출
		System.out.println("부모클래스의 howToMove() 메소드 호출");
		v.howToMove();
		
		System.out.println("자식클래스의 howToMove() 메소드 호출");
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
	}

}
