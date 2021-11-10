package com.kh.chap02_beforeVSafter.after.run;

import com.kh.chap02_beforeVSafter.after.model.vo.*;

public class AfterRun extends Object { // 모든 클래스는 Object라는 클래스를 상속받고 있음; Object는 모든 이의 조상; 'extends Object' 생략 가능

	public static void main(String[] args) {
		
//		Product p = new Product();
		
		Tv t = new Tv(); // Product(); 생성 안 했는데도, 이 자식클래스 생성자 호출 시 부모클래스 생성자 내용도 출력됨
		
//		t.price = 1000; // 접근제한자를 private으로 해서 캡슐화했기 때문에 이렇게 직접접근 불가능
		
		t.setPrice(1000); // Tv 클래스가 Product 클래스를 상속받기 전에는 "The method setPrice(int) is undefined for the type Tv"
		System.out.println(t.getPrice());
		
		// 객체 생성하면서 초기화 진행
		SmartPhone s = new SmartPhone("Apple", "app1234", "아이폰14", 1000000, "SKT");
		
		System.out.println(s.information()); // 부모클래스의 information() 메소드 상속받아 씀
		
		Desktop d = new Desktop("Apple", "mc945-7", "짱짱데스크탑", 5000000, true);
		Tv t1 = new Tv("LG", "tv04", "나노티비", 8000000, 70);
		
		System.out.println(d.information()); // 부모클래스의 information() 메소드 overriding
		System.out.println(t1.information()); // 부모클래스의 information() 메소드 overriding
		// 자식클래스에 overriding(부모클래스의 메소드를 재정의)을 했을 경우, 자식클래스의 overriding된 메소드가 우선권을 가져 호출됨 -> Desktop/Tv information() 반환값 출력 결과에 자식 고유의 필드 값 추가되어 있음 
		
		/* 상속의 특징
		 * Java에서는 클래스 간의 다중 상속 불가능 -> 단일 상속만 가능; 2개 이상의 부모를 가질 수 없음
		 * 명시되어 있지는 않지만 모든 클래스(내가 만든 클래스들 + Java에서 이미 제공하고 있는 클래스들)는 Object클래스의 후손 -> Object클래스에 있는 메소드를 호출해서 사용 가능 -> Object클래스에 있는 메소드가 마음에 안 드는 경우, overriding을 통해 재정의 가능
		 * 
		 * 상속의 장점
		 * 중복된 코드를 공통적으로 관리 가능 -> 새로운 코드 작성할 때나 수정할 때 용이; 보다 적은 양의 코드로 새로운 클래스를 만들 수 있음
		 * 프로그램의 생산성과 가독성 향상, 유지보수에 크게 기여
		 */

	}

}
