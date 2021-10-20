package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else { // B_Else 클래스 영역 시작
	
	/* if-else문
	 * 두 개 밖에 없음; '모' 아니면 '도'
	 * 바늘(if)과 실(else; 바늘이 있어야만 실이 바느질 할 수 있다) -> if가 없으면 else 사용 불가능
	 * 표현법: if(조건식) {
	 * 			조건식이 true일 때 실행할 코드 -- 1
	 * 		 }
	 * 		 else {
	 * 			조건식이 false일 때 실행될 코드 -- 2
	 * 		 }
	 * codes는 위->아래로 실행됨
	 * 조건식의 결과가 true일 경우 1을 실행 -> 조건식의 결과가 false일 경우 2를 실행
	 */
	
	public void method1() { // method1 영역 시작
		// 연산자 문제: 정수 입력 받고 양수/0/음수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// A_If class에서 if문만 쓴 경우: if문 3개 적용/연산 필요함
		// 아래와 같이 else if문 쓴 경우: 조건식 결과가 true일 경우, else block을 건너뜀 -> 불필요한 연산이 줄어듦 -> 효율적인 동작
		if(num > 0) { // 양수일 경우 실행
			System.out.println("양수다");
		} else { // 0 또는 음수일 경우 실행 <- 중첩if문 사용
			if(num == 0) { // 0일 경우 실행
				System.out.println("0이다");
			}
			else { // 음수일 경우 실행
				System.out.println("음수다");
			}
		}
		
		sc.close();
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		// 주민번호 입력 후 성별 판별
		
		// 1. 사용자로부터 주민번호 입력받기(String personId = xxxxxx-xxxxxxx)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(- 포함) : ");
		String personId = sc.nextLine();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추출
		char gender = personId.charAt(7); // charAt(index 번호): 해당 index에 저장된 문자 추출
		
//		방법1)
//		if('1' <= gender && gender <= '4') { // 들어올 수 있는 숫자 한정적
		if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { // 1번 if 시작
			if(gender == '1' || gender == '3') { // 2번 if 시작
				System.out.println("남자");
			} // 2번 if 끝 
			else { // 2번 else 시작
				System.out.println("여자");
			} // 2번 else 끝
		} // 1번 if 끝
		else { // 1번 else 시작; 유효하지 않은 주민번호
			System.out.println("유효하지 않은 주민번호");
		} // 1번 else 끝
		
//		방법2)
//		if(!(gender == '1' || gender == '2' || gender == '3' || gender == '4')) { // 안 되는 많은 경우의 수 먼저 배제시킴 -> 좋은 코드
//			System.out.println("유효하지 않은 주민번호");
//		}
//		else {
//			if(gender == '1' || gender == '3') {
//				System.out.println("남자");
//			}
//			else {
//				System.out.println("여자");
//			}
//		}
		
		sc.close();
	} // method2 영역 끝 
	
	/* if-else if문
	 * 바늘(if)과 실(else if; 바늘이 있어야만 실이 바느질 할 수 있다) -> if가 없으면 else if 사용 불가능
	 * 
	 * 표현법: if(조건식1) { // if문 시작
	 * 			조건식1이 true일 경우 실행할 코드1
	 * 		 } // if문 끝
	 * 		 else if(조건식2) { // 그밖에도 만약에; else if문1 시작
	 * 			조건식2가 true일 경우 실행할 코드2
	 * 		 } // else if문 끝
	 * 		 else if(조건식3) { // else if문2 시작
	 * 			조건식3이 true일 경우 실행할 코드3
 	 * 		 } // else if문2 끝
 	 * 		 else { // 다 아니면; else문 시작
 	 * 			그밖의 경우에 실행할 코드..
 	 * 		 } else문 끝
	 */
	
	public void method3() { // method3 영역 시작
		// 정수 입력받고 양수/0/음수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // if 영역 시작 
			System.out.println("양수다");
		} // if 영역 끝
		else if(num == 0) { // else if 영역 시작
			System.out.println("0이다");
		} // else if 영역 끝
		else { // else 영역 시작; else if 대신 else로 쓰면 계산/비교 한 번 안 해도 됨 -> 효율적..
			System.out.println("음수다");
		} // else 영역 끝
		
		sc.close();
	} // method3 영역 끝
	
	public void method4() { // method4 영역 시작
		// -값: 지구인이 아닙니다
		// 0~13세: 어린이
		// 14~19세: 청소년
		// 20세~: 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		// 가장 큰 범위의 것을 부정문으로 첫번째 조건식으로 쓰면 좋음 -> 가장 큰 것을 배제시킴/빼버림
		if(age < 0) { // 유효하지 않은 나이를 입력 -> 유효하지 않은 것 처음에 빼버림
			System.out.println("지구인이 아닙니다 @.@");
		} else if(age >= 20) { // 그 다음으로 큰 범위 빼버림..
			System.out.println("성인입니다");
		} else if(age >= 14) { // 0 <= age && 없어도 될 듯..
			System.out.println("청소년입니다");
		} else {
			System.out.println("어린이입니다");
		}
		
		sc.close();
		
	} // method4 영역 끝
	
	public void method5() { // method5 영역 시작
		String season;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월입니까? : ");
		int month = sc.nextInt();
		System.out.print("기온은 섭씨 몇 도입니까? : ");
		double temperature = sc.nextDouble();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			if(temperature <= -15.0) {
				season += " 한파 경보";
			} else if(temperature <= -12.0) {
				season += " 한파 주의보";
			}
		} else if(3 <= month && month <= 5) {
			season = "봄";
		} else if(6 <= month && month <= 8) {
			season = "여름";
			if(temperature >= 35.0) {
				season += " 폭염 경보";
			} else if(temperature >= 33.0) {
				season += " 폭염 주의보";
			}
		} else if(9 <= month && month <= 11) {
			season = "가을"; // 변수 season을 초기화/대입하는 과정 -> += 연산자 쓰면 오류
		} else {
			season = "유효한 월이 아닙니다";
		}
		
		System.out.println("기온이 " + temperature + "도인 지금은 " + month + "월이며, " + season);
		
	} // method5 영역 끝

} // B_Else 클래스 영역 끝
