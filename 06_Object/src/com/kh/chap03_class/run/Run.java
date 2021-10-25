package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// Person이라는 클래스(=내가 만든 나만의 자료형)를 통해/틀을 이용하여 객체 생성
		// 내가 만든 나만의/사용자 정의 자료형의 특징
		// 1. 참조자료형 -> 주소값을 저장
		// 2. 여러 개의 자료형의 값 및 기능을 보관 가능 -> 변수와 메소드의 집합
		
		// 인스턴스화 = 객체를 만듦; heap 영역의 메모리에 올림
		// 클래스명 객체/변수명 =(새로 만든 우항의 어떤 것을 대입) new 클래스명과 동일한 메소드();
		Person kang = new Person();
		System.out.println(kang.information()); // 각 멤버변수에 값 대입하기 전에는 기본값이 들어있음 -> 기본(primitive)자료형은 0(.0), 공백; 참조형은 null

		// setter 이용하여 값 대입
		kang.setIdNum("850410-2******");
		kang.setName("강은영");
		kang.setAge(36);
		kang.setGender('F');
		kang.setMobile("010-8217-4120");
		kang.setEmail("greenkey20@naver.com");
		
		System.out.println(kang.information());
		System.out.println(kang); // 출력 결과 = 저장 경로 및 16진수로 표시된 주소값
		
		Product pd1 = new Product();
		
		pd1.setProductName("아이폰13");
		pd1.setPrice(1380000);
		
		System.out.println(pd1.information());
		
		pd1.setBrandName("삼성");
		System.out.println(pd1.information());

	}

}
