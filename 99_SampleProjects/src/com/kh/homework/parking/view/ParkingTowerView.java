package com.kh.homework.parking.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.homework.parking.controller.ParkingTowerController;
import com.kh.homework.parking.model.vo.Car;

public class ParkingTowerView {

	// [필드부]
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();

	// [메소드부]
	public void mainMenu() {

		while (true) {
			System.out.println("==== 주차 타워 관리 프로그램 ====");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();
			sc.nextLine(); // 개행 하나 해줌(이 줄의 정확한 용도를 잘 모르겠음..)

			switch (menu) {
			case 1:
				insertCar();
				break;
			case 2:
				deleteCar();
				break;
			case 3:
				searchCar();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("종료합니다");
				return;
			default:
				System.out.println("잘못된 번호입니다");
				break;
			}

		}

	} // mainMenu() 종료

	public void insertCar() { // 차량 주차 <- 차량 번호, 차량 종류, 차주
		System.out.print("차량 번호 > ");
		int carNum = sc.nextInt();
		sc.nextLine();

		System.out.print("차량 종류(1. 경차 / 2. 세단 / 3. SUV / 4. 트럭) > ");
		int carType = sc.nextInt();
		sc.nextLine();

		System.out.print("차주 > ");
		String owner = sc.nextLine();

		// 입력받은 자료(요청내용)들 Controller에 넘겨줄 것임
		Car car = new Car(carNum, carType, owner); // 처음에 vo에 안 만든, 매개변수 3개 있는 이 생성자도 여기서 자동완성 가능
		System.out.println(car); // 사용자로부터 입력받은 바에 따라 생성된 car객체 내용 확인하고자 추가한 행
		ptc.inertCar(car); // 이 메소드도 여기서 자동완성 가능
		System.out.println(car); // 주차한 car객체 내용 확인/보여주기용 출력

	} // insertCar() 종료

	public void deleteCar() {
		System.out.print("차량 번호 > ");
		int carNum = sc.nextInt();
		sc.nextLine();

		int result = ptc.deleteCar(carNum); // 아래 조건문 만들기 위해 정수형 result 변수를 반환받음

		if (result > 0) {
			System.out.println("출차가 완료되었습니다");
		} else {
			System.out.println("해당 차량은 존재하지 않습니다");
		}

	} // deleteCar() 종료

	private void searchCar() {

		// 차주 검색
		System.out.print("주차 차량 차주 검색 > ");
		String owner = sc.nextLine();
//			sc.nextLine();

		ArrayList<Car> searchedCar = ptc.searchCar(owner);

		// 결과 화면
		if (searchedCar.isEmpty()) {
			System.out.println("조회된 차량이 없습니다");
		} else {
			System.out.println("검색 결과 " + searchedCar.size() + "개의 차량이 조회되었습니다");
			for (int i = 0; i < searchedCar.size(); i++) {
				System.out.println(searchedCar.get(i));
			}
		}

	} // searchCar() 종료

	private void selectList() {

		ArrayList<Car> allCar = ptc.selectCar();

		if (allCar.isEmpty()) {
			System.out.println("차량이 없습니다");
		} else {
			System.out.println(allCar.size() + "개의 차량이 조회되었습니다");
			for (int i = 0; i < allCar.size(); i++) {
				System.out.println(allCar.get(i));
			}
		}

	}

}
