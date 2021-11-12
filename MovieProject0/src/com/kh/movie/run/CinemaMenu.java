package com.kh.movie.run;

import java.util.Scanner;

import com.kh.movie.controller.CinemaController;

public class CinemaMenu { // 영화 예매를 위해 사용자에게 보여지는 부분을 모아둔 클래스 
	
	private CinemaController cc = new CinemaController(); // CinemaController 자료형을 갖는 객체 생성하여 변수 cc에 주소값을 담음
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() { // 영화 예매 앱의 메인메뉴
		while(true) {
			System.out.println("----------- 영화 예매 앱입니다 -----------");
			System.out.println("1. 영화 예매");
			System.out.println("2. 나가기");
			System.out.print("메뉴번호를 입력하세요 > ");
			
			String num = sc.next();
			
			System.out.println();
			
			if(num.equals("1")) {
				cc.ticketing2();
			}else if (num.equals("2")) {
				System.out.println("앱을 종료합니다. ");
				return;
			}else {
				System.out.println("잘못 입력하셨습니다, 메뉴번호를 다시 입력하여 주세요. ");
				System.out.println();
				continue;
			}
		}
		
	}
}
