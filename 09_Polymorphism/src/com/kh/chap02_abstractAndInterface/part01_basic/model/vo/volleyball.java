package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class volleyball extends Sports {
	
	@Override
	public void rule() {
		System.out.println("네트에 몸이 닿으면 안 돼요");
	}
}
