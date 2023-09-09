package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	// String클래스 = 참조자료형; 4bytes 크기; 불변/변하지 않는/immutable 클래스 = 수정하는 순간 기존의 값이 담겨져있는 공간에서 수정되지 않음
	// pool = 수영장; 담는 용기 같은 것..
	
	/* String클래스 형태의 객체 생성 방법
	 * 방법1) new 키워드로 생성자 호출
	 * 방법2) 대입연산자를 통해 직접 값을 넣어서 생성
	 * String a = "hi";
	 */
	
	// 방법1) 생성자를 통해서 문자열 담기 -> 이건 안 좋은/나쁜 방법이니까 이렇게 쓰지 말 것
	public void method1() { // method1 영역 시작
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		// toString() = Object클래스 것 = String자료형으로 반환 -> 오버라이딩해서 씀
		// String클래스는 제공되는 API + toString() 오버라이딩 되어있음; String클래스의 toString() 메소드의 경우 실제 담겨있는 문자열을 반환하게끔 오버라이딩이 되어있음
		System.out.println(str1/*.toString()*/);
		System.out.println(str2); // toString() 메소드를 오버라이딩 하지 않은 경우 클래스로 객체 만들었을 때는 그 객체의 주소값 반환하는데, String자료형의 변수 str2는 왜 내용물이 출력되는가?
		/* This object (which is already a string!) is itself returned.
	     * @return  the string itself.
	    public String toString() {
	        return this;
	    }
	    */
		
		// equals() 메소드
		System.out.println(str1.equals(str2));
		// 결과값이 true인 경우 문자열의 내용을 비교해봤는데 동일함
		// 2. String클래스의 equals() 메소드의 경우, 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되어있음
		/*
		public boolean equals(Object anObject) {
	        if (this == anObject) {
	            return true;
	        }
	        if (anObject instanceof String) {
	            String aString = (String)anObject;
	            if (!COMPACT_STRINGS || this.coder == aString.coder) {
	                return StringLatin1.equals(value, aString.value);
	            }
	        }
	        return false;
	    }
	    */
		
		// hashCode() = 원래 Object클래스의 메소드로, 16진수의 주소값을 10진수 정수로 변환해서 int형 반환해주는 메소드 -> 10진수 정수 형태의 주소값을 볼 수 있음
		// String클래스의 hashCode()는 주소값(x) (객체 안에) 실제 담긴 문자열(o)을 (기반으로) 해시코드 값을 만들어서/10진수로 hashing해서/정수형으로 변환해서 반환하도록 오버라이딩 되어있음
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		// String클래스 + ctrl + 클릭해서 들어가서 public int hashCode() 찾아봤는데요, 해석이 잘 안 됩니다만, 
		
		// String자료형/클래스의 진짜 주소값을 알고 싶다면 System.identityHashCode(참조형변수명) -> 실제 주소값의 해시코드를 출력
		System.out.println(System.identityHashCode(str1)); // 123961122
		System.out.println(System.identityHashCode(str2)); // 1227229563
		// str1과 str2의 주소값이 다름을 확인할 수 있음 -> str1과 str2는 다른 객체
		
		// 주소값 동등비교하는 보다 간단한 방법 = 동등비교연산자 사용
		System.out.println(str1 == str2); // false
		
		// 한 번 hashing한/10진수로 바꾼 주소값을 16진수로 바꾸는 것은 일반 PC로는 불가능/슈퍼컴퓨터/양자컴퓨터로는 가능할 수 있음 <- hashing 과정은 hashing 알고리즘 만든 사람만 앎 + 되돌리기 어렵도록 salt(Java에서는 hash 만들어진 시간) 뿌림
		
	} // method1 영역 끝
	
	// 방법2) 문자열을 리터럴로 생성; 대입연산자를 통해 직접 값을 넣어서 생성
	public void method2() { // method2 영역 시작
		
		String str1 = "hello"; // String Pool에 들어감
		String str2 = "hello";
		
		// toString() 메소드
		System.out.println(str1);
		System.out.println(str2);
		
		// equals() 메소드 -> String클래스에서 오버라이딩함 -> 문자열의 내용/리터럴 비교
		System.out.println(str1.equals(str2)); // true
		
		// hashCode() 메소드
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		
		// System클래스의 identityHashCode() 메소드 -> 객체의 진짜 주소값 확인 가능
		System.out.println(System.identityHashCode(str1)); // 123961122
		System.out.println(System.identityHashCode(str2)); // 123961122
		// str1과 str2의 주소값이 같다?!
		
		System.out.println(str1 == str2); // true
		
	} // method2 영역 끝
	
	// String클래스, String Pool
	
	public void method3() {
		
		String str1 = "hello"; // 이렇게 리터럴 대입 시 리터럴은 String Pool 영역에 올라감 -> String Pool의 특징 = 동일한 내용의 문자열이 존재 불가능
		String str2 = new String("hello"); // 메모리의 낭비가 굉장히 심해질 수 있어서 사용 지양
		
		System.out.println(System.identityHashCode(str1)); // 653305407
		
		// String자료형은 '불변클래스'
		str1 = "see you";
		System.out.println(System.identityHashCode(str1)); // 1227229563
		
		// 연결이 끊긴 문자열들은 garbage collector가 알아서 정리해줌
		// 불변 = 아예 수정이 안 되는 것이 아니라, 매번 새로운 주소값을 참조한다는 뜻
		str1 += "abc";
		System.out.println(System.identityHashCode(str1)); // 1982791261
		str1 += "abc";
		System.out.println(System.identityHashCode(str1)); // 1562557367
		// 문자열을 더할 때마다 heap 영역에 계속 새로운 객체가 생김 -> 주소값이 계속 바뀜 = 비효율적인 메모리 사용
		
		String a = "a";
		String b = "a";
		System.out.println("결과 : " + a); // "결과 : a"라는 문자열
		System.out.println("결과 : " + a == b); // false
		// stack 영역에 a와 b
		// heap 영역 > string pool
		
		a = "a";
		b = "a";
		System.out.println("결과 : " + (a == b)); // 결과 : true; String자료형 다룰 때 연산자 우선순위, () 등 매우 중요함
		
		a = "a";
		b = "b";
		System.out.println("결과 : " + (a == b)); // 결과 : false
		
	}
	
	public void method4() {
		// 문자열(String)은 안의 내용이 변경될 때마다 새로운 공간을 할당하고 새로 집어넣음
		// vs 이를 막기 위해 임시공간(buffer)을 하나 준비해서 임시공간에 차곡차곡 담아두었다가 한 번에 처리해주는 클래스 = StringBuffer, StringBuilder
		// 성능 : String 더하기 < StringBuffer << StringBuilder(속도/성능 2배 정도 더 빠름)
		// cf. 속도 비교를 위해 for문 50만번 돌려보자..
	
		// StringBuffer클래스 -> 주소값 변하지 않음; 메모리의 낭비 없음
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		System.out.println("Hello".hashCode()); // 69609650
		System.out.println(sb); // Hello
		System.out.println(sb.hashCode()); // 1227229563
		
		sb.append(" World!");
		System.out.println("Hello World!".hashCode()); // -969099747
		System.out.println(sb); // Hello World!
		System.out.println(sb.hashCode()); // 1227229563
		
		String str = sb.toString();
		System.out.println("결과 : " + sb); // 결과 : Hello World!
		System.out.println("결과 : " + str); // 결과 : Hello World!
		
	}
	
	public void method5() {
		
		// StringBuilder
		// StringBuffer는 동시 제어(thread safe) 기능이 있음; 컴퓨터가 random 메소드 돌려서 배분(?)
		// 하지만 간단한 프로그램 구현 시, 또는 third-party 사용하는데 그 다른 프로그램에서 동시 제어 기능을 제공하는 바 내 Java codes에서 동시 제어 기능 구현할 필요 없는 경우 등 굳이 buffer 사용 필요 없음; buffer 사용은 too much
		// 이 기능만 쏙 뺀 클래스가 필요했는데 그게 StringBuilding
		// buffer와 builder의 논리적 구조(?)는 동일
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		System.out.println("Hello".hashCode()); // 69609650
		System.out.println(sb); // Hello
		System.out.println(sb.hashCode()); // 123961122
		
		sb.append(" World!");
		System.out.println("Hello World!".hashCode()); // -969099747
		System.out.println(sb); // Hello World!
		System.out.println(sb.hashCode()); // 123961122
		
		System.out.println("결과 : " + sb); // 결과 : Hello World!
		
	}

}
