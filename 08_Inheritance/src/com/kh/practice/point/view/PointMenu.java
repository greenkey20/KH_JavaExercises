package com.kh.practice.point.view;

import java.util.Scanner;
import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	// [필드부]
	
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	// [생성자부]
		
	// [메소드부]
	public void mainMenu() { // 메인메뉴 출력 메소드
		// 잘못 입력했을 시 다시 받도록 반복
		while (true) { // while문 영역 시작
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : circleMenu();
				break;
			case 2 : rectangleMenu();
				break;
			case 9 : System.out.println("종료합니다");
				return; // 2021.10.29 저녁 현재로써는 프로그램 종료 어떻게 시켜야 할지 모르겠음 -> 수업 시간 예제 보고 아이디어 얻어 return; 하니 프로그램 종료됨
			default : continue;
			}
		} // while문 영역 끝
	}
	
	public void circleMenu() { // 원 메뉴 출력 메소드
		// 잘못 입력했을 시 메인메뉴로 돌아감
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인 메뉴로");
		System.out.print("메뉴 번호 > ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : calcCircum();
			break;
		case 2 : calcCircleArea();
			break;
		case 9 :
		default : mainMenu();
		}
	}
	
	public void rectangleMenu() { // 사각형 메뉴 출력 메소드
		// 잘못 입력했을 시 메인메뉴로 돌아감
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인 메뉴로");
		System.out.print("메뉴 번호 > ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : calcPerimeter();
			break;
		case 2 : calcRectArea();
			break;
		case 9 :
		default : mainMenu();
		}
	}
	
	public void calcCircum() { // x,y,반지름 입력 받음 -> 원의 정보 및 원 둘레 출력 메소드
		System.out.print("x 좌표 > ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 > ");
		int y = sc.nextInt();
		
		System.out.print("반지름 > ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() { // x,y,반지름 입력 받음 -> 원의 정보 및 원 넓이 출력 메소드
		System.out.print("x 좌표 > ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 > ");
		int y = sc.nextInt();
		
		System.out.print("반지름 > ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() { // x,y,너비,높이 입력 받음 -> 사각형의 정보 및 사각형 둘레 출력 메소드
		System.out.print("x 좌표 > ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 > ");
		int y = sc.nextInt();
		
		System.out.print("너비 > ");
		int width = sc.nextInt();
		
		System.out.print("높이 > ");
		int height = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, width, height));
	}
	
	public void calcRectArea() { // x,y,너비,높이 입력 받음 -> 사각형의 정보 및 사각형 넓이 출력 메소드
		System.out.print("x 좌표 > ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 > ");
		int y = sc.nextInt();
		
		System.out.print("너비 > ");
		int width = sc.nextInt();
		
		System.out.print("높이 > ");
		int height = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, width, height));
	}

}
