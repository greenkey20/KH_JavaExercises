package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부

public class Student {
	
	// [필드부]
	/* 각 정보를 담는 부분
	 * 필드 == (클래스의) 멤버 변수 == 인스턴스변수 == 클래스(의) 변수 == 속성
	 * 접근제한자 자료형 필드이름;
	 */
	
	// 앞으로 클래스 안 필드 선언할 때는 private으로 설정
	private String name;
	private int age;
	private char gender;
	
	// [생성자부]
	
	// [메소드부]
	/* 각 기능을 구현하는 부분 
	 * 접근제한자 반환(return; 나를 부른 곳으로 돌아감)형(type) 메소드이름(자료형 매개변수명) {
	 * 		실행할 코드;
	 * }
	 * 접근제한자: 호출할 수 있는 범위를 제한해줌
	 * 반환형: 메소드의 결과값의 자료형 지정; return 시 나를 부른 곳으로 내가 들고/돌아갈 값; 갖고 돌아갈 것/돌려줄 값이 없으면 void 씀
	 * 매개변수: 메소드 호출 시 입력값으로 넣어주는 변수; 메소드 호출 시에는 '인자'라고 부름; 해당 메소드 실행 중에만 사용 가능한 변수; 생략 가능; 각기 다른 자료형으로 2개 이상의 값 입력 가능
	 */
	
	// setter 메소드: 데이터를 기록(대입) 및 수정(다른 값을 대입)하는 기능의 메소드
	/* 규칙
	 * 1. setter 메소드는 접근 가능하도록 만들어야 하기 때문에 public 접근제한자를 이용
	 * 2. set필드명으로 이름짓되, 낙타봉(camelCase) 표기법(=메소드 식별자 표기법) e.g. setName, setAge, setGender
	 * 3. 멤버변수/필드 하나당 하나의 setter 설정; 반드시 모든 필드에 대해서 전부 다 작성을 해줘야 함
	 */
	
	// 이름을 기록 및 수정할 수 있는 메소드; 매개변수로는 문자열만 입력 가능
	public void setName(String name) { // 반환할 것이 없으므로 void; Student처럼 생긴 객체의 이름을 대입/set하고자 함; 문자열인 name을 매개변수로 입력함
		this.name = name; // 이(this) 객체 필드에 매개변수로 입력한 값(여기서는 name)을 대입함 
	}
	
	// 나이를 기록 및 수정할 수 있는 메소드; 매개변수로는 정수만 입력 가능
	public void setAge(int age) {
		this.age = age;
	}
	
	// 성별을 기록 및 수정할 수 있는 메소드; 매개변수로는 문자 1개만 입력 가능
	public void setGender(char gender) {
		this.gender = gender;
		// 특정 영역 안에서는 해당 영역 안에 있는 지역변수 우선권이 있음 -> 여기서는 매개변수 gender가 우선권이 있음; this.를 붙이지 않으면 매개변수 gender로 인식이 됨
	}
	
	// System.out.print(this.name); // 받은 값을 출력해주는/보여주는 기능 != 값을 반환하는 것
	
	// getter 메소드: 데이터/값을 반환(나를 호출한 곳에 돌려줌)해주는 기능의 메소드
	/* 1. getter 메소드가 값을 전달해주어야 하므로 getter 메소드도 public 접근제한자 사용 
	 * 2. get필드명으로 이름짓되, 낙타봉 표기법 사용 e.g. getName, getAge
	 * 3. 반드시 모든 필드/멤버변수에 대해 다 작성해줘야 함
	 */
	
	// 객체의 name(이름)을 반환해주는 메소드 
	public String getName() { // 입력은 필요 없음
		return this.name; // 호출한 곳으로 돌아가는 법 = return 키워드 사용; 객체(this = 객체를 가리키는(?) 키워드)의 이름 반환하는 기능 수행
						  // return 결과값 -> 결과값을 돌려주겠다
						  // 메소드의 반환형과 결과값의 반환형이 동일한지 확인
	}
	
	// 객체의 나이를 반환해주는 메소드
	public int getAge() {
		return this.age;
	}
	
	// 객체의 성별을 반환해주는 메소드
	public char getGender() {
		return this.gender;
	}
	
	// 멤버변수의 접근제한자 private으로 바꾸고 + setter, getter 메소드 다 만들어줬으면 -> 캡슐화 끝
	
	// 이제 예쁘게 메소드
	
	public String information() {
		// return name, age, gender; // 결과값은 return 하나당 한 개이도록..
//		String info = name + "님의 나이는 " + age + "세이고, 성별은 " + gender + "입니다.";
//		return info;
		return name + "님의 나이는 " + age + "세이고, 성별은 " + gender + "입니다."; // 위와 같이 info라는 변수 안 써도 됨
	}

}
