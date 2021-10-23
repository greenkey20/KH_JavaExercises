package com.kh.practice2.func;

import java.util.Scanner;

public class Practice2 { // 2021.10.18(월) 숙제2 풀이 클래스 영역 시작
	
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
		
		// 출제 의도: 조건문 + ||(or)
		
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
//		if (num3 <= num1 || num2 < num3) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		// 방법2)
//		System.out.print("첫번째 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("세번째 정수를 입력하세요 : ");
//		int num3 = sc.nextInt();
//		
//		if (num1 < num2) {
//			if (num3 <= num1 || num2 < num3) {
//				System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
//		} else {
//			System.out.println("false");
//		}
		
		// 방법3) 손민성님 ideas
		// num1 >= num2인 경우 "조건에 맞지 않습니다" 출력..
//		System.out.print("첫번째 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("세번째 정수를 입력하세요 : ");
//		int num3 = sc.nextInt();
//		
//		if (num1 >= num2) {
//			System.out.println("조건에 맞지 않습니다");
//		} else {
//			if (num3 <= num1 || num2 < num3) {
//				System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
//		}
		
		// 방법4) while문 등 추가 사용하여 2021.10.23(토) 복습 시 보완
		// num1 < num2가 아닐 때 사용자로부터 정수 다시 입력 받기
		
		while (true) {
			System.out.print("첫번째 정수를 입력하세요 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 정수를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			System.out.print("세번째 정수를 입력하세요 : ");
			int num3 = sc.nextInt();
			
			if (num1 >= num2) {
				System.out.println("조건에 맞지 않습니다 - 첫번째 정수와 두번째 정수를 다시 입력해주세요(첫번째 정수 < 두번째 정수)");
				continue;
			} else {
				if (num3 <= num1 || num2 < num3) {
					System.out.println("true");
					break;
				} else {
					System.out.println("false");
					break;
				}
			}
		}
		
	} // 1번 문제 풀이 메서드 영역 끝
	
	public void methodQ2() { // 2번 문제 풀이 메서드 영역 시작
		
		System.out.println("\n[2번 문제: 3개의 정수값 비교]");
//		2. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
//		ex.
//		입력1 : 5
//		입력2 : -8
//		입력3 : 5
		
//		false
		
		// 출제 의도: 조건문 + &&(and)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		// 방법1) 첫번째 if문 조건식에서 비교연산 2회
		if (num1 == num2 && num2 == num3) System.out.println("true"); // if문 조건식이 true일 때 실행할 코드 1줄이면 중괄호{} 생략 가능
		else System.out.println("false");
		
		// 방법2) 첫번째 if문 조건식에서 비교연산 3회
//		if(num1 != num2 || num2 != num3 || num3 != num1) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
		
		// 방법3) 3항연산자 사용; if문보다 한 눈에 알아보기는 덜 좋음..
//		String flag = (num1 == num2) ? ((num2 == num3) ? "true" : "false") : "false";
//		String flag = (num1 == num2 && num2 == num3) ? "true" : "false"; // 위의 줄 간소화
//		
//		System.out.println(flag);
		
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
		
		// 출제 의도: 홀/짝수 조건식 복습
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		// 방법1)
		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (num % 2 == 0) {
			System.out.println("짝수다!");
		} else {
			System.out.println("홀수다!");
		}
		
		// 방법2)
//		if (num > 0 && num % 2 == 0) { // 음수 걸러짐
//			System.out.println("짝수다");
//		} else if (num % 2 == 1) { // -9(음의 홀수)를 2로 나눈 나머지 = -1 -> 이 조건문에 의해 음의 홀수 걸러짐ㄴ
//			System.out.println("홀수다");
//		} else {
//			System.out.println("양수만 입력해주세요");
//		}
		
		// 방법3) 3항연산자 사용 -> 조건문과 호환됨
//		String flag = (num <= 0) ? "양수만 입력해주세요" : (num % 2 == 0) ? "짝수다" : "홀수다";
//		System.out.println(flag);
		
		System.out.println();
	} // 3번 문제 풀이 메서드 영역 끝
	
