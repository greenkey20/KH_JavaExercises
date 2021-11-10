package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.*; // 이 패키지에 있는 모든 클래스 불러와서 사용 = *

public class BeforeRun {

	public static void main(String[] args) {
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("LG", "lg-01", "짱짱데스크탑", 3000000, true);
		
		// SmartPhone 객체 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("LG", "g-07", "G7", 700000, "LG");
		
		// Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "n-tv", "나노셀TV", 12000000, 100);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		// 지금까지 중복되는 내용이 많음; 필드명이 비슷한 게 많아서 생성자, get(), set(), information() 등 비슷
		/* 매 클래스마다 중복된 코드들을 하나하나 기술하면 수정 등 유지/보수할 경우 매번 하나하나 다 찾아서 수정해야 하는 번거로움이 생김
		 * vs '상속' 개념 적용시켜서 매 클래스마다 중복된 필드 및 메소드를 단 하나의 클래스(부모 클래스)로 만들어놓고 정의를 해 두고, 그 해당 클래스의 속성(변수, 데이터) 및 행위(메소드, 함수)를 가져다 쓰는 형식으로 진행
		 * 무형자산을 상속하듯이..
		 */

	}

}
