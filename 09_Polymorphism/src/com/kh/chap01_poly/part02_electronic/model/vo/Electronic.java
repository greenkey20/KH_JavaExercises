package src.com.kh.chap01_poly.part02_electronic.model.vo;

// 부모클래스; 용산 전자상가에서 살 수 있는 전자제품들
public class Electronic {
	
	// [필드부]
	private String name;
	private String brand;
	private int price;
	
	// [생성자부]
	public Electronic() { // 기본생성자 -> 안 만들면 자식클래스에서 오류 날 수 있음
		
	}
	
	public Electronic(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	// [메소드부]
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// syso(e/*.toString()*/) // 우리 눈에 보이지 않고 생략되어 있지만 JVM이 만들어줌 -> toString()은 원래 com.kh...(패키지 위치).클래스명@16진수 주소값 출력해줌
	// JVM: 어떤 운영체제에서든지 Java가 동작할 수 있도록 중간에서 작동하는 가상 기계
	public String toString() {
		return "제품명 : " + name + ", 브랜드명 : " + brand + ", 가격 : " + price;
	}

}
