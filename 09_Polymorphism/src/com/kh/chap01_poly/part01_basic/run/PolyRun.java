package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.*;

public class PolyRun {
	
	/* 다형성
	 * 상속을 전제로 한/이용한 기술: 부모클래스로부터 상속받은 자식클래스 타입의 객체를 부모클래스의 타입으로 형 변환 -> 동일한 자료형이 됨 -> 한 번에 다룰 수 있음
	 * -> 배열을 사용할 수 있음(배열은 같은 자료형끼리 묶어서 보관이 가능하니까); 배열을 사용하면 같은 자료형의 자료를 여러 개 한 번에 다룰 수 있음 
	 * 
	 * 형 변환
	 * (double)int로 형 변환한 것은 double과 동일한 자료형이 됨
	 * 자식클래스는 부모클래스로부터 ☆☆☆☆☆☆☆☆types(자료형)☆☆☆☆☆☆☆☆, 변수, 메소드(생성자 포함)를 상속받음 
	 */

	public static void main(String[] args) { // main메소드 영역 시작
		
		// 대입연산자=(우항의 값을 좌항에 대입) 특징: ☆☆☆☆☆☆☆☆☆☆☆ 양변의 자료형이 같아야 함 ☆☆☆☆☆☆☆☆☆☆☆
		
		// 1. 부모 타입 레퍼런스(참조)로 부모 객체를 다루는 경우
		System.out.println("1. 부모 타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
//		p1.printChild1(); // 자식 것은 부모 것이 아님 -> p1으로는 Parent에만 접근 가능
		
		// 2. 자식 타입 레퍼런스로 자식 객체를 다루는 경우
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1(); // 내 것은 내 것
		c1.printParent(); // 상속받은 바, 부모님 것은 자식 것 -> c1으로는 Parent, Child1에 둘 다 접근 가능
		
		System.out.println("[ + 첫번째 손녀]");
		GrandChild1 gc1 = new GrandChild1();
		gc1.printGrandChild1(); // 내 것은 내 것 
		gc1.printChild1(); // 상속받은 바, 부모님 것은 자식 것
		gc1.printParent(); // 상속받은 바, 부모님의 부모님(조부모님) 것은 손녀 것 -> gc1로 Parent, Child1, GrandChild1에 모두 접근 가능
		
		// 3. 부모 타입 객체로 자식 객체를 사용하는/다루는 경우 = 형 변환; 다형성이 적용된 개념
		System.out.println("3. 부모 타입 객체로 자식 객체를 사용하는 경우");
		Parent p2 = /*(Parent)*/ new Child1(); // Child1(자식) 생성자 호출; 대입연산자 양변에 같은 자료형 -> 자동형변환된 것; Parent형으로 자동형변환이 되었기 때문에 양쪽의 자료형이 다름에도 오류가 나지 않음 
		// 다형성; 상속 구조에서는 클래스 형 변환이 가능
		p2.printParent();
//		p2.printChild1(); // 내 거가 내 거가 안 됨; 자료형이 Parent이기 때문에 자식 것에 접근 불가능 -> p2로는 Parent에만 접근 가능
		
		((Child1)p2).printChild1(); // p2(객체; 주소가 담긴 것 -> 얘를 따라가면 메모리 heap 영역 어딘가에 있는 객체의 진짜 내용(필드, 메소드 등)) = reference/참조 -> p2를 Child1로 강제형변환하면 자식 것에 접근 가능
		
		/* 상속 구조일 경우에만 클래스 간의 형 변환 가능
		 * 1. UpCasting: 자식 타입 -> 부모 타입; 생략 가능
		 * 2. DownCasting: 부모 타입 -> 자식 타입; 생략 불가능
		 */
		
		System.out.println("[ + 첫번째 손녀를 (조)부모 타입 객체로 사용하면]");
		Parent p3 = new GrandChild1();
		p3.printParent(); // 자료형이 Parent인 바, 자기 것에만 접근 가능
		((GrandChild1)p3).printGrandChild1(); // 손녀 것에 접근하려면 Parent형 변수를 p3를 GrandChild1(첫번째 손녀) 자료형으로 강제형변환해야 함
		((GrandChild1)p3).printChild1(); // 손녀(GrandChild1) 자료형으로 자식(Child1) 것 접근 가능 = 상속받은 바, 자식은 부모님 것에 접근 가능
		
		// 다형성을 사용하는 이유: 배열(한 종류의 자료형인 값들을 묶어서 관리 가능)을 써보자
		System.out.println("[다형성을 접목한 (객체)배열]");
		// 부모 타입의 객체 배열을 만든 다음, 자식들을 부모 배열로 묶어보자
		
		Parent[] arr = new Parent[6]; // 부모 타입/Parent형의 (객체)배열 만들기 -> Parent형 자료형만 들어갈 수 있는 배열
		arr[0] = /*(Parent)*/ new Child1(1); // 자식 자료형을 Parent형 배열에 넣음(눈에 넣어도 안 아픈 자식; 부모님의 사랑으로 문제 안 됨) -> UpCasting이 생략되어 있음; 자동형변환이 되어 가능
		arr[1] = /*(Parent)*/ new Child1(4, 5, 6);
		arr[2] = /*(Parent)*/ new Child2();
		arr[3] = /*(Parent)*/ new Child2(10, 11, 12);
		arr[4] = /*(Parent)*/ new GrandChild1(2, 3);
		arr[5] = null;
		
		// printParent 메소드 호출 <- 객체배열 arr에서 부모 자료형으로 자동형변환된 자식과 손자는 부모의 것 접근 가능
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].printParent();
			}
		}
		
		// printChild1/2, printGrandChild1 메소드 호출 <- arr[i]는 부모형 객체를 가리키고 있는 바, DownCasting을 해야 가능
		// 아래 형태는 반복문 사용이 불가능(ou 조건/반복문 억지로 몇 십 줄 쓰면 사용할 수는 있겠지만)  
		((Child1)arr[0]).printChild1(); // 부모 클래스에는 자식 것이 선언되어 있지 않음 + 자식은 부모 것을 상속받기만 하고; 부모가 자식인 척 해야(DownCasting) 호출/사용 가능
		((Child1)arr[1]).printChild1(); 
		((Child2)arr[2]).printChild2(); 
		((Child2)arr[3]).printChild2();
		((GrandChild1)arr[4]).printGrandChild1();
		
		// Child1을 Child2로 강제형변환 한다면
