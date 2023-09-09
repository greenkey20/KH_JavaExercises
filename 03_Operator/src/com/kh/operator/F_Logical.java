package com.kh.operator;

import java.util.Scanner; // 패키지 선언문 아래에 import

public class F_Logical {
	
	/* IT = physical(hardware적인 것) + logical/virtual(software적인 것, Java..)
	 * 
	 * 논리 연산자: 이항 연산자; 2개의 논리값을 연산하는 연산자
	 * 표현법: 논리값 논리연산자 논리값 -> 결과값도 논리값(연산 기본 원칙에 따라)
	 * 
	 * 종류
	 * 1. AND 연산자: 논리값 && 논리값; 좌항과 우항의 값이 모두 true이어야만 최종 결과가 true
	 * 2. OR 연산자: 논리값 || 논리값; 좌항 또는 우항의 값 중 하나라도 true이면 최종 결과가 true
	 */
	
	// AND
	public void method1() {
		// 사용자가 입력한 정수값이 양수"이면서/이고" 짝수인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && ((num % 2) == 0); // 조건1(num이 양수입니까?) 제시 && 조건2(num이 짝수입니까?) 제시
		// &&의 의미 = A이면서, B이고, 그리고..
		
		System.out.println("정수가 양수이면서 짝수입니까? : " + result);
		
//		sc.close(); // 경고 메시지 "Resource leak: 'sc' is never closed"
					// 그런데 막상 이거 쓰면 method1()에서 method2()로 넘어가며 사용자 입력받을 때 오류남(Exception in thread "main" java.util.NoSuchElementException)
			
	}
	
	public void method2() {
		// 입력한 정수값이 1 이상 100 이하인지 확인; 수학에서는 "1 <= num <= 100"로 표현; 컴퓨터에서는 "num이 1보다 크거나 같"고" "그리고" 100보다 작거나 같습니까?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (1 <= num) && (num <= 100); // (num >= 1) 대신 -> 보다 직관적으로 읽힘
		
		System.out.println("정수가 1 이상 100 이하입니까? : " + result);
		
	}
	
	public void method3() {
		// 사용자가 입력한 값이 A(대문자)인지 a(소문자)인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 하나 입력 : ");
		char gender = sc.nextLine().charAt(0); // 입력받은 line 중 첫번째 문자를 gender라는 변수로 대입함
		
		// int로 자동형변환이 되기 때문에 문자 비교 연산 가능
		boolean result = (gender == 'A') || (gender == 'a');
		// ||의 의미 = A이거나, 또는, B이거나..
		
		System.out.println("알파벳 a 또는 A입니까? " + result);
		
	}
	
	/* 진리표
	 * &&: 두 개의 조건이 모두 true일 때 결과가 true
	 * true && true -> true
	 * true && false -> false
	 * false && true -> false
	 * false && false -> false
	 * 
	 * ||: 두 개의 조건 중 하나라도 true이면 결과가 true
	 * true || true -> true
	 * true || false -> true
	 * false || true -> true
	 * false || false -> false
	 */
	
	public void method4() {
		int num = 10;
		boolean result = false && (num > 0); // Java의 shortcut 연산; "dead code" 경고msg
		// 첫번째 피연산자가 false니까 뒤의 비교 연산 구문(dead code)을 굳이 실행하지 않음
		// dead code: 실행 오류는 나지 않지만, 결과값이 false일텐데 굳이 왜 쓰지? -> 굳이 쓸 필요 없는 codes -> 안 좋은 codes
	}
		
}

