package com.kh.teamwork2.casino.model.vo;

public class Player { // 플레이어 클래스를 만들어 정보를 저장한다.

	private String playerName;// 플레이어 이름
	private int Wallet;// 플레이어 지갑

	public String getPlayerName() {// 외부에서 이름을 조회하는 getter
		return playerName;
	}

	public void setPlayerName(String playerName) {// 외부에서 플레이어 이름을 저장하는 setter
		this.playerName = playerName;
	}

	public int getWallet() {// 외부에서 지갑의 값을 조회하는 getter
		return Wallet;
	}

	public void setWallet(int wallet) {// 외부에서 지갑의 값을 저장하는 setter
		Wallet = wallet;
	}

}
