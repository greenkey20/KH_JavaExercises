package com.kh.practice3.funcal.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice3.funcal.model.vo.*;
import com.kh.practice3.funcal.view.FunCalMenu;

public class FunCalController {
	
	 private Level lv = new Level();
	 
	 public void insertLevel(Level lv) {
		 this.lv = lv;
	 }
	 
	 public Level getLevel() {
		 return lv;
	 }
	 
	 public int numLevel(String level) { // 난이도별 숫자 범위 반환하는 메소드
//		 FunCalMenu fm = new FunCalMenu();
//		 String level = fm.mainMenu();
		 int numLevel = 0;
		 
		 switch(level) {
		 case "상" : numLevel = LevelHigh.numHigh;
		 	break;
		 case "중" : numLevel = LevelMid.numMid;
		 	break;	
		 case "하" : numLevel = LevelLow.numLow;
		 	break;
		 }
		 
		 return numLevel;
	 }
	 
	 public void levelGame(String level) { // 문제 메소드 영역 시작
			
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("# " + level + "급 난이도입니다. 1 ~ " + numLevel(level) + "범위로 출제됩니다.");
		 
		 while(true) { // while문 영역 시작
			int input = 0;
			 
		 	int num1 = (int)(Math.random()*numLevel(level)) + 1;
			int num2 = (int)(Math.random()*numLevel(level)) + 1; // 피연산자끼리 같은 숫자 나와도 상관은 없음
			int operator = (int)(Math.random()*4);
				
			switch(operator) {
			case 0 : lv.setQuestion(num1 + " + " + num2);
				lv.setAnswer(num1 + num2);
				break;
			case 1 : lv.setQuestion(num1 + " - " + num2);
				lv.setAnswer(num1 - num2);
				break;
			case 2 : lv.setQuestion(num1 + " X " + num2);
				lv.setAnswer(num1 * num2);
				break;
			case 3 : lv.setQuestion(num1 + " ÷ " + num2);
				try {
					lv.setAnswer(num1 / num2);
				}
				catch(ArithmeticException e) {
					continue;
				}
				break;
			}
			System.out.println("Q" + (lv.getRightAnswer() + lv.getWrongAnswer() + 1) + ") " + lv.getQuestion() + " = ?");
			System.out.print(">> ");
			
			
			try {
				input = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("======================");
				System.out.print("# 정답 횟수 : " + lv.getRightAnswer() + "회, 오답 횟수 : " + lv.getWrongAnswer() + "회");
				if (lv.getRightAnswer() > lv.getWrongAnswer()) {
					System.out.println(" -> 참 잘 했어요~");
				} else {
					System.out.println(" -> 조금 아쉽네요~ 다음에는 더욱 분발해봅시다!");
				}
//				lv.setRightAnswer(0); // 난이도 바꿔서 문제 계속 푸는 프로그램으로 만들 때, 다음 난이도 게임으로 넘어가기 전 문제 번호 1번부터 보여주기 위해
//				lv.setWrongAnswer(0);
//				return;
				System.exit(0);
			}
			
			if (input != lv.getAnswer()) {
				System.out.println("# 틀렸습니다 >.<");
				lv.setWrongAnswer(lv.getWrongAnswer() + 1);
			} else if (input == lv.getAnswer()) {
				System.out.println("# 정답입니다 ^ㅁ^");
				lv.setRightAnswer(lv.getRightAnswer() + 1);
			} 
				
		} // while문 영역 끝
	} // 문제 메소드 영역 끝

}
