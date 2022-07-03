package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/* 예외 처리는 항상 해줘야 하고, 하는 방법은 많음 -> 상황에 따라 다름 
	 * 
	 * exception 클래스를 상속받는 클래스 = checked exception
	 * RunTime exception 클래스를 상속받는 클래스 = unchecked exception -> 빨간줄 안 뜸
	 * 
	 * RunTimeException: 프로그램 실행 시 발생되는 예외들
	 * RunTimeException의 자식클래스들
	 *  - ArrayIndexOutOfBoundsException: 배열의 부적절한 index로 접근할 때 발생하는 예외
	 *  - NegativeArraySizeException: 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 *  - ClassCastException: 상속 구조가 아닌 경우 등 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 *  - NullPointerException: 객체를 참조했더니 주소값이 null이 들어있을 경우 발생하는 예외
	 *  - ArithmeticException: 나누기 연산 시 0으로 나누면 발생하는 예외 등
	 * RunTimeException 관련 예외들의 공통점: 개발자가 완벽하게는 아니더라도 어느 정도 예측이 가능함 -> 조건문으로 해결 가능함 -> 굳이 예외처리 할 필요 없음
	 */
	
	// ArithmeticException
	public void method1() {
		// 사용자에게 2개의 정수값을 입력받아 나눗셈 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 > ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 > ");
		int num2 = sc.nextInt();
		
		// 방법1) 조건문으로 처리: if문으로 조건 검사 후에 계산 진행 -> 예외 발생을 차단(예외 나오지 마)
//		if (num2 != 0) { // num2가 0이 아닐 때만 나눗셈 결과 출력
//			System.out.println("나눗셈 결과 : " + (num1 / num2));
//		} else {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}
//		
//		System.out.println("프로그램 종료");
		
		// 방법2) 예외 처리 구문으로 해결; 예외가 발생했을 경우 실행할 내용을 정의해둠
		
		/* try~ catch문
		 * 예외 처리 방법 중 하나
		 * 표현법
		 * try {
		 * 		// 내가 실행할 코드인데, 예외/문제가 발생될 법한/여지가 있는(-> 예외가 발생할 수도 있고, 안 발생할 수도 있음) 구문
		 * 		   e.g. (num1 / num2)
		 * }
		 * catch(발생할예외클래스이름 변수명; 일종의 매개변수) {
		 * 		   e.g. (ArithmeticException e)
		 * 		// 해당 예외가 발생했을 때 발생할 문제를 잡아(catch) 실행할 구문
		 * }
		 */
		
		try {
			System.out.println("나눗셈 결과 : " + (num1 / num2));
		}
//		catch(Exception e) { // 모든 exception은 Exception으로부터 상속받음; 더 큰 범위 -> 여기서 다 잡음 -> 아래 예외처리 구문이 필요 없음; 이렇게 쓰면 안 됨
//			
//		}
		catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			e.printStackTrace(); // 오류를 추적할 수 있는 메소드; 현재 오류가 발생한 정보를 볼 수 있고, 처음부터 어디서 에러가 났는지 나열해줌
			// 개발 단계와 테스트 단계에서만 써야함; 실제 코드에 써서 일반 사용자에게 문제가 있다는 점을 보이면 절대 안 됨 -> otherwise, 회사의 신뢰도 하락
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	// 다중 catch block
	public void method2() {
		
		/* 다중 catch block
		 * catch할 예외가 여러 개일 경우 주로 사용
		 * 예외 나열 순서: 범위가 작은 자식type의 예외클래스부터 나열
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(0 제외) > "); 
		
		try {
			int num = sc.nextInt(); // 발생할 여지가 있는 문제1) 정수 입력하라고 했는데, 문자, 특수문자 등 각종 다른 자료형 입력하는 경우들 있음
			System.out.println("나눗셈 결과 : " + (100 / num));  // 발생 가능 문제2) 0 입력하지 말랬는데, 정수 0 입력
		} // 여기서 문제 안 생겼으면 catch 안 봄
		catch(InputMismatchException e) { // 1. 우선적으로 입력받은 것이 정수인지 판단
			System.out.println("정수를 입력하세요");
		}
		catch(ArithmeticException e) { // 2. 정수라면 0인지 아닌지 판단
			System.out.println("0을 제외한 정수를 입력하세요");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public void method3() {
		// 배열 활용
		// ArrayIndexOutOfBoundsException: 배열의 __ 인덱스로 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기(음수 x) > ");
		
		try {
			int size = sc.nextInt(); // 발생 가능 문제1) InputMismatchException
			int[] arr = new int[size]; // 발생 가능 문제2) NegativeArraySizeException
			System.out.println(arr[100]); // 발생 가능 문제3) ArrayIndexOutOfBoundsException
		}
//		catch(InputMismatchException e) {
//			System.out.println("정수를 입력하세요");
//		}
//		catch(NegativeArraySizeException e) {
//			System.out.println("양의 정수를 입력하세요");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열이 100칸보다 작습니다");
//		}
		// 위와 같이 하면 귀찮음 -> 위 exceptions는 RunTimeException 클래스를 상속받음
		
		// 부모가 아래에 있어야 함; 부모가 자식의 위에 있으면 자식들이 죽은 코드가 됨 -> 다중 catch문 작성 시 범위가 작은 자식 type의 예외클래스부터 먼저 기술해야 함
		catch(RuntimeException e) { // 단점: 뭉뚱그려서 포괄적인 오류 처리만 가능 -> "어, 아, 그러니까.. 예외가 발생하긴 했는데, 배열의 크기가 잘못 되었거나, 부절적한 인덱스 값을 입력받았거나, 정수가 아닌 것을 입력받았어.. 근데 나는 뭐가 문제인지 잘 모르겠어.."
			System.out.println("배열이 잘못됐어.."); 
		}
		
		// if문은 괄호 안의 조건식이 true이어야만 실행됨
		
	}

}
