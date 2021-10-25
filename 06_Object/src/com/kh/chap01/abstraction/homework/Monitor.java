package com.kh.chap01.abstraction.homework;

public class Monitor { // 모니터 클래스의 영역 시작
	
	// 모니터 클래스의 멤버변수
	public String location; // 위치
	public int screenSize; // 사이즈(inches)
	public String brand; // 제조사명
	public boolean power; // 전원 -> powerSwitch 메소드를 통해 상태 변화
	public int brightness; // 밝기 -> brightnessControl 메소드를 통해 상태 변화
	public double electricityConsumption; // 전기 사용량 -> electricityBill 메소드를 통해 상태 변화
	
	// 모니터 클래스의 메소드
	public void powerSwitch() { // 모니터의 전원 끄거나 켜는 메소드
		power = !power;
		if (power) {
			System.out.println("power ON");
		} else {
			System.out.println("power OFF");
		}
	}
	
	public void brightnessControl(int brightness) { // 모니터의 밝기 조절하는 메소드
		this.brightness += brightness;
		
		if (this.brightness >= 100) {
			System.out.println("더 이상 밝게 할 수 없습니다");
		} else if (this.brightness <= 0) {
			System.out.println("더 이상 어둡게 할 수 없습니다");
		} else {
			System.out.println("모니터의 밝기가 " + this.brightness + "로 조절되었습니다");
		}
	}
	
	public double electricityBill() { // 전기 사용량 계산하는 메소드
		
		while (power == true) {
			if (brightness > 75) {
				switch (screenSize) {
				case 24 : electricityConsumption += 30;
					break;
				case 27 : electricityConsumption += 40;
					break;
				case 32 : electricityConsumption += 50;
					break;
				default : electricityConsumption += 35;
					break;
				}
			} else {
				switch (screenSize) {
				case 24 : electricityConsumption += 10;
					break;
				case 27 : electricityConsumption += 20;
					break;
				case 32 : electricityConsumption += 30;
					break;
				default : electricityConsumption += 25;
					break;
				}
			}
			break;
		}
		
		return electricityConsumption;
	}

} // 모니터 클래스의 영역 끝
