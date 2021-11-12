package com.kh.movie.model.vo;

public abstract class Cinema { // 영화관의 공통 속성들을 담는 클래스; 추상 메소드 1개를 포함하는 추상클래스가 됨
	
	// [필드부]
	private String release; // 상영 일자
	private int ticket; // 티켓 가격(1인)
	
	// [생성자]
	public Cinema() { // Cinema 클래스의 기본 생성자
//		super();
	}

	public Cinema(String release, int ticket) { // Cinema 클래스의 매개변수 생성자
//		super();
		this.release = release;
		this.ticket = ticket;
	}

	// [메소드부]
	// 필드의 값을 초기화/입력/수정하기 위한 setter 및 반환/조회하기 위한 getter
	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
	// 자식클래스에 상속해서 오버라이딩하게 할 추상메소드; 영화 선택과 인원 수를 매개변수로 받아 영화관 티켓을 출력하기 위한 메소드 
	public abstract void publish(int index, int person);

}