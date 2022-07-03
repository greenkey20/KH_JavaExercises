package com.kh.teamwork2.junkshop.controller;

import java.util.Scanner;

import com.kh.teamwork2.junkshop.model.vo.Customer;
import com.kh.teamwork2.junkshop.model.vo.ElectronicProduct;
import com.kh.teamwork2.junkshop.model.vo.JunkShop;

/*
 * 본 JunkjShopcontroller 클래스는 전체 KH고물상 코드에서, 기능을 담당하는 클래스로.
 * 
 * 사용자에게 값을 입력받아,
 * 미리 설정해 놓은 메소드에 입력하여 연산을 할 수 있는 구조를 설계하였다.
 * 1.사용자의 생년월일과 뒷 첫번째값을 입력받아 
 *  1-1) Int형자료형으로 환산하여 사용자의 나이를 환산
 * 	1-2) char형 자료형으로 환산하여 사용자의 성별을 확인
 * 
 * 
 * 2.사용자가 고물을 가져왔다는 메뉴를 선택시 매입하는 고물의 품목을 출력문이 제시하고 가져온 고물의 갯수를 입력 받아 
 * Icalc 클래스에서 변수선언해 놓은 책정된 가격의 곱으로 매입가격을 환산함
 * 2-1)사용자가 고철을 가져왔다는 시나리오를 가정하여 사용자가 가져온 고철의 무게를 입력받아 
 * Icalc 클래스에서 변수선언해 놓은 고철 별 가격을 책정하여 매입가격을 환산 1-1)에서 확인한 사용자의 나이를 토대로, Discount 클래스에서 선언해놓은 변수를 토대로
 * 해당 조건을 만족하는 (75세이상의 고령자 혹은 19세 이하의 청소년) 매입가격을 할증적용한 연산식
 * 
 * 2-2) 사용자가 가져온 고물의 무게를 고물상의 저울로 축정하여 갯수를 판단한다는 시나리오로 매입 품목의 가격에, 갯수를 임의의값(random)으로 설정하여 매입가격을 환산
 * 
 * 
 * 3.사용자가 가전을 가져왔다는 메뉴를 선택시 매입하는 가전제품의 품목을 출력문이 제시하고 가져온 가전제품의 갯수를 입력 받아 
 * 3-1) * ElectronicPrice 클래스에서 변수선언해 놓은 책정된 가격의 곱으로 매입가격을 환산하며 1-1)에서 확인한 사용자의 나이를 토대로, Discount 클래스에서 선언해놓은 변수를 토대로
 * 
 * 3-2) 사용자가 가져온 가전의 갯수를 고물상의 저울로 축정하여 갯수를 판단한다는 시나리오로 갯수를 임의의값(random)으로 설정하여 매입가격을 환산
 * 
 * JunkShopMenu 클래스의 출력구문들을 통해 사용자로 하여금 필요한 값을 입력받아 
 * 위의 메소드 들이 
 * 
 * 본 코드 상에서, 사용자의 상태(생년월일솨 성별),목적(고철 판매or가전제품판배), 상태(중량 확인 유무)에 따라서
 * 최종적으로 사용자가 판매한 고철의 값을 손쉽게 계산할 수 있는 기능을 포함한 클래스이다.
 * 
 */

public class JunkShopcontroller {

	private JunkShop js;
	private ElectronicProduct ep;

	Scanner sc = new Scanner(System.in); // 스캐너 선언 사용자로부터 값을 입력받음

	// -------------------------------A.필드부---------------
	public JunkShopcontroller() {

	}

	public JunkShopcontroller(JunkShop js, ElectronicProduct ep) {
		this.js = js;
		this.ep = ep;
	}

//--------------------------------	B.게터 & 세터------------------
	public JunkShop getJs() {
		return js;
	}

	public void setJs(JunkShop js) {
		this.js = js;
	}

	public ElectronicProduct getEp() {
		return ep;
	}

	public void setEp(ElectronicProduct ep) {
		this.ep = ep;
	}

//-----------------------C.사용자에게 주민등록 번호를 입력받아, 앞 2자리로 생년월일과,  7번인덱스로, 성별을 파악하는 메소드 
	public int age(Customer ct) {
		int age = Integer.parseInt(ct.getMemberId().substring(0, 2)); // 사용자로부터 입려받은 문자열 자료형 주민등록번호 (memberId)을 정수형으로
																		// 변환하는 함수 Integer.parseInt를 사용/
		age = 100 - age + 22; // 입력받은 2자리수의 100-(생년)+(연수) ex)89년생의 경우, 100-89+22 == 33
		if (age > 100) { // if문사용하여 , 00년생 이후 출생자들의 경우, 100자리수를 제거하여 제대로된 나이가 나올 수 있게 연산
			age = age - 100;
		} else {

		}

		return age;
	}

