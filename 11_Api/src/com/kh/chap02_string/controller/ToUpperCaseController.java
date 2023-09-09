package com.kh.chap02_string.controller;

import java.util.Scanner;

public class ToUpperCaseController {
	
	private String userStr = "";
	private String upperStr = "";
	private Scanner sc = new Scanner(System.in);
	
	public void toUpperCase() {
		
		while (true) { // 사용자가 숫자나 한글을 입력한 경우 다시 입력받고 싶음
			
			System.out.print("영어를 입력하세요(띄어쓰기 포함) > ");
			userStr = sc.nextLine().toLowerCase();
			char[] chArr = userStr.toCharArray();
			
			for (int i = 0; i < chArr.length; i++) {
				if (i == 0) {
					chArr[i] = (char) (userStr.charAt(i) - 32);
				} else if (chArr[i - 1] == ' ') {
					chArr[i] = (char) (userStr.charAt(i) - 32);
//					chArr[i] = Character.toUpperCase(userStr.charAt(i))
				}
			}
			
			System.out.println(String.valueOf(chArr));
			
		} // while문 영역 끝
			
	}

}
