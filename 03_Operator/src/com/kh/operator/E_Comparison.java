package com.kh.operator;

public class E_Comparison {
	
	/* 비교/관계 연산자: 두 개의 값을 가지고 비교; 이항 연산자
	 * 피연산자는 보통 숫자; 결과값은 논리값 -> 비교 연산을 한 결과, 참인 경우 true, 거짓인 경우 false 반환
	 * 특정 조건을 제시할 수 있는 조건문에서 쓰일 예정 
	 */
	
	/* 종류
	 * 1. 크고 작음을 비교
	 * a < b: a가 b보다 작습니까?
	 * a > b: a가 b보다 큽니까?
	 * a <= b: a가 b보다 작거나 같습니까?
	 * a >= b: a가 b보다 크거나 같습니까?
	 * 
	 * 2. 일치함을 비교(동등 비교)
	 * a == b: a와 b가 일치합니까?
	 * a != b: a와 b가 일치하지 않습니까?
	 */
	
	public void method() {
		int a = 10;
		int b = 25;
		
		System.out.println("a < b : " + (a < b)); // true
		System.out.println("a <= b : " + (a <= b)); // true
		System.out.println("25 <= b : " + (25 <= b)); // true
		
		boolean result1 = (a == b); // 비교연산자가 괄호로 우선순위 묶어주는 것이 한 눈에 우선순위를 보기 더 좋음; 괄호 없어도 결과는 동일
		System.out.println("result1 : " + result1); // false
		
		boolean result2 = (a != b);
		System.out.println("result2 : " + result2); // true
		
		System.out.println("a - b < 0 : " + (a - b < 0)); // true
		
		System.out.println("a가 짝수입니까? : " + (a % 2 == 0)); // true
		System.out.println("a가 홀수입니까? : " + (a % 2 != 0)); // false
		System.out.println("b가 홀수입니까? : " + (b % 2 != 0)); // true
		
	}

}
