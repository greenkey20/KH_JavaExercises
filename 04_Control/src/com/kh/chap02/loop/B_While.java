package com.kh.chap02.loop;

import java.util.Arrays;

public class B_While {
	
	/* while문: 또 다른 종류의 반복문
	 * 
	 * 표현법
	 * 초기식; // 필수는 아님
	 * while(조건식) {
	 * 		(조건식이 true일 때) 반복적으로 실행할 코드; // a
	 * 		증감식; // 필수는 아님
	 * }
	 * 
	 * 괄호 안의 조건식이 true일 경우 해당 구문(a)을 반복적으로 실행
	 * while(true): 무조건 반복시킴 -> 무한반복
	 */
	
	public void method1() { // method1 영역 시작
		// i가 1~5일 때 인사하기: 구현 방법은 다수
		
		// 초기식
		// 제어변수 i, j, k

		// 방법1)
		System.out.println("[방법1]");
		int i = 0;
		
		while (/*조건식*/ i < 5) {
//			i++; // 문법에 틀린 건 아니지만, 논리적 오류; 증감식의 순서를 잘못 써서 "2~6번째 안녕" 출력 -> 맞는 사용 예는 방법2 참조
			System.out.println(++i + "번째 안녕하세요");
//			i++;
		}
		
		// 방법2)
		System.out.println("[방법2]");
		int k = 0;
				
		while (k < 5) {
			k++; 
			System.out.println(k + "번째 안녕하세요"); 
		}
		
		// 방법3)
		System.out.println("[방법3]");
		int l = 1;
		
		while (l <= 5) {
			System.out.println(l++ + "번째 안녕하세요"); // 후위연산자로 증감식 쓴 경우, 출력(처리)한 뒤 i값 1 증가시킴
		}
		
		
		// 방법4)
		System.out.println("[방법4]");
		int j = 1;
		
		while (j <= 5) {
			System.out.println(j + "번째 안녕하세요");
			j++;
		}
		
		int b = 10;
		while (b >= 6) {
			System.out.println(b + "(으)로 줄어든다...");
			b--;
		}
		
		int c = 1;
		while (c < 10) {
			System.out.println("다섯번만 나올거야~ (제어변수 c = " + c + ")");
			c += 2; // 증감식 c = c + 2-> c = 1 3 5 7 9 (11 되며 while문 탈출)
		}
		
	} // method1 영역 끝
	
	public void methodSum() { // methodSum 영역 시작
		int i = 1; // 초기식
		
		int sum = 0; // 합계를 계산해서 담아둘 변수
		
		while (i <= 100) { // i < 101
			sum += i;
			i++; // 증감식
		}
		
		System.out.println("1~100 사이의 자연수의 합 : " + sum);
	} // methodSum 영역 끝
	
	public void method2() { // method2 영역 시작
		// while문(만) 써서 1~100 사이의 짝수만 더하기
		
		int i = 1; // 초기식
		
		int sum = 0; // 합계를 계산해서 담아둘 변수
		
		while (i <= 100) { // i < 101
			// 짝수일 때만 더하기
			if (i % 2 == 0) {
				sum += i; // sum = sum + i;
			}
			i++; // 증감식
		}
		
		System.out.println("1~100 사이의 짝수의 합 : " + sum);
		
	} // method2 영역 끝
	
	public void method3() { // method3 영역 시작
		// while문(만) 써서 1~100 사이의 짝수만 더하기
		
		int i = 1; // 초기식
		
		int sum = 0; // 합계를 계산해서 담아둘 변수
		
		while (i <= 100) { // i < 101
			// 홀수일 때만 더하기
			if (i % 2 == 1) {
				sum += i; // sum = sum + i;
			}
			i++; // 증감식
		}
		
		System.out.println("1~100 사이의 홀수의 합 : " + sum);
		
	} // method3 영역 끝
	
