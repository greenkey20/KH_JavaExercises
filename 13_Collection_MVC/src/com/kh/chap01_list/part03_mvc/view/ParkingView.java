package com.kh.chap01_list.part03_mvc.view;

import java.util.Scanner;

import com.kh.chap01_list.part03_mvc.controller.ParkingController;
import com.kh.chap01_list.part03_mvc.model.vo.Car;

public class ParkingView {
	
	// [필드부]
	private Scanner sc = new Scanner(System.in);
	private ParkingController pc = new ParkingController();
	
	// [생성자부]
	
	// [메소드부]
	public void mainMenu() {
		
		while (true) {
			System.out.println("=== 주차 타워 관리 프로그램 ===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 차량 검색");
			System.out.println("4. 전체 차량 출력");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("-------------------------");
			System.out.print("메뉴 선택 > ");
			String menu = sc.next();
			
			switch (menu) {
			case "1" : // 차량 주차할 수 있는 서브메뉴(화면) 호출해서 보여주기
				insertCar();
				break;
			case "2" : // 차량 출차할 수 있는 서브메뉴(화면) 호출해서 보여주기
			case "3" : // 특정 차량을 검색할 수 있는 서브메뉴(화면) 호출해서 보여주기
			case "4" : // 전체 차량 목록을 볼 수 있는 서브메뉴(화면) 호출해서 보여주기
			case "0" : // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			default : // 사용자가 메뉴를 잘못 선택한 경우 다시 입력받음
				System.out.println("없는 메뉴입니다. 메뉴 번호를 다시 선택해주세요.");
				break;
			}
			
			
		} // while문 영역 끝
		
	} // mainMenu() 종료
	
	public void insertCar() { // 차량 주차할 수 있는 서브메뉴(화면) 
		
	} // insertCar() 종료
	
	public void deleteCar() { // 차량 출차할 수 있는 서브메뉴(화면)
		
	} // deleteCar() 종료
	
	public Car searchCar() { // 특정 차량을 검색할 수 있는 서브메뉴(화면)
		
	} // searchCar() 종료

}
