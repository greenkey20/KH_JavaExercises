package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	// 문자열을 배열로 분리시키는 방법
	// 방법1) 구분자를 제시해서 해당 문자열을 분리시킴 = 배열 이용
	// 방법2) 분리된 각각의 문자열들을 token으로 취급함 = token 이용
	
	String str = "Java,강해피,Oracle,JDBC,내일 시험,행복하다"; // str = 필드/멤버변수 + 순서가 있는 문자의 집합
	
	// 방법1) 배열 사용
	public void method1() {
		// split = 분리하다, 쪼개다..
		// 문자열.split(String 구분자) : 반환형 String[]
		String[] sArr = str.split(",");
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		// 향상된(enhanced) for문: 초기식, 조건식, 증감식 필요 없음 cf. Java의 정석 p.166
		// for each문
		// 표현법: for (값을 받아줄 변수 선언 : 순차적으로 접근한 배열) { }
		// 단점: 배열의 값 수정 불가능; 출력만 가능 -> 용도에 맞게 쓰면 됨
		for (String s : sArr) {
			System.out.println(s);
		}
		
	}
	
	// 방법2) token 사용
	public void method2() {
		// 각각의 문자열을 토큰으로 처리
		// java.util.StringTokenizer 클래스 이용
		// 표현법: StringTokenizer stn = new StringTokenizer(문자열, 구분자) -> 객체 생성
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 개수 : " + stn.countTokens()); // 분리된 문자열의 개수 : 6
		// countTokens() = 분리된 문자열의 개수를 반환해주는 메소드
		
		/*
		// 실제로 분리된 내용물을 보고 싶다면 -> nextToken() = 토큰의 내용 하나씩 보여주는 메소드
		System.out.println(stn.nextToken()); // Java
		System.out.println(stn.nextToken()); // 강해피
		System.out.println(stn.nextToken()); // Oracle
		System.out.println(stn.nextToken()); // JDBC
		System.out.println(stn.nextToken()); // 내일 시험
		System.out.println(stn.nextToken()); // 행복하다
		
		// 여기서 남아있는 토큰이 없을텐데, 또 nextToken() 호출하면
		System.out.println(stn.nextToken());
		// NoSuchElement(요소)Exception; 더 이상 꺼내올 토큰(요소)가 없어서 발생하는 오류
		*/
		
		// 중복을 줄여 더 좋은 codes로 만들기 위해 반복문 사용 -> 보통 토큰 출력 시에는 while문 사용
		/*
		for (int i = 0; i < stn.countTokens(); i++) {
			System.out.println(stn.nextToken()); 
		}
		*/
		
		while(stn.hasMoreTokens()) {
			// hasMoreTokens() = stn에 남아있는 토큰이 있으면 true vs 토큰이 다 빠졌으면 false
			System.out.println(stn.nextToken());
		}

	}

}