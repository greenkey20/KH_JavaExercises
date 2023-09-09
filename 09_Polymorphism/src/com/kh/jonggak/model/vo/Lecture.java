package com.kh.jonggak.model.vo;

//부모클래스; 부모클래스에서 특별히 적어야 하는 키워드 같은 것 없음; 자식클래스에서 중복되는 요소들 가져와서 만듦
public class Lecture { 
	
	// [필드부]
	private String name;
	private String major;
	
	// [생성자부]
	public Lecture() {
		
	}
	
	public Lecture(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	// [메소드부]
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void startLecture() {
		System.out.println("Java 강의 시작합니다~");
	}
	
	public void stopLecture() {
		System.out.println(name + ", 수업 멈추세요!");
	}

}
