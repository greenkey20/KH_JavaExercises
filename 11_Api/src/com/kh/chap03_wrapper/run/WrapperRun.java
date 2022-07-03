// 2021.11.17(수) 9h
package com.kh.chap03_wrapper.run;

// 주류 객체 지향(객체들을 다루며 프로그래밍함 <- 캡슐화, 상속, 다형성 등 지원) 언어 = Java, C++, C#(?) 
// 객체 = 참조자료형

public class WrapperRun {

	public static void main(String[] args) {
		/* Wrapper 클래스 -> 기본자료형(boolean, char, byte, short, int, long, float, double)을 객체로 포장해줌
		 * 
		 * 기본 자료형 <----> Wrapper 클래스
		 * boolean			Boolean
		 * char				Character
		 * byte				Byte
		 * short			Short
		 * int				Integer
		 * long				Long
		 * float			Float
		 * double			Double
		 * 
		 * 기본자료형을 객체로 취급해야 하는 경우
		 * 1. 메소드 호출 시; 기본자료형에 대해 메소드를 사용하고 싶을 때
		 * 2. 메소드의 매개변수로 기본자료형이 아닌 객체 타입만 요구될 때
		 * 3. 다형성을 적용시키고 싶을 때
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// num1과 num2를 동등비교하고 싶다면?
		System.out.println(num1 == num2); // 동등비교 연산자(기본자료형에 사용 가능) 사용
		// System.out.println(num1.equals(num2)); // equals() 메소드 = Object클래스의 것; 객체들의 주소값을 비교해서 같으면 true, 다르면 false return
		// 모든 클래스는 Object클래스를 상속받고 있기 때문에 모든 클래스는 equals() 메소드를 상속받고 있음/사용 가능
		
		// 객체 생성으로 변환하는 방법(제목이 이게 맞나?)
		// Integer i1 = new Integer(num1); // 방법1) 생성자 사용 -> "The constructor Integer(int) is deprecated(유지보수가 중단되어, 사용이 권장되지 않는)"; 지금(Amazon에서 다운받은 Java Development Kit 8)은 사용 가능하나, 조금 지나면 못 쓰게 될 거니까 사용 권장하지 않는 방법임 (-> 다른 방법 사용 권장); 이런 경고가 있었음을 개발자가 알고 있어야 함
		// 지역변수 i1에 노란줄 = 사용 안 하는데 왜 선언했는지 경고문 보내줌; "The value of the local variable i1 is not used"
		
		// 방법2) Wrapper 클래스로 변환하여 사용: 기본자료형을 Wrapper 클래스 자료형에 대입(?)(auto boxing)
		Integer i1 = num1;
		Integer i2 = num2;
		// int num5 = i1.intValue(); // 원래는 이렇게 (Wrapper 클래스로?) 변환해야 하는데, 귀찮으니까 윗줄처럼 간편하게 쓰자
		System.out.println(i1.equals(i2)); // i1, i2가 주소값을 가지게 되어 equals() 메소드 사용 가능하게 됨 -> 두 객체는 다른 주소값을 가짐; 다른 객체임
		System.out.println(i1.compareTo(i2)); // a.compareTo(b) : a가 b보다 크면 1 반환; a가 b보다 작으면 -1 반환; a와 b가 같으면 0 반환
		// 나의 질문 = compareTo는 숫자 리터럴을 비교하는 건가요? 주소값을 비교하는 건가요?
		
		// 문자열을 Integer 타입으로 바꾸고 싶을 때 생성자 사용
		// Integer i3 = "123"; // 정수만 auto boxing 가능; 이 경우는 세트가 아니라서 안 됨
		Integer i3 = new Integer("123");
		
		// Wrapper 클래스 자료형을 기본자료형으로 바꿈 = unboxing
		int num3 = i1;
		int num4 = i2;
		System.out.println("num3 + num4 : " + (num3 + num4));
		
		// 기본자료형 <----> String
		String str1 = "10"; // int형
		String str2 = "15.0"; // double형
		
		System.out.println(str1 + str2); // 문자열과 어떤 다른 타입의 피연산자를 + 하면 문자열로 더해짐; 1015.0
		
		/* 1. String을 기본자료형으로 parsing(어구의 해부, 문의 분석 -> 알아먹게 바꿈)
		 * Java에서 parser는 메소드로 구현되어 있음
		 * 표현법: 해당Wrapper클래스이름.parse기본자료형XXX(변환할문자열);
		 */
		
		int i = Integer.parseInt(str1); // "10" -> 10
		double d = Double.parseDouble(str2); // "15.0" -> 15.0
		
		System.out.println(i + d); // 25.0
		
		// 2. 기본자료형을 String형으로: String.valueOf(변환할기본자료형값) -> 반환형 = String
		String strI = String.valueOf(i); // 10 -> "10"
		String strD = String.valueOf(d); // 15.0 -> "15.0"
		
		System.out.println(strI + strD); // 1015.0
		// String.valueOf 등 API 문서 많이/자주 읽기; API 문서 읽기/숙지 -> 업무시간 단축

	}

}
