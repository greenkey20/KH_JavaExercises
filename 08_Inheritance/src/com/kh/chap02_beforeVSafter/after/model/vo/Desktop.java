package com.kh.chap02_beforeVSafter.after.model.vo;

public class Desktop extends Product { // 상속받는 자식클래스 이름 extends(확장하다) 상속해주는 부모클래스 이름
	// 상속의 특징: 부모로부터 상속받는 부분은 기술하지 않음; 단, 메소드는 상속받아서 재정의(overriding)해서 사용하는 경우 기술 가능
	
	// [필드부]
	private boolean allInOne; // 모니터에 컴퓨터 기능이 있는 것; 논리형 변수 식별자의 경우 is 종종 붙여줌 e.g. isAllInOne
	
	// [생성자부]
	public Desktop() {
		
	}
	
	// brand, pCode, pName, price: 부모클래스(Product)에 있는 필드에 초기화됨
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// 방법3) 매개변수가 있는 부모클래스의 생성자 호출
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	
	// [메소드부]
	// overriding 개념 적용 가능
	// brand, pCode, pName, price에 대한 setters, getters는 작성하지 않아도 호출 가능 <- 상속 받았으므로
	// + allInOne에 대한 setter, getter 작성 필요
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean getAllInOne() {
		return allInOne;
	}
	
	// 부모클래스(Product)의 information() 메소드는 가격까지만 반환해 주므로, Desktop에서 필요한 allInOne도 반환을 해주자 <- overriding
	@Override
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}

}
