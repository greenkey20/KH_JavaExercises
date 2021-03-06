package com.kh.chap04_field.model.vo;

// 클래스/static 변수와 상수 필드(static final)에 대하여
public class FieldTest3 {
	
	// [필드부]
	public static String sta = "static 변수";
	/* [생성 시점] 프로그램 실행과 동시에 메모리의 static 영역에 할당됨; 객체를 생성하지 않고, 무조건 프로그램 실행과 동시에 할당됨
	 * [종료 시점] 프로그램 종료 시 소멸됨
	 * 
	 * static은 어디 있든 공유해서 사용 가능; '공유'의 개념이 강함; 프로그램 실행과 동시에 메모리 static 영역에 공간을 만들어두고, 그 안에 값을 공유해서 씀
	 * 
	 * private static도 가능 e.g. unique identifiers of objects in the class 매기기 위해서 사용 등
	 */
	
	public static final int NUM = 10;
	/* 상수 필드
	 * 표현법: public static final 자료형 상수필드이름 = 값;
	 * 한 번 지정된 값을 고정해서 쓰는 바, 선언 시 무조건 초기화해줘야 함
	 * 예약어 순서는 상관 없음; public final static으로 써도 됨
	 * 값이 변경되어서는 안 되는 고정적인 값을 static 메모리 상에 올려놓고(-> 프로그램 시작과 동시에 메모리 영역에 할당; 값이 변하지도 않음 e.g. 환경 설정 files 등) 공유할 목적으로 사용
	 * 상수 필드 이름도 항상 모두 대문자
	 * 
	 * private static final도 가능..
	 * 
	 * static: '공유'의 개념; 재사용성
	 * final: 한 번 지정해놓고 변경하지 않겠다(상수 선언)
	 */
	
	/* random() 메소드가 static 메소드 -> Math클래스 random() 호출 시 객체 생성 안 함; 클래스 이름으로 호출/직접 접근 -> Math.random()
	 * Math클래스의 PI 상수 필드도 제공 -> Math.PI
	 */
	
	// [생성자부]
	
	// [메소드부]
	public static void test() {
		System.out.println("hello, Method!");
	}

}
