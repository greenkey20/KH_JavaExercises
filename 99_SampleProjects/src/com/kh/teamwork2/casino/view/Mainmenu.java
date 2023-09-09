package com.kh.teamwork2.casino.view;

import java.util.Scanner;

import com.kh.teamwork2.casino.controller.*;
import com.kh.teamwork2.casino.model.vo.Player;

public class Mainmenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SlotController s = new SlotController();// 슬롯머신 컨트롤러 클래스객채를 생성
		BlackjackController b = new BlackjackController();// 블랙잭 컨트롤러 클래스객채를 생성
		Player p = new Player(); // 플레이어 클래스 객채를 생성
		System.out.println("KH 카지노에 오신 걸 환영합니다");
		System.out.println("=============================");// 기본 안내를 위한 프린트문
		System.out.println("플레이어명과 소지금을 입력하세요");

		System.out.print("이름 : ");
		String name = sc.nextLine();// 이름을 입력받아
		p.setPlayerName(name);// 플레이어 클래스 set플레이어 네임에 넣음

		System.out.print("소지금 : ");
		int Wallet = sc.nextInt();// 정수를 입력받아
		p.setWallet(Wallet);// 플레이어 클래스 set 월렛에 넣음

		for (;;) {// 사용자가 원하는 만큼 반복하기위한 반복문
			System.out.println("=============================");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 블랙잭");
			System.out.println("2. 슬롯머신"); // 메인메뉴 프린트문
			System.out.println("3. 회원 돈 충전");
			System.out.println("4. 회원 정보");
			System.out.println("0. 나가기");
			System.out.print(">>");
			int num = sc.nextInt(); // 메인 메뉴에 나와있는 숫자를 입력하면
			switch (num) { // 입력받은 숫자에 따라 스위치문 으로 넘어감
			case 1: // 1입력시 브레이크 가있는 구문까지 실행
				System.out.println("블랙잭 게임입니다"); // 기본 안내 프린트문
				System.out.println("게임은 21에 맞추거나 21에 가까운 사람이 승리하는 게임으로 21을 넘어가면 탈락입니다.\n승리시 배팅금액에 두배를 돌려 드립니다.");
				b.playBlackjack(p.getWallet()); // 블랙잭 컨트롤러 매소드를 불러옮
				break;
			case 2: // 2입력시 브레이크 가있는 구문까지 실행
				System.out.println("슬롯머신 게임입니다"); // 기본 안내 프린트문
				System.out.println("게임은 같은 숫자 3개가 나올 경우 승리합니다. \n숫자가 7,7,7일 때는 잭팟으로 승리합니다 등수에 따른 금액을 돌려 드립니다.\n");
				s.playSlot(p.getWallet()); // 슬롯머신 컨트롤러 매소드를 불러옮
			case 3: // 3입력시 브레이크 가있는 구문까지 실행
				System.out.println("돈 충전 메뉴입니다."); // 기본 안내 프린트문
				System.out.print("충전 금액을 입력하세요 : ");
				int cash = sc.nextInt(); // 정수를 입력받아
				p.setWallet(cash + p.getWallet()); // set월랫 안에 있던 정수에 더함 (돈)
				break;
			case 4: // 4입력시 브레이크 가있는 구문까지 실행 //기본 안내 프린트문
				System.out.println("회원 이름 : " + p.getPlayerName());
				System.out.println("회원 지갑 : " + p.getWallet());
				break;
			case 0: // 0입력시 리턴을 사용해 돌아가서 종료함
				System.out.println("수고 하셨습니다."); // 기본 안내 프린트문
				return;
			default: // 메인메뉴에 나와있는 숫자가 아닌 다른걸 입력했을 시 for문을 다시 실행하기 위한 설정
				System.out.println("다시 입력하세요.");

				continue;
			}
		}

	}

}
