package com.kh.chap03.branch;

import java.util.Scanner;

public class Homework {
	
	public void homework1() { // 2021.10.20 숙제1번 메소드 영역 시작
		// 연산자와 정수 2개를 입력받고, 입력된 연산자에 따라 알맞은 결과를 출력
		// 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 입력될 때까지 무한 반복하며, "exit"가 입력되면 "프로그램을 종료합니다" 출력하고 종료
		// 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 "0으로 나눌 수 없습니다. 다시 입력해 주세요"를 출력 + 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 함
		// 없는 연산자가 들어올 때 "없는 연산자입니다. 다시 입력해주세요"를 출력 + 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 함

		System.out.println("[2021.10.20자 숙제1번: 2항연산자 계산]");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) { // while 영역 시작
			
			System.out.print("연산자 하나를 입력하세요 > "); // 사용자로부터 연산자 입력받기
			String str = sc.next(); // "exit" 문자열을 받을 경우를 위해 next() 메소드를 활용하여 String 자료형에 저장함
									// nextLine() 메소드를 사용한 경우 반복 실행 시 오류 나서 next() 메소드 선택함 
			char operator = str.charAt(0); // 윗줄에서 받은 String 자료형(문자열)의 첫번째 글자를 char형 변수로 추출하여 저장함
			
			if (str.equals("exit")) { // 사용자가 연산자로 "exit"을 입력한 경우 <- String 비교 메소드 equals() 사용
				System.out.println("프로그램을 종료합니다");
				break; // 프로그램 종료를 위해 break문을 통해 while문(가장 가까운 반복문)을 빠져나감
			}
			
			System.out.print("첫 번째 정수를 입력하세요 > "); // 사용자로부터 첫번째 정수(피연산자1) 입력받음
			int num1 = sc.nextInt(); // 정수형 변수로 받음
			
			System.out.print("두 번째 정수를 입력하세요 > "); // 사용자로부터 두번째 정수(피연산자2) 입력받음
			int num2 = sc.nextInt(); // 정수형 변수로 받음
			
			if (operator == '/' && num2 == 0) { // 연산자가 '/'(나누기)이고 두번째 정수(num2)가 0인 경우
				System.out.println("0으로 나눌 수 없습니다, 다시 입력해주세요");
				continue; // 가장 가까운 반복문(위 while문(어떤 부분으로?))으로 돌아가기 -> 사용자로부터 연산자와 정수 2개 다시 입력받음
			}
			
			double result; // 연산자와 정수 2개의 연산 결과를 실수형으로 저장할 변수 선언
			
			switch(operator) { // 사용자가 입력한 연산자(문자)를 동등비교하고자 함
			case '+' : result = num1 + num2;
				break; // 해당 switch문을 빠져나가는 break문
			case '-' : result = num1 - num2;
				break; // 해당 switch문을 빠져나가는 break문
			case '*' : result = num1 * num2;
				break; // 해당 switch문을 빠져나가는 break문
			case '/' : result = (double)num1 / num2; // 나눗셈 결과가 소수점까지 정확하게 표현되도록 피연산자 하나를 double형으로 강제형변환 시킴
				break; // 해당 switch문을 빠져나가는 break문
			case '%' : result = num1 % num2;
				break; // 해당 switch문을 빠져나가는 break문
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요"); // 없는 연산자가 입력된 경우
				continue; // 가장 가까운 반복문(위 while문(어떤 부분으로?))으로 돌아가기 -> 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 함
			}
			
			System.out.printf("%d %c %d = %.3f\n", num1, operator, num2, result); // 
					
			break; // while문 밖으로 나가기
			
		} // while 영역 끝
		
		System.out.println();
		
	} // 2021.10.20 숙제1번 메소드 영역 끝
	
	public void homework2() { // 2021.10.20 숙제2번 메소드 영역 시작
		// 2번 공차 만들기
		
		// 사용자로부터 시작 숫자와 공차를 입력받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램 구현하기; 단, 출력되는 숫자는 총 10개
		// 공차: 숫자들 사이에서 일정한 숫자의 차가 존재하는 것
		// e.g. 2, 7, 12, 17, 22 …
		//       5   5   5   5
		
		// e.g.
		// 시작 숫자 : 4
		// 공차 : 3
		// 4 7 10 13 16 19 22 25..
		
		System.out.println("[2021.10.20자 숙제2번: 공차 만들기]");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자를 입력하세요 > ");
		int start = sc.nextInt();
		
		System.out.print("공차를 입력하세요 > ");
		int diff = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) { // 등차수열의 원소 10개 출력을 위해 10번 반복
			System.out.printf("%d ", start + diff * (i - 1));
		}
		
	} // 2021.10.20 숙제2번 메소드 영역 시작

}
