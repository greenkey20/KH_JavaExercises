package com.kh.practice3.funcal.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice3.funcal.controller.FunCalController;
import com.kh.practice3.funcal.model.vo.Level;

public class FunCalMenu { // 사용자에게 보여주는 메뉴 클래스 영역 시작
	
	private FunCalController fc = new FunCalController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() { // main메뉴 표시 메소드 영역 시작
		
		String level = "";
		
		while (true) { // while문 영역 시작
			System.out.println("~~~~~ 재미있는 3칙연산 게임 ~~~~~");
			System.out.println("# 즐겁게 문제를 푸시다가 지겨우면 숫자 외 아무 키나 누르세요");
			System.out.println("# Enter를 누르면 시작합니다");
			System.out.println("======================");
			
			String start = sc.nextLine();
			
			if (!start.equals("")) { // 게임 시작할 때 바로 그만 두고 싶은 경우
				System.out.println("# 게임을 종료합니다"); 
				System.exit(0);
			} else /*if (start.equals(""))*/ { // 첫번째 else문 영역 시작
				System.out.print("# 난이도를 입력하세요(상, 중, 하) > ");
				level = sc.next();
				if (!level.equals("상") && !level.equals("중") && !level.equals("하")) {
					System.out.println("# 정확히 입력해주세요");
					sc.nextLine(); // 앞의 next()에 의해 버퍼에 남아있는 개행문자 없애주어 난이도 제대로 입력받기 위해서
					continue;
				} else {
					fc.numLevel(level);
					fc.levelGame(level);
//					sc.nextLine(); // 난이도 바꿔서 문제 계속 푸는 프로그램으로 만들 때 다시 메인메뉴 보여주기 전, fc.levelGame() 실행 중 nextInt()로 인해 버퍼에 남아있는 개행문자 없애주기 위해
				}
			} // 첫번째 else문 영역 끝
		} // while문 영역 끝
	} // main메뉴 표시 메소드 영역 끝 
	
} // 사용자에게 보여주는 메뉴 클래스 영역 끝
