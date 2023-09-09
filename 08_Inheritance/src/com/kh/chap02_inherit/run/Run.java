package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// 이름, 연비, 종류, 타이어/날개/프로펠러 크기
		Car c = new Car("미니쿠퍼", 17.3, "경차", 17);
		Ship s = new Ship("오징어잡이배", 2.1, "어선", 15);
		Airplane a = new Airplane("보잉787", 5.4, "여객기", 2, 3);
		
		Vehicle v = new Vehicle("탈것", 1, "이동수단");
		
		// e.g. Address 클래스와 객체 만들어 주소값 출력해보기
		Address ad = new Address();
		System.out.println(ad/*.toString()*/); // com.kh.chap02_inherit.model.vo.Address@2d363fb3
		System.out.println(ad.toString()); // com.kh.chap02_inherit.model.vo.Address@2d363fb3
		// 부모클래스인 Object클래스에 있는 toString() 메소드가 생략된 형태로 그동안 호출했던 것임 <- 자동으로 내부에서 JVM이 호출해줌 
		// toString(): '해당 객체의 full 클래스명 + @ + 해당 객체의 주소값(16진수)' 형태로 변환
		
		// 앞으로 Object클래스의 toString() 메소드를 overriding해서 사용
		System.out.println(c.toString()); // name : 미니쿠퍼, mileage : 17.3, type : 경차, tire : 17
		System.out.println(s.toString()); // name : 오징어잡이배, mileage : 2.1, type : 어선, propeller : 15
		System.out.println(a.toString()); // name : 보잉787, mileage : 5.4, type : 여객기, wing : 2, tire : 3
		
		// 눈에 보이지 않지만/명시되지 않았지만 숨겨져 있는 것; JVM이 하고 있던 일; Java 소스코드 컴파일 시 명시적으로 코딩하지 않을 경우 컴파일러에 의해 자동으로 생성되는 코드
		// 기본생성자(default constructor), super() 생성자, 반환형 void(반환형이 없는) 메소드 body 부분 마지막의 return;, Object클래스 상속, 자동형변환/자동 upcasting, .toString() 주소값 출력, String 참조자료형 사용 시 String 객체 생성, this., import.java.lang*;..
		
		// overriding(자식클래스들은 부모클래스의 howToMove() 메소드('(각 클래스/객체가) 어떻게 동작하는가?')를 상속받아 사용할 수 있음 + 상속받은 자식클래스가 고쳐서/재정의해서 사용 -> 부모클래스 및 각 자식클래스에서 다른 기능을 함)의 예시
		// howToMove(); // 이렇게만 호출하면 어떤 객체의 메소드인지 모르므로 오류; 누가 움직이는지 알려줘야 함
		System.out.println("부모클래스의 howToMove() 메소드 호출");
		v.howToMove(); // 움직인다
		
		System.out.println("자식클래스의 howToMove() 메소드 호출");
		c.howToMove(); // 바퀴가 굴러서 움직입니다
		s.howToMove(); // 프로펠러를 돌려서 떠다닙니다
		a.howToMove(); // 바퀴로 달리다가 날개로 날아요
		
	}

}