	public void method4() { // method4 영역 시작
		
		System.out.println("[1부터 random2까지 모두 더한 총/누적 합계]");
		// 1부터 random(무작위)한 수(단, 1 ~ 10)까지 모두 더하는 총/누적 합계 -> 반복문의 제어변수 초기값 = 1
		
		// Math(수학 관련)라는 클래스의 random() 메소드(무작위 기능) 활용
		// random() 메소드의 결과 값: 0.0 ~ 0.9999999999999999999999999..(사람이 셀 수는 없겠지만 컴퓨터의 자료형이 허용하는만큼 표현 가능)
		// 실행할 때마다 다른 값이 나옴; 예측 불가
		
		// 표현법: Math.random();
		// Math 클래스는 자주 사용하기 때문에, String처럼, 아래와 같이 작성할 필요 없음 
		// Math m = new Math(); // 클래스 별명 지어 사용할 수 있도록 함
		// m.random();
		
		// 단계1) random() 메소드가 잘 작동되는지 호출해보기
		double random = Math.random();
		System.out.println("random : " + random);
		
		// 지수표기법
		// 0.15 = 1.5*(10^(-1)) = 1.5E-1
		// 123456789.987654321 = 1.23456789987654321E+8
		
		// 단계2) 결과값에 10 곱하면 0.0 ~ 9.9999999.. 난수
		// -> int형으로 강제형변환하면 0 ~ 9 정수 난수
		// -> 문제의 조건을 맞추기 위해 +1하  면 1 ~ 10 정수 난수
		// (int)(Math.random() * 몇 개 랜덤값) + 시작 수; // 시작 수가 2이면 1은 절대 나오지 않음
		
		int random2 = (int)(Math.random() * 10) + 1;
		System.out.println("random2 : " + random2);
		System.out.println();
		
		// 단계3) 반복문 통해서 누적 합 구하기
		int i = 1;
		
		// 방법1)
		int sum1 = 0;
		while (i <= random2) {
			sum1 += i;
			i++;
		}
		
		System.out.println("방법1) " + sum1);
		
		// 방법2)
		int sum2 = 0;
		while (random2 > 0) { // 또는 random2 != 0
			sum2 += random2;
			random2--;
		}
		
		System.out.println("방법2) " + sum2);
		
	} // method4 영역 끝
	
	public void method5() { // method5 영역 시작
		// lotto
		// 규칙: 1 ~ 45 범위, 6개 선택
		// (int)(Math.random() * 45(랜덤값 수)) + 1(시작수)
		
		
		int[] lotto = new int[6]; // "lotto"라는 이름을 가진, 정수형(int) 원소 6개 배열 선언
		// 배열 = 순서가 있는 공간 -> 순서가 있음 = index가 있음 -> index가 있는 공간/칸이 만들어짐
		// lotto[0] = (int)(Math.random() * 45) + 1 // lotto라는 배열의 첫번째 공간에 대입
		// lotto[1] = (int)(Math.random() * 45) + 1 // lotto라는 배열의 두번째 공간에 대입
		// lotto[2] = (int)(Math.random() * 45) + 1 // lotto라는 배열의 세번째 공간에 대입
		// ...
		// lotto[5] = (int)(Math.random() * 45) + 1 // lotto라는 배열의 여섯번째 공간에 대입
		
		int i = 0;
		while (i < lotto.length) { // lotto 배열의 길이 = 6 -> 0번 index부터 5번 index까지 6번 반복해야 함
			lotto[i] = (int)(Math.random() * 45) + 1;
			i++;
		}
		
		// 중복 체크 및 정렬 안 했지만..
		// if문에서 현재 나온 숫자를 비교해서 같은 숫자 안 나올 때까지 반복(?)하게 할 수도 있음; 더 간단한 방법은 나중에 배울 것임..
		
		// Arrays.toString(배열 이름); Arrays라는 클래스 내에 배열의 원소/값들을 출력하는 기능을 가진 메소드
		System.out.println(Arrays.toString(lotto));
		
	} // method5 영역 끝

}
