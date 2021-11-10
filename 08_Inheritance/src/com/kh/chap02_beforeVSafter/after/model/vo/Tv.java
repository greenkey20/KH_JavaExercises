package com.kh.chap02_beforeVSafter.after.model.vo;

public class Tv extends Product { // 상속을 받을 클래스(Tv)에서 누구로부터(Product) 상속받는지 명시; 키워드 extends(확장하다) 이용
	
	// 부모가 자식에게 물려주는 것은 사라지는(x) 남아있는, 대대손손 전해지는, 무형자산 같은(o) 것들
	// 내가 부모로부터 상속받을 부분은 작성하지 않음; 단, 메소드는 오버라이딩(overriding) 할 경우 작성
	
	// [필드부]
	// brand, pCode, pName, price, inch
	private int inch;
	
	// [생성자부] 식별자(이름)가 다르므로 상속 받을 수 없음; 만들어줘야 함
	// 기본생성자
	public Tv() {
//		super(); // 보이진 않지만 부모의 기본 생성자가 들어가 있음
		System.out.println("자식 객체 생성");
	}
	
	// 모든 필드에 대해 매개변수가 있는 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		
		// 부모클래스에 있는 필드나 메소드를 접근 및 사용하고자 할 때 super.(부모에게 접근) 키워드 사용; super는 해당 부모의 주소를 담고 있음 -> super.을 통해 부모에 접근 가능
		// 나는 brand 필드 선언한 적 없음 -> 부모에게 있는 brand 필드에 접근
		// 단, 접근하고자 하는 그 어떤 것이 private인 경우 외부에서는(자식클래스에서라도) 접근 불가능 -> super.brand = brand; // 부모의 brand 필드의 접근제한자가 private -> 내부(해당 클래스)에서만 접근 가능; 외부에서 접근 불가능
		/* 해결
		 * 방법1) 부모클래스의 필드를 자식들은 접근 가능하도록 설정 = 부모클래스의 필드들의 접근제한자를 private에서 protected로 바꿈 = 캡슐화 원칙(꼭 지켜야 하는 것)을 깨는 것 -> 적합한 방법은 아님
		 * 방법2) 부모클래스의 setter 메소드(=public 접근제한자)를 호출해서 초기화 -> super.set필드이름(); -> 부모클래스의 필드 초기화
		 * 방법3) 부모클래스의 모든 매개변수가 있는 생성자를 호출 -> 부모클래스에 위치한 생성자로 감 -> 부모클래스의 필드 (값) 초기화 -> 부모님의 것은 내(자손) 것; 가장 좋은 방법 + codes 간단해서 주로 이 방법을 많이 씀 -> super(매개변수들); e.g. Product(brand, pCode, pName, price); 
		 */
		
		// 방법2 이용
		super.setBrand(brand); // 부모의 brand 필드 setter에 접근해서, 매개변수가 있는 Tv 생성자 호출 시 입력한 인자 brand 값을 대입함 cf. super(부모).brand = brand; // this(클래스가 만드는 객체 자기 자신).brand = brand;
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		
		this.inch = inch; // 나(자손)만 가지고 있는 필드 초기화
	}
	
	// [메소드부]
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	/* 여기까지 필수 작성 요소들은 모두 작성함
	 * information이라는 메소드는 이미 부모로부터 상속받음 -> 덮어쓰기(overriding) 가능
	 */
	
	@Override
	public String information() { // 덮어쓰기 할 때는 보통 내용 추가 -> 원래/부모의 information 메소드에 나만의 information 메소드를 덮어씀 
		return super.information() + ", inch : " + inch; // 부모님의 information 메소드 반환값 String + 나만의 정보 String으로 이어씀
	}

}
