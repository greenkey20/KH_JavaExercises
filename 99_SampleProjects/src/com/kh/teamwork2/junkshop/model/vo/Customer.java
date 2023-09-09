package com.kh.teamwork2.junkshop.model.vo;

public class Customer { // 입력받은 주민등록번호 저장하는 클래스
	private String memberId;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Customer() {
	}

	public Customer(String memberId) {
		this.memberId = memberId;
	}

}
