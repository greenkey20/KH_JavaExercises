package com.kh.operator;

public class B_InDecrease {
	
	/* 증감연산자: 단항연산자; 한 번에 1씩 증가/더하거나 감소하는/빼는 연산을 함
	 * -> 먼저 증감을 할건지, 나중에 증감을 할건지 연산자의 위치(피연산자의 앞 또는 뒤)에 따라 달라짐
	 * 
	 * 표현법
	 * ++: 값을 1씩만 증가시키는 연산자
	 * --: 값을 1씩만 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위 연산: ++값, --값 -> 먼저 값을 증감하고 그 값을 처리
	 * 후위 연산: 값++, 값-- -> 값을 먼저 처리하고 나서 증가/감소함 
	 */
	
	// 후위 연산
	public void method1() {
		int num = 10;
		System.out.println("num : " + num);
		
		num++; // line by line 처리 -> 세미콜론; = 논리적인 한 구절이 끝남 = ☆처리★; 여기까지 num = 10
		       // -> 그 후에 'num 변수의 literal 값에 1을 증가시키겠다'; num + 1 -> 여기부터 num = 11
		System.out.println("☆처리★ num : " + num); // num = 11
		
		num--; // 세미콜론 = ☆처리★; 세미콜론까지는 num = 11
			   // -> 그 후에 num - 1; num = 10
		System.out.println("☆처리★ num : " + num); // num = 10
		
		System.out.println("num : " + num++); // 세미콜론 ☆처리★ 전까지 num = 10
											  // -> 그 후에 num + 1; num = 11
		System.out.println("num : " + num); // 11
	}
	
	public void method2() {
		int a = 10; // step1) 오른쪽의 '값'을 왼쪽(공간)에 넣음 -> 10을 a에 직접 대입
		int b = a++; // step2) 오른쪽의 '값'(a에 저장되어 있는 값 = 10)을 왼쪽(공간, b라는 변수)에 넣음/대입(= '대입'이라는 ☆처리★ 완료) -> 세미콜론;
		// -> step3) 그 다음/세미콜론 지나고 a의 값을 1만큼 증가시킴(a = 10 -> 11)
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		
		int c = 20; // step1) 20 값을 변수/공간 c에 대입/저장
		int d = c--; // step2) c에 저장되어 있는 값(20)을 d에 대입하는 처리를 먼저 수행
		// -> step3) 그 다음 c의 값을 1만큼 감소시킴(c = 20 -> 19)
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
	}
	
	// 전위 연산
	public void method3() {
		int a = 10; // step1) 값 10을 변수 a에 저장
		int b = ++a; // step2) a의 값 1만큼 증가 연산 먼저 함( a = 10 -> 11)
		// -> step3) 그 다음 a의 값을 b에 저장/대입하는 처리 수행
		
		System.out.println("a : " + a); // 11
	    System.out.println("b : " + b); // 11
	    System.out.println("a : " + --a); // a의 값을 1만큼 감소시킴 -> a = 11 -> 10
	}
	
	public void method4() {
		// 후위 연산자
		int num1 = 20; // step1) 값 20을 변수 num1에 저장
		int result1 = num1++*3; // 처리 후 num1의 값을 1만큼 증가시킴 -> step2) 첫번째 처리 = num1에 3 곱함 = 60 -> step3) 60을 result에 대입
		// -> step4) 그 다음 num1의 값을 1만큼 증가시킴(num1 = 20 -> 21)
		
		System.out.println("num1 : " + num1); // 21
		System.out.println("result1 : " + result1); // 60
		
		// 전위 연산자
		int num2 = 20;
		int result2 = ++num2*3;
		System.out.println("num2 : " + num2); // 21
		System.out.println("result2 : " + result2); // 63
				
	}

}
