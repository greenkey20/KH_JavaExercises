// 2021.11.19(금) 9h
package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	
	// [필드부]
	private String name;
	private int age;
	private int score;
	
	// [생성자부]
	// 기본 생성자
	public Student() {
		super();
	}

	// 모든 필드를 매개변수로 받는 생성자 
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// [메소드부]
	// getter, setter
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	// 객체 중복 방지를 위한 hashCode() 및 equals() 오버라이딩 -> 자주 쓰는 바, 자동완성 기능 제공됨
	// 직접 만든 것
	/*
	@Override
	public int hashCode() {
		return (name + age + score).hashCode();
		// return절의 hashCode()가 어떤 일을 하는지 모름(hash알고리즘 만든 사람만 앎)
		// 원래 hashCode() = 객체들의 16진수 표시 주소를 10진수 정수값으로 변환 
		// 내가 오버라이딩한 hashCode() = Student클래스의 필드들 더한 값을 해싱 -> name, age, score가 같은 객체이면 같은 해시코드가 나옴
	}
	
	@Override
	public boolean equals(Object obj) {
		// equals() 메소드를 통해 비교대상이 될 매개변수를 Student std로 쓰자 오류 메시지 'The method equals(Student) of type Student must override or implement a supertype method'
		// vs Object클래스의 equals()의 매개변수는 Object클래스 -> 오버라이딩하려면 매개변수 같아야 함(맞나? 정확히 못 들었고 이해 못함)
		
		Student other = (Student)obj;
		
		if (!this.name.equals(other.name) || this.age != other.age || this.score != other.score) { // 이름, 나이, 점수 중 하나라도 다르면 다른 사람
			return false;
		}
		
		// 여기서 더 처리해줘야 하는 부분 = Student클래스를 상속받는 Student2클래스가 있어서 Student2 클래스를 이용해서 객체를 생성하는 경우, 미피1 객체의 필드값들도 상속받음 -> 이런 경우(? 강사님 설명 정확히 이해 못함) 처리해줘야 함
		
		// 모든 조건이 불일치하면 true 반환
		return true;
	}
	*/
	
	// 자동완성(Source > Generate hashCode() and equals()) 오버라이딩 메소드: 촘촘함..
	// lines가 늘어나도 연산이 줄어들면 좋은 코드
	@Override
	public int hashCode() { // 10h45 강사님께서 아래 코드 설명해주신 내용 잘 못 들음 ㅠ.ㅠ
		final int prime = 31; // 상수인데 왜 대문자로 안 썼나? -> Java 만든 사람에게 가서 물어봐야 함
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) // 현재 객체와 비교 객체의 주소값이 일치하는가? 
			return true; // 주소값 일치 = 같은 곳을 가리키고 있음 = 모든 필드값 일치
		if (obj == null) // 비교 대상이 null인가?
			return false; // 비교 대상이 null이면 비교할 필요 없음 -> false 반환
		if (getClass() != obj.getClass()) // getClass() 메소드로 타입 비교
			return false; // 타입이 다르면 false 반환
		
		// 위 3가지 조건을 만족하지 않았을 경우, 아래 조건문들로 각 객체의 내용물들 모두 비교
		// 아래 조건문 중 하나라도 걸리면 false/다른 객체로 빠져나가게 함
		Student other = (Student) obj;
		
		if (age != other.age) // 현재 객체와 인자로 받은 객체의 나이가 다른 경우
			return false;
		if (name == null) { // 현재 객체의 이름 값이 null인 경우
			if (other.name != null) // 비교 객체의 이름 값이 null이 아닌 경우
				return false;
		} else if (!name.equals(other.name)) // 현재 객체와 비교 객체의 이름 값이 다른 경우
			return false;
		if (score != other.score) // 현재 객체와 비교 객체의 점수가 다른 경우
			return false;
		
		// 모든 경우를 빗겨나갔을 경우 = 모든 것이 같은 경우, 같은 객체로 판단하고 true 반환
		return true;
	}

}
