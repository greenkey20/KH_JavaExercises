package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/* CheckedException: 문법적으로 반드시 예외 처리를 해줘야 하는 예외들; 빨간 줄 나옴
	 * 예측 불가능한 곳에서 발생 -> 미리 예외처리 구문을 작성해야 함
	 * 주로 외부 매체와 어떤 입출력 시 발생
	 */
	
	// heap 영역에 Scanner 객체 생성 -> 사용 후 자원 반납해줘야 함
	// sc.close(); // 자원 반납하는 메소드: 지금까지 안 해줘도 왜 문제가 안 생겼을까? 프로그램 종료 시 이 Scanner 객체를 참조하는 연결이 다 끊어지기 때문에 garbage collector가 가져감
	// 운영체제가 파일 접근할 수 있는 경로(?)를 정해두기도 함; 운영체제마다 다름
	
	// Scanner와 같은 역할을 하는 BufferedReader라는 클래스 + throw 구문 활용
	
	public void method1() { // 메소드2 호출
		try {
			method2();
		}
		catch(IOException e) {
			System.out.println("IOException 예외 발생함");
		}
	}
	
	public void method2() throws IOException { // 문자열 입력받는 메소드
		System.out.print("아무 문자열이나 입력해주세요~");
		
		/*
		Scanner sc = new Scanner(system.in);
		String str = sc.nextLine();
		*/
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로만 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String str = br.readLine(); // 아래 예외처리 안 하면 "Unhandled exception type IOException(이 메소드 호출 시 IOException 발생할 수도 있음을 알려줌)" error 발생 -> 예외 처리 반드시 해줘야 문제없이 실행됨 
		
		// 방법1) try ~ catch: 내가 해결하겠다
		try { // 문제 발생 여지가 있는 부분을 try 블럭{} 안에 넣음
			String str = br.readLine();
			System.out.println("문자열의 길이 : " + str.length());
		}
		catch(IOException e) {
			System.out.println("IOException 예외 발생함");
		}
		
		// 방법2) throws: 내가 지금 여기(method2)에서 처리 안 하겠다고, 메소드 호출한 곳(method1)으로 예외를 떠넘겨서/위임해서/던져서 처리하게 함
		// 왠만하면 자신에게 발생한 예외는 자신이 처리하는 것이 좋음
		// 떠넘기는 경우 예시: 내가 하기 귀찮거나.. 내가 할 필요가 없거나.. 예외들 모아서 예외처리하는 곳을 만들어둔 경우..
		String str = br.readLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
	}

}
