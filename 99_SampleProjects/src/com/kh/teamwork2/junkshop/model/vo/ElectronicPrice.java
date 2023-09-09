package com.kh.teamwork2.junkshop.model.vo;

public interface ElectronicPrice { // 가격변동 가능성이있어 인터페이스로 작성.
	// 반드시 public static final로 지정되어야함 (생략가능)
	public static final int STYLER = 1200000;
	public static final int REFRIGENATOR = 4500000;
	public static final int COMPUTER = 3000000;
	public static final int WASHING_MACHINE = 1500000;
	public static final int DRYER = 1800000; // 반드시 상수로 쓰이므로 대문자로 표기

}
