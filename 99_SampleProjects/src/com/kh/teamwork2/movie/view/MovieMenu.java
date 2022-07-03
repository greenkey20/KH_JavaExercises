package com.kh.teamwork2.movie.view;

import java.util.Scanner;

import com.kh.teamwork2.movie.controller.MovieController;

public class MovieMenu {

	private Scanner sc = new Scanner(System.in);
	private MovieController mc = new MovieController();

	// 메뉴 번호를 입력받아서 번호에 해당하는 메소드를 출력시키도록 했습니다.
	public void mainMenu() {
		while (true) {
			System.out.println("====메뉴====");
			System.out.println("1. 전체 영화 조회");
			System.out.println("2. 예매하기");
			System.out.println("3. 예매 조회");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				movieAll();
				break;
			case 2:
				reserve();
				break;
			case 3:
				reserveCheck();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	// 전체 영화 보기
	// controller클래스의 movie[]객체베열 메소드의 toString을 출력하도록 했습니다.
	public void movieAll() {
		for (int i = 0; i < mc.movieList().length; i++) {
			System.out.println(mc.movieList()[i].toString());
		}
	}

	// 예약하기
	public void reserve() {
		while (true) {
			// 영화 제목이랑 비교해서 아니면 다시 입력받기
			// 영화는 0, 1, 2번 총 3개 있음
			System.out.println("어떤 영화를 예매하시나요?");
			String title = sc.next();
			if (0 <= mc.selectMovie(title) && mc.selectMovie(title) < 3) {
				System.out.println("현재 선택 가능한 좌석입니다.");
				for (int i = 0; i < mc.availableSeat(title).length; i++) {
					// 이미 팔린 좌석은 좌석가격이 0으로 초기화된다.
					// 좌석가격이 0이 아닌 좌석을 출력하는 것으로 남아있는 좌석을 확인한다.
					if (mc.availableSeat(title)[i].getPrice() != 0) // 없는 좌석 빼고 출력하기
						System.out.println(mc.availableSeat(title)[i].restSeat());
				}
				System.out.print("좌석이름를 입력하세요: ");
				String seatGrade = sc.next();
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				System.out.println("전화번호를 입력하세요: ");
				int phone = sc.nextInt();
				mc.reserveMovie(title, name, phone, seatGrade);
			} else {
				System.out.println("현재 상영작이 아닙니다.");
			}

			// 그만할 때까지 계속 예약받기
			// 21: 전체 예약 가능 인원
			for (int i = 0; i < 21; i++) {
				if (mc.personCount() != 21) {
					System.out.println("그만하시려면  N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
					String select = sc.next();
					if (select.equals("N") || select.equals("n")) {
						return;
					} else
						break;
				} else {
					System.out.println("예약이 꽉 찼기 때문에 메인 메뉴로 돌아갑니다.");
					return;
				}
			}
		}
	}

	// 예약 확인하기
	public void reserveCheck() {
		System.out.print("예약자명을 입력하세요: ");
		String rName = sc.next();

		// 사용자가 입력한 예약자명과 저장되어있는 예약자들의 이름을 비교하여 해당 예약자가 예약한 영화 내역을 출력하도록 했습니다.
		for (int i = 0; i < mc.personCount(); i++) {
			if (mc.reservationList(rName)[i] != null)
				System.out.println(mc.reservationList(rName)[i].toString());
		}
	}

}
