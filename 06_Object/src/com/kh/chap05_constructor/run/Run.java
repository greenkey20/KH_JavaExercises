package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {
	
	public static void main(String[] args) {
		
		// 1. 기본 생성자 사용해서 객체 생성 후, setter를 이용해서 필드값 초기화
		User go = new User(); // 생성자 호출; User 클래스에서 기본 생성자 주석처리하면 User() 생성자가 선언되지 않았다고 오류 발생
		// 객체 지향 관점에서는 객체 생성 시 초기값을 대입해주는 것이 좋음 vs 웹개발 시 초기화 없이 생성하는 경우 많음 -> 기본 생성자를 항상 작성하자
		go.setUserId("gomdol.kang");
		go.setUserPwd("1234");
		go.setName("강곰돌");
		System.out.println(go.information()); // 이 출력 결과처럼 나이는 0세, 성별 없는 강곰돌은 존재할 수 없음 -> 객체 생성 시 유효한 값이 입력되도록
		
		// 2. 객체 생성과 동시에 필드값을 초기화
		// id, 비밀번호, 이름
		// id, 비밀번호, 이름, 나이, 성별
		User tom = new User("tomicutie", "5678", "강토미"); // 생성자 호출 -> User 클래스의 생성자에 따라 매개변수의 값이 객체의 필드에 대입됨; 나이와 성별은 기본형(int 및 char)의 기본값(0 및 공백)이 들어가있음 
		System.out.println(tom.information());
		
		// 3. 생성자로 모든 필드값 초기화
		User u = new User("ubewarm", "1357", "강유베", 4, 'F');
		System.out.println(u.information());
		
		// 굳이 setter는 왜 필요할까?
		// 중간에 비밀번호 바꿔야 하거나 개명했다면?
		
		
	}

}
