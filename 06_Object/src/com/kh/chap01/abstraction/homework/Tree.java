package com.kh.chap01.abstraction.homework;

import java.util.Scanner;

public class Tree { // 나무 클래스의 영역 시작
	
	// 나무 클래스의 멤버변수
	public String name; // 종류
	public int numOfLeaf; // 잎파리의 수 -> seasonalGrowth 메소드를 통해 상태 변화
	public double height; // 키(cm) -> sunGrowth 메소드를 통해 상태 변화
	public double round; // 몸통의 둘레(cm) -> sunGrowth 메소드를 통해 상태 변화
	public boolean noDisease; // 병충해 없음 또는 있음 -> medicalTreatment 메소드를 통해 상태 변화
	
	public String season; // 계절
	public int hour; // 일일 평균 일조 시간
	
	// 나무 클래스의 메소드
	public boolean medicalTreatment() { // 병충해를 이겨내는 약 처방하는 메소드
		noDisease = !noDisease;
		return noDisease;
	}
	
	public void seasonalGrowth() { // 계절에 따른 성장을 알아보는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 무슨 계절입니까? > ");
		season = sc.next();
		
		switch (season) {
		case "봄" : numOfLeaf += 20;
			break;
		case "여름" : numOfLeaf += 40;
			break;
		case "가을" : numOfLeaf -= 50;
			break;
		case "겨울" : numOfLeaf = 0;
			break;
		}
		
		if (numOfLeaf < 0) {
			System.out.println("나무에 이상이 있는 것 같아요, 확인해주세요");
		}
	}
	
	public void sunGrowth() { // 햇빛에 따른 성장을 알아보는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("하루 평균 해를 몇 시간 쬐었나요? > ");
		hour = sc.nextInt();
		
		height += hour * 0.2;
		round += hour * 0.14;
	}

} // 나무 클래스의 영역 끝
