package com.kh.teamwork2.casino.model.vo;

//추상매소드를 사용하기 위해 추상클래스를 만들고 카지노 인터페이스를 상속받음
public abstract class Game implements Casino {

	private String gameName; // 프라이빗 접근제한자 스트링 변수를 선언

	public Game() {// 기본생성자를 만듦

	}

	public Game(String gameName) {
		this.gameName = gameName; // 매개변수가 있는 생성자를 만듦
	}

	public String getGameName() { // 캡슐화를 사용했기 때문에 게터 세터를 만들어줌
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String playGame() {// 받은값을 리턴해줌
		return gameName + " 게임 ";
	}

	// 추상매소드
	public abstract int payFee();

}
