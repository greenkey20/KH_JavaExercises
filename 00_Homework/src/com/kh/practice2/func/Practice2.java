package com.kh.practice2.func;

import java.util.Scanner;

public class Practice2 { // 숙제2 풀이 클래스 영역 시작
	
	public void methodQ1() { // 1번 문제 풀이 메서드 영역 시작
		
		System.out.println("[1번 문제: 3개의 정수 크기 비교]");
//		1. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//		아니면 false를 출력하세요(단, num1은 num2보다 작아야 함)
		
//		ex.
//		정수1 : 4
//		정수2 : 11
//		입력 : 13
		
//		true
		
		Scanner sc = new Scanner(System.in);
		
		// 방법1) 서비스메시지에 num1 < num2 유도
//		System.out.print("첫번째 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("첫번째 정수보다 큰, 두번째 정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("세번째 정수를 자유롭게 입력하세요 : ");
//		int num3 = sc.nextInt();
//		
//		if (num3 < num1 || num2 < num3) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		// 방법2)
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		if (num1 < num2) {
			if (num3 < num1 || num2 < num3) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}
		
		System.out.println();
//		sc.close();
	} // 1번 문제 풀이 메서드 영역 끝
	
	public void methodQ2() { // 2번 문제 풀이 메서드 영역 시작
		
		System.out.println("[2번 문제: 3개의 정수값 비교]");
//		2. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
//		ex.
//		입력1 : 5
//		입력2 : -8
//		입력3 : 5
		
//		false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		// 방법1) 첫번째 if문 조건식에서 비교연산 2회
		if (num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// 방법2) 첫번째 if문 조건식에서 비교연산 3회
//		if(num1 != num2 || num2 != num3 || num3 != num1) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
		
		System.out.println();
	} // 2번 문제 풀이 메서드 영역 끝 
	
	public void methodQ3() { // 3번 문제 풀이 메서드 영역 시작
		
		System.out.println("[3번 문제: 홀/짝수 판별]");
//		3. 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
//		ex.
//		숫자를 한 개 입력하세요 : -8
//		양수만 입력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("양수만 입력해 주세요.");
		} else if (num % 2 == 0) {
			System.out.println("짝수다!");
		} else {
			System.out.println("홀수다!");
		}
		
		System.out.println();
	} // 3번 문제 풀이 메서드 영역 끝
	
	public void methodQ4() { // 4번 문제 풀이 메서드 영역 시작
		
		System.out.println("[4번 문제: 2항연산자 계산]");
//		4. 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력(double)하세요.
//		(단, 두 개의 정수 모두 양수일 때만 작동하며, 없는 연산 기호 및 음수를 입력 했을 시
//		“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		
//		ex.
//		피연산자1 입력 : 15
//		피연산자2 입력 : 4
//		연산자를 입력(+,-,*,/,%) : /
//		15 / 4 = 3.75000
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		double num1 = sc.nextDouble(); // 연산 결과를 실수형(double)로 출력해야 하기 때문에 정수 입력받을 때 double로 받음
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		double num2 = sc.nextDouble();
				
		sc.nextLine(); // 다음 nextLine() 메서드를 사용해서 문제 없이 문자(열) 입력받기 위해, 이전 nextDouble() 사용 후 버퍼공간에 남아있는 개행문자 없애줌
		
		System.out.print("연산 기호 하나를 입력하세요 : ");
		char operator = sc.nextLine().charAt(0);
		
		double add = num1 + num2;
		double subtract = num1 - num2;
		double multiply = num1 * num2;
		double divide = num1 / num2;
		double modulo = num1 % num2;
		
		if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') || num1 <= 0.0 || num2 <= 0.0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else if (operator == '+') {
			System.out.println(add);
		} else if (operator == '-') {
			System.out.println(subtract);
		} else if (operator == '*') {
			System.out.println(multiply);
		} else if (operator == '/') {
			System.out.println(divide);
		} else {
			System.out.println(modulo);
		}
		
		sc.close();
	} // 4번 문제 풀이 메서드 영역 끝

} // 숙제2 풀이 클래스 영역 끝
