package com.kh.operator;

public class D_LogicalNegation {
	
	/* 논리 부정 연산자: 논리값(true, false)을 반대로 바꿔주는 연산자
	 * 표현법: !논리값	 * 
	 */
	
	public void method() {
		System.out.println("true의 부정 : " + !true); // false
		System.out.println("false의 부정 : " + !false); // true
		
		boolean b1 = true; // b1이라는 논리형 변수/메모리공간에 true 값을 저장
		boolean b2 = !b1; // b2라는 논리형 변수/메모리공간에 !true(=false) 값을 저장
		
		System.out.println("b1 : " + b1); // true
		System.out.println("!b1 : " + !b1); // false
		System.out.println("!!b1 : " + !!b1); // true
		System.out.println("b2 : " + b2); // false
		
	}

}
