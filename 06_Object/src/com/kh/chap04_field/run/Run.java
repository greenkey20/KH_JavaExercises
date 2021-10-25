package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.*; // com.kh.chap04_field.model.vo 안의 모든 클래스를 가져다 씀

public class Run {

	public static void main(String[] args) {
		
		// 1. FieldTest1
		FieldTest1 f1 = new FieldTest1(); // 객체 생성(new 키워드 사용) 시 global 멤버변수가 heap 영역에 할당
		// f1도 main메소드 안에서만 사용할 수 있는 지역변수 -> stack 영역에 할당; f1에는 f1이라는 객체의 heap 영역 주소값이 들어가 있음 -> 이 주소값을 따라가면 global이라는 멤버변수 접근 가능(f1.global)
		
		f1.test(10); // test 메소드 호출 시 num(메소드의 argument로써 10이라는 값이 저장되어 있음), local(클래스에서 초기값 0으로 초기화되어있음) 지역변수가 stack 영역에 할당
		// -> test 메소드 호출 종료 시 num, local은 test 메소드 안에 있는 지역변수인 바 소멸
		
		System.out.println(f1);
		f1 = null; // f1의 주소값으로 null 값 대입 -> null로써 참조하는 객체의 주소값 연결 끊음 -> heap 영역의 f1 객체를 가리키는 존재(?)는 없어짐; reference count = 0 -> garbage collector가 와서 객체에 할당되었던(?) 메모리 되가져감 -> f1 객체에 있던/f1 객체의 것이었던 global 멤버변수 소멸
		// stack 영역에 f1 공간은 살아있으나, 연결된 heap 영역의 주소값이 없음
		System.out.println(f1);
		
		// main메소드는 계속 사용 가능함; 단 global 멤버변수는 f1 객체가 소멸되며 소멸되어 사용할 수 없음 -> global 멤버변수는 객체/인스턴스가 살아있어야만 사용할 수 있으므로 전역변수(x) 멤버/인스턴스변수(o)라고 불러야 함
		// static이라는 키워드를 붙이면 프로그램 시작~종료 시, 즉 전역에서 사용 가능
		
		// 2. FieldTest2
		FieldTest2 f2 = new FieldTest2();
		
		// public: 어디서든 접근 가능
		System.out.println(f2.pub); // 직접 접근 가능
		
		// protected: 같은 패키지에서는 직접 접근; 다른 패키지에서는 상속 구조만 직접 접근 가능
//		System.out.println(f2.pro); // 이렇게 직접 접근 불가능
		
		// default: 같은 패키지 내부에서만 접근 가능
//		System.out.println(f2.df); // 이렇게 직접 접근 불가능
		
		// private: 해당 클래스에서만 접근 가능
//		System.out.println(f2.pri); // 이렇게 직접 접근 불가능
		
		// 3. FieldTest3
//		FieldTest3 f3 = new FieldTest3();
		
		System.out.println(FieldTest3.sta); // public static String sta 특징: 객체 생성하지 않아도 사용 가능 -> 객체 참조하지 않아도 됨; 클래스 참조 -> 클래스명 반드시 적어줘야 함, 다른 클래스에도 변수 이름이 중복될 수 있으므로..
		// new.FieldTest3(); 객체 생성 필요 없음
		System.out.println(FieldTest3.NUM); // public static final int NUM
		
		System.out.println(Math.PI);

	}

}
