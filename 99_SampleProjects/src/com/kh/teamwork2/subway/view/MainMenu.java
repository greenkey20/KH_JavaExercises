package com.kh.teamwork2.subway.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.teamwork2.subway.controller.SandwichController;

public class MainMenu {

	private Scanner sc = new Scanner(System.in); // Scanner 를 사용하기 위해 객체생성
	private SandwichController sub = new SandwichController(); // SandwichController의 메서드들을 사용하기 위해 SandwichController
																// 타입의 객체 생성

	private String[] menuView = { "햄 : 4800/6600", "아보카도 섭도그 : 5900/7900", "풀드포크 : 6000/7700", "쉬림프 : 5900/8100",
			"에그마요 4300/6000" };
	private String[] breadView = { "화이트", "위트", "플랫브레드", "파마산오레가노", "허니오트", "하티" };
	private String[] cheeseView = { "아메리칸치즈", "슈레드치즈", "모짜렐라치즈" };
	private String[] vegetableView = { "양상추", "토마토", "오이", "피망", "양파", "피클", "올리브", "할라피뇨" };
	private String[] sauceView = { "마요네즈", "스위트어니언", "스위트칠리", "허니머스타드", "핫칠리", "랜치", "사우스웨스트치폴레", "홀스래디쉬", "올리브오일",
			"후추", "레드와인식초", "소금", "스모크바비큐" };
	private String[] drinkView = { "코카콜라", "코카콜라제로", "스프라이트", "닥터페퍼" };
	private String[] cookieView = { "초코칩", "라즈베리", "오트밀레이즌", "화이트마카다미아", "더블초코칩" };

	// String 타입 배열에 매장에 있는 메뉴, 빵, 치즈, 야채, 음료, 쿠키 종류들을 String 타입으로 받아서 초기화 해줬습니다.

