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
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 방법2) 증감식을 매번 2씩 증가시킴
		// for (int i = 0; i <= 10; i += 2)
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 방법3) continue;문을 사용
		for (int i = 1; i <= 10; i++) { // 1 2 3 4 5 6 7 8 9 10 중에
			if (i % 2 == 0) { // i가 짝수일 때
				continue; // 가장 가까운 반복문(for문)의 i++ 부분으로 올라감
			}
			System.out.print(i + " "); // 홀수일 때만/짝수 제외하고 출력
		}
		
		System.out.println();
		
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		// 5칸짜리(index 0~4) 정수 배열을 만들고 숫자 입력받기
		// int[] arr = new int[5];
		// 1~100까지의 정수만 입력받음 -> 만약 그 범위를 넘어선 숫자를 입력받는다면 "다시 입력해주세요" 출력하고 다시 입력받기
		
		int[] arr = new int[5]; // int형의 배열 5칸짜리(정수형 변수 5개 있는)를 만듦/선언
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) { // 배열의 길이(5)만큼/5칸짜리 배열이 꽉 찰 때까지/i=0~4일 때 반복해서 입력받음
			System.out.print("1~100의 정수를 하나 입력해주세요 : ");
			int temp = sc.nextInt(); // 사용자로부터 입력받은 정수형 data를 temp라고 불리는 변수공간에 대입
//			arr[i] = temp; // 여기서 배열에 temp 값 대입하면 + 아래 if문 내 i-- 감소식 없으면 1~100 범위 벗어난 숫자가 입력된 배열이 만들어짐
			System.out.println("(i = " + i + ")"); // 여기서는 어떤 i값인지 확인하며 부분부분 문제 해결..
			
			if (temp <= 0 || 100 < temp) { // if문 시작 -> 조건식 검사 -> 1~100 범위를 벗어난 숫자를 걸러냄
				System.out.println("범위가 이상합니다. 다시 입력해주세요");
				System.out.println("(if문 안의 i = " + i + ")"); // 여기서는 어떤 i값인지 확인하며 부분부분 문제 해결..
//				i--; // 논리적인(o) 문법(x) 오류 해결을 위한 방법; 값을 잘못 입력한 index를 채워주기 위해 for문 i++로 가기 전에 i 값을 하나 줄여줌으로써 index i 자리에 적합한 값이 입력될 수 있는 기회를 줌 
					 // 이 i 감소식이 없으면, 1~100 범위에 맞지 않아 arr[i] 저장할 기회를 날린만큼 arr[i]의 값으로써 초기값 0(원래 들어있는 값)이 남아있음/배열에 0이 들어가있음
				continue; // 가장 가까운 반복문의 증감식 i++로 감 -> i번째 입력받아 temp에 저장되어 있던 값은 의미 없는 값이 됨/temp에 값을 저장할 수 있는 기회는 날아감
			} // if문 끝; if문 아래로 내려올 수 있는 건 1~100의 temp 값
			
			System.out.println("(if문 아래의 i = " + i + ")"); // 여기서는 어떤 i값인지 확인하며 부분부분 문제 해결..
			arr[i] = temp; // 맞는 범위의 정수값을 배열에 넣기 위해, 위 if문 아래에서 배열 arr의 i번째 칸/index에 temp 값 대입
			
		} // for문 끝
		
//		System.out.println(temp); // temp는 for문 안에 존재하기 때문에 이렇게 for문 밖에서는 모르는/없는 변수임 -> 출력 불가능
		System.out.println(Arrays.toString(arr)); // 배열 안의 내용을 보여주는 Arrays.toString() 기능
				
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
