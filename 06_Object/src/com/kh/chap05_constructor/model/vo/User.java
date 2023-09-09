package com.kh.chap05_constructor.model.vo;

public class User {
	
	/* User 클래스의 객체 생성: User go = new User();
	 * 객체 생성 시 new(새로 만든다)라는 키워드 뒤 '클래스명()' 이게 생성자(constructor)
	 * 
	 * 대입연산자(=): 우항의 값을 좌항의 공간에 대입 -> User 클래스의 go 객체에 User()의 값을 대입
	 */
	
	// [필드부]
	// 회원 ID, 비밀번호, 이름, 나이, 성별
	// 캡슐화 단계1) 값 숨기기
	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	
	// [생성자부]
	/* 생성자: 메소드 이름이 클래스 이름과 동일하고, return(반환)자료형/반환형이 없는(void) 메소드 + 객체 생성 시/new 키워드 사용 시 호출이 되는 메소드
	 * 
	 * 표현법
	 * public(외부에서도 접근 가능해야 하므로) 클래스이름(대문자로 시작)(매개변수는 생략 가능; 매개변수가 있도록 만드는 것이 좋음) {
	 * 		해당 생성자를 통해 객체 생성 시 실행하고자 하는 코드 e.g. 필드 초기화 등
	 * }
	 * 
	 * cf. 메소드의 표현법
	 * 접근제한자 반환형 메소드이름(매개변수(생략 가능)) {
	 * }
	 * 
	 * 작성 목적
	 * 1. 객체 생성해주기 위한 목적
	 * 2. 객체 생성 뿐만 아니라 매개변수로 전달된 값들을 바로 필드에 초기화할 (수 있도록 하는) 목적
	 * 
	 * 종류
	 * 1. 매개변수가 없는 생성자 = 기본 생성자
	 * 2. 매개변수가 있는 생성자
	 * 차이점: 필드에 값을 초기화할 수 있나 없나의 차이
	 * 
	 * 작성 시 주의사항
	 * 1. 반드시 생성자의 이름은 클래스의 이름과 동일(대/소문자)
	 * 2. 반환형 존재하지 않음(메소드와 유사하게 생겨서 헷갈릴 수 있음)
	 * 3. 생성자는 여러 개 생성 가능하지만, 매개변수가 중복이 되면 안됨(overloading)
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본 생성자를 JVM이 안 만들어줌 -> 기본 생성자를 만드는 습관을 들이는 것이 좋음
	 */
	
//	public User() { // 기본 생성자: 매개변수가 없음
//		/* 단지 객체를 생성할 목적으로 사용 -> 메모리 공간이 할당될 때, 공간 확보할 때..
//		 * 기본 생성자는 작성 생략해도 오류 안 남 <- 생성자를 하나도 안 만들면 JVM이 기본 생성자를 자동으로 만들어줌(사람들이 자주 빼먹으니까 자동 생성되도록 기능으로 넣음) 
//		 */
//		System.out.println("생성자 호출 잘 되었나요?");
//	}
	
	// 아래 (생성자) 메소드 이름이 모두 같고, 매개변수의 갯수와 자료형이 다름 = 오버로딩(overloading); 메소드 호출(loading) 시 여러 가지 방법으로 부를 수 있음
	public User() {} // 이 기본 생성자 꼭 만들기; 특히 매개변수 있는 생성자를 만들면 JVM은 기본 생성자를 자동으로 안 만들어주므로 주의
	
	// 매개변수가 있는 생성자; 생성자의 매개변수로는 필드들이 들어올 수 있음; 매개변수 있는 생성자 2개 만든 것은 메소드 overloading
	public User(String userId, String userPwd, String name) { // 객체에 초기값을 넣어줄 목적으로 매개변수 있는 생성자
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
	}
	
	public User(String userId, String userPwd, String name, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// [메소드부]
	// 캡슐화 단계2) getter, setter 메소드 만들기
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return name + "님의 ID는 " + userId + ", 비밀번호는 " + userPwd + ", 나이는 " + age + "세, 성별은 " + gender;
	}

}
