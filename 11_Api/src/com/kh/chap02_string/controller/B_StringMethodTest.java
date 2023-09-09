package com.kh.chap02_string.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	// 문자열과 관련된 메소드들
	public void method1() {
		String str1 = "Hell World";
		
		// 메소드명(매개변수) : 반환형
		// 1. 문자열.charAt(int index) : 반환형 char; 문자열에서 전달받은 index 위치의 문자 하나만 뽑에서 반환/return
		char ch = str1.charAt(4);
		System.out.println("ch : " + ch); // 빈칸 1개 반환; "ch : "  		
		
		// 2. 문자열.concat(String str) : 반환형 String; 문자열과 전달받은 또 다른 문자열을 하나로 합쳐서 return -> 문자열 + str
		String str2 = str1.concat("!!!!");
		System.out.println("str2 : " + str2); // str2 : Hell World!!!!
		
		// 3. 문자열.length() : 반환형 int; 문자열의 길이(공백도 포함)를 반환
		System.out.println("str1의 길이 : " + str1.length()); // str1의 길이 : 10
		
		// 4. 문자열.substring(int beingindex) : 문자열의 beingindex 위치에서 문자열 끝까지의 문자열을 추출해서 return
		// 문자열.substring(int beingindex, int endindex): 문자열의 beingindex 위치에서부터 (endindex - 1)까지의 문자열을 추출해서 return
		// 반환형 String
		System.out.println(str1.substring(6)); // orld
		System.out.println(str1.substring(0, 6)); // Hell W
		
		// 5. 문자열.replace(char old, char new) : 반환형 String; 문자열에서 old문자를 new문자로 변/치환한 문자열을 return
		String str3 = str1.replace('l', 'x'); // l이 모두 x로 치환됨
		System.out.println("str3 : " + str3); // str3 : Hexx Worxd
		
		// 6. 문자열.trim() : 반환형 String; 문자열의 앞/뒤 공백을 제거한 문자열을 return
		String str4 = "    J  A     V              A          ";
		System.out.println("str4 : " + str4.trim()); // str4 : J  A     V              A
		// 웹 (스)크롤러 = 웹에서 자료 긁어옴 -> 자료에 공백 많음 -> trim해서 공백 없애줌 
		
		// 7. 문자열.toUpperCase() : 반환형 String; 모든 문자를 대문자로 변경 후 문자열 return
		//    문자열.toLowerCase() : 반환형 String; 모든 문자를 소문자로 변경 후 문자열 return
		System.out.println("toUpperCase : " + str1.toUpperCase()); // toUpperCase : HELL WORLD
		System.out.println("toLowerCase : " + str1.toLowerCase()); // toLowerCase : hell world
		
		// 8. 문자열.toCharArray() : 반환형 char[]; 문자열 = 문자들의 집합 -> 문자(형)의 배열; 문자열의 각 문자들을 char[] 배열(한 칸 한 칸)에 옮겨 담은 후 해당 배열을 return
		char[] chArr = str1.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i] + " ");
		} // H e l l   W o r l d 
		System.out.println();
		
		// String형의 생김새 = char[]의 생김새
		char[] arr = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(String.valueOf(arr)); // 공식 문서 웹사이트에서 사용법 등 꼭 찾아보기(단, 어떤 점을 보라고 하셨는지 강사님 설명 잘 못 들음); apple
		
	}
	
	public void method2() {
		// "종료하시겠습니까?(Y/N)"라는 service msg 주고자 함 -> Y 또는 N 입력받기 -> 경우의 수1) Y/N 2) y/n 3) 와이/엔(else로 처리)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("종료하시겠습니까?(Y/N) > ");
		char a = sc.nextLine().toUpperCase().charAt(0); // 문자열 입력받음 -> 입력받은 문자열의 모든 알파벳을 대문자로 바꿈 -> 0번째 index의 문자만 추출
														// method chaining = 메소드를 연이어서 호출
		
		if (a == 'Y') {
			System.out.println("종료합니다");
			return;
		} else if (a == 'N') {
			System.out.println("종료 안 합니다");
		} else {
			System.out.println("잘못 입력했습니다");
		}		
		
	}

}
