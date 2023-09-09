package com.kh.operator;

public class C_Compound {
	
	/* 복합 대입연산자
	 * 다른 산술연산자(+ - * / %)와 대입연산자(=)가 결합한 것; 이항 연산자
	 * 자기 자신과 해당 산술연산 후에 그 결과를 자기 자신에게 덮어씌우는 것
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	// 연산자들 순서 유의해서 써야 함; 다른 순서로 쓰면 다른 의미가 되므로..
	
	// e.g. int a = 1;
	// a = a + 3 -> a += 3
	// a의 기존 값에 3을 더하고, 그 결과 값을 a에 다시 대입함
	
	public void method1() {
		
		int num = 12; // Eclipse에서 용도/분류에 맞게 줄 띄어써서 쓰는 것은 프로그래머가 읽기/보기/작업하기 좋도록 하는 것..
		
		System.out.println("현재 num : " + num); // 12
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3을 증가시킨 num : " + num); // 15
		
		// num을 3 증가시키기
		num += 3;
		System.out.println("3을 더 증가시킨 num : " + num); // 18
		
		// num을 3 감소시키기
		num -= 3;
		System.out.println("3을 감소시킨 num : " + num); // 15
		
		// num을 3배 증가시키기
		num *= 3;
		System.out.println("3배 증가시킨 num : " + num); // 45
		
		// num을 2배 감소시키기
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num); // 22
		
		// num을 2로 나눈 나머지를 num에 대입
		num %= 2;
		System.out.println("num을 2로 나눈 나머지를 대입한 값 : " + num); // 0
		
	}

}
