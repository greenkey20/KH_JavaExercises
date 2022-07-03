package com.kh.teamwork2.junkshop.view;

import java.util.Scanner;

import com.kh.teamwork2.junkshop.controller.JunkShopcontroller;
import com.kh.teamwork2.junkshop.model.vo.Customer;

public class JunkShopMenu {

	public void mainMenu() {

		// 필요한 객체 생성 및 연결
		Scanner sc = new Scanner(System.in);
		Customer mi = new Customer();
		JunkShopcontroller jc = new JunkShopcontroller();

		// 안내문
		System.out.println("GOD승철의 AntiqueShop의 오신것을 환영합니다 ");
		System.out.println("주민번호 -> 생년월일과 뒷자리 첫번째까지 입력해주세요 ex) 981212-1");

		String memid = sc.nextLine();
		mi.setMemberId(memid); // 맴버 아이디 등록
		int age = jc.age(mi); // JunkShopcontroller에 있는 age 메소드를 통해, 주민등록번호 앞 자리로 나이 분석
		char gender = jc.gender(mi); // JunkShopcontroller에 있는 age 메소드를 통해, 주민등록번호 뒷 자리 첫번째 값으로 나이 분석

		boolean Manustop = true; // 무한루프 값 설정
		while (Manustop) {

			System.out.println("1. 고물판매");
			System.out.println("2. 전자제품판매");
			System.out.println("3. 상점 나가기");
			int choice = sc.nextInt();
			if (choice == 1) { // 1번(고물판매)을 선택했을 때

				boolean junkstop = true;
				while (junkstop) { // 메뉴 무한루프
					System.out.println("1. 고정 고물 가격 판매");
					System.out.println("2. 랜덤 고물 가격 판매");
					System.out.println("3. 메뉴로 돌아가기");

					int choiceJunk = sc.nextInt(); // 사용자 메뉴 선택
					if (choiceJunk == 1) {
						jc.junkType(gender, age); // 각각의 고물 무게들을 입력받고 사용자 성별, 나이 가격에 맞는 총액 출력
					} else if (choiceJunk == 2) {
						jc.junkRandomPrice(gender, age); // 고물들(종이, 플라스틱, 철, 구리, 병)의 가격들을 각각 랜덤화 한 후,
															// 소비자의 나이, 성별을 고려하여 할인값이 추가로 들어가게 된다.
					} else if (choiceJunk == 3) {
						junkstop = false; // 기존의 메뉴로 돌아간다
						System.out.println("기존 메뉴로 돌아갑니다.");

					} else { // 사용자가 1, 2, 3 이외의 숫자를 입력할 경우
						System.out.println("잘못 입력 하셨습니다.");
					}
				}

			} else if (choice == 2) { // 2번(전자제품)을 선택했을 경우
				boolean electronicStop = true;
				while (electronicStop) { // 무한루프

					// 안내문
					System.out.println("1. 고정 고물 가격 판매");
					System.out.println("2. 랜덤 고물 가격 판매");
					System.out.println("3. 메뉴로 돌아가기");

					int choiceJunk = sc.nextInt();
					if (choiceJunk == 1) { // 사용자가 "고정 고물 가격 판매"를 선택했을 경우
						jc.electronicType(gender, age); // 스타일러, 냉장고, 컴퓨터, 세탁기, 건조기의 개수를 입력받은 후, 나이, 성별에 따른 총액을 가르쳐 준다.

					} else if (choiceJunk == 2) { // 사용자가 "랜덤 고물 가격 판매"를 선택했을 경우
						jc.electronicRandomPrice(gender, age); // 각각의 스타일러, 냉장고, 컴퓨터, 세탁기의 가격들을 랜덤화 한 후,
																// 바로 productPrice에 연결되어, 나이, 성별에 다르게 할인값이 들어간다.
					} else if (choiceJunk == 3) {
						System.out.println("기존 메뉴로 돌아갑니다."); // 기존메뉴로 돌아간다.
						electronicStop = false;
					} else {
						System.out.println("잘못 입력 하셨습니다."); // 1, 2, 3 이외의 값을 입력했을 때
					}
				}
				System.out.println("2. 고정 전자제품 가격 판매");
				System.out.println("3. 랜덤 전자제품 가격 판매");
			} else if (choice == 3) { // 3번 입력시, 프로그램 종료
				System.out.println("GOD승철의 AntiqueShop을 다시 찾아주세요 ^^");
				Manustop = false;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}

		}

	}

}
