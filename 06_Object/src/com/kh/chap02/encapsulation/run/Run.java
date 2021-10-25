package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	
	/* 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추게 하자
	 * 캡슐화를 하지 않으면 외부로부터 직접 접근이 가능하기 때문에 함부로 값이 변질되거나 조회를 막지 못하는 문제가 발생
	 * cf. 정보 보안 3요소: 기밀성, 무결성, 가용성
	 * 
	 * 캡슐화 작업 = 정보 은닉 기술 중 하나; 정보 보안의 기밀성과 무결성을 지킬 수 있게 함; 캡슐 안에 숨기는 것;
	 * 			  데이터의 접근 제한(<-접근제한자)을 원칙으로 해서 외부로부터 직접 접근을 막음;
	 * 			  단, 대신, 메소드를 통해 간접적으로나마 처리(값 대입, 조회)를 할 수 있게 함
	 * 
	 * 캡슐화 작업의 2단계/공식(무조건 따라야 함 -> 외부에서 접근할 수 없도록)
	 * 1. 값 숨기기: 멤버변수의 접근제한자 public 대신 private으로 바꿔서/사용해서 접근을 막음
	 * 2. 간접적으로 값을 처리할 수 있는 메소드(getter, setter)를 만듦
	 */
	
	// 접근제한자 (예약어) 반환형 메소드이름(매개변수)
	// 매개변수 이름은 개발자 마음대로 할 수 있지만, coding convention(관례, 개발자들끼리의 약속) = main함수의 매개변수 이름은 args로 하자
	public static void main(String[] args) {
		
		// 객체 생성 == 인스턴스화; 객체 만들어진 것 = 인스턴스; 객체 생성은 반드시 main메소드에서만 할 수 있는 건 아님
		Student lee = new Student(); // new라는 키워드 사용해서 import하고 lee에 대입
		
		/*
		lee.name = "김선민"; // 개인정보인데 누구나 와서 변경하면 보안 문제 vs private 멤버변수로 바꿔 설정하면 필드가 보이지 않아 오류 발생 -> 직접 접근 불가능함
		lee.age = 46;
		lee.gender = 'F';
		
		System.out.println(lee.name);
		System.out.println(lee.age);
		System.out.println(lee.gender);
		
		직접 접근을 막았으니 간접적으로나마 접근할 수 있게 해주기 <- get(얻기)ter /set(설정)ter 메소드 만들기
		*/
		
		lee.setName("이선민 컴퓨터공학과"); // 괄호() 안에 적절한 자료형의 매개변수/입력값 안 넣으면 오류
		lee.setAge(23);
		lee.setGender('F'); // 문자를 ''로 안 묶어주면 컴파일러에서 문자로 해석을 못함/변수로 생각함
		
//		lee.getName(); // 값을 반환만 받은 것; 어떻게 사용할지는 내 마음대로 정함
		System.out.println(lee.getName()); // print라는 함수/메소드 사용 시 함수의 매개변수로 괄호() 안에 argument(인자)를 넣음 -> 인자를 출력해달라 -> 반환받은 값을 출력해달라
		System.out.println(lee.getAge());
		System.out.println(lee.getGender());
		
		System.out.println(lee.information());
		
		

	}

}