	public char gender(Customer ct) {
		char gender = 0;
		int g = Integer.parseInt(ct.getMemberId().substring(7, 8));// 사용자로부터 입려받은 문자열 자료형 주민등록번호 (memberId)을 정수형으로 변환하는
																	// 함수 Integer.parseInt를 사용
																	// 주빈번호의 8번째자리로 성별을 구별하는 특성을 이용
		if (g == 1) { // 주민번호 7번인덱스의 값이 1일경우 M으로 값을 반환
			gender = 'M';
		} else if (g == 2) { // 주민번호 7번인덱스의 값이 2일경우 F으로 값을 반환
			gender = 'F';
		}

		return gender;
	}

//---------------------D.1고물판매--> 1.고정고물가격판매 선택시 연산하는 메소드로 사용자가 가져온 고물의 무게를 직접 입력하여,
	// 각 변수에 값을 set해주는 메소드
	public void junkType(char gender, int age) {
		js = new JunkShop();
		System.out.println("폐지는 몇 kg 입니까 ? ");
		int paper = sc.nextInt(); // 입력받은 정수를 paper 변수 값으로 반환
		js.setPaper(paper);

		System.out.println("플라스틱은 몇 kg 입니까 ? ");
		int plastic = sc.nextInt();
		js.setPlastic(plastic);

		System.out.println("철는 몇 kg 입니까 ? ");
		int iron = sc.nextInt();
		js.setIron(iron);

		System.out.println("구리는 몇 kg 입니까 ? ");
		int copper = sc.nextInt();
		js.setCopper(copper);

		System.out.println("병은 몇 kg 입니까 ? ");
		int bottle = sc.nextInt();
		js.setBottle(bottle);

		junkPrice(js, gender, age);

	}

//------------------------E. D에서 입력한 값(set)을 호출하여(get), Icalc클래스에서 선언해 놓은 가격을 통해 연산
	// -------------------------단, 본 코드의 의도대로, 사용자의 나이와 성별에 따라, OLD_WOMAN, OLD_MAN,
	// STUDENT로 구분하여 각각 지정해놓은 할증률(Discount클래스)을 적용하여 판매가격 환산
	public void junkPrice(JunkShop js, char gender, int age) {

		String won = "원";
		String kg = "kg 이며 가격은 ";
		String result = "";
		js.setPaperResutlPrice(js.getPaper() * js.PAPERPRICE);
		js.setPlasticResultPrice(js.getPlastic() * js.PLASTICPRICE);
		js.setIronResultPrice(js.getIron() * js.IRONPRICE);
		js.setCopperResultPrice(js.getCopper() * js.COPPERPRICE);
		js.setBottleResultPrice(js.getBottle() * js.BOTTLEPRICE);
		if (age > 75) { // if문을 사용하여 75세 이상의 사용자는OLD, 그렇지 않은사람은 STUDENT를 분류
			if (gender == 'F') { // if중첩문을 사용하여, OLD 중 성별을 구분
				result = "폐지는 " + js.getPaper() + kg + ((int) (js.getPaperResutlPrice() * js.OLD_WOMAN)) + won + "\n"
						+ "플라스틱은 " + js.getPlastic() + kg + ((int) (js.getPlasticResultPrice() * js.OLD_WOMAN)) + won
						+ "\n" + "철은 " + js.getIron() + kg + ((int) (js.getIronResultPrice() * js.OLD_WOMAN)) + won
						+ "\n" + "구리는 " + js.getCopper() + kg + ((int) (js.getCopperResultPrice() * js.OLD_WOMAN)) + won
						+ "\n" + "병은 " + js.getBottle() + kg + ((int) (js.getBottleResultPrice() * js.OLD_WOMAN)) + won
						+ "\n" + "총 "
						+ (((int) (js.getPaperResutlPrice() * js.OLD_WOMAN))
								+ ((int) (js.getPlasticResultPrice() * js.OLD_WOMAN))
								+ ((int) (js.getIronResultPrice() * js.OLD_WOMAN))
								+ ((int) (js.getCopperResultPrice() * js.OLD_WOMAN))
								+ ((int) (js.getBottleResultPrice() * js.OLD_WOMAN)))
						+ won;

			} else if (gender == 'M') {
				result = "폐지는 " + js.getPaper() + kg + ((int) (js.getPaperResutlPrice() * js.OLD_MAN)) + won + "\n"
						+ "플라스틱은 " + js.getPlastic() + kg + ((int) (js.getPlasticResultPrice() * js.OLD_MAN)) + won
						+ "\n" + "철은 " + js.getIron() + kg + ((int) (js.getIronResultPrice() * js.OLD_MAN)) + won + "\n"
						+ "구리는 " + js.getCopper() + kg + ((int) (js.getCopperResultPrice() * js.OLD_MAN)) + won + "\n"
						+ "병은 " + js.getBottle() + kg + ((int) (js.getBottleResultPrice() * js.OLD_MAN)) + won + "\n"
						+ "총 "
						+ (((int) (js.getPaperResutlPrice() * js.OLD_MAN))
								+ ((int) (js.getPlasticResultPrice() * js.OLD_MAN))
								+ ((int) (js.getIronResultPrice() * js.OLD_MAN))
								+ ((int) (js.getCopperResultPrice() * js.OLD_MAN))
								+ ((int) (js.getBottleResultPrice() * js.OLD_MAN)))
						+ won;

			}
		} else if (age < 20) { // 20세 미만의 사용자는 STUDENT로 Discount클래스에 지정해놓은 할증을 적용하여 결과값으로 판매가격 환산

			result = "폐지는 " + js.getPaper() + kg + ((int) (js.getPaperResutlPrice() * js.STUDENT)) + won + "\n"
					+ "플라스틱은 " + js.getPlastic() + kg + ((int) (js.getPlasticResultPrice() * js.STUDENT)) + won + "\n"
					+ "철은 " + js.getIron() + kg + ((int) (js.getIronResultPrice() * js.STUDENT)) + won + "\n" + "구리는 "
					+ js.getCopper() + kg + ((int) (js.getCopperResultPrice() * js.STUDENT)) + won + "\n" + "병은 "
					+ js.getBottle() + kg + ((int) (js.getBottleResultPrice() * js.STUDENT)) + won + "\n" + "총 "
					+ (((int) (js.getPaperResutlPrice() * js.STUDENT))
							+ ((int) (js.getPlasticResultPrice() * js.STUDENT))
							+ ((int) (js.getIronResultPrice() * js.STUDENT))
							+ ((int) (js.getCopperResultPrice() * js.STUDENT))
							+ ((int) (js.getBottleResultPrice() * js.STUDENT)))
					+ won;

		} else {
			System.out.println(js.getPlasticResultPrice());
			result = "폐지는 " + js.getPaper() + kg + ((int) (js.getPaperResutlPrice())) + won + "\n" + "플라스틱은 "
					+ js.getPlastic() + kg + ((int) (js.getPlasticResultPrice())) + won + "\n" + "철은 " + js.getIron()
					+ kg + ((int) (js.getIronResultPrice())) + won + "\n" + "구리는 " + js.getCopper() + kg
					+ ((int) (js.getCopperResultPrice())) + won + "\n" + "병은 " + js.getBottle() + kg
					+ ((int) (js.getBottleResultPrice())) + won + "\n" + "총 "
					+ (((int) (js.getPaperResutlPrice())) + ((int) (js.getPlasticResultPrice()))
							+ ((int) (js.getIronResultPrice())) + ((int) (js.getCopperResultPrice()))
							+ ((int) (js.getBottleResultPrice())))
					+ won;
		}

		System.out.println(result);
	}

