package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	/* 메소드 오버로딩: 한 클래스 안에 같은 메소드명으로 여러 메소드들을 정의할 수 있는 방법
	 * 매개변수의 자료형의 갯수, 순서, 종류가 다 다르게 작성되어야 함
	 * 단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 주지 않음
	 */
	
	// 메소드 이름은 test로 통일
	public void test() { // 매개변수 없음
		System.out.println("안녕하세요?"); // println(줄바꿔 출력하는 기능)의 매개변수로 문자열, 논리형, 정수형 등 여러 가지 사용 가능
		System.out.println(true);
		System.out.println(1234567890);
	}
	
	public void test(int a) { // 매개변수로 정수 1개 받음
		System.out.println("이건 int a 하나만 매개변수로 받았어요");
	}
	
	public void test(int a, String s) {
		System.out.println("이건 int a 먼저, String s 두번째로 받았어요");
	}
	
	public void test(String s, int a) {
		System.out.println("이건 String s 먼저, int a 두번째로 받았어요");
	}
	
	public void test(int a, int b) {
		System.out.println("이건 int a, int b 받았어요");
	}
	
	// 정수형 2개를 받는 test를 하나 더 만들면 -> 매개변수의 이름과는 상관없이 자료형의 갯수 순서가 같기 때문에 error 발생
	// 즉, 매개변수의 자료형의 갯수와 순서가 항상 다르게 작성되어야 함
	/*
	public void test(int c, int d) {
		
	}
	*/
	
	public void test(int a, int b, char c) {
		System.out.println("이건 int a, int b, char c 받으면 구분 가능해요");
	}
	
	// 메소드 호출 시 반환형을 명시하지 않는 바, 반환형이 다르다고 오버로딩이 적용되지 않음; 반환형과 상관없이 매개변수의 자료형의 갯수와 순서가 다르게 작성되어야 함
	// 메소드를 호출하는 시점에서 매개변수가 동일하면 error 발생
	/*
	public void test(int a , int b, String s) {
		System.out.println("안녕하세요");
	}
	*/
	
	public int test(int a , int b, String s) {
		return a + b;
	}
	
	// 매개변수의 이름(내가 임의로 지어주는 것)이 다르다고 오버로딩이 적용되지 않음
	/*
	public int test(int b, int a, String s) {
		return a + b;
	}
	*/
	
	// 접근제한자가 다르다고 오버로딩이 적용되지 않음
	// 메소드를 호출하는 시점에서 매개변수가 동일하면 error 발생
	/*
	private void test(int a , int b, String s) {
		System.out.println("안녕하세요");
	}
	*/

}
