package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		Book jv = new Book("Java의 정석", "남궁 성", 32000);
		System.out.println(jv/*.toString()*/); // 출력 결과 = 원래는 객체의 주소값(com.kh.chap03_override.model.vo.Book@223f343과 같은 형태)
											   // -> toString() 메소드를 이렇게 쓰기 싫으니까, 예쁘게 출력할 수 있도록 Book 클래스 메소드부에서 overriding/재정의
										       // -> 출력 결과 = Book [title = Java의 정석, author = 남궁 성, price = 32000]
		// .toString() 안 써도 JVM이 불러줌 -> 예쁘게 정리된 출력 결과 나옴
	}

}
