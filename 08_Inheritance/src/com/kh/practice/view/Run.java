package com.kh.practice.view;

public class Run {

	public static void main(String[] args) { // 프로그램의 실행은 main메소드에서 <- MainMenu 클래스의 객체를 생성해서 mainMenu() 호출
		MainMenu mm = new MainMenu(); // 클래스의 필드가 아니라 static으로 만들어진 main메소드 안에서 객체를 불러오는 거니까 private 접근제한자로 안 해도 됨
//		mm.mainMenu(); // MainMenu 생성자에 mainMenu() 메소드 넣었기 때문에, 윗줄을 통해 MainMenu 자료형의 객체 생성 시 mainMenu() 메소드 호출/실행됨; 굳이 객체를 통해 접근해서 mainMenu() 메소드 호출할 필요 없음
		
		// 객체 간의 상호작용; 내/외부적 관점: 객체 생성되면 그들만의/각 역할에 맞게 구분; 각 역할에 맞게 객체 생성 -> 객체를 필드로 받고.. -> 객체 지향 
	}

}
