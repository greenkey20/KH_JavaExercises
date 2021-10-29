package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) { // main메소드 영역 시작 
		
		Book b1 = new Book();
		System.out.println(b1.information()); // 초기화가 안 되어 자료형들의 기본값들이 들어가 있음(null null null 0 0.0)
		
		Book b2 = new Book("자바의 정석", "도우출판", "남궁 성");
		System.out.println(b2.information()); // 3개 필드가 인자의 값으로 초기화되어 출력됨
		
		Book b3 = new Book("해리 포터와 마법사의 돌", "매직출판사", "조앤 롤링", 14900, 0.1);
		System.out.println(b3.information());
		
		// 개인 소감: 책 여러 개 만들 수 있어서 신기하다..
		
		// 도서 정보를 입력받아서 도서들의 정보를 출력해주는 프로그램 만들기
		// 책 3권의 정보를 입력받겠다고 가정; 입력받을 정보: 도서명, 출판사, 저자, 가격, 할인율
		// 객체 따로따로 관리
		// 입력은 Scanner 사용
		
		b1 = null; // 현재 입력되어 있는 값들 모두 초기화/reset/연결 끊음
		b2 = null; 
		b3 = null; 
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("제목 > ");
			String title = sc.nextLine();
			
			System.out.print("출판사 > ");
			String publisher = sc.nextLine();
			
			System.out.print("저자 > ");
			String author = sc.nextLine();
			
			System.out.print("가격 > ");
			int price = sc.nextInt();
			
			System.out.print("할인율 > ");
			double discountRate = sc.nextDouble();
			
			sc.nextLine(); // nextDouble() 입력받을 때 버퍼공간에 남아있던 개행문자 없애주기
			
			// 입력받은 정보를 set; 배열 안 쓰고 변수만 써서 하는 프로그래밍
			if (i == 0) { // 객체배열 아직 안 배웠으니까 지금 내가 사용할 수 있는 도구들 적극 활용하기
				b1 = new Book(title, publisher, author, price, discountRate);
			} else if (i == 1) {
				b2 = new Book(title, publisher, author, price, discountRate);
			} else {
				b3 = new Book(title, publisher, author, price, discountRate);
			}
			
		}
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println(b3.information());
		
		// 사용자로부터 검색할 도서의 제목(searchTitle) 입력받아서
		// 각 전체 도서들의 제목(객체 b1, b2, b3의 인스턴스/멤버변수 title)과 하나하나 비교해서 일치하는 도서의 가격을 알려주는 프로그램
		
		// b1.title 멤버변수 private으로 선언했기 때문에 직접 접근 불가능 -> getTitle을 통해 값 반환받아야 함
		
		while (true) {
			System.out.println("검색할 도서의 제목을 입력해주세요 > ");
			String searchTitle = sc.nextLine();
			
			if (b1.getTitle().equals(searchTitle)) { // 참조자료형(String)끼리 동등비교== 하면 주소값 비교하게 됨 vs 문자열 내용물 비교 시 .equals()라는 기능 사용(이 정도 오류 찾는 것 = 문제해결시나리오 문제 난이도 상)
													 // b1 객체 주소에 접근 -> 멤버변수 Title에 대한 getter() 메소드를 통해 b1.Title의 값에 접근 -> searchTitle의 참조에 접근해서 -> equals로 내용물 비교
													 // searchTitle.equals(b1.getTitle())처럼 비교 대상 순서 바꿔서 써도 됨; 순서가 중요한 게 아니라 둘이 같은지 비교하는 것이 중요
				System.out.println(b1.getPrice());
				break;
			} else if (b2.getTitle().equals(searchTitle)) {
				System.out.println(b2.getPrice());
				break;
			} else if (b3.getTitle().equals(searchTitle)) {
				System.out.println(b3.getPrice());
				break;
			} else {
				System.out.println("찾으시는 책이 없습니다");
				continue;
			}
		}

	} // main메소드 영역 끝

}
