package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 기본 생성자로 객체 만들기
		Employee e1 = new Employee();
		
		// setter를 이용해 값 변경
		e1.setEmpNo(100);
		e1.setEmpName("홍길동");
		e1.setDept("영업부");
		e1.setJob("과장");
		e1.setAge(25);
		e1.setGender('남');
		e1.setSalary(2500000);
		e1.setBonusPoint(0.05);
		e1.setPhone("010-1234-5678");
		e1.setAddress("서울시 강남구");
		
		// getter를 이용해 출력
		System.out.println("e1 객체의 필드 값 출력");
		System.out.println("사원번호 : " + e1.getEmpNo());
		System.out.println("이름 : " + e1.getEmpName());
		System.out.println("부서 : " + e1.getDept());
		System.out.println("직위 : " + e1.getJob());
		System.out.println("나이 : " + e1.getAge());
		System.out.println("성별 : " + e1.getGender());
		System.out.println("월급 : " + e1.getSalary());
		System.out.println("보너스 포인트 : " + e1.getBonusPoint());
		System.out.println("전화번호 : " + e1.getPhone());
		System.out.println("주소 : " + e1.getAddress());
		
		// 2021.10.26자 숙제 소감: 오늘 숙제는 클래스 만들고 메소드 실행하는 것을 간단히, 차분하게, 쉽게 해 볼 수 있었습니다.
		// 남은 한 주도 건강하세요~ 감사합니다!

	}

}
