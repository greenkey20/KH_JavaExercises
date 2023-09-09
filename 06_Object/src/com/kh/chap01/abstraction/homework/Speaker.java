package com.kh.chap01.abstraction.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Speaker { // 스피커 클래스의 영역 시작
	
	// 스피커 클래스의 멤버변수
	public String productName; // 제품명
	public String brand; // 제조사명
	public boolean left; // 왼쪽 스피커 (비)활성화 -> balanceControl 메소드를 통해 상태 변화
	public boolean right; // 오른쪽 스피커 (비)활성화 -> balanceControl 메소드를 통해 상태 변화
	public int volume; // 전체 음량(0~30) -> volumeControl 메소드를 통해 상태 변화
	public char mode; // 음질 모드 -> modeControl 메소드를 통해 상태 변화
//	public double bass; // 베이스톤 음량(0~10)
//	public double mid; // 중간톤 음량(0~10)
//	public double high; // 높은톤 음량(0~10)
	
	// 스피커 클래스의 메소드
	public void balanceControl() { // 왼/오른쪽 스피커 밸런스 맞추는 메소드
		if (!left || !right) {
			Scanner sc = new Scanner(System.in);
			System.out.print("왼쪽과 오른쪽 밸런스를 맞추시겠습니까? (Y/N) > ");
			String reply = sc.next();
			if (reply.equals("Y")) {
				left = true;
				right = true;
			} 
		}
		
		System.out.printf("%s의 왼쪽 스피커 상태 : %b, 오른쪽 스피커 상태 : %b\n", productName, left, right);
	}
	
	public void volumeControl (int volume) { // 스피커의 전체 음량을 조절하는 메소드
		if (left || right) {
			this.volume += volume;
			
			if (this.volume >= 30) {
				System.out.println("최대 음량입니다");
			} else if (this.volume <= 0) {
				System.out.println("최소 음량입니다");
			} else {
				System.out.println("현재 음량 : " + this.volume);
			}
		} else {
			System.out.println("왼쪽/오른쪽 스피커가 모두 꺼져있습니다");
		}
	}
	
	public void toneControl() { // 톤별 음량을 조절하는 메소드
		Scanner sc = new Scanner(System.in);
		
		String[] tones = {"bass", "mid", "high"};
		double[] tonesVol = new double[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print(tones[i] + "의 음량을 입력하세요(0~10) > ");
			tonesVol[i] = sc.nextDouble();
			
			if (tonesVol[i] < 0 || tonesVol[i] > 10) {
				System.out.println("적당한 음량을 다시 입력해주세요 > ");
				i--;
				continue;
			}
		}
		
		System.out.println(productName + "의 " + Arrays.toString(tones) + " : " + Arrays.toString(tonesVol));
	}
	
	public void modeControl(char mode) { // 음질 모드를 조절하는 메소드
		switch (mode) {
		case 'A' : System.out.println("normal");
			break;
		case 'B' : System.out.println("pop");
			break;
		case 'C' : System.out.println("rock");
			break;
		case 'D' : System.out.println("classical");
			break;
		case 'E' : System.out.println("dance");
			break;
		}
	}

} // 스피커 클래스의 영역 끝
