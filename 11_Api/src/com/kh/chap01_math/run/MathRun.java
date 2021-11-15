package com.kh.chap01_math.run;

// import.java.lang.*;
// java.lang = Java 프로그래밍하면서 필수적인 클래스들을 모아둔 패키지 -> 생략 가능; 내 눈에 보이지는 않지만 항상 import됨

public class MathRun {

	public static void main(String[] args) {
		
		// API(Application Programming Interface): 프로그램을 짜기/applications를 프로그래밍하기 위한 인터페이스(내가 생각해본 것); 언어적 측면에서 제공 + 사용자는 세부(구성)내용 몰라도 됨
		// Application = Java로 내가 만드는 프로그램
		
		System.out.println("Hello, Java world!");
		/* 클래스명 위에 Ctrl 누르고 클릭하면 상세 설명 페이지로 이동
		 * 기본생성자의 접근제한자 = private -> 기본생성자로 System클래스의 객체 생성 불가능
		 * 만약 System클래스가 없었다면 이런 클래스 및 출력 기능을 개발자가 만들었어야 함
		 */
		
		// Object클래스는 모든 클래스의 최상위 = 모든 클래스는 Object클래스를 상속받음 -> 모든 클래스는 Object타입으로 형 변환 가능
		
		// Math클래스: 수학 관련 -> Math 클래스에서 제공하는 유용한 기능들 살펴보기
		/* Math클래스의 특징
		 * java.lang이라는 패키지 안에 존재
		 * 모든 필드와 메소드(의 접근제한자)가 static으로 되어있음 -> static 메모리 = 프로그램 시작~끝 사용 가능 -> 객체 생성 없이 사용 가능/객체 생성할 필요 없음 = 굳이 생성자 필요 없음
		 * 객체 생성할 필요 없으므로, 생성자(의 접근제한자) = private
		 * 
		 * cf. '모든 것이 static으로 되어있음' 관련: design patterns 중의 하나 = Singleton(싱글톤) pattern: 프로그램 실행과 동시에 메모리 영역에 올려놓고 재사용하는 개념; 객체 하나만으로 어디에서든지 가져다 쓸 수 있는 개념; 공유
		 * 싱글톤패턴의 개념은 JDBC할 때 배울 것임
		 */
		
		// 필드
		// PI = Math클래스 내의 상수필드로 정의되어 있음
		System.out.println("파이 : " + Math.PI);
		
		// 메소드
		// API의 메소드는 오버로딩이 많이 되어있음
		// 사용 가능한 메소드 종류, 사용법 등 잘 모르겠으면 API 문서를 먼저 찾아보기
		// 메소드명(매개변수 타입)
		// 1. 올림 = Math.ceil(double) -> 반환형 = double
		double num1 = 4.42424;
		System.out.println("올림 : " + Math.ceil(num1)
		);
		
		// 2. 반올림 = Math.round(double) -> 반환형 = long
		System.out.println("반올림 : " + Math.round(num1));
		
		// 3. 버림 = Math.floor(double) -> 반환형 = double
		System.out.println("올림 : " + Math.floor(num1));
		
		// 코드 분석하기? 설명 제대로 못들음
		
		// 4. 절대값 = Math.abs(int/long/double/float) -> 반환형 = int/long/double/float 그대로
		int num2 = -14; 
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 5. 최소값 = Math.min(int, int) -> 반환형 = int
		System.out.println("최소값 : " + Math.min(5, 10));
		
		// 6. 최대값 = Math.max(int, int) -> 반환형 = int (vs 코드 쓸 때 자동완성 내용 보니 double, float 매개변수도 가능한 듯?)
		System.out.println("최대값 : " + Math.max(num1, num2)); // double, int 비교도 가능한 듯?
		
		// 7. 제곱근(루트) = Math.sqrt(double) -> 반환형 = double
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 8. 제곱 = Math.pow(double, doubl) -> 반환형 = double
		System.out.println("2의 5 제곱 : " + Math.pow(2, 5));

	}

}
