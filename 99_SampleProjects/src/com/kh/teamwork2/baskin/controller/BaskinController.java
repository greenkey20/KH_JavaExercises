package com.kh.teamwork2.baskin.controller;

import com.kh.teamwork2.baskin.model.vo.*; // 손님 클래스, 베스킨 클래스, 사이즈별로 클래스가 모두 필요해서 '*'로 전부 import함

public class BaskinController {

	// 손님 객체 생성
	Guest g = new Guest();

	// 베스킨메뉴 클래스에서 손님객체마다 다르게 입력받은 돈을 받아서
	// 손님객체에 셋팅해주는 메소드
	public void setGuestMoney(int money) {
		g.setMoney(money); // 손님클래스의 setter메소드에 입력받은 돈을 전달해준다.
	}

	// 소유한 돈에 맞는 아이스크림 메뉴 출력
	public int showMenu() {
		// 돈 모자라면 쫓아내기위한 변수 선언
		int getOut = 0;

		// setMoney()로 입력받은 돈을 반환하는 getMoney()메소드를 사용해 사이즈별로 살 수있는
		// 아이스크림 크기를 출력해준다.
		if (g.getMoney() >= 26500) {
			System.out.println("하프갤런, 패밀리, 쿼터, 파인트 주문가능합니다!");
		} else if (g.getMoney() >= 22000) {
			System.out.println("패밀리, 쿼터, 파인트 주문가능합니다!");
		} else if (g.getMoney() >= 15500) {
			System.out.println("쿼터, 파인트 주문가능합니다!");
		} else if (g.getMoney() >= 8200) {
			System.out.println("파인트 주문가능합니다!");
		} else {
			System.out.println("돈도 없으면서 무슨... 가서 메로나나 사드시길");
			getOut = 1;// 돈이 8200미만이면 int getOut을 1로 베스킨메뉴에 반환하고 종료시킨다.
		}

		return getOut; // 돈이 8200원 이상일경우엔 초기화식 그대로 0이어서 코드 진행이 된다.
	}

	// 아이스크림 메뉴 정하기
	public Baskin selectIcecream(int menuNum) {

		// 메뉴 번호에 따른 아이스크림 객체 생성
		if (menuNum == 1) { // 베스킨메뉴에서 1번을 고를 경우 부모타입인 베스킨 참조변수 p안에 자식인 파인트객체가
							// 자동형변환되어 생성된다.(다형성 : 부모타입참조변수로 -> 자식객체 다루기)
			Baskin p = new Pint();
			return p; // 부모타입 베스킨형 p를 반환
		} else if (menuNum == 2) {// 베스킨메뉴에서 2번을 고를 경우 부모타입인 베스킨 참조변수 q안에 자식인 쿼터객체가
									// 자동형변환되어 생성된다.(다형성 : 부모타입참조변수로 -> 자식객체 다루기)
			Baskin q = new Quarter();
			return q; // 부모타입 베스킨형 q를 반환
		} else if (menuNum == 3) {// 베스킨메뉴에서 3번을 고를 경우 부모타입인 베스킨 참조변수 f안에 자식인 패밀리객체가
									// 자동형변환되어 생성된다.(다형성 : 부모타입참조변수로 -> 자식객체 다루기)
			Baskin f = new Family();
			return f; // 부모타입 베스킨형 f를 반환
		} else if (menuNum == 4) {// 베스킨메뉴에서 2번을 고를 경우 부모타입인 베스킨 참조변수 h안에 자식인 하프갤런객체가
									// 자동형변환되어 생성된다.(다형성 : 부모타입참조변수로 -> 자식객체 다루기)
			Baskin h = new HalfGallon();
			return h; // 부모타입 베스킨형 h를 반환
		}

		return null; // 만약 사용자한테 입력받은 값이 1, 2, 3, 4중 없다면 null값 반환
	}

	// 베스킨 메뉴에서 사용자한테 입력받은 손님의 명수대로 매개변수로 받아 숟가락 갯수 셋팅해주는 메소드
	public void setGuestNum(int guestNum) {
		g.setGuestNum(guestNum); // 손님의 setter메소드에 베스킨 메뉴에서 입력받은 명수를 매개변수로 전달.
	}

	// 숟가락 개수 가져오기
	public int getGuestNum() { // 위에서 손님의 setter메소드를 통해 입력받은 숟가락 갯수를
								// 베스킨 메뉴에 반환시켜주는 손님의 getter메소드
		return g.getGuestNum();
	}

	// mySelectFlavor 배열에 맛이름 넣기
	public String[] setFlavor(int[] selectFlavor, Baskin b) { // 베스킨 메뉴에서 사용자가 선택한 맛별 번호가 들어있는 정수형 배열과 베스킨 객체를 전달 받는다.
		String[] mySelectFlavor = new String[b.getIcecreamNum()]; // 각사이즈별로 선택할 수 있는 맛의 갯수가 다르기때문에 부모타입인 베스킨의
																	// getIcecreamNum()메소드를 호출하여
																	// String[] mySelectFlavor의 인덱스 칸값으로 정수를 반환받는다.

		for (int i = 0; i < mySelectFlavor.length; i++) { // 사용자가 고른 아이스크림 사이즈(= 아이스크림갯수) 만큼 for문을 돌려준다.
			mySelectFlavor[i] = b.getFlavor()[selectFlavor[i]]; // 베스킨 메뉴에서 사용자가 고른 아이스크림 숫자가 담겨있는
																// int[] selectFlavor를 b.getFlavor()의 배열 인덱스안의 값으로 주면
																// getFlavor()는 아스크림맛 10가지가 담겨있는 String[] flavor의 인덱스값을
																// String[] mySelectFlavor[i] 에 넣어준다.
		}

		return mySelectFlavor; // 따라서 사용자가 고른맛으로만 구성되어 있는 String[] mySelectFlavor 배열을 베스킨 메뉴로 반환하게 된다.
	}

} // 온전히 제머릿속에서 나온것이 아닌 저희 조원 5명 모두 쥐어 짜서 나온 코드입니다.
