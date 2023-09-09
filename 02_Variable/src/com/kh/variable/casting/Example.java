package com.kh.variable.casting;

public class Example {
		
	/* 형 변환(type casting): 값의 종류, 즉 자료형,을 바꾸는 개념
	 * 
	 * 컴퓨터 안에서 값을 처리하는 규칙
	 * 1. =(대입연산자)를 기준으로 왼쪽, 오른쪽이 같은 자료형이어야 함 -> 같은 자료형에 해당되는 literal 값만 대입이 가능함; 자료형이 다를 경우 (오른쪽의) 값을 바꿔서 대입해야 함
	 * 2. 같은 자료형들끼리만 (사칙)연산(+ - * / 등)이 가능함 -> 다른 자료형들끼리 연산을 하고 싶다면 둘 중에 하나는 '형 변환'을 해서 나머지 하나와 동일하게 만들어줘야 함
	 * 3. 연산의 결과물도 같은 자료형이어야 함
	 *  e.g. 1 + 1 = 2(정수), 1.1 + 1.1 = 2.2(실수)
	 * 
	 * 표현법: (바꿀자료형)값
	 *  - ()는 형 변환/cast 연산자; 수학에서 ()는 우선 연산..
	 *  
	 * 종류
	 * 1. 자동형변환(promotion): 자동으로 형 변환이 진행; 내가 형 변환 할 필요 없음
	 *  - 작은 크기의 자료형 -> 큰 크기의 자료형 e.g. byte형(-128~127 표현 가능) -> int형(약-21.47억~약21.47억)
	 * 2. 강제형변환(type casting): 자동형변환이 되지 않는 경우에 진행; 직접 내가 형 변환을 해야 함; ()연산자 통해서 진행
	 *  - 큰 크기의 자료형 -> 작은 크기의 자료형; 값의 손실이 발생할 수 있어 신중하게 해야 함
	 */
	