//		((Child2)arr[0]).printChild2(); // class cast exception(클래스 간의 형 변환이 잘못되었을 경우 발생하는 에러) 발생; 원래 Child1인 아이를 Child2로 바꾸려니까 에러가 남
		// Child1,2는 남남
		
		// 반복문과 오버라이딩 개념까지 적용
		System.out.println("[반복문 + 오버라이딩]");
		for (int i = 0; i < arr.length; i++) {
			// 각 배열의 index에 차근차근 접근; 배열의 index에는 부모 type이 저장되어 있음
			// 각각의 배열의 index를 강제형변환x; passing(강제형변환 안 해줌) -> arr[i]에 담긴 객체는 Parent 자료형
			
			// 메소드 호출
			if (arr[i] != null) {
				arr[i].print();
			}
			// 부모는 자식의 것에 접근할 수 없으므로 "나는 부모야~"가 4번 찍혀야 되는데, 정작 결과는 오버라이딩된 print가 각각 호출이 됨
			// 오버라이딩의 특징: 오버라이딩 개념이 적용된 메소드를 호출 시, 새롭게 정의된 메소드가 원조 메소드보다 우선순위가 높아서 먼저 호출이 됨; 오버라이딩을 사용하면 자식 메소드에게 우선권을 줌
			// -> "우리가 앞으로 객체배열을 쓸 때 오버라이딩을 이용하면 굳이 강제형변환을 안 해도 됨"
			
			/* 정적 바인딩 = compile(컴퓨터가 알아듣게 해줌) 시점에 바인딩; compile 시점 -> 정적 바인딩 -> 현재 주소값의 자료형의 클래스에 있는 메소드를 가리킴
			 * vs 동적 바인딩 = runtime 시점(실행 시점)에 바인딩; runtime 시점 -> 동적 바인딩 -> 각각의 자식 클래스에 오버라이딩된 메소드가 있을 경우, 알아서 해당 메소드가 실행됨
			 * 
			 * 동적 바인딩 성립 요건 = 상속 관계로 이루어져 다형성이 적용된 경우, 메소드 오버라이딩이 되어있으면 정적으로 바인딩된 메소드 코드보다 오버라이딩된 (자식의) 메소드 코드를 우선적으로 수행
			 *  cf. runtime 오류
			 */
		}

	} // main메소드 영역 끝

}
