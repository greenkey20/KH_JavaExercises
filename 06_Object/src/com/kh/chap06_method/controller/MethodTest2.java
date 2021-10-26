package com.kh.chap06_method.controller;

public class MethodTest2 {
	
	// static 메소드 만들기 -> static에 대한 예시
	
	// 1. 매개변수가 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다");
	}
	
	// 2.
	public static String method2() {
		return "매개변수는 없지만 반환값은 있는 메소드입니다";
	}
	
	// 3.
	public static void method3(String name, int age) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드입니다");
		System.out.println(name + " 님, " + age + "살!");
	}
	
	// 4.
	public static String method4(String name, int age) {
		System.out.println("매개변수와 반환값이 둘 다 있는 메소드입니다");
		return name + " 님, 안녕하세요! " + age + "세이시죠?";
	}
	
	/* 반환형 없는 메소드: 출력문 작성하는 편
	 * 반환형 있는 메소드: 호출하는 부분에서 출력문을 작성
	 */
		
		

}
