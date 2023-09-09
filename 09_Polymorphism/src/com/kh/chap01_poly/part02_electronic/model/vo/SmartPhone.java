package src.com.kh.chap01_poly.part02_electronic.model.vo;

public class SmartPhone extends Electronic {
	
	private String phoneNumber;
	
	public SmartPhone() {
//		super(); // 부모의 기본생성자가 생략되어 있음 -> 부모의 기본생성자가 만들어있지 않으면(e.g. JVM이 자동생성 못/안 한 경우) 오류남
	}
	
	public SmartPhone(String name, String brand, int price, String phoneNumber) {
		super(name, brand, price);
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return super.toString() + ", 전화번호 : " + phoneNumber;
	}

}
