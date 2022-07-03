package com.kh.teamwork2.junkshop.model.vo;

public interface Discount { // 할인율 변동가능성
	// 반드시 public static final로 지정되어야함 (생략가능)
	public static double OLD_WOMAN = 1.1;
	public static double OLD_MAN = 1.05;
	public static double STUDENT = 0.9;
	// 위 값들은 변하지 않는 값이기 때문에 인터페이스를 이용하여 작성을 함

}
