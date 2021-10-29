package com.kh.chap02.objectarray.run;

import java.util.ArrayList;

import com.kh.chap02.objectarray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) { // main함수 영역 시작
		// 객체 배열 선언 및 할당
		// Phone이라는 자료형을 담을 배열; int[] arr = new int[3];으로부터 자료형만 바뀐 것
		Phone[] arr = new Phone[3];
		// 객체의 배열의 index에는 주소값이 들어가 있음(참조자료형); 정보 직접 접근 못하게 되어있으므로 참조해서 접근하여 사용
		
		System.out.println(arr); // arr이라는 배열의 주소값이 arr에 담겨있음
		System.out.println(arr.length); // 배열의 길이/방 갯수/크기 -> 반환값 = 정수 -> 3
		System.out.println(arr[0]); // arr[0]이 가리킬 주소(값)(o) 객체(x)가 없음; 참조자료형으로써 기본값으로 null이 들어있음
		
		// 객체를 생성해서 arr[i]이 어떤 객체/주소를 가리키게 하고 싶음 -> new 키워드 사용 + 생성자 메소드 호출 -> Phone의 객체 생성
		arr[0] = new Phone();
		System.out.println(arr[0]); // 첫번째 폰 객체의 주소가 들어가 있음
		
		// set을 해줄 객체를 어디서 찾을 수 있는가/set을 해줄 객체의 주소가 어디에 있는가 -> arr[0]이 가지고 있음
		arr[0].setName("아이폰");
		arr[0].setSeries("12mini");
		arr[0].setBrand("Apple");
		arr[0].setPrice(900000);
		System.out.println(arr[0]);
		System.out.println(arr[0].information());
		
		// 두번째 객체
		arr[1] = new Phone("갤럭시", "z플립", "삼성", 1120000); // 객체 생성하며 초기화도 진행
		arr[2] = new Phone("노키아", "5.3", "노키아", 350000);
		
		// 총 가격 및 평균가 출력
		/*
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}
		
		System.out.println("총 합계 : " + sum + "원");
		System.out.println("평균가 : " + (sum / arr.length) + "원");
		*/
		
		// Array(배열)List(목록)(=배열의 먼 친척) 버전
		ArrayList<Phone> list = new ArrayList<>(3); // Phone 객체만 담을 수 있는 ArrayList를 생성
		
		// arraylist의 편리한 기능: add()로 요소 추가
		// index 번호는 없으나, 앞에서부터 차곡차곡 쌓임; list 번호 붙일 수도 있긴 함
		list.add(new Phone("아이폰", "12mini", "Apple", 900000));
		list.add(new Phone("갤럭시", "z플립", "삼성", 1120000));
		list.add(new Phone("노키아", "5.3", "노키아", 350000));
		
		list.add(0, new Phone("아이폰", "14pro", "Apple", 1250000)); // 자동으로 size up; 0번째 삽입
		// list는 처음에 할당한 크기의 70% 정도 차면 자동으로 15%씩(?) 커짐 + 여러 메소드 사용 등 -> 배열보다 편리
		
		// 총 가격 및 평균가 출력
		int sum = 0;
		for (int i = 0; i < list.size(); i++) { // list의 size
			System.out.println(list.get(i).information());
			sum += list.get(i).getPrice();
		}
		
		System.out.println("총 합계 : " + sum + "원");
		System.out.println("평균가 : " + (sum / list.size()) + "원");

	} // main함수 영역 끝

}
