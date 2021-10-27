package com.kh.chap02_beforeVSafter.after.model.vo;

public class SmartPhone extends Product { // 자식클래스이름(상속받는) extends(확장하다) 부모클래스이름(상속해주는)
	
	// [필드부]
	private String mobileAgency;
	// + brand, pCode, pName, price는 Product 클래스로부터 상속받음
	
	// [생성자부]
	// 생성자는 클래스 이름이 다른 바 상속받을 수 없음
	public SmartPhone() {
//		super(); // 보이진 않지만 부모의 기본 생성자가 들어가 있음
		System.out.println("자식 객체 생성");
	}
	
	// 초기화를 모두 진행할 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		
		// 방법2) 부모클래스에 있는, public 접근제한자인 setter 메소드 호출
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 방법3)
		super(brand, pCode, pName, price); // 부모님의 생성자 호출 -> 부모의 필드를 나의 생성자에서 사용할 수 있도록 + 부모의 필드 값/부모 객체 초기화
		// 윗줄 안 적으면 JVM이 super(); 만들어서 실행시킴
		// 부모님이 먼저 태어나야 자식이 존재할 수 있어서 super 생성자가 먼저 와야 함
		
		this.mobileAgency = mobileAgency; // 내 것은 내가 알아서 초기화
	}
	
	// [메소드부]
	// mobileAgency에 대한 getter, setter 작성 <- 부모님이 내 것 해주실 수 없음
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	// 내가 실행하고자 하는 메소드가 해당 클래스에 존재하지 않는다면 자동으로 해당 클래스의 부모클래스에 있는 메소드로 호출됨
	// SmartPhone 클래스에 information() 메소드 안 만들었는데, Run에서 SmartPhone 객체.information() 호출하면 값 볼/출력할 수 있음

}
