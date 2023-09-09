package com.kh.homework.parking.controller;

import java.util.ArrayList;

import com.kh.homework.parking.model.vo.Car;

public class ParkingTowerController {

	// [필드부]
	// 주차 차량에 대한 정보가 담겨있는 리스트 -> 이 리스트에 주차(차량 정보 추가), 출차(차량 정보 삭제), 검색 기능
	ArrayList<Car> carList = new ArrayList<>();

	public void inertCar(Car car) {

		int lastNum = 0; // 마지막 차의 주차번호 = carList의 마지막 인덱스(== size() - 1) -> 새로 주차하는 차량의 주차번호 = 마지막 차의
							// 주차번호 + 1

		if (carList.isEmpty()) {
			lastNum = 1;
		} else {
//				lastNum = carList.size() + 1; // 나의 생각 -> 이건 (왜) 안 될까?
			lastNum = carList.get(carList.size() - 1).getParkingNum() + 1;
		}

		car.setParkingNum(lastNum); // 매개변수로 받은 car 객체의 '주차번호' 필드값을 위에서 받은 주차번호로 수정/대입
		carList.add(car); // 주차차량 목록에 car 객체 추가

	} // insertCar() 종료

	public int deleteCar(int carNum) {
		int result = 0; // 삭제 처리하면 result++(1씩 증가)

		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				result++;
			}
		}

		return result;
	} // deleteCar() 종료

	public ArrayList<Car> searchCar(String owner) {

		ArrayList<Car> searchedCar = new ArrayList<>();

		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getOwner().equals(owner)) {
				searchedCar.add(carList.get(i));
//					System.out.println(searchedCar);
			}
		}

		return searchedCar;

	}

	public ArrayList<Car> selectCar() {

		return carList;
	}

}
