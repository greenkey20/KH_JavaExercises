package com.kh.practice.student.model.vo;

public class Student {
	
	// [필드부]
	private String name;
	private String subject;
	private int score;
	
	// [생성자부]
	public Student() { // 기본 생성자
		
	}
	
	public Student(String name, String subject, int score) { // 3개의 초기값을 받는 생성자
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// [메소드부]
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getScore() {
		return score;
	}
	
	public String inform() { // Student 클래스의 모든 필드 값들을 합쳐서 반환하는 메소드
		return "이름 : " + name + " / 과목 : " + subject + " / 점수 : " + score; // StudentMenu 클래스 '학생 정보 출력' 부분 작성하다가 과제 명세서 출력 내용처럼 양식 수정 
	}

}
