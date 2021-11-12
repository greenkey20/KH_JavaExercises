package com.kh.jonggak.model.vo;

public class SecureLecture extends Lecture {
	
	// [필드부]
//	private String name;
//	private String major;
	
	// [생성자]
	public SecureLecture() {
		
	}

	public SecureLecture(String name, String major) {
		super(name, major); // 부모클래스의 생성자 호출; 부모클래스의 필드 값 초기화하기 위한 것
		// super.name = name; // 이렇게 하면 error
		// super.major = major;
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
		System.out.println("보안 강의 시작합니다~");
	}
	
//	public void stopLecture() {
//		System.out.println(name + ", 수업 멈추세요!");
//	}

}
