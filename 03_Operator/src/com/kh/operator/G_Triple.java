package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/* 3항 연산자: 피연산자가 3개 -> 값 3개와 연산자 1개로 이루어짐; 조건식 형식으로 쓰임
	 * 조건식: 결과값에 따라서 연산을 처리하는 방식 -> 결과값이 참일 경우 식1을 처리하고, 결과값이 거짓일 경우 식2를 처리
	 * 표현법: 조건식 ? 조건이 true일 경우의 결과값 : 조건이 false일 경우의 결과값 
	 */
	
	// 앞으로 프로그래밍하면서 '조건식'을 잘 세워야 함..
	
	public void method1() {
		// 사용자가 입력한 값이 양수인지 아닌지 판별 후 그에 맞는 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? " 0보다 크다(양수이다)" : " 0보다 작거나(음수이거나) 같다(0이다)";
						// 조건식? 조건이 true일 경우의 결과값 : 조건이 false일 경우의 결과값
		
		System.out.println(num + "는/은" + result);
		
		System.out.println(num + "는/은" + ((num <= 0) ? " 양수가 아니다" : " 양수이다")); // 짝이 되는 괄호 잘 찾기
		// 결과값은 같은 값/내용을 출력하지만, 조건에 따라 참/거짓 결과가 다르므로 결과가 다르게 나올 수 있음
		
	}
	
	public void method2() {
		// 짝/홀수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : " );
		int num = sc.nextInt();
		
		String result1 = (num % 2 != 0) ? " 홀수이다" : " 짝수이다";
		String result2 = (num % 2 == 1) ? " 홀수이다" : " 짝수이다";
		String result3 = (num % 2 == 0) ? " 짝수이다" : " 홀수이다";
		// 다 맞는 것임; 여러 가지 방법이 있을 수 있음
		
		System.out.println(num + "는/은" + result1);
		System.out.println(num + "는/은" + result2);
		System.out.println(num + "는/은" + result3);
		
	}
	
	public void method3() {
		// 영문자 하나를 입력받아 대문자인지 아닌지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ('a' <= ch) && (ch <= 'z') ? " 소문자이다" : " 대문자이다"; // 조건식에서 문자들은 int형으로 계산됨; int로 자동형변환이 되기 때문에 문자 비교 연산 가능
		
		System.out.println(ch + "는/은" + result);
		
	}
	
	public void method4() {
		// method1 보완: 정수값이 음수/0/양수인지 판별; 3항 연산자 한 번 더 사용해서 조건 2개 넣기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? " 양수이다" : ((num == 0) ? " 0이다" : " 음수이다");
		
		System.out.println(num + "는/은" + result);
		
	}

}
