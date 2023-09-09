package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/* 산술연산자: 2항 연산자; 연산 방법, 우선순위가 일반 수학 산술과 동일
	 * + : 덧셈
	 * - : 뺄셈
	 * * : 곱셈
	 * / : 나눗셈
	 * % : 모듈러(modular); 나눗셈에서의 나머지를 구함
	 */

	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1 + "\nnum2 : " +num2);
		System.out.println("덧셈 코드가 잘못된 경우 num1 + num2 : " + num1 + num2);
		// 괄호로 묶지 않고 이렇게 출력하면 첫번째 피연산자 String(문자열) 때문에 num1의 값도 String(문자열)으로 인식되는 바(+연산자는 String끼리 붙여주는 역할을 해서), "10" + "3" 결과로 103이 찍힘
		// 문자열 + 정수10 = 문자열 10 -> 문자열 10 + 정수3 = 문자열 103 -> 결과값은 103
		System.out.println("num1 + num2 : " + (num1 + num2)); // (num1 + num2) 수식을 괄호로 묶어줘야 13이라는 결과값이 나옴
		
		System.out.println("num1 - num2 : " + (num1 - num2)); // 뺄셈의 경우 괄호로 묶지 않으면 첫번째 피연산자 문자열과 num1을 하나로 묶어서 새로운 문자열을 만들기 때문에 오류가 발생
		
		System.out.println("num1 × num2 : " + (num1 * num2)); // *, /, % 연산자의 우선순위가 +, -보다 높기 때문에 괄호로 묶지 않아도 먼저 연산이 됨
		System.out.println("num1 ÷ num2 : " + (num1 / num2)); // 우선순위 상 괄호 안 써도 되지만, 연산 우선순위를 나타내는 가독성을 위해 괄호로 묶어줄 것을 권장함
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		// 특이케이스
//		System.out.println(5/0); // 0으로 나누는 것을 컴퓨터가 처리할 수 없다고 Java의 ArithmeticException 클래스(수학 관련)에서 error msg 뜸
//		System.out.print(5%0); // 0으로 나누는 것을 컴퓨터가 처리할 수 없다고 Java의 ArithmeticException 클래스(수학 관련)에서 error msg 뜸
		System.out.println(5.0/0); // 출력 결과 = infinity(무한대) <- 실수인 경우 0이 아닌 무한소수로 나눈다?(강사님 설명 제대로 못 들음)
			
	}
	
	// 사탕 나눠주기 프로그램
	// 메서드명: methodCandy
	// 입력 받을 값: 1. 인원 수
	//			  2. 전체 사탕 갯수
	// 1인당 가질 수 있는 사탕의 갯수: 사탕 갯수 / 인원 수
	// 남은 사탕의 갯수: 사탕 갯수 % 인원 수
	// 출력 형식: 1인당 가질 수 있는 사탕의 갯수 : x개
	//		   남는 사탕의 갯수 : x개
	public void methodCandy() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 인원 수는 몇 명이니?");
		int ppl = sc.nextInt(); // int 자료형으로 입력받아 int형 변수에 저장..
		
		System.out.print("총 사탕 갯수는 몇 개니?");
		int candy = sc.nextInt();
		
		System.out.println("1인당 가질 수 있는 사탕의 갯수 : " + (candy / ppl));
		System.out.println("남는 사탕의 갯수 : " + (candy % ppl));	
	}

}
