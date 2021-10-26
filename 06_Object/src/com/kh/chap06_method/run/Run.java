package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;
import com.kh.chap06_method.controller.OverloadingTest;

public class Run {

	public static void main(String[] args) {
		
		/*
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();
		
//		String a = mt1.method2(); // Type mismatch; 대입할 자료형 맞춰야 함
		int a = mt1.method2(); // Type mismatch; 대입할 자료형 맞춰야 함
		System.out.println("랜덤값 : " + a);
		System.out.println("랜덤값 : " + mt1.method2()); // 이 값 다시 안 쓸 것 같으면 굳이 변수 a 사용할 필요 없음
		
		mt1.method3(1, 3); // arguments(인자) 입력 안 하면 오류
		
		System.out.println(mt1.method4(1, 3)); // 반환 받은 값 어떻게 쓸지는 내가 정해야 함
		
		MethodTest2 mt2 = new MethodTest2();
		// static: 객체를 생성하지 않아도 호출 가능; 프로그램 실행~종료 시점동안 메모리에 남아있음; 첫번째 시간 HelloWorld 클래스에서 맛보기 했음
		// 표현법: 클래스이름.메소드이름();
		
		MethodTest2.method1(); // 메소드 내 println으로 콘솔에 출력
		System.out.println(MethodTest2.method2()); // 반환받은 값을 main메소드에서 출력 
		MethodTest2.method3("해피", 4); // 메소드 내 println으로 콘솔에 출력
		System.out.println(MethodTest2.method4("해피", 4)); // 반환받은 값을 main메소드에서 출력
		*/
		
		OverloadingTest ot = new OverloadingTest();
		
		// test라는 메소드를 다양한 매개변수에 따라 여러 개 만들어놨기 때문에 호출 시 다양한 인자를 넣어서 호출 가능
		ot.test();
		ot.test(4);
		ot.test(1, "사랑해");
		ot.test("나도 사랑해", 2);
		
	}

}
