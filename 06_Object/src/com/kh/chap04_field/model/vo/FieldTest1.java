package com.kh.chap04_field.model.vo;

/* field: 클래스를 구성하는 요소(필드+메소드) 중 하나; 클래스 내부이지만 메소드 밖 영역에 정의됨; 어떠한 데이터를 저장하기 위한 역할(변수)
 * 
 * 변수 구분
 *  - 전역변수: 클래스 영역에 바로 선언하는 변수; 단, public static 키워드를 붙여야 함 -> 클래스 내(o)프로그램(x) 어디서나 (같은 의미로) 사용 가능
 *  - 지역변수: 클래스 영역 내의 특정한 구역(중괄호{} code block 내; 메소드, for문 등)에서만 사용 가능 e.g. for (int i = 0; 조건식; 증감식) { } -> 초기식에서 선언된 i도 지역변수
 * e.g. 같은 말(감자)이 다른 의미가 될 수 있음 -> 제주도에서만 고구마를 감자(감저)라고 부름(지역변수) vs 전국 어디서나 '감자'라고 하면 감자(구황작물 potato) 받을 수 있음(전역변수)
 * Java에서 전역변수는 존재하지 않음
 * 
 * 지금 당장은 기능 구현에 초점을 두지만, 성능과 연관되어 있어(-> 프로그램을 효율적으로 짤 수 있어) 메모리에 대해 아는 것은 궁극적으로 중요함
 * 
 * 1. 전역(global)변수(variable)
 * - 멤버변수/필드/인스턴스변수
 *  [생성 시점] new 키워드를 사용하여 해당 객체를 생성하는 순간 heap 메모리 영역에 할당됨
 *  [소멸 시점] 객체가 소멸될 때/reference count가 0이 될 때 -> garbage collector
 *   cf. 프로그램이 종료되기 전 객체 소멸 가능
 *   
 * - 클래스/static 변수: 진짜 전역변수; static이라는 예약어가 붙은 변수
 *  [생성 시점] 프로그램 실행과 동시에 메모리의 static 영역에 들어감/할당됨; 해당 객체가 생성이 안 되어도 무조건 프로그램 실행과 동시에 할당이 됨
 *  cf. 프로그램 실행하면 main메소드를 실행하러 감..
 *  [소멸 시점] 프로그램이 끝날 때
 *  
 * 2. 지역변수
 *  [생성 시점] 특정한 구역{} 실행 시 stack 메모리 영역에 할당
 *  [소멸 시점] 특정한 구역{} 종료 시 소멸
 */

public class FieldTest1 {
	
	private int global; // 멤버변수/필드/인스턴스변수; private = 클래스 내부에서 사용 가능
		
	public void test(int num) { // 여는 중괄호{ = test 메소드 영역의 시작
		// 지역변수 사용
		int local = 1; // 지역변수; 초기화를 반드시 해줘야 사용 가능; 변수 local이 살아있는 범위 = 선언 ~ test 메소드 영역 끝
		
		System.out.println(global); // 멤버변수; 클래스 내부에서 사용 가능
		System.out.println(local); // 지역변수
		System.out.println(num); // 지역변수(test 메소드 영역 안에서만 사용 가능)이자 매개변수
			
	} // test 메소드 영역의 끝

}
