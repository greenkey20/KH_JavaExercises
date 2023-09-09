package com.baekjoon.control;

import java.util.Scanner;

// 2022.4.24(일) 23h20 -> 23h55 204ms 맞았습니다
public class Main_2577 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		while (a < 100 || a >= 1000) {
//			System.out.print("3자리의 자연수로 다시 입력해 주세요 > ");
			a = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		while (String.valueOf(b).length() != 3) {
//			System.out.print("3자리의 자연수로 다시 입력해 주세요 > ");
			b = sc.nextInt();
		}
		
		int c = sc.nextInt();
		
		while (String.valueOf(c).length() != 3) {
//			System.out.print("3자리의 자연수로 다시 입력해 주세요 > ");
			c = sc.nextInt();
		}
		
		String multiply = String.valueOf(a * b * c);
//		int count = 0; // 처음에는 여기에서 변수 선언했음 -> 0~9 반복문 돌 때 count가 계속 누적됨 != 내가 의도한 바
		
		// 23h35 시도1) 잘못된 로직 ㅠ.ㅠ
		/*
		for (int i = 0; i < multiply.length(); i++) {
			for (int j = 0; j < 10; j++) { // a * b * c의 결과에 0~9 숫자가 몇 번 쓰였는지, 0~9 순서대로 확인하고 출력
				if (multiply.charAt(i) == j) {
					count++;
				}
				
				System.out.println(count);
			}
		}
		*/
		
		// 시도2) 23h55 의도한대로 동작하는 듯
		for (int j = 0; j < 10; j++) {
			int count = 0;
			
			for (int i = 0; i < multiply.length(); i++) {
//				System.out.println(Character.getNumericValue(multiply.charAt(i)));
				
				if (j == Character.getNumericValue(multiply.charAt(i))) {
//					count += 1;
					count++; // 2022.4.25(월) 0h15 수정 <- 아까 문제 풀 때는 이렇게 쓰면 증가되어 출력 안 되는 줄 알고 고쳤는데, 그 때는 조건문이 잘못되어 count가 증가 안 된 거지, 이 표현식 문제가 아니었음
				}
			}
			
			System.out.println(count);
		}
		
		/* 주안점
		 * 1. charAt(i)의 결과로 받은 문자 '0~9'가 ASCII code로 인식되지 않도록
		 * 2. int 자료형 변수 count의 선언 위치 -> 반복문 내에서 필요할 때 초기화시켜야 함
		 * 3. 디버깅 방법 익히기; breakpoint 찍고 step over하며 변수 값 확인
		 */
		
		sc.close();
		
	}

}
