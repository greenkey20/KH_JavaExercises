package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Homework { // 클래스 영역 시작

	public void exercise1() { // exercise1 메소드 영역 시작
		
		System.out.println("[2021.10.21자 숙제1번: 1~10 난수 10개 최대/소값]");
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
		// e.g. 5 3 2 7 4 8 6 10 9 10
		// 최대값 : 10
		// 최소값 : 2
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
		}
		
		// 응용) 10개 숫자 반복되는 것 없이 난수 생성
//		for (int 0 = 1; i < nums.length; i++) {
//			nums[i] = (int)(Math.random() * 10) + 1;
//			for (int j = 1; j <= i; j++) {
//				if (nums[i] == nums[i - j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		System.out.println(Arrays.toString(nums));
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] >= max) {
				max = nums[i];
			}
			
			if (nums[i] <= min) {
				min = nums[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min + "\n");

	} // exercise1 메소드 영역 끝

	public void exercise2() { // exercise2 메소드 영역 시작
		
		System.out.println("[2021.10.21자 숙제2번: lotto 번호 자동 생성기]");

		// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 출력하세요
		// e.g. 39 1 41 34 2 27
		
		int[] nums = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 45) + 1;
			for (int j = 1; j <= i; j++) {
				if (nums[i] == nums[i -j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("☆행운과 행복의 lotto 번호☆ : " + Arrays.toString(nums) + "\n");
		
		// lotto 번호 정렬 시도..
//		int min = nums[1];
//		int temp = 0;
//		
//		for (int i = 1; i < nums.length; i++) {
//			if (nums[i] <= min) {
//				temp = nums[i - 1];
//				nums[i - 1] = nums[i];
//				nums[i] = temp;
//			}
//		}
//		
//		System.out.println("정렬된 lotto 번호 : " + Arrays.toString(nums));

	} // exercise2 메소드 영역 끝

	public void exercise3() { // exercise3 메소드 영역
		
		System.out.println("[2021.10.21자 숙제3번: 문자열의 문자 검사]");

		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력
		// e.g. 문자열 : application
		// 문자열에 있는 문자 : a, p, l, i, c, t, o, n
		// 중복되지 않는 문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		
//		String[] str = new String[100];
		
		System.out.print("문자열을 입력하세요 > ");
		String input = sc.next();
		
		char[] letters = new char[input.length()]; // 사용자가 입력한 문자열에 들어간 문자 전체를 저장할 배열 선언 및 초기화
		letters[0] = input.charAt(0);
		
//		String list = ""; // 사용자가 입력한 문자열에 사용된 알파벳을 저장할 문자열 
				
		for (int i = 1; i < input.length(); i++) {
					
			
			for (int j = 1; j <= i; j++) {
				if (input.charAt(i) != input.charAt(i - j)) {
					letters[i] = input.charAt(i);
				} else {
					continue;
				}
			}
			
//			list += input.charAt(i) + " ";
			
			
			
		}
		
		System.out.println(Arrays.toString(letters));
//		System.out.println(list);

		
		
		

	} // exercise3 메소드 영역 끝

	/*
	 * 2021.10.21(목) 숙제 소감
	 * 
	 */

} // 클래스 영역 끝
