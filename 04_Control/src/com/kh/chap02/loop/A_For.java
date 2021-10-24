package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For { // A_For 클래스 영역 시작
	
	/* for문: for () {}
	 * 괄호() 안에 반복을 지정하는 부분이 있고, 초기식; 조건식; 증감식 3가지로 이루어짐 -> 각각 세미콜론;으로 구분됨
	 * (논리적으로 문장이 완성되었을 때 세미콜론; 사용)
	 * 
	 * 표현법:
	 * for (초기식; 조건식; 증감식) { // 반복 횟수를 지정하는 요소들..
	 * 		반복적으로 실행시키고자 하는 codes
	 * }
	 * - 초기식: 반복문이 시작될 때 '초기에 단 한 번만 실행'될 구문; 반복문에서 사용할 (제어)변수를 선언하고 초기화(initialization)하는 구문
	 *  e.g. int i = 0;
	 *  
	 * - 조건식: '반복문이 실행될 조건'을 작성하는 구문; 조건식은 연산(x) 질문/의문문(작니? 크니? 등)(o) -> 조건식이 true일 경우 반복문 실행 vs false일 경우 반복문 멈추고 빠져나옴
	 *  e.g. i < 10; i가 10보다 작으면 true vs i가 10보다 같거나 크면 false
	 *  
	 * - 증감식: '반복문을 제어하는 변수 값'을 증(++)감(--)시키는 구문; 보통 초기식에서 선언된 변수를 가지고 증감식 작성; 증감연산자가 주로 쓰임; 전/후위연산자 같은 결과
	 *  e.g. i++
	 */
	
	public void method1() { // method1 영역 시작
		// "안녕하세요" 1000번 반복해서 출력하고자 할 때
		/* System.out.println("안녕하세요");
		 * System.out.println("안녕하세요");
		 * System.out.println("안녕하세요");
		 * System.out.println("안녕하세요");
		 * System.out.println("안녕하세요");
		 */
		// 적은 횟수는 얼마든지 복사+붙여넣기 가능하지만, 200회, 1234회 등 반복하고 싶을 때는 현대인이 할 일이 아님
		
		// 1에서부터 5보다 작거나 같을 때까지 반복 수행 = 1 2 3 4 5
		
		for (/*초기식*/; /*조건식*/; /*증감식*/) { // 이 상태로 호출/실행하면 무한한 인사 -> console창 빨간색 네모 click하면 멈춤 -> 빨간 버튼 안 먹으면 ctrl+Z(Eclipse 강제 종료) 
			System.out.println("안녕하세요");
		}
		
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		// 고정된 문자열이 아닌, 매번 달라지는, 출력 결과 확인하자
		// i : 1
		// i : 2..
		
		// 방법1)
		// 제일 단순하게 반복되는 횟수를 제어하는 표현법 = for (int i = 0; i < 10; i++)
		for (int i = 1; i <= 3; i++) { // 제어변수 i, j, k..; 외국에서는 i < 12 방식으로 많이 사용; 우리나라에서는 이하/이상으로 많이 사용..
			System.out.println("i : " + i);
		}
		
		// 방법2)
//		 for (int i = 0; i + 1 <= 3; i++) {
//		 		System.out.println("i : " + (i + 1));
//		 }
		
		// i값이 1에서부터 5와 같아질 때까지 1씩 증가할동안 반복 수행(총 5회 반복)
		for (/*단계1 초기식: 제어변수 선언 및 초기화*/ int i = 1; /*단계2 조건식*/ i <= 5; /*단계4 증감식*/ i++) {
			/*단계3 조건식의 결과가 true일 경우 실행할 codes*/ System.out.println(i+ "번 반갑습니다");
		}
		
		// 감소하는 예: i값이 10에서 6보다 작을 때까지 1씩 감소하면서 반복 수행
		for (int i = 10; i >= 6; i--) {
			System.out.println("i = " + i);
		}
		
		// 증감 2씩 증가하도록(i = 1 -> 3 -> 5 -> 7 -> 9) 증감식 써보기
		for (int i = 1; i <= 9; i += 2) { // 조건식 i < 10; 증감식 i = i + 2로도 표기 가능
			System.out.println("i = " + i);
		}
		
		// 20까지 3의 배수 출력
		for (int i = 3; i <= 20; i += 3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	} // method2 영역 끝
	
	public void gugudan() { // gugudan 메서드 영역 시작
		// 사용자로부터 입력받은 숫자(정수)의 단을 출력하기; codes 텍스트로 게시판에 올리기
		
		/* e.g.
		 * 입력 숫자 = 3
		 * ===== 3단 =====
		 * 3 X 1 = 3
		 * 3 X 2 = 6
		 * 3 X 3 = 9
		 * 3 X 4 = 12
		 * 3 X 5 = 15
		 * 3 X 6 = 18
		 * 3 X 7 = 21
		 * 3 X 8 = 24
		 * 3 X 9 = 27
		 * 
		 * System.out.printf("%d X %d = %d", num, i, num * i);
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// version2) 2021.1.23 복습 시 보완
		while (true) {
			System.out.print("정수를 입력하세요: "); // "계산할 구구단 숫자를 입력하세요"
			int num = sc.nextInt();
			
			if (num <= 1 || 10 <= num) {
				continue;
			}
			
			System.out.println("입력 숫자 = " + num); // 사용자가 입력한 정수 표시
			System.out.printf("===== %d단 =====\n", num); // 구구단 제목
			for (int i = 1; i <= 9 ; i++) { // 제어변수 i의 값이 1~9인 동안
				System.out.printf("%d X %d = %d\n", num, i, num * i); // 이 형식(format)을 출력함
			}
			break;
		}
		
		// version1) 2021.10.19 숙제
//		System.out.print("정수를 입력하세요: "); // "계산할 구구단 숫자를 입력하세요"
//		int num = sc.nextInt();
//		
//		while (num <= 1 || 10 <= num) { // 2~9에 대해 구구단을 만들기 위해 적합한 정수값(2~9)을 입력받고자 범위 조건을 지정함
//			System.out.print("정수를 다시 입력하세요: "); // 위 조건식의 값이 true인 경우, 즉 2~9 이외의 정수값이 입력된 경우, 사용자로부터 정수를 다시 입력받음
//			num = sc.nextInt(); // 사용자가 입력한 정수는 위에서 선언한 int형 변수 num에 대입
//		} // 위 num 범위 조건식의 값이 false가 되면, 즉 2 <= num && num <= 9이면, while문을 빠져나옴
//		
//		System.out.println("입력 숫자 = " + num); // 사용자가 입력한 정수 표시; printf("==%d단==", num);도 가능
//		System.out.println("===== " + num + "단 ====="); // 구구단 제목
//		for (int i = 1; i <= 9 ; i++) { // 제어변수 i의 값이 1~9인 동안
//			System.out.printf("%d X %d = %d\n", num, i, num * i); // 이 형식(format)을 출력함
//		}
		
	} // gugudan 메서드 영역 끝 
	
	public void method3() { // method5 영역 시작
		// *******
		// *******
		// *******
		// *******
		// *******
		
		System.out.println("[중첩 for문]\n"); // ln과 \n에 의해 줄바꿈 2번/2줄 띔
		// 2,3,4...중 가능; 3중 이상되면 헷갈림; 왠만한 문제는 2중으로 해결 가능
		
		// 2단계
		for (int i = 1; i <= 5; i++) { // 첫번째 for문 시작
			for (int j = 1; j <= 7; j++) {
				System.out.print("*");
//				break; // = for문 안의 break -> 가장 가까운 for문 탈출 -> 두번째 for문에서 j=1일 때 * 한 번만 찍힘 -> 첫번째 for문으로 돌아감
			}
			System.out.println("반짝반짝+ln"); // 줄바꿈
		} // 첫번째 for문 끝
		
		System.out.println("[for문 안에 if문 쓰기]\n");
		
		for (int i = 0; i < 30; i++) { // 첫번째 for문 시작
			System.out.println((i + 1) + "번째 반복입니다");
			
			// if문으로 10번째 반복마다 ☆ 넣어주기
			if ((i + 1) % 10 == 0)  {
				System.out.println("☆반짝반짝☆");
//				break; // = if문 안의 break -> 가장 가까운 for문 탈출 -> (i+1)이 처음으로 10의 배수일 때(i=9일 때)까지만 첫번째 for문 실행(총 10번 반복)하고 for문 탈출
			}
		} // 첫번째 for문 시작
		
	} // method5 영역 끝
	
	public void methodStars() { // 별 찍기 메소드 영역 시작
		// 수업 내용x, 개인적인 호기심
		// 구글 검색(https://elena90.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EB%B3%84%EC%B0%8D%EA%B8%B0) 참고
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 쌓을 높이를 입력해주세요 :");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print("☆");
			}
			for (int j = 0; j < 2 * i + 1; j++) { // 앞의 for문의 block이 종료되고, 이번 for문에서 제어변수 새로 선언 및 초기화하므로, 굳이 제어변수 k, l, m 등으로 바꿔서 쓸 필요 없는 듯..?
				System.out.print("★");
			}
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	} // 별 찍기 메소드 영역 끝

} // A_For 클래스 영역 끝
