package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.*;

public class BasicRun {
	
	public static void main(String[] args) {
		
		// 클래스가 미완성되었기 때문에 추상클래스로 객체 생성 불가
//		Sports s = new Sports();
		
		// 객체는 못만들지만 참조형 자료형으로는 사용 가능
		Sports s; // 이 참조형 변수에는 Sports 타입의 객체들은 못 들어가고 자식들만 들어갈 수 있음; 자식은 부모의 타입을 물려받으니까..
		s = new Soccer(); // 자식생성자 대입 -> 다형성 이용 -> 자식 객체를 받아주는 용도로 사용 가능
//		Sports s = new Soccer(); // 선언 및 대입 1줄 표현
		
		// 객체 배열
		Sports[] arr = new Sports[2];
		arr[0] = new Soccer();
		arr[1] = new volleyball();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		// 추상메소드 사용 시
		// 메소드 사용의 통일성 확보 가능
		// 표준화된 틀 제공 <- 상속받은 자식클래스는 반드시 미완성/추상 메소드를 완성시켜야 함
		
	}

}
