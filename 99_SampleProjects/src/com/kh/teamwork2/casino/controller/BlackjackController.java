package com.kh.teamwork2.casino.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.teamwork2.casino.model.vo.Blackjack;

public class BlackjackController {

	Scanner sc = new Scanner(System.in);
	Blackjack bj = new Blackjack();
	int j = 2;
	int a = 0;
	int b = 0;
	int wallet = 0;

	public boolean game() {
		boolean c = true;
		do {
			System.out.println("현재 상대방의 패 : " + Arrays.toString(bj.getDealdeck()));
			System.out.println("현재 나의 패 : " + Arrays.toString(bj.getMydeck()));
			System.out.println("");
			if (a >= 21) {
				System.out.println("이기셨습니다.");
				break;
			} else if (b >= 21) {
				System.out.println("패배하셨습니다");
				c = false;
				break;
			} else {
				System.out.println("카드를 더 받으시려면 엔터를 누르세요.");
				sc.nextLine();
				bj.hit(j);
				a += bj.getDealdeck()[j];
				b += bj.getMydeck()[j];
				j++;
			}
		} while (j < 5);
		return c;
	}
	// do-while 문으로 start메소드에서 받아온 2장의 카드를 먼저 일단 비교해보고 승패를 가린후에 승패가 안나게된다면 더 진행하도록
	// 만들었고,
	// game이라는 메소드는 boolean형의 반환값을 주고있으며 본 메소드에서 분리시켜서 작성했습니다.
	// 이 메소드가 실행되고나면 클라이언트의 승패에 따라 반환값이 변하도록 설계했습니다.
	// 게임을 더 진행하지않을때 기존의 숫자만 가지고 승패를 가리는 기능을 추가하고싶습니다.

	public void playBlackjack(int num) {
		wallet = num;

		while (true) {
			System.out.println("Welcome BlackJack");
			System.out.println("게임을 시작하시려면 아무키나 눌러주세요.");
			sc.nextLine();
			bj.start();
			a += bj.getDealdeck()[0] + bj.getDealdeck()[1];
			b += bj.getMydeck()[0] + bj.getMydeck()[1];

			System.out.println("배팅 금액을 입력해주세요 :");
			int bat = sc.nextInt();
			wallet -= bat;
			if (num < bat) {// 소지하고 있는 금액이 요금보다 적을 경우 게임을 시작하지 않고, 현재 잔액을 보여준 후 메인으로 돌아간다.
				System.out.println("잔액이 부족합니다. 메인으로 돌아갑니다.");
				System.out.println("현재 잔액 : " + num);
				return;
			} else {// 그 외의 경우 게임 시작.
				sc.nextLine();
				System.out.println("Spinning the card--︎");
				System.out.println("카드를 확인하시려면 엔터를 눌러주세요.");
				sc.nextLine();
				boolean d = game();
				if (d == true) {
					System.out.println("배팅금액의 2배를 잔액으로 반환 하였습니다.");
					wallet += bat * 2;
				} else if (d == false) {
					System.out.println("힘내세요..");
				}
				System.out.println();
				System.out.println("그만 하시려면 \"항복\"이라고 정자로 입력하세요.");
				String SR = sc.nextLine();
				if (SR.equals("항복")) {
					break;
				}
			}
		}
	}
	// 먼저 메인에서 호출되는 메소드이고 진행하게되면 첫 카드 2장을 덱에 저장하게되고 그 배열에 저장된 카드의 수를 각 a,b에 대입하게됩니다.
	// 그리고 60번 줄에서 boolean d 라는 변수를 선언함과 동시에 game메소드를 호출해서 기능을 수행한후에 반환값으로 랜덤한
	// boolean값을 반환받습니다.
	// 그리고 조건문을 만들어 d 변수의 값이 true 라면 클라이언트의 지갑에 배팅을 걸었던 금액의 2배 만큼 돌려줍니다.
	// 후에 게임을 그만두겠다는 특정 문자열을 받으면 반복문을 종료하며 메소드의 기능이 끝나고 호출한 곳으로 돌아갑니다.
	// 입력받은 문자열이 조건식과 동일하지않을경우 다시 포문의 처음으로 돌아가 새로운 게임이 시작됩니다.

}
