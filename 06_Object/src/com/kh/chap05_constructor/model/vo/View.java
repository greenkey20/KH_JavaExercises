package com.kh.chap05_constructor.model.vo;

public class View { // design pattern에 따라 View 클래스 분리
	
	// 기본 생성자; 이 클래스의 객체가 생성될 때 사용자에게 보여지는 부분이 실행되도록 함
	public View() {
		System.out.println("---------- 뭔가를 보여주는 프로그램 ----------");
		System.out.println("메뉴 1.");
		System.out.println("메뉴 2.");
		System.out.println("메뉴 3.");
		System.out.println("메뉴 4.");
		System.out.println("메뉴 5.");
		System.out.println("메뉴 6.");
	}

}