	// ------------------F.사용자가 2.랜덤 고물가격 판매 선택 시,
	// 랜덤함수를 이용하여, 각각의 품목에 랜덤한 값을 곱하여 값이 출력
	public void junkRandomPrice(char gender, int age) {
		js = new JunkShop();
		int paper = ((int) (Math.random() * 100) + 1); // (int)(Math.random() * 100) + 1 1~100까지의 임의의 값을 추출하여
		js.setPaper(paper); // paper의 값으로 set

		int plastic = ((int) (Math.random() * 100) + 1);
		js.setPlastic(plastic);

		int iron = ((int) (Math.random() * 100) + 1);
		js.setIron(iron);

		int copper = ((int) (Math.random() * 100) + 1);
		js.setCopper(copper);

		int bottle = ((int) (Math.random() * 100) + 1);
		js.setBottle(bottle);

		junkPrice(js, gender, age); //

	}

	// ----------------------G.사용자가 2.전자제품판매 -> 1.고정 고물 가격 판매 선택시 연산하는 메소드이며
	// 사용자가 가져온 고물의 갯수를 직접 입력하여, 각 변수에 값을 설정(set)해주는 메소드
	public void electronicType(char gender, int age) {
		ep = new ElectronicProduct();
		System.out.println("스타일러는 몇개 입니까 ? ");
		int styler = sc.nextInt();
		ep.setStyler(styler);

		System.out.println("냉장고는 몇개 입니까 ? ");
		int refrigerator = sc.nextInt();
		ep.setRefrigerator(refrigerator);

		System.out.println("컴퓨터는 몇개 입니까 ? ");
		int computer = sc.nextInt();
		ep.setComputer(computer);

		System.out.println("세탁기는 몇개 입니까 ? ");
		int washingMachine = sc.nextInt();
		ep.setWashingMachine(washingMachine);

		System.out.println("건조기는 몇개 입니까 ? ");
		int dryer = sc.nextInt();
		ep.setDryer(dryer);

		productPrice(ep, gender, age);

	}

