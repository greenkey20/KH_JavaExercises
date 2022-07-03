package com.kh.teamwork2.restaurant.view;

import java.util.Scanner;

import com.kh.teamwork2.restaurant.controller.RestaurantController;
import com.kh.teamwork2.restaurant.model.vo.Guest;

public class KoreanRestaurant {

	private RestaurantController rc = new RestaurantController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		int menuNo;
		System.out.println("손님 정보를 입력 해주세요.");
		System.out.println("인원수(정원 5명) : ");
		int peoples = sc.nextInt();
		if (peoples > 5) {
			System.out.println("6명 이상은 받을 수 없습니다. 나가!!!");
			return;
		}
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("닉네임 : ");
		String nickName = sc.next();
		System.out.print("얼마들고왔어요?? : ");
		int money = sc.nextInt();

		Guest g = new Guest(name, money, nickName);
		rc.hereGuest(g, peoples);

		while (true) {
			System.out.println();
			System.out.println("==== 국밥집 ====");
			System.out.println("1. 남은 자리 확인");
			System.out.println("2. 지갑에 얼마있지?");
			System.out.println("3. 국밥왕은 얼마나 벌었지?");
			System.out.println("4. 국밥 주문(두 당 9000원)");
			System.out.println("9. 가게 나가기");
			System.out.print("메뉴 번호 : ");
			menuNo = sc.nextInt();
			System.out.println();
			switch (menuNo) {
			case 1:
				System.out.println(rc.guestCount() + "자리 남았습니다.");
				break;
			case 2:
			case 3:
				infoMoney(menuNo);
				break;
			case 4:
				jumo();
				break;
			case 9:
				System.out.println("가게를 벗어납니다!");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				;
			}

		}
	}

	private void infoMoney(int choise) {
		System.out.println(rc.getBalance(choise) + "원");
	}

	private void jumo() {
		rc.order();
	}

}
