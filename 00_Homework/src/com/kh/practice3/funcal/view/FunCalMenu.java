package com.kh.practice3.funcal.view;

import java.util.Scanner;

import com.kh.practice3.funcal.controller.FunCalController;
import com.kh.practice3.funcal.model.vo.Level;

public class FunCalMenu {
	
	private FunCalController fc = new FunCalController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() { // main메뉴 표시 메소드 영역 시작
		System.out.println("~~~~~ 재미있는 3칙연산 게임 ~~~~~");
		System.out.println("# 즐겁게 문제를 푸시다가 지겨우면 N 또는 n을 누르세요");
		System.out.println("# Enter를 누르면 시작합니다");
		System.out.println("======================");
		
		String level = "";
		String start = sc.nextLine();
		
		if (start.equals("N") || start.equals("n")) {
			System.out.println("게임을 종료합니다");
			System.exit(0);
		} else {
			while (true) {
				System.out.print("# 난이도를 입력하세요(상, 중, 하) > ");
				level = sc.next();
				
				fc.numLevel(level);
				fc.levelGame(level);
				
			}
		}
		
	} // main메뉴 표시 메소드 영역 끝 
	
}