	// ----------------------------H. E부와 마찬가지로, 사용자에게 G에서 입력한 값(set)을 호출하여(get),
	// ElectronicPrice 클래스에서 선언해 놓은 가격을 통해 연산
	// -------------------------이 역시 본 코드의 의도대로, 사용자의 나이와 성별에 따라, OLD_WOMAN,
	// OLD_MAN, STUDENT로 구분하여 각각 지정해놓은 할증률(Discount클래스)을 적용하여 판매가격 환산
	public void productPrice(ElectronicProduct ep, char gender, int age) {
		String won = "원";
		String eA = "개 이며 가격은 ";
		String result = "";
		ep.setStylerPrice(ep.getStyler() * ep.STYLER);
		ep.setRefrigeratorPrice(ep.getRefrigerator() * ep.REFRIGENATOR);
		ep.setComputerPrice(ep.getComputer() * ep.COMPUTER);
		ep.setWashingMachinePrice(ep.getWashingMachine() * ep.WASHING_MACHINE);
		ep.setDryerPrice(ep.getDryer() * ep.DRYER);

		if (age > 75) { // 75세 이상의 이상의 사용자를if문을 사용하여 OLD와 STUDENT를 분류
			if (gender == 'F') {// if중첩문을 사용하여, OLD 중 성별을 구분
				result = "스타일러는 " + ep.getStyler() + eA + ((int) (ep.getStylerPrice() * ep.OLD_WOMAN)) + won + "\n"
						+ "냉장고은 " + ep.getRefrigerator() + eA + ((int) (ep.getRefrigeratorPrice() * ep.OLD_WOMAN)) + won
						+ "\n" + "컴퓨터은 " + ep.getComputer() + eA + ((int) (ep.getComputerPrice() * ep.OLD_WOMAN)) + won
						+ "\n" + "세탁기는 " + ep.getWashingMachine() + eA
						+ ((int) (ep.getWashingMachinePrice() * ep.OLD_WOMAN)) + won + "\n" + "건조기은 " + ep.getDryer()
						+ eA + ((int) (ep.getDryerPrice() * ep.OLD_WOMAN)) + won + "\n" + "총 "
						+ (((int) (ep.getStylerPrice() * ep.OLD_WOMAN))
								+ ((int) (ep.getRefrigeratorPrice() * ep.OLD_WOMAN))
								+ ((int) (ep.getComputerPrice() * ep.OLD_WOMAN))
								+ ((int) (ep.getWashingMachinePrice() * ep.OLD_WOMAN))
								+ ((int) (ep.getDryerPrice() * ep.OLD_WOMAN)))
						+ won;
			} else if (gender == 'M') {
				result = "스타일러는 " + ep.getStyler() + eA + ((int) (ep.getStylerPrice() * ep.OLD_MAN)) + won + "\n"
						+ "냉장고은 " + ep.getRefrigerator() + eA + ((int) (ep.getRefrigeratorPrice() * ep.OLD_MAN)) + won
						+ "\n" + "컴퓨터은 " + ep.getComputer() + eA + ((int) (ep.getComputerPrice() * ep.OLD_MAN)) + won
						+ "\n" + "세탁기는 " + ep.getWashingMachine() + eA
						+ ((int) (ep.getWashingMachinePrice() * ep.OLD_MAN)) + won + "\n" + "건조기은 " + ep.getDryer() + eA
						+ ((int) (ep.getDryerPrice() * ep.OLD_MAN)) + won + "\n" + "총 "
						+ (((int) (ep.getStylerPrice() * ep.OLD_MAN)) + ((int) (ep.getRefrigeratorPrice() * ep.OLD_MAN))
								+ ((int) (ep.getComputerPrice() * ep.OLD_MAN))
								+ ((int) (ep.getWashingMachinePrice() * ep.OLD_MAN))
								+ ((int) (ep.getDryerPrice() * ep.OLD_MAN)))
						+ won;
			}
		} else if (age < 20) { // 20세 미만의 사용자는 STUDENT로 Discount클래스에 지정해놓은 할증을 적용하여 결과값으로 판매가격 환산
			result = "스타일러는 " + ep.getStyler() + eA + ((int) (ep.getStylerPrice() * ep.STUDENT)) + won + "\n" + "냉장고은 "
					+ ep.getRefrigerator() + eA + ((int) (ep.getRefrigeratorPrice() * ep.STUDENT)) + won + "\n"
					+ "컴퓨터은 " + ep.getComputer() + eA + ((int) (ep.getComputerPrice() * ep.STUDENT)) + won + "\n"
					+ "세탁기는 " + ep.getWashingMachine() + eA + ((int) (ep.getWashingMachinePrice() * ep.STUDENT)) + won
					+ "\n" + "건조기은 " + ep.getDryer() + eA + ((int) (ep.getDryerPrice() * ep.STUDENT)) + won + "\n"
					+ "총 "
					+ (((int) (ep.getStylerPrice() * ep.STUDENT)) + ((int) (ep.getRefrigeratorPrice() * ep.STUDENT))
							+ ((int) (ep.getComputerPrice() * ep.STUDENT))
							+ ((int) (ep.getWashingMachinePrice() * ep.STUDENT))
							+ ((int) (ep.getDryerPrice() * ep.STUDENT)))
					+ won;
		} else {
			result = "스타일러는 " + ep.getStyler() + eA + ((int) (ep.getStylerPrice())) + won + "\n" + "냉장고은 "
					+ ep.getRefrigerator() + eA + ((int) (ep.getRefrigeratorPrice())) + won + "\n" + "컴퓨터은 "
					+ ep.getComputer() + eA + ((int) (ep.getComputerPrice())) + won + "\n" + "세탁기는 "
					+ ep.getWashingMachine() + eA + ((int) (ep.getWashingMachinePrice())) + won + "\n" + "건조기은 "
					+ ep.getDryer() + eA + ((int) (ep.getDryerPrice())) + won + "\n" + "총 "
					+ (((int) (ep.getStylerPrice())) + ((int) (ep.getRefrigeratorPrice()))
							+ ((int) (ep.getComputerPrice())) + ((int) (ep.getWashingMachinePrice()))
							+ ((int) (ep.getDryerPrice())))
					+ won;
		}
		System.out.println(result);

	}

	// ----------------------I. 2->2. 랜덤 고물판매 선택시 연산 메소드
	// 판매 품목별 랜덤함수를 이용하여, 각각의 품목에 랜덤한 값을 곱하여 값이 출력
	public void electronicRandomPrice(char gender, int age) {
		ep = new ElectronicProduct();
		int styler = ((int) (Math.random() * 10)); // int 자료형 Stlyer 변수에 지정한 가격에 랜덤한 값(수량)으로 설정하여 값 반환(setStyler)
		ep.setStyler(styler);
		int refrigerator = ((int) (Math.random() * 10));
		ep.setRefrigerator(refrigerator);
		int computer = ((int) (Math.random() * 10));
		ep.setComputer(computer);

		int washingMachine = ((int) (Math.random() * 10));
		ep.setWashingMachine(washingMachine);

		int dryer = ((int) (Math.random() * 10));
		ep.setDryer(dryer);

		productPrice(ep, gender, age);

	}

}
