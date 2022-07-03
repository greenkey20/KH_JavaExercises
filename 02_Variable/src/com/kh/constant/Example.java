package com.kh.constant;

public class Example {
	public static void main(String[] args) {
		
		// 상수(수학) != 상수(프로그래밍)
		// (변수에 대입되는) 변하지 않는(고정된, 수정할 수 없는) 값 = literal = 수학에서의 상수 != 상수(프로그래밍)
				
		// 정수(양수, 음수, 0)
		System.out.println(111); // println(메소드명) 옆 괄호()에 입력했을 때 출력된다는 건 Java가 인식/처리할 수 있다는 의미..
		System.out.println(222);
		System.out.println(-333);
		System.out.println(-444);
		System.out.println(0);
		
		// 실수
		System.out.println(1.0);
		System.out.println(0.2);
		System.out.println(-3.0);
		System.out.println(-0.4);
		System.out.println(0.0); // 실수로써의 zero
				
		// 문자, 문자열
		System.out.println('a'); // 문자 1개는 ""(쌍따옴표) 또는 ''(홑따옴표)로 감쌀 수 있음(성능 등 차이 없음)
		System.out.println("B");
		System.out.println("cdefghijklmnop"); // 문자열은 ''로 감쌀 수 없음
		
		// 논리값(true, false)
		System.out.println(true); // true와 false는 예약어
		System.out.println(false);		
	}
}
