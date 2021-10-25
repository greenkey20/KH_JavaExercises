package com.kh.chap01.abstraction.model.vo;

/* 클래스의 구조
 * public class 클래스이름(대문자로 시작) {
 * 		// field부
 * 
 * 		// 생성자(constructor)부
 * 
 * 		// method부
 * 
 * }
 */

// 토끼들을 추상화(abstraction)해서 만든 클래스(토끼가 어떻게 생겼는지 성질 등)
public class Rabbit {
	// Rabbit 클래스의 모양 만들기
	
	// [필드부]
	// 토끼들의 성질은 아주 많지만, 특정 토끼를 구분하기 위해 필요한 성질 추출 = 멤버변수
	// 접근제한자 자료형(기본+사용자 정의) 필드(= 멤버변수 = 변수)이름;
	// 접근제한자: 이 필드에 접근할 수 있는 범위를 제한할 수 있음; public(공공의 -> 외부(다른 패키지)에서 사용 가능) > protected > default > private(개인의, 사적인 -> 직접 접근 막힘;가장 많이 쓸 것임); 클래스 안에서 필드 선언 시 반드시 접근제한자 써줘야 함
	public String name; // public = 다른 패키지에서도 이 클래스를 접근할 수 있도록 하는 접근(access)제어/한자(modifier)
	public int age;
	public double weight;
	public char gender;
	public boolean isBig;
	public String eyesColor;
	public String noseColor;
	public String bodyColor;
	public String dressColor;
	
	// [생성자부]
	
	// [메소드부]
	// 토끼의 성질을 변화시킬 토끼의 행동 = 메소드
	public void eat(int weight) { // 토끼 객체의 체중(성질)을 변화시키는 행동
								  // 괄호 안 = 마술상자/메소드에 들어올 input; 자료형도 입력
		this.weight += weight; // 토끼 체중은 계속 늘어나는 게 가능한 것으로 해둠
		// this. = 이것(토끼 객체)의 체중 != 입력값으로 들어오는 체중
		// 좌항의 weight는 형광하늘색(클래스의 멤버변수) vs 우항의 weight는 군청하늘색(메소드에 input됨) 
	}
	
	public void jump() {
		if ( weight > 200 && weight > 10.39) { // 체중은 무한히 감소할 수 없으므로 조건 걸기 -> 조건문; 토끼의 최소 건강 체중 && 빼려고 하는 무게보다 클 때
			weight -= 10.39;
		} else {
			System.out.println("더 살 못 빼요, 밥 주세요~");
		}
	}
	// 컴퓨터는 실수를 완벽히 표현하지 못함 -> double형 마지막 자리에 작은 숫자가 남아서, 예상한 값과 달리 소숫점 아래 작은 수가 나타남 
	
	/* 숙제1(필수): 나만의 클래스 3개 만들고, 클래스마다 객체 2개 이상씩 생성 
	 * 클래스 안의 멤버변수는 최소 3개 이상
	 * 클래스 안의 메소드는 최소 2개 이상
	 * 메소드 호출해서 객체 상태 변경 + 잘 작동하는지 확인
	 * 
	 * 숙제2(선택): 문제4개
	 */

}