	public void methodQ4() { // 4번 문제 풀이 메서드 영역 시작
		
		System.out.println("[4번 문제: 2항연산자 계산]");
//		4. 키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력(double)하세요.
//		(단, [조건식1] 두 개의 정수 모두 양수일 때만 작동하며, [조건식2] 없는 연산 기호 및 음수를 입력 했을 시
//		[출력] “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		
//		ex.
//		피연산자1 입력 : 15
//		피연산자2 입력 : 4
//		연산자를 입력(+,-,*,/,%) : /
//		15 / 4 = 3.75000
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		// 2021.10.19 오전 수업 선생님과 수정/작성한 if문에서는 int형으로 받아야 함..
		// 2021.10.18 과제 수행 시, 연산 결과를 실수형(double)로 출력해야 하기 때문에 정수 입력받을 때 double로 받음 + int로 받았을 때 예를 들어 1 / 4 = 0.0이 출력 vs double로 받았을 때 1 / 4 = 0.25 출력
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
				
		sc.nextLine(); // 다음 nextLine() 메서드를 사용해서 문제 없이 문자(열) 입력받기 위해, 이전 nextDouble() 사용 후 버퍼공간에 남아있는 개행문자 없애줌
		
		System.out.print("연산 기호 하나를 입력하세요 : ");
		char operator = sc.nextLine().charAt(0); // 사용자에게 입력받는 연산자
		
//		double add = num1 + num2;
//		double subtract = num1 - num2;
//		double multiply = num1 * num2;
//		double divide = num1 / num2;
//		double modulo = num1 % num2;
		
		double result = 0.0; // 연산의 결과값을 담을 변수; double형 자료의 기본(?) 초기값이 0.0이므로, result = 0.0으로 초기화할 필요는 없음..
		
		// 방법1)
		// 조건식에 넣어야 할 것
		// 1. num1과 num2가 0보다 커야한다(양수)
		// 2. +, -, *, /, % 5개의 연산자가 정확히 입력되어야 한다
//		if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') || num1 <= 0.0 || num2 <= 0.0) { // 아래 행과 동치인 표현
		if ((num1 <= 0 || num2 <= 0) || (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%')) { 
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			if (operator == '+') result = num1 + num2; // 실행 codes 짧을 때 중괄호{} 생략 및 1줄로 표기
			else if (operator == '-') result = num1 - num2;
			else if (operator == '*') result = num1 * num2;
			else if (operator == '/') result = (double)num1 / num2; // num1을 double로 형 변환 -> 피연산자들은 같은 자료형이어야 하므로 num2도 double로 자동형변환
			else result = num1 % num2;
			System.out.printf("%d %c %d = %.3f", num1, operator, num2, result); // printf = 출력 시 formatting 해주는 메소드
		}
		
//		} else if (operator == '+') { // 출력 양식 반복됨 -> 수정,유지,보수 등 번거로움..
//			System.out.println(num1 + " + " + num2 + " = " + add);
//		} else if (operator == '-') {
//			System.out.println(num1 + " - " + num2 + " = " + subtract);
//		} else if (operator == '*') {
//			System.out.println(num1 + " * " + num2 + " = " + multiply);
//		} else if (operator == '/') {
//			System.out.println(num1 + " / " + num2 + " = " + divide);
//		} else {
//			System.out.println(num1 + " % " + num2 + " = " + modulo);
//		}
		
		// 방법2) 2021.10.23(토) 복습 시 switch문 사용해봄
//		if (num1 <= 0 || num2 <= 0 || (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%')) {
//			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
//		} else {
//			switch(operator) {
//			case '+' : result = num1 + num2;
//				break;
//			case '-' : result = num1 - num2;
//				break;
//			case '*' : result = num1 * num2;
//				break;
//			case '/' : result = num1 / num2;
//				break;
//			case '%' : result = num1 % num2;
//				break;
//			}
//			System.out.printf("%d %c %d = %.3f", num1, operator, num2, result);
//		}
		
	} // 4번 문제 풀이 메서드 영역 끝

} // 숙제2 풀이 클래스 영역 끝
