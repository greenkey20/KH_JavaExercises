package com.kh.array.run;

import com.kh.array.A_Array;
import com.kh.array.B_ArrayCopy;
import com.kh.array.Homework;

public class Run {
	
	public static void main(String[] args) {
		
		A_Array a = new A_Array();
		// [좌항] 자료형(data type) 변수명 = 변수 선언; a = 객체
		// A_Array = 클래스 = 사용자 정의 자료형 = 참조자료형(주소값이 저장되어 있음; String을 제외하고는 .(참조연산자)를 붙여야 해당 주소를 찾아갈 수 있음) -> 내가 만든 자료형으로 변수 선언
		// [대입 연산자 =] 우항의 값을 좌항의 변수 공간에 대입
		// [우항] 뭔가 만들어서(new) a라는 변수에 대입
		
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.method7();
//		a.method8();
		
		B_ArrayCopy b = new B_ArrayCopy();
		b.method1();
		b.method2();
		b.method3();
		b.method4();
		b.method5();
		
		Homework h = new Homework();
//		h.exercise1();
//		h.exercise2();
//		h.exercise3();
		
	}

}
