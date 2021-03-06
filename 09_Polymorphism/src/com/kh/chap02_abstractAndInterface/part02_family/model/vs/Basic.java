package com.kh.chap02_abstractAndInterface.part02_family.model.vs;

/* interface
 * 
 * 표현법
 * 접근제한자 interface 인터페이스이름 {
 * 		상수 필드
 * 		추상 메소드		
 * }
 * 
 * 상수 필드와 추상 메소드만으로 이루어진 추상 클래스의 변형체
 * 인터페이스에서 무조건 필드는 상수 필드(키워드 static final -> static 메모리 영역에 프로그램 시작 시 할당되어 프로그램 종료 시까지 존재; 프로그램 동작 중에 같은 이름의 변수가 생길 일 없음) + 메소드는 무조건 추상 메소드
 * 무조건 구현해야 하는 것이 있을 때 인터페이스에 틀만 만들어두고 상속하게 됨
 * 
 * Java에서는 메소드 및 필드 충돌 때문에 단일 상속(한 번에 한 번 상속)만 가능 vs 인터페이스는 다중 상속을 허용/다중 상속해도 문제 발생 여지 없음; 메소드가 겹치더라도 최종 구현 부분은 실제 구현 클래스에서 기술하기 때문에 
 * 인터페이스는 클래스가 아님
 * Java 초기 문법 배울 때는 인터페이스 사용할 일 별로 없음; 2-3년차 대리 정도 되면 사용하는 과업들 주어질 것..
 * 
 * 추상 클래스보다 좀 더 강한 규칙성/강제성을 가짐
 * 
 * 추상 클래스와 인터페이스
 * 1. 공통점
 * 객체 생성은 안 되나, 참조변수로 사용은 가능(-> 다형성 적용 가능)
 * 상속하는 클래스에 추상 메소드를 오버라이딩(추상 메소드의 몸통 구현)하도록 강제
 * 추상클래스도 추상클래스를 상속할 수 있고, 인터페이스는 인터페이스를 상속할 수 있음
 * 
 * 2. 차이점: 존재하는 목적이 다름
 * 추상 클래스: 클래스 멤버로 변수 및 함수 생성이 가능하고, 추상 메소드가 포함되어 있거나 abstract 키워드를 통해 정의됨 -> 추상 클래스를 상속받아 기능을 이용하고 자식클래스에서 클래스 확장해서 씀
 * 인터페이스: 모든 필드는 상수 필드 + 모든 메소드는 추상 메소드로 정의 -> 클래스의 기능/메소드 구현을 강제하기 위해 사용 -> 구현을 강제함으로써 구현 객체의 같은 동작을 보장할 수 있음
 * 
 * extends(상속받다) vs implements(구현하다)
 * 클래스 간의 상속 관계: 자식클래스 extends 부모클래스
 * 클래스와 인터페이스의 구현 관계: 클래스 implements 인터페이스
 * 인터페이스 간의 상속 관계: 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2.. (다중 가능)
 */

public interface Basic {
	
	// 인터페이스 정의: 인터페이스에서는 무조건 상수 필드와 추상 메소드 밖에 정의되므로, 접근제한자와 예약어 생략 가능(명시적으로 써줘도 되긴 하지만)
	
	// [상수 필드]
	/* public static final */ int NUM = 10; // 변수
	
	// [추상메소드]
	
	/* public abstract */ void eat();
	/* public abstract */ void sleep();
	
	// 필기 2줄 정도 못함..
	
	// static 메소드 = ___(설명 못 들음) (+객체 생성 없이 사용 가능)
	// final 메소드 = 오버라이딩 안 되게 함

}
