package com.kh.practice.view; // 사용자에게 보여지는 것(출력 구문 등); 기능이나 값이 들어가지 않음

import java.util.Scanner;

import com.kh.practice.controller.ChildController;

public class MainMenu {
	
	// [필드부]
	// 전에는 메소드 내에 Scanner 만들어서 지역변수로 사용했었음; 여기서는 이 클래스의 필드로 선언 및 초기화 -> 변수/필드 캡슐화해야 함(=반드시 해야 하는 공식)
	// Scanner라는자료형 필드이름(=변수 선언) -> Scanner라는 자료형의 객체를 생성하여 초기화 -> 객체가 생성되면 sc가 메모리에 올라감
	private Scanner sc = new Scanner(System.in); 
	
	private ChildController cc = new ChildController(); // ChildController라는 자료형을 사용하는 객체 cc를 만듦
	// -> MainMenu 클래스는 이를 필드로 가지고 있음; MainMenu 클래스는/외부에서는 cc라는 객체가 어떤 필드를 가지고 있는지 알 필요 없음 vs MainMenu 클래스에서 필요한 것은 cc가 가진 더하기 및 곱하기 기능
	// MainMenu 클래스의 mainMenu()를 호출하는 Run 클래스에서는 MainMenu 클래스가 어떤 필드를 가지고 있는지 알 필요 없음/오히려 알면 접근하려고 하는 바, 안 좋음
	
	// [생성자부]
	public MainMenu () { // MainMenu 클래스의 객체 생성 시 바로 mainMenu 호출+실행되도록 <- Run 클래스에서는 MainMenu 클래스의 mainMenu()도 알 필요 없음
		mainMenu();
	}
	
	
	// [메소드부]
	// 보이는 것 작성
	public void mainMenu() {
		while(true) { // while문으로 무한반복
			System.out.println("---- 메뉴 ----");
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("9. 나가기");
			System.out.print("메뉴 번호 입력 > ");
			int select = sc.nextInt();
			switch(select) { // switch문 영역 시작
			case 1 : sum();// 더하기를 보여주려고 함
				break;
			case 2 : times();
				break;
			case 9 : System.out.println("프로그램을 종료합니다");
				return;
			default : System.out.println("해당하는 메뉴가 없습니다. 다시 입력해주세요~");
			} // switch문 영역 끝
		} // while문 무한반복 영역 끝
	}
	
	public void sum() {
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 > ");
		int y = sc.nextInt();
		System.out.print("세 번째 정수를 입력해주세요 > ");
		int z = sc.nextInt();
		int result = cc.calcSum(x, y, z); // Controller에 있던 계산하는 기능 가져와서 씀
		System.out.println("세 수의 합 : " + result);
	}
	
	public void times() {
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 > ");
		int y = sc.nextInt();
		System.out.print("세 번째 정수를 입력해주세요 > ");
		int z = sc.nextInt();
		int result = cc.calcTimes(x, y, z); // Controller에 있던 계산하는 기능 가져와서 씀
		System.out.println("세 수의 곱 : " + result);
	}

}
