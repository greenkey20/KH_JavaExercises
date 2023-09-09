// 2021.12.10(금) 13h JavaScript 수업 '무지개 색깔 찍기'를 Java로 해보기
package com.kh.rainbow;

import java.util.Scanner;

public class RainbowView {

	private Scanner sc = new Scanner(System.in);

	public void rainbowMethod1() {
		/* JavaScript 수업 '무지개 색깔 찍기' 강사님 방법
		 * 앞의 색상이 빨강인 경우 주황 출력
		 * vs 앞의 색상이 주황인 경우 노랑 출력..
		 * vs 앞의 색상이 남색인 경우 보라 출력
		 * vs 앞의 색상이 보라인 경우 빨강 출력
		 */
		
		String color = "빨강";
		System.out.println("현재 색상은 [" + color + "]입니다");

		while (true) {
			System.out.print("색깔을 바꿔 무지개를 만들기 위해 Enter를 쳐 주세요~ 그만 하시려면 exit을 입력하세요 > ");
			String enter = sc.nextLine();

			if (enter.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			} else {
				if (color.equals("빨강")) {
					color = "주황";
					System.out.println("[ " + color + " ]");					
				} else if (color.equals("주황")) {
					color = "노랑";
					System.out.println("[ " + color + " ]");					
				} else if (color.equals("노랑")) {
					color = "초록";
					System.out.println("[ " + color + " ]");					
				} else if (color.equals("초록")) {
					color = "파랑";
					System.out.println("[ " + color + " ]");					
				} else if (color.equals("파랑")) {
					color = "남색";
					System.out.println("[ " + color + " ]");					
				} else if (color.equals("남색")) {
					color = "보라";
					System.out.println("[ " + color + " ]");					
				} else if (color.equals("보라")) {
					color = "빨강";
					System.out.println("[ " + color + " ]");					
				}
			}

		} // while문 영역 끝

	} // rainbowMethod1() 종료

	public void rainbowMethod2() {
		// JavaScript 실습 시간에 내가 생각했던 logic = 클릭한 횟수 변수를 하나씩 증가시켜 7로 나눈 나머지에 따라 색상 출력 -> JavaScript에서는 클릭 수 저장 어떻게 해야 할지 몰라서 구현 못 함.. 

		String[] colors = { "빨강", "주황", "노랑", "초록", "파랑", "남색", "보라" };
		int num = 0;
		
		System.out.println("현재 색상은 [" + colors[num] + "]입니다");

		while (true) {

			System.out.print("색깔을 바꿔 무지개를 만들기 위해 Enter를 쳐 주세요~ 그만 하시려면 exit을 입력하세요 > ");
			String enter = sc.nextLine();

			if (enter.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			} else {
				num++;
				if (num % 7 == 0) {
					System.out.println("[ " + colors[0] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				} else if (num % 7 == 1) {
					System.out.println("[ " + colors[1] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				} else if (num % 7 == 2) {
					System.out.println("[ " + colors[2] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				} else if (num % 7 == 3) {
					System.out.println("[ " + colors[3] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				} else if (num % 7 == 4) {
					System.out.println("[ " + colors[4] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				} else if (num % 7 == 5) {
					System.out.println("[ " + colors[5] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				} else if (num % 7 == 6) {
					System.out.println("[ " + colors[6] + " ] (" + num + "번째 Enter -> " + (num/7 + 1) + "번째 무지개)");
				}				
			} // else문 영역 끝

		} // while문 영역 끝

	} // rainbowMethod2() 종료

}