	// 자동형변환: 작은 바이트 -> 큰 바이트
	public void autoCasting() {
		
		//1. int(4bytes, 정수) -> double(8bytes, 실수)
		int i1 = 10;
		System.out.println(i1);
		double d1 = /*(double)*/i1; // 이 줄의 대입연산자의 오른쪽은 i1 변수 안에 대입되어 있는 값(o)변수(x) -> 그 값을 d1이라는 변수에 대입/저장
									// 자동형변환이 되는 경우이기 때문에 오른쪽 리터럴 변수명 앞에 (double) 쓸 필요 없음
		System.out.println(d1);
		// 자동형변환 완료: int는 정수, double은 실수; d1 = 10 -> 10.0
		
		//2. int(4bytes, 정수) -> long(8bytes, 정수)
		int i2 = 12345678;
		long l3 = i2;
		System.out.println(l3);
		
		// 특이케이스 3. long(8bytes, 정수) -> float(4bytes, 실수): 정수가 실수로 담길 때 큰 사이즈(여기서 '사이즈'는 '해당 자료형에 대해 미리 규정된/정해진 저장공간' ou '숫자의 크기/범위' 의미?)의 정수가 작은 사이즈의 실수에 대입이 가능
		//  - 4bytes의 float형이 long형보다 담을 수 있는 값의 범위가 더 크기(x) 훨씬 더 많은 숫자를 표현할 수 있기(o) 때문임
		long l4 = 1000000L;
		float f5 = l4;
		System.out.println(f5);
		
		// 특이케이스 4. char(2bytes) <-> int(4bytes): char와 int는 양방향 형 변환이 가능; ASCII codes 표 참조하기
		char ch = 98;
		System.out.println(ch); // 출력 결과 = b
//		System.out.printf(%d, ch); // error
		
		int num = ch;
		System.out.println(num); // 출력 결과 = 98
		
		System.out.println('김'); // 출력 결과 = 문자 '김'
		System.out.println((int)'김'); // 출력 결과 = 44608 = '김'의 유니코드 값
		System.out.println('김'+(char)2); // 숫자/정수 2를 char형으로 강제 형 변환 -> + 연산자는 (1) 피연산자 하나가 문자열이면 문자열로 더하고 결과도 문자열이 되고, (2) 기타 피연산자들을 int형으로 바꿔서 결과도 int형으로 냄..
										 // 출력 결과 = 44610 (-> 2021/10/14 마지막 교시 이해 안 되네.. ㅜ.ㅜ -> 2021/10/15 1교시 수업으로 이해)
		System.out.println('김'+2); // char형이 int형으로 자동형변환되어 +연산 수행 -> 출력 결과 = 44610
		
		System.out.println(2);
		System.out.println((char)2); // 출력 결과 = 제어문자 STX
		System.out.println('2');

		System.out.println('김'+'2'); // 문자 2 .. 출력 결과 = 44658
		System.out.println(2); // 2
		System.out.println('2'); // 2
		System.out.println('2'+ 2);	// 52	
		
		// ctrl + alt + 화살표 위↑/아래↓: 커서가 위치하고 있는 행 위/아래로 복사
		// ctrl + d: 커서가 위치하고 있는 행 삭제
		
		int a = 2;
		System.out.println(a); // 정수형 변수 a에 저장/대입되어있는 10진수/정수 값(숫자2) 출력
		System.out.println((char)a); // 숫자2를 char형으로 바꾸면 제어문자 STX가 되며, 이 제어문자는 이클립스가 표현할 수 없음; 단 컴퓨터는 STX로 인식해서 일함
		
		char c = '2';
		System.out.println(c); // char형 변수 c에 저장되어 있는 문자 2 출력
		
		// 비교 연산자: 좌항과 우항의 값을 비교해서 결과값(논리값 true/false 형식)을 반환
		System.out.println(2=='2'); // 다르므로 false
		System.out.println(2==a); // 같으니까 true
		System.out.println(c=='2'); // 같으니까 true
		System.out.println(a==c); // 다르므로 false
		
		System.out.println(2==(int)'2'); // 2 != 50 -> 다르므로 false; 66~68행은 같은 내용임..
		System.out.println((char)2=='2'); // STX != 2 -> 다르므로 false
		System.out.println((int)a==(int)c); // 2 != 50 -> 다르므로 false
		
		System.out.println(2+'2'); // 52
		System.out.println(2+2); // 4
		System.out.println((char)2+(char)'2'); // 52
		System.out.println((char)2+(char)2); // 4
		
		// 특이케이스 5. byte, short 간의 연산
		byte b1 = 1;
		byte b2 = 2;
		System.out.println(b1 + b2); // byte끼리의 연산의 결과값은 int형 -> CPU가 값을 처리하는 기본크기 int형의 크기(4bytes)
		
//		byte resultB = b1 + b2; // int형 자료를 더 작은 byte형에 저장하려고 해서 error
		byte resultB = (byte)(b1 + b2); // int -> byte로 강제형변환
		
//		byte b3 = 128; // 표현 범위: -128~127(256개의 10진수 숫자 표현 가능)
		byte b3 = (byte)128;
		System.out.println(b3); // 출력 결과 = -128 -> overflow
		
		byte b4 = 127;
		byte b5 = 127;
		System.out.println(b4 + b5); // byte끼리의 연산의 결과값은 int형
				
	}
	
	// 강제/명시적 형 변환 : 큰 바이트 -> 작은 바이트
	public void forceCasting() {
		// (바꿀 자료형)값
		
		// 1. double(8bytes) -> float(4bytes)
		float f1 = 4.0f;
		double d2 = 8.0;
		float f2 = (float)d2; // double형을 float형으로 저장하려면 강제형변환 필요
		System.out.println(f2);
		
		// 2. double(8bytes) -> int(4bytes)
		double d3 = 10.89;
		int i3 = (int)d3; // double형을 int형으로 저장하려면 강제형변환 필요
		System.out.println(i3); // 10 출력; 소수점 아래 부분(0.89)이 절삭됨 -> 데이터 손실됨
		
		int iNum = 10;
		double dNum = 8.89;
		System.out.println(iNum + dNum); // iNum + dNum 덧셈 결과는 double로 자동형변환(작은 -> 더 큰 자료형으로); 18.89 출력
		
		int result = iNum +(int)dNum; // int형 값을 저장할 메모리 공간을 할당받고, 그 이름을 result라는 식별자로 하겠다(=변수 선언) -> 대입연산자를 통해 우항의 int값(literal; 18)이 공간에 저장됨; 영역{} 안에서 계속 존재하며 사용됨
		System.out.println(result);
		
		result = (int)(iNum + dNum); // 130행과 연산 결과는 같으나, 연산하고자 하는 바를 나타내는 데에 조금 더 명확하고 좋은 표기 방법
									 // 새로운 int형 저장 공간 마련하는 대신, 130행에서 만들어/선언해둔 공간/변수("result")를 사용함
		System.out.println(result);	
		
	}

}
