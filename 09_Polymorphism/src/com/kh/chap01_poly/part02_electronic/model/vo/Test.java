package src.com.kh.chap01_poly.part02_electronic.model.vo;

public class Test {
	
	// Test 자료형의 모양/생김새 = Test 객체를 만들면 모양 = int형 필드 하나 a, 매개변수 1개 받는 생성자(기본생성자는 없음), getter, setter
	
	private int a;

	public Test(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	} 

}
