package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vs.*;

public class FamilyRun {

	public static void main(String[] args) {
		
		// Person p = new Person(); // Person은 추상클래스이므로 객체 생성 불가
		
		// 1. 다형성 적용; 인터페이스 적용 전
		Person mom = new Mother("김엄마", 50, 80, "출산"); // -> mom과 baby1는 
		Person baby1 = new Baby("정아기", 3.3, 90);
		
		System.out.println(mom); // toString() 반환값 문자열 출력됨
		System.out.println(baby1);
		
		// 밥 먹고, 잠자기
//		mom.eat(); // 엄마: 몸무게 + 0.3 -> 인터페이스 사용하면 eat(), sleep()은 자식(o) 부모(x) 것
//		baby1.eat(); // 아기: 몸무게 + 0.1, 건강도 + 5
		
//		mom.sleep(); // 엄마: 건강도 + 5
//		baby1.sleep(); // 아기: 건강도 + 5
		// eat()과 sleep()은 인터페이스에 만들어서 Mother, Baby에서 구현한 것
		// 추상 클래스(Person)는 공통된 필드를 상속을 받기/확장을 위한 용도 -> Person 객체 만들 필요 없음
		// 서로 다른 클래스임에도 불구하고 
		
		// e.g. 그리기() 기능/메소드; 속성 필요 없음 -> 도형(원, 3,4,5..각형, 사다리꼴) 그리기 프로그램 만듦; 각 도형 별로 그려야 하는 것 다름 -> 인터페이스는 implements를 통해 각 도형에서 기능이 구현되도록 하게 하는 것
		// 색칠하기() 기능만 가지고 있는 인터페이스 -> 각 도형 그리기 프로그램(인터페이스 다중 상속 가능하므로) 또는 다른 사물 색칠하기 등으로 사용 가능 
		
		System.out.println("---- 다음 날 ----");
		System.out.println(mom);
		System.out.println(baby1);
		
		// 2. 인터페이스 적용 후
		// Basic b = new Basic(); // 인터페이스는 (미완성)클래스가 아닌 바 객체 생성 불가능
		// 옛날에는 Cabc, Iabc와 같이 명명했음
		Basic mom2 = new Mother("김엄마", 50, 80, "출산");
		Basic baby2 = new Baby("정아기", 3.3, 90);
		// 인터페이스도 참조자료형으로는 사용 가능함
		
		System.out.println(mom2); // toString() 반환값 문자열 출력됨
		System.out.println(baby2);
		
		mom2.eat(); // 엄마: 몸무게 + 0.3 -> 인터페이스 사용하면 eat(), sleep()은 자식(o) 부모(x) 것; 인터페이스에서 받은 것
		baby2.eat(); // 아기: 몸무게 + 0.1, 건강도 + 5
		
		mom2.sleep(); // 엄마: 건강도 + 5
		baby2.sleep(); // 아기: 건강도 + 5
		
		System.out.println("---- 다음 날 ----");
		System.out.println(mom2);
		System.out.println(baby2);
		
	}

}
