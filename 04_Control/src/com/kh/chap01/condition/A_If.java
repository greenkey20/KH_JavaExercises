package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/* 단독 if문
	 * 표현법: if (조건식) {
	 * 			조건식이 true일 경우 실행할 코드
	 * 		 }
	 * 조건식의 결과가 true일 경우: 중괄호{} 안의 코드들이 실행됨
	 * 조건식의 결과가 false일 경우: 중괄호{} 안의 코드들을 건너뜀
	 */
	
	/* 중첩 if문
	 * if (num > 10) {
	 * 		if (num > 5) {
	 * 			실행;
	 * 		}
	 * 		if (num > 0) {
	 * 			실행;
	 * 		}
	 * }
	 * num = 13인 경우 if문 3개 모두 비교하게 됨..
	 * 
	 * else if문
	 * if (num > 10) {
	 * 			실행1;
	 * } else if (num > 5) {
	 * 			실행;
	 * } else if (num > 0) {
	 * 			실행;
	 * }
	 * num = 13인 경우 실행1만 하게 됨; else if.. 연결되는 조건들 비교할 필요 없음
	 * 
	 * 상황에 따라 맞는 구문을 사용하게 됨..
	 */
	
	// 3항연산자 실습 문제
	public void method1() {
		// 정수 입력받고 양수/0/음수 출력
		Scanner sc = new Scanner(System.in); // ctrl + shift + o -> 3행 import Scanner 자동 입력
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num > 0) { // 조건문에 들어와서 조건식("num이 0보다 큰가?")을 봄
			
			System.out.println(num + "는/은 양수입니다.");
			// 단축키: 1. sout -> ctrl + space
			//       2. syso -> ctrl + space
			//		 3. sysout -> crtl + space
		
		}
		
		if (num == 0) {
			System.out.println(num + "은 0입니다.");
		}
		
		if (num < 0) {System.out.println(num + "는/은 음수입니다.");} // 실행 코드 짧은 경우 이렇게 써도 됨; 실행 코드 2줄 이상 되면 위와 같이 줄 바꿔서 쓰기; 언제나 가독성 좋은 방식으로 쓰기
		
	}
	
	public void method2() {
		// 홀/짝수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 양수일 경우에만 조건문 실행하도록 추가하기
		
		// 방법1) 논리연산자 && 사용해서 if(조건식)에 조건식 하나 추가
//		if(num % 2 == 1 && 0 < num) {System.out.println(num + "는/은 홀수입니다.");}
//		if(num % 2 == 0 && 0 < num) {System.out.println(num + "는/은 짝수입니다.");}
		// 사용자가 -8 입력한 경우: 첫번째 if문 들어가서 확인 -> 첫번째 조건식에 위배되어 빠져나옴 -> 두번째 if문 들어가서 확인 -> 두번째 조건식 위배되어 빠져나옴 -> 연산 2번
		
		// 방법2) 중첩if문
		if (num > 0) { // 이 조건식이 잘 걸러주어 연산의 횟수를 최소화할 수 있도록 해야 함
			if (num % 2 == 1) {System.out.println(num + "는/은 홀수입니다.");	}
			if (num % 2 == 0) {System.out.println(num + "는/은 짝수입니다.");	}
		}
		// 사용자가 -8 입력한 경우: 첫번째 조건식에 위배되어 if문 건너뜀 -> 1번 연산
		// 사용자가 3 입력한 경우: 3번 연산
		
//		if(num < 0) {
//		System.out.println(num + "는/은 음수입니다.");
//		}
		
		System.out.println("하하하!"); // 사용자가 음의 정수 입력한 경우 if문 건너뛰고 이 문장 출력; 단, 양의 정수인 경우에도 출력
		
	}
	
	public void method3() {
		// 주민번호 입력받아서 남자(1, 3), 여자(2, 4) 체크
		// 1,2,3,4가 아닌 숫자 입력 시 sout("잘못된 주민번호를 입력하셨습니다!")
		
		// 사용자로부터 주민번호 입력받기 xxxxxx-1/2xxxxxx
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함 전체) : ");
		String personId = sc.nextLine();
		
		// String(문자열): 순서가 있는 문자들의 나열 e.g. "a b c d e f g..."
		// 							   순서 = index 0 1 2 3 4 5 6... (index는 int(정수 자료형); 0번부터 시작)
		
		// 입력받은 주민번호로(123456-1234567)부터 성별에 해당하는 '문자'(8번째에 있음, index=7)를 추출
		char gender = personId.charAt(7); // charAt(7): 주민번호 상 8번째에 있는 7번 index를 추출 
//		char id = sc.nextLine().charAt(7);
		
		// 1(int, 정수) != '1'(char, 문자)
		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		}
		
		if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}
		
		// 그 외
//		if(gender == '0' || gender > '4') {
		if (gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("잘못된 주민번호를 입력하셨습니다!");
		}
		
		// if문의 영역 주의 깊게 확인하며 쓰자
//		if (gender != '1' && gender != '2' && gender != '3' && gender != '4') { // 이 조건식에서 1, 2, 3, 4가 다 제외되는 바, 1, 2, 3, 4는 이 if문 안에 들어갈 수 없음
//			System.out.println("잘못된 주민번호를 입력하셨습니다!");
//			if (gender == '1' || gender == '3') {System.out.println("남자입니다.");}
//			if (gender == '2' || gender == '4') {System.out.println("여자입니다.");}
//		}
		
	}
	
}
