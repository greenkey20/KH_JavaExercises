package com.kh.chap03.branch;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue { // 클래스 영역 시작
	
	/* continue : 반복문 안에서 쓰이는 구문; 분기문(탈출문), break의 친구
	 * continue를 만나면 그 뒤에 어떤 구문이 있든간에 실행하지 않고 pass -> 가장 가까운 반복문(증감식 부분)으로 돌아가라는 의미
	 */
	
	public void method1() { // method1 영역 시작
		// 1부터 10까지 홀수만 출력; 1 3 5 7 9
		
		// 방법1) 반복문을 1씩 증가하면서 돌리는데, 홀수일 경우만 출력하도록 조건문 사용
		// if (i % 2 ==1) -> sout(i)
		
		// 방법2) 증감식을 매번 2씩 증가시킴
		// for (int i = 0; i <= 10; i += 2)
		
		// 방법3) continue;문을 사용
		for (int i = 1; i <= 10; i++) { // 1 2 3 4 5 6 7 8 9 10 중에 짝수 제외하고 출력
			if (i % 2 == 0) { // 짝수일 때 -> for 반복문의 i++ 부분으로 올라감
				continue;
			}
			System.out.print(i + " "); 
		}
		
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		// 5칸짜리(index 0~4) 정수 배열을 만들고 숫자 입력받기
		// int[] arr = new int[5];
		// 1~100까지의 정수만 입력받음 -> 만약 그 범위를 넘어선 숫자를 입력받는다면 "다시 입력해주세요" 출력하고 다시 입력받기
		
		int[] arr = new int[5]; // int형의 배열 5칸짜리를 만듦
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) { // 정수형 배열의 길이만큼 입력받음
			System.out.print("정수를 하나 입력해주세요 : ");
			int temp = sc.nextInt(); // 사용자로부터 입력받은 정수형 data를 temp라는 변수공간에 대입
			
			if (temp <= 0 || 100 < temp) { // if문 시작
				System.out.println("범위가 이상합니다. 다시 입력해주세요");
				i--; // 논리적인 오류 해결을 위한 방법; for문 i++로 가기 전에 i 값을 하나 줄여줌으로써 index i 자리에 적합한 값이 입력될 수 있는 기회를 줌
				continue; // -> 가까운 반복문의 증감식 i++로 감; temp에 저장되어 있던 값/temp에 값을 저장할 수 있는 기회는 날아감..
			} // if문 끝
			
			arr[i] = temp;
		} // for문 끝
		
//		System.out.println(temp); // temp는 for문 안에 존재하기 때문에 이렇게 for문 밖에서는 출력 불가능/없는 값임..
		System.out.println(Arrays.toString(arr));
				
	} // method2 영역 끝
	
	public void method3() { // method3 영역 시작 
		// 1부터 100까지의 총 합계 계산; 단, 6의 배수는 제외하고 더하기
		
		int sum = 0; // 합계를 저장할 변수 선언 및 초기화
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 6 == 0) { // i가 6의 배수인 경우
				continue; // 가장 가까운 반복문의 증감식 부분으로 돌아가라
			}
			
			sum += i;
		}
		
		System.out.println("1부터 100까지, 단 6의 배수는 제외하고, 합계 : " + sum);
		
	} // method3 영역 끝

} // 클래스 영역 끝
