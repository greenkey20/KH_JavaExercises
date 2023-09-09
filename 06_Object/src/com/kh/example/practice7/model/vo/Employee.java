package com.kh.example.practice7.model.vo;

public class Employee { // Employee 클래스 영역 시작
	// 2021.10.26 과제: 클래스 다이어그램 보고 클래스 작성하기
	
	// [필드부]
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	// [생성자부]; 단축키로 만들어봄
	public Employee() { // 기본생성자
//		super(); // 아직 안 배운 내용; 빼기
	}

	public Employee(int empNo, String empName) { // 매개변수 2개 들어가는 생성자
//		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	// 10개의 필드 모두가 매개변수로 들어가는 생성자 
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) { 
//		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	// [메소드부]
	// getter() 및 setter() 단축키로 생성
	public int getEmpNo() { // 정수형 자료인 empNo의 값을 반환하는 메소드
		return empNo;
	}

	public void setEmpNo(int empNo) { // 정수형 자료인 empNo 값을 매개변수로 받아서 객체의 멤버변수/인스턴스변수/필드 empNo에 대입시키는 메소드; 결과값을 반환할 값이 없음(-> 반환형 void) 
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

} // Employee 클래스 영역 끝
