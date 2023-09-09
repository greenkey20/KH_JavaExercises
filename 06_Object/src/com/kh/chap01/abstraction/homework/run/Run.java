package com.kh.chap01.abstraction.homework.run;

import com.kh.chap01.abstraction.homework.*;

public class Run { // Run 클래스 영역 시작
	
	public static void main(String[] args) { // main메소드 영역 시작
		
		// 1. 모니터 클래스
		// 모니터 클래스의 객체 생성
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		// 모니터 객체들의 멤버변수 값 대입
		m1.location = "책상1";
		m1.screenSize = 24;
		m1.brand = "LG";
		m1.power = true;
		m1.brightness = 40;
		m1.electricityConsumption = 180.45;
		
		m2.location = "책상2";
		m2.screenSize = 32;
		m2.brand = "Dell";
		m2.power = false;
		m2.brightness = 78;
		m2.electricityConsumption = 200.67;
		
		// 메소드 호출 -> 모니터 객체들의 상태 변경
		System.out.println(m2.location + " 모니터의 전원 상태(before) : " + m2.power);
		m2.powerSwitch(); // m2 모니터의 전원 상태 변경
		System.out.println(m2.location + " 모니터의 전원 상태(after) : " + m2.power);
		
		m1.brightnessControl(-20);
		m2.brightnessControl(10);
		
		m1.electricityBill();
		m2.electricityBill();
		System.out.println(m1.location + " 모니터의 전기 사용량 : " + m1.electricityConsumption);
		System.out.println(m2.location + " 모니터의 전기 사용량 : " + m2.electricityConsumption);
		
		// 2. 나무 클래스
		// 나무 클래스의 객체 생성
		Tree t1 = new Tree();
		Tree t2 = new Tree();
		
		// 나무 객체들의 멤버변수 값 대입
		t1.name = "버드나무";
		t1.numOfLeaf = 60;
		t1.height = 210.34;
		t1.round = 78.54;
		t1.noDisease = false;
		
		t2.name = "밤나무";
		t2.numOfLeaf = 45;
		t2.height = 195.12;
		t2.round = 57.39;
		t2.noDisease = true;
		
		// 메소드 호출 -> 나무 객체들의 상태 변경
		System.out.println(t1.name + "의 치료 전 병충해 없음 : " + t1.noDisease);
		t1.medicalTreatment(); // t1 나무의 병충해 유무 변경
		System.out.println(t1.name + "의 치료 후 병충해 없음 : " + t1.noDisease);
		
		t1.seasonalGrowth();
		System.out.println(t1.season + "의 " + t1.name + "의 잎파리 수 : " + t1.numOfLeaf);
		t2.seasonalGrowth();
		System.out.println(t2.season + "의 " + t2.name + "의 잎파리 수 : " + t2.numOfLeaf);
		
		System.out.println(t1.name + "의 현재 키와 둘레 : " + t1.height + ", " + t1.round);
		t1.sunGrowth();
		System.out.println("일일 평균 일조 " + t1.hour + "시간에 따른 " + t1.name + "의 키 : " + t1.height + "cm, 둘레 : " + t1.round + "cm");
		
		System.out.println(t2.name + "의 현재 키와 둘레 : " + t2.height + ", " + t2.round);
		t2.sunGrowth();
		System.out.println("일일 평균 일조 " + t2.hour + "시간에 따른 " + t2.name + "의 키 : " + t2.height + "cm, 둘레 : " + t2.round + "cm");
		
		// 3. 스피커 클래스
		// 스피커 클래스의 객체 생성
		Speaker s1 = new Speaker();
		Speaker s2 = new Speaker();
		Speaker s3 = new Speaker();
		
		// 스피커 객체들의 멤버변수 값 대입
		s1.productName = "soundcloud12";
		s1.brand = "Sony";
		s1.left = false;
		s1.right = false;
		s1.volume = 10;
		s1.mode = 'A';
		
		s2.productName = "minicon";
		s2.brand = "Samsung";
		s2.left = false;
		s2.right = true;
		s2.volume = 5;
		s2.mode = ' ';
		
		s3.productName = "lalaland";
		s3.brand = "LG";
		s3.left = true;
		s3.right = false;
		s3.volume = 11;
		s3.mode = 'D';
		
		// 메소드 호출 -> 스피커 객체들의 상태 변경
		s1.balanceControl();
		s2.balanceControl();
		s3.balanceControl();
		
		s1.volumeControl(21);
		s2.volumeControl(-8);
		s3.volumeControl(3);
		
		s1.toneControl();
		
		s2.modeControl('B');
		
	} // main메소드 영역 끝

} // Run 클래스 영역 끝 
// 2021.10.22자 클래스 숙제 소감: 현실의 사물들을 프로그래밍하는 것이 객체지향프로그래밍이라고는 하지만, 클래스로 만들기 적당한 대상(적당한 수의, 명확한 멤버변수들을 만들 수 있고, 내가 적당한 수의 기능을 구현할 수 있는)에 대해 고민을 조금 했습니다.
// 대상들을 선정한 후에 속성과 기능을 정리해서 작성해 보는 것은 재미있었습니다. 더 복잡한 기능을 구현하지 못하는 스스로가 조금 답답했습니다.
// 감사합니다!
