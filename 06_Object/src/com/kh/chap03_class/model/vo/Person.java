package com.kh.chap03_class.model.vo;

public class Person {
	
	// 사람의 인적정보: 사람 모양으로, 호구 조사하는, 인적정보 담긴, 클래스
	// 주민번호, 이름, 나이, 성별, 휴대폰번호, 이메일주소
	
	// [필드(== 멤버변수 == 인스턴스변수)부]
	// private 접근제한자 -> 외부에서 접근 불가능
	private String idNum;
	private String name;
	private int age;
	private char gender;
	private String mobile;
	private String email;
	
	// [생성자부]
	
	// [메소드부]
	// setter메소드: set필드명
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter메소드: get필드명
	public String getIdNum() {
		return this.idNum; // this.는 생략 가능; Java 개발자들은 보통 this. 붙임; 다른 객체지향 언어에서는 종종 생략
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	// information(): 필드 모아서 예쁘게 반환하기
	public String information() {
		return name + "님(" + age + "세, " + gender + ")의 주민번호는 " + idNum + "이고, 휴대폰번호는 " + mobile + ", 이메일 주소는 " + email + "입니다.";
	}

}
