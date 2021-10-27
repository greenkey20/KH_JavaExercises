package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkWeekend { // 2021.10.22자 숙제 풀이 클래스 시작
	
	public void exercise1() { // 숙제1번 풀이 메소드 영역 시작
		
		System.out.println("[2021.10.22자 숙제1번: 문자열에서 특정 문자 검색]");
		/* 문자열을 입력 받아 문자 하나하나를 배열에 넣고
		 * 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 * e.g.
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i 개수 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 > "); // 사용자로부터 문자열을 입력받음
		String input = sc.next();
		
		char[] cArr = new char[input.length()]; // 사용자로부터 입력받은 문자열의 문자 하나하나를 넣을 배열 선언 및 할당
		
		for (int i = 0; i < input.length(); i++) { // 강사님 제안 = 배열 값 초기화와 글자 비교를 하나의 반복문 안에서 해보기
			cArr[i] = input.charAt(i);
		}
		
//		System.out.println(Arrays.toString(cArr));
		
		String index = "";
		int count = 0;
		
		System.out.print("검색할 문자를 입력해주세요 > ");
		char c = sc.next().charAt(0);
		
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == c) {
				index += i + " ";
				count++;
			}
		}
		
		System.out.println(input + "에 " + c + "가 존재하는 위치(index) : " + index);
		System.out.println(c + " 개수 : " + count);
		
	} // 숙제1번 풀이 메소드 영역 끝
	
	public void exercise2() { // 숙제2번 풀이 메소드 영역 시작
		
		System.out.println("[2021.10.22자 숙제2번: 배열 선언, 할당, 초기화 및 합계]");
		/* 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * e.g.
		 * 정수 : 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번째 인덱스에 넣을 값 : -4
		 * 배열 2번째 인덱스에 넣을 값 : 3
		 * 배열 3번째 인덱스에 넣을 값 : -3
		 * 배열 4번째 인덱스에 넣을 값 : 2
		 * 4 -4 3 -3 2
		 * 총 합 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 > ");
		int arrLength = sc.nextInt();
		
		int[] iArr = new int[arrLength];
		int sum = 0;
		
		for (int i = 0; i < arrLength; i++) {
			System.out.print("배열 " + i + "번째 index에 넣을 값 : ");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		
		System.out.println(Arrays.toString(iArr)); // 강사님 제안 = 반복문 활용해서 배열 원소 출력해보기
		System.out.println("배열의 원소들의 총합 : " + sum);
		
	} // 숙제2번 풀이 메소드 영역 끝
	
	public void exercise3() { // 숙제3번 풀이 메소드 영역 시작
		
		System.out.println("[2021.10.22자 숙제3번: 사용자가 찾는 치킨 배열]");
		/* 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 * e.g.
		 * 치킨 이름을 입력하세요 : 양념
		 * 치킨 이름을 입력하세요 : 불닭
		 * 양념치킨 배달 가능 
		 * 불닭치킨은 없는 메뉴입니다.
		 */
		
		String[] chickens = {"후라이드", "양념", "반반", "갈릭", "간장", "허니", "파", "올리브", "크리미언", "볼케이노", "땡초"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 > ");
		String user = sc.next();
		
		// 방법1)
		int check = -1;
		
		for (int i = 0; i < chickens.length; i++) {
			if (user.equals(chickens[i])) {
				check = i;
			} 
		}
		
		if (check >= 0) {
			System.out.println(user + " 치킨 배달 가능");
		} else {
			System.out.println(user + " 치킨은 없는 메뉴입니다");
		}
		
		// 방법2) 강사님 제시 답안
//		String rs = "";
//	
//		for (int i = 0; i <chickens.length; i++) {
//			if (chickens[i].equals(user)) {
//				rs = user + "치킨 배달 가능";
//				break;
//			}
//			else {
//				rs = user + "치킨은 없는 메뉴입니다";
//			}
//		}
//		System.out.println(rs);
		
	} // 숙제3번 풀이 메소드 영역 끝
	
	public void exercise4() { // 숙제4번 풀이 메소드 영역 시작
		
		System.out.println("[2021.10.22자 숙제4번: 사용자가 입력한 높이의 별 찍기]");
		/* 다음과 같은 실행 예제를 구현하세요.
		 * e.g.
		 * 정수 입력 : 4
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(별 쌓을 높이)를 하나 입력하세요 > ");
		int num = sc.nextInt();
		
		// 방법1)
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		// 방법2) 강사님 제시 답안
//		for (int i = num; i >= 1; i--) {
//			for (int star = i; star >= 1; star--) {
//				System.out.print("☆");
//			}
//			System.out.println();
//		}
		
	} // 숙제4번 풀이 메소드 영역 끝
	
	public void stars2() { // 별찍기 추가2 메소드 영역 시작
		System.out.println("[2021.10.26 별 찍기 추가2 연습]");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(별 쌓을 높이)를 하나 입력하세요 > ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int star = 0; star < i + 1; star++) {
				System.out.print("☆");
			}
			
			System.out.println();
		}
		
	} // 별찍기 추가2 메소드 영역 끝
	
	public void stars3() { // 별찍기 추가3 메소드 영역 시작
		System.out.println("[2021.10.26 별 찍기 추가3 연습]");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(별 쌓을 높이)를 하나 입력하세요 > ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) { // 바깥쪽 for문 영역 시작
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int star = 0; star < i * 2 + 1; star++) {
				System.out.print("☆");
			}
			
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		} // 바깥쪽 for문 영역 끝
		
	} // 별찍기 추가3 메소드 영역 끝
	
	public void stars4() { // 별찍기 추가4 메소드 영역 시작
		System.out.println("[2021.10.26 별 찍기 추가4 연습]");
		
		// 인터넷에서 위/아래 영역 나눠서 codes 쓴다는 힌트 얼핏 보고(https://coding-factory.tistory.com/68) 풀이 시작
		Scanner sc = new Scanner(System.in);
		
		while (true) { // while문 영역 시작
			System.out.print("홀수(별 쌓을 높이)를 하나 입력하세요 > ");
			int num = sc.nextInt();
			
			if (num % 2 == 0) { // 사용자가 입력한 정수가 짝수인 경우
				System.out.println("짝수 말고 홀수를 입력해주세요");
				continue; // 사용자로부터 정수 다시 입력받으러 while문 처음으로 감
			} else { // 사용자가 홀수를 입력한 경우
				for (int i = 0; i < num; i++) { // 별 쌓을 높이(num)만큼 for 반복문을 돌림
					if (i < num / 2 + 1) {
						for (int j = 0; j < (num - 1) / 2 - i; j++) {
							System.out.print(" ");
						}
						
						for (int star = 0; star < i * 2 + 1; star++) {
							System.out.print("☆");
						}
						
						for (int j = 0; j < (num - 1) / 2 - i; j++) {
							System.out.print(" ");
						}
					} else if (i > num / 2) {
						for (int j = 0; j < i - num / 2; j++) {
							System.out.print(" ");
						}
						
						for (int star = 0; star < (num - i) * 2 - 1; star++) {
							System.out.print("☆");
						}
						
						for (int j = 0; j < i - num / 2; j++) {
							System.out.print(" ");
						}
					}
					System.out.println();
				} // 별 쌓을 높이만큼 for 반복문 다 돌림
				return; // while 반복문 빠져나가기 위해 이 메소드를 호출한 곳으로 돌아감
			}
		} // while문 영역 끝
		
	} // 별찍기 추가4 메소드 영역 끝

} // 2021.10.22자 숙제 풀이 클래스 끝

// 2021.10.22자 주말 추가 숙제 소감: 1,2번은 차근차근 한 단계씩 하니 문제 처음 읽었을 때보다 쉽게 해결할 수 있었습니다.
// 3번은 중간에 조금 헷갈렸습니다. 처음에 간단히 생각하고 풀었을 때 반복문 돌 때마다 출력 문구도 반복해서 출력되어 놀랐고, 1,2번 문제보다 조금 더 고민해서 해결책을 찾았습니다.
// 4번은 인터넷에서 본 다른 별찍기 문제들보다 간단한 편이었지만, 아직 익숙하지 않아서인지 제어변수들 조건이 바로 안 떠오릅니다.
// 스스로 별찍기를 못한다는 생각 때문인지 집착이 되어서 다른 몇 개도 그려보았는데, 풀이과정이 똑똑하지 못하고 코드가 너무 지저분한 것 같습니다.
// 감사합니다!