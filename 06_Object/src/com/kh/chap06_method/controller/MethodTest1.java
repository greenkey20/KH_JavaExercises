package com.kh.chap06_method.controller; // 패키지명에 controller = 기능적인 부분 수행

public class MethodTest1 {
	
	/* method(메소드, 메서드): 기능, 마술상자, (클래스 안에 있는) (멤버)함수; 입력을 가지고 어떤 일을 수행한 다음에 결과물을 내놓음
	 * 
	 * 표현법
	 * 접근제한자 예약어(e.g. static) 반환형(내놓는 결과물/반환받을 값의 자료형) 메소드이름(매개변수의자료형 매개변수이름) {
	 * 		수행할 코드;
	 * 		return(메소드를 호출한 곳으로 돌아감) 반환값;
	 * }
	 * 생략 가능한 것: 예약어, 매개변수, return문(반환형이 void일 경우)
	 * 호출할 때 인자값(메소드 호출 시 괄호 안에 들어가는 값들)은 매개변수의 자료형과 갯수가 일치해야 함
	 * 
	 * 한 번 정의해두고 필요할 때마다 호출해서 언제든지 사용
	 */
	
	// 1. 매개변수가 없고 반환값도 없는(void) 메소드; 절차 지향적 프로그래밍으로 배울 때 계속 만들었던 것
	public void method1() {
		System.out.println("[1. 매개변수와 반환값 둘 다 없는 메소드입니다]");
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
//		return; // 반환해주는 값 없음; 기본 생성자처럼 JVM이 자동으로 만들어줘서 원래 있었던 것 -> 그러나 반환형이 void이기 때문에 return 생략되었던 것
	}
	
	// 2. 매개변수는 없고 반환값은 있는 메소드
	public int method2() {
		System.out.println("[2. 매개변수는 없고 반환값은 있는 메소드입니다]");
		
		// 1에서부터 100까지 랜덤값을 발생시켜 반환
//		int result 같은 변수 굳이 안 써도 됨
		
		return (int)(Math.random() * 100) + 1;
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("[3. 매개변수는 있고 반환값은 없는 메소드입니다]");
		
		// 정수 2개 입력받아서 둘 중 큰/작은 수 구분하는 메소드
		int min = 0;
		int max = 0;
		
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		
		System.out.println("최소값 : " + min + ", 최대값 : " + max);
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int a, int b) {
		System.out.println("[4. 매개변수는 있고 반환값은 없는 메소드입니다]");
		
		// 정수 2개 입력받아서 둘의 합 계산해서 반환하는 메소드
		return a + b; // 반환 != 출력
	}
	
	/* 반환형 없는 메소드: 출력문 작성하는 편
	 * 반환형 있는 메소드: 호출하는 부분에서 출력문을 작성
	 */
	
	/* 기능/메소드/프로그램 = business logic(기능, 동작 논리) + presentation(눈에 보여지는 것) -> 이 둘이 분리되는 것이 좋은 프로그램
	 * 메소드 1개당 기능 1개
	 */

}
