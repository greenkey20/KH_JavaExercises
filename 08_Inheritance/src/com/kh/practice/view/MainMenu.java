package com.kh.practice.view; // 사용자에게 보여지는 것(출력 구문 등); 기능이나 값이 들어가지 않음

import java.util.Scanner;

import com.kh.practice.controller.ChildController;

public class MainMenu {
	
	// [필드부]
	// 전에는 메소드 내에 Scanner 만들어서 지역변수로 사용했었음; 여기서는 이 클래스의 필드로 선언 및 초기화 -> 변수/필드 캡슐화해야 함(=반드시 해야 하는 공식)
	// Scanner라는자료형 필드이름(=변수 선언) -> 초기화  
	private Scanner sc = new Scanner(System.in); 
	// 객체가 생성되면 sc가 메모리에 올라감
	
	private ChildController cc = new ChildController();
	
	// [생성자부]
	public MainMenu () { // MainMenu 클래스의 객체 생성 시 바로 mainMenu 호출/실행되도록..
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
			switch(select) {
			case 1 : sum();// 더하기를 보여주려고 함
				break;
			case 2 : times();
				break;
			case 9 : return;
			default : System.out.println("해당하는 메뉴가 없습니다. 다시 입력해주세요~");
			}
		}
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
