package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) { // main메소드 영역 시작

		// 배열의 특징: 같은 자료형끼리만 묶을 수 있다; 순서대로; index(0~); 참조자료형; 객체..
		
		// int[] iArr = new int[5]; -> iArr 정수형 배열 5칸짜리
		// String[] sArr = new String[5]; -> sArr 문자열형 배열 5칸짜리
		// Book[] bArr = new Book[3]; -> bArr 객체들을 담는 배열 3칸짜리
		
		// 객체 배열의 선언 및 할당
		// 표현법
		// 클래스이름[] 배열이름 = new 클래스이름[배열크기];
		
		Book[] arr = new Book[3]; // Book형(내가 만든 자료형)을 담을 배열(선언) + 3칸짜리(할당); arr[0], arr[1], arr[2] 각 방에는 객체의 주소가 담겨있음
		// arr = 노란색 = 지역변수, 스택에 있음; new 키워드를 이용해 만든 객체(heap 영역 안에 만들어져있는 객체)의 주소가 arr에 저장되어 있음; arr이 가리키는 이 주소에는 3칸짜리 방(배열)이 있고, 각 방에는 객체의 주소가 들어있음
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			
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
			
			// 입력받은 정보를 set; 똑같은 코드를 반복하니까 반복문 사용 -> 반복 횟수가 정해져 있으니까 for문 사용, 단 현재 for문 돌고 있으니까 현재 for문 안에서 할 수 있음
			arr[i] = new Book(title, publisher, author, price, discountRate); // Book 객체를 만드는, 매개변수 있는, 생성자; 사용자가 입력한 값이 객체를 만들 인자로 전달되어 객체의 필드/인스턴스변수들의 값 초기화/대입
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information()); // arr의 i번째 방(에 저장되어 있는 주소)을 참조하여 information() 접근 -> 각 객체의 정보 출력
		}
		
		System.out.println("검색할 도서의 제목을 입력해주세요 > ");
		String searchTitle = sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getTitle().equals(searchTitle)) {
				System.out.println(arr[i].getPrice());
			}
		} // 나는 System.out.println("찾으시는 책이 없습니다"); 추가하고 싶다..
		
	} // main메소드 영역 끝

}
