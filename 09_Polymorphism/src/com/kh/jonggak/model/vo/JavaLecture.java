package com.kh.jonggak.model.vo;

public class JavaLecture extends Lecture {
	
	// 상속 받을 부분 지워줌
	// [필드부]
//	private String name;
//	private String major;
	private int x;
	
	// [생성자부]
	public JavaLecture() {
		
	}
	
	public JavaLecture(String name, String major) {
		super(name, major);
//		this.name = name;
//		this.major = major;
	}
	
	public JavaLecture(String name, String major, int x) {
		this(name, major); // 내 클래스 내부에 있는 생성자 호출; 생성자 오버로딩 시 사용 -> 중복 lines 줄임
		this.x = x; 
	}
	
	// [메소드부]
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getMajor() {
//		return major;
//	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}
	
	@Override
	public void startLecture() {
		System.out.println("Java 강의 시작합니다~");
	}
	
//	public void stopLecture() {
//		System.out.println(name + ", 수업 멈추세요!");
//	}

}
