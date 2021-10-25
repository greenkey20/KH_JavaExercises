package com.kh.chap04_field.model.vo;

// 필드에서 사용 가능한 접근제한자 4가지
public class FieldTest2 {
	
	/* (+)public: 어디서든(같은 ou 다른 패키지 모두)/어느 패키지에서도 접근 가능
	 * 
	 * (#)protected: 같은 패키지이면 무조건 접근 가능 vs 다른 패키지이면 상속 구조인 클래스에서만 접근 가능
	 * 
	 * (~)default: 오로지 같은 패키지에서만 접근 가능; package-friendly; 생략 가능
	 * (-)private: 오직 해당 클래스 안에서만 접근 가능
	 * 위에서부터 아래로 내려갈수록 접근할 수 있는 범위가 좁아짐
	 * +, #, ~, -: 클래스 다이어그램 표기 방법  
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String df = "default";
	private String pri = "private";

}
