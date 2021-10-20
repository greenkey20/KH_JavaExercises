package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break { // 클래스 영역 시작
	
	/* break; ((반복문 또는 switch문) 멈춰) 
	 * break문을 만나는 순간 '가장 가까운 반복문'을 빠져나감; 해당 break문이 속해있는 반복문 1겹만 빠져나감
	 * 
	 * 주의할 점: switch문 안의 break;와 다른 개념; switch문 안의 break는 해당 switch를 빠져나가는 용도일 뿐임
	 * 
	 * return은 메소드를 빠져나가는 것; 호출한 곳으로 돌아감
	 */
	
	public void method1() { // method1 영역 시작
		// 매번 반복적으로 새롭게 발생되는 랜덤값 출력(1~100) -> 무한하게(for 또는 while)
		// 방법1) for( ; ; )
		// 방법2) while(true)
		
		// 그 랜덤값이 홀수일 경우(=조건 -> 조건문 사용) 반복문을 빠져나가게 할 것
		
		for( ; ;) { // 랜덤값이 홀수일 때까지 무한 반복
			int random = (int)(Math.random() * 100) + 1; 
			// Math.random() = 0.00 ~ 0.99999
			// Math.random() * 100 = 0.00 ~ 99.9999
			// (int)(Math.random() * 100) = 0 ~ 99
			// (int)(Math.random() * 100) + 1 = 1 ~ 100
			
			if (random % 2 == 1) {
				break;
			} else {
				System.out.println("random : " + random); // 결과물 수 = 홀수 random 값 나오기 전/if문 빠져나오기 전 for문이 돈 횟수
			}
		}
		
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		// 매번 사용자에게 문자열을 입력받은 후, 해당 문자열의 길이(문자가 몇 개인지)를 출력
		// 단, 사용자가 exit을 입력할 경우 반복문 빠져나가게 하기
		
		Scanner sc = new Scanner(System.in);
		
		while (true) { // 사용자가 exit을 입력할 때까지 무한 반복
			System.out.print("문자열을 입력하세요 : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break; // 가장 가까운 반복문(while) 밖으로 나감
			}
			
			System.out.println(str + "의 글자수 : " + str.length());
		}
		
	} // method2 영역 끝
	
	public void method3() { // method3 영역 시작
		// 매번 사용자로부터 숫자 입력받고, 해당 숫자가 음수이면 "프로그램을 종료합니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수를 하나 입력해주세요 : ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
	} // method3 영역 끝

} // 클래스 영역 끝