	public void mainMenu() {

		while (true) { // 빵 주문을 잘못 입력했을 경우 다시 돌아와야 하기 때문에 무한반복문으로 만들어 줬습니다.
			System.out.println("안녕하세요 서브웨이 kh점입니다~");
			System.out.println("온도체크 후 QR인증 부탁드려요 ㅎㅎ\n");
			System.out.println("재료 소진으로 인해 1인당 1개만 주문 가능합니다.");
			System.out.print("카드 잔액을 입력하세요. : ");
			int myCoin = Integer.parseInt(sc.nextLine()); // nextInt를 사용하면 46행에 nextLine이 작동하지 않기 때문에 nextLoine으로 사용한 후
															// parseInt로 integer로 바꿔주었습니다.
			int menuPrice = 0; // 메뉴 가격을 담을 변수 menuPrice를 선언과 0으로 초기화를 해줬습니다.
			System.out.println();
			if (myCoin < 4000) {
				System.out.println("4000원 이하는 나가주시죠 ㅋㅋ~~zzz");
				return; // 현재 고객이 가진 금액을 myCoin으로 입력받아서 가장 적은 메뉴 가격은 4000원 미만일때는 return으로 프로그램이 종료되게
						// 하였습니다.
			} else {
				System.out.println("귀하의 잔액은 " + myCoin + "￦ 입니다"); // 4000원 이상이면 잔액을 보여주고 프로그램이 계속 실행됩니다.
			}
			System.out.println();
			System.out.println("======== 서브웨이 메뉴판 ==========");
			System.out.println();
			System.out.println(Arrays.toString(menuView) + "\n"); // 13행의 menuView 배열을 toString 으로 출력하였습니다.
			System.out.print("메뉴를 골라주세용 > ");
			String name = sc.nextLine(); // 메뉴의 이름을 name에 입력받아 저장하였습니다.

			System.out.print("\n세트로 변경하려면 \"네\"입력 : ");
			String setbool = sc.nextLine(); // 세트로 하겠다는 '네'를 입력받을 setbool을 선언해 주었습니다.
			System.out.println();
			boolean set = false; // boolean 타입 변수 set 를 false로 선언과 초기화를 해줬습니다.
			if (setbool.equals("네")) { // String 타입 setbool에 입력받은 값이 "네" 이면 equals를 사용해 스트링타입끼리 비교하여 둘이 같으면 set를 true로
										// 바꾸어
				set = true; // 56행에 switch 문에 if문에 set가 true가 되어 set를 시켰을 시에는 if문으로 들어가게 만들어줬습니다.
			}

			switch (name) { // 입력받은 메뉴이름이 case안에 있는 값들로 들어가게끔 만들어줬습니다.
			case "햄":
				if (set) { // setbool의 값이 "네"이면 set가 true가 되어 if문에 조건식이 true가 되어 if문안에 내용을 실행하게 됩니다.
					menuPrice = 6600; // menuPrice 가 6600원으로 초기화가 되어집니다.
					myCoin -= menuPrice;// myCoin에서 menuPrice의 가격을 빼주어 잔액이 줄어들게 됩니다.
				} else {
					menuPrice = 4800;
					myCoin -= menuPrice;
				}
				break;
			case "아보카도 섭도그":
				if (set) {
					menuPrice = 7900;
					myCoin -= menuPrice;
				} else {
					menuPrice = 5900;
					myCoin -= menuPrice;
				}
				break;
			case "풀드포크":
				if (set) {
					menuPrice = 7700;
					myCoin -= menuPrice;
				} else {
					menuPrice = 6000;
					myCoin -= menuPrice;
				}
				break;
			case "쉬림프":
				if (set) {
					menuPrice = 8100;
					myCoin -= menuPrice;
				} else {
					menuPrice = 5900;
					myCoin -= menuPrice;
				}
				break;
			case "에그마요":
				if (set) {
					menuPrice = 6000;
					myCoin -= menuPrice;
				} else {
					menuPrice = 4300;
					myCoin -= menuPrice;
				}
				break;
			default: // 혹시 메뉴이름이 case에 없을경우 default 로 와서 밑에 출력문을 출력합니다.
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				System.out.println("잔액 입력부터 다시 하세요.");
				continue;// continue를 사용해 가장 가까운 반복문 끝으로 가게하여 다시 27행으로 돌아가게 됩니다.
			}

			if (myCoin < 0) { // 혹시 메뉴를 정했으나 잔돈이 0원보다 미만이 되면 잔액이 부족하게 되어 다시 메인메뉴로 돌아가게 하였습니다.
				System.out.println("잔액부족이십니다. 다른 카드 줘보세요");
				mainMenu();
			}

			System.out.println("\n빵을 골라주세요.");
			System.out.println(Arrays.toString(breadView));// breadView 배열을 꺼내어 내용을 보여주게 하였습니다.
			System.out.print(" >> ");
			String bread = sc.nextLine(); // bread를 입력받으면 바로 170행에 insertMenu에 매개변수로 들어가게 하였습니다다

			System.out.println("\n치즈를 골라주세요.");
			System.out.println(Arrays.toString(cheeseView));// cheeseView 배열을 꺼내어 내용을 보여주게 하였습니다.
			System.out.print(" >> ");
			String cheese = sc.nextLine(); // cheese를 입력받으면 바로 170행에 insertMenu에 매개변수로 들어가게 하였습니다다

			System.out.println("\n제외할 야채를 골라주세요. 다먹을거면 엔터를 연타하세요. 그리고 순서대로 입력 안하면 아무것도 안줌.");
			System.out.println(Arrays.toString(vegetableView));// vegetableView 배열을 꺼내어 내용을 보여주게 하였습니다.
			String vegetable = null; // 고객에게 빼고싶은 야채를 입력받아 저장하기 위한 vegetable 변수를 null로 기본 생성해주었습니다.
			int count = 0; // 배열 realvegetable의 배열길이를 만들어 주기 위한 count를 0으로 초기화하며 생성해 주었습니다.
			for (int i = 0; i < vegetableView.length; i++) { // 사용자가 빼고싶은 야채를 빼기위한 vegetableView의 길이만큼 반복할 반복문을 만들었습니다.
				System.out.print(" >> ");
				vegetable = sc.nextLine();
				if (vegetableView[i].equals(vegetable)) { // 순서대로 입력받은 vegetable 값이 vegetableView과 겹치면
					vegetableView[i] = ""; // 공백으로 채워줍니다.
					count++;// 빼고싶은 야채로 입력한 값이 겹치면 count가 하나씩 올라가게 됩니다.
				}

			}

			vegetable = ""; // 139행에 이중for문에서 사용하기 위해 vegetable을 공백으로 초기화한 후
			String[] realvegetable = new String[vegetableView.length - count];// 이제 사용자가 빼고싶은 야채값이 없는 야채를 담을 배열을 만들어
																				// 줍니다. 길이는 vegetableView의 길이에서
			for (int i = 0; i < vegetableView.length; i++) { // 빼고싶은 야채수인 count를 빼주워서 생성했습니다. 그 후 vegetableView의 길이만큼
																// for문을 돌려줍니다.
				for (int j = 0; j < realvegetable.length; j++) { // realvegetable의 크기만큼 돌려줄 for문을 만들어준 후
					if (vegetableView[i] != "") { // if 문을 넣어서 vegetableView 에 공백이 아닐 경우 realvegetable에 vegetableView의
													// 내용을 옮겨 담아 줍니다.
						realvegetable[j] = vegetableView[i]; // realvegetable 배열에 값을 입력받아 준후
						vegetable += realvegetable[j]; // insertMenu 의 매개변수로 사용할 vegetable에 담아줍니다.
						vegetable += " "; // 보기 좋게 하기 위해 띄어쓰기를 넣어주었습니다.
						break;// 값이 담기면 148행으로가 다시 반복문을 수행합니다.
					}

				}
			}

			System.out.println("\n소스를 골라주세요. 3가지만 받겠습니다.");
			System.out.println(Arrays.toString(sauceView));// sauceView 배열을 꺼내어 내용을 보여주게 하였습니다.
			String sauce = ""; // insertMenu 메뉴에 담을 sauce를 공백으로 선언과 초기화를 해주었습니다.
			for (int i = 0; i < 3; i++) { // 3가지의 소스를 받기 위해 3번 돌려주었습니다.
				System.out.print(" >> ");
				sauce += sc.nextLine();
				sauce += " "; // 보기 좋게 하기 위해 띄어쓰기를 넣어주었습니다.
			}

			if (set) { // set가 true일때만 실행되게 하였습니다.
				System.out.println("\n쿠키를 골라주세요.");
				System.out.println(Arrays.toString(cookieView));// cookieView 배열을 꺼내어 내용을 보여주게 하였습니다.
				System.out.print(" >> ");
				String cookie = sc.nextLine();
				System.out.println("\n음료를 골라주세요.");
				System.out.println(Arrays.toString(drinkView));// drinkView 배열을 꺼내어 내용을 보여주게 하였습니다.
				System.out.print(" >> ");
				String drink = sc.nextLine();
				sub.insertMenu(name, menuPrice, bread, cheese, vegetable, sauce, cookie, drink);
				// SandwichController에 있는 insertMenu 메서드를 쓰기위해 만든 SandwichController 타입의 변수 sub를
				// 이용해 메서드를 호출과 동시에 초기화를 해주었습니다.
				System.out.println("\n주문하신 " + name + "세트 나왔습니다.");
				System.out.println("\n" + sub.printMenu() + "\n쿠키는 " + cookie + ", 음료는 " + drink + "입니다.");
				// insertMenu에서 초기화를 해준 후 printMnu를 통해 출력문을 출력해 주었습니다.
				// 세트메뉴일때는 printMenu 뒤에 쿠키와 음료가 더 있어 출력문을 초기화 해주었습니다.

			} else {

				System.out.println("\n주문하신 " + name + "단품 나왔습니다.");
				sub.insertMenu(name, menuPrice, bread, cheese, vegetable, sauce); // 단품일때도 오버로딩을 이용하여 매개변수 갯수만 다르게해서 초기화 해 주었습니다.
				System.out.println("\n" + sub.printMenu()); // printMenu를 이용해 출력해 주었습니다.

			}

			System.out.println("맛있게 드세요~");
			System.out.println("\n귀하의 잔액은 " + myCoin + "￦ 남았습니다."); // 남은 잔액을 보여주었습니다.
			System.exit(0); // 다시 반복되지 않게 프로그램이 종료되게 하였습니다.
		}
	}

}

//저희 조는 어떻게 만들지 다 같이 고민하면서 만들어서 전체에 제 생각을 적었습니다. 감사합니다. 고생하셨습니다.
