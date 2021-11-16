package com.kh.chap02_string.run;

import java.util.Scanner;

import com.kh.chap02_string.controller.ToUpperCaseController;

public class ToUpperCaseView {
	
	private ToUpperCaseController tucc = new ToUpperCaseController();
	private String userStr = "";
	private String upperStr = "";
	private Scanner sc = new Scanner(System.in);
	
	public ToUpperCaseView() {
		ToUpperCaseMainMenu();
	}

	public void ToUpperCaseMainMenu() {
		
		while (true) { // 사용자가 숫자나 한글을 입력한 경우 다시 입력받고 싶음
			System.out.print("영어를 입력하세요(띄어쓰기 포함) > ");
			userStr = sc.nextLine().toLowerCase();
			char[] chArr = userStr.toCharArray();
		}
			
			
	}

}
