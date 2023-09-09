package com.kh.chap01_math.run;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DoubleArithmetic {

	public static void main(String[] args) {
		System.out.println("[double형으로 표현된 실수의 사칙연산]");
		double num1 = 13.44;
		double num2 = 2.44;
		
		System.out.println("첫번째 실수 = " + num1); // 13.44
		System.out.println("두번째 실수 = " + num2); // 2.44
		
		System.out.println("덧셈 : " + (num1 + num2)); // 15.879999999999999
		System.out.println("뺄셈 : " + (num1 - num2)); // 11.0
		System.out.println("곱셈 : " + (num1 * num2)); // 32.7936
		System.out.println("나눗셈 : " + (num1 / num2)); // 5.508196721311475
		System.out.println("나머지 : " + (num1 % num2)); // 1.2399999999999998
		System.out.println();
		
		System.out.println("[BigDecimal 클래스를 이용한 실수의 사칙연산]");
		// java.math.BigDecimal 클래스를 이용 -> 정수를 이용해서 실수를 표현 -> 실수형 자료형의 정밀도, 오차 등을 보완할 수 있음 
		
		// BigDecimal의 생성: 일반적으로 문자열로 숫자를 표현함
		BigDecimal bd1 = new BigDecimal("14.578");
		BigDecimal bd2 = new BigDecimal("2.8937");
		System.out.println("첫번째 실수 = " + bd1.setScale(4)); // bd2와 소수점 아래 자리 맞춰서 표시하기 위해 scale 변경함
		System.out.println("두번째 실수 = " + bd2);
		// double형 값을 매개변수로 갖는 생성자를 사용하면 오차가 발생할 수 있으므로 주의하기
		
		// 사칙연산
		System.out.println("덧셈 : " + bd1.add(bd2)); // 17.4717
		System.out.println("뺄셈 : " + bd1.subtract(bd2)); // 11.6843
		System.out.println("곱셈 : " + bd1.multiply(bd2)); // 42.1843586
		System.out.println("나눗셈 : " + bd1.divide(bd2, 10, RoundingMode.HALF_UP)); // 5.0378408266; bd1(분자, numerator)을 bd2(분모, denominator, divisor)로 나눈 결과를 소수점 아래 10자리까지 표시하되, 반올림 시 5 이상은 올림, 5 미만은 버림으로 처리; Windows 계산기 결과 = 5.037840826623354
		// 나눗셈한 결과가 무한소수인 경우 반올림 모드를 지정해주어야 함; otherwise "ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result"
		// BigDecimal이 오차없이 실수를 저장하기 위한 자료형이지만, 나눗셈에서 발생하는 오차는 어쩔 수 없음
		System.out.println("나머지 : " + bd1.remainder(bd2)); // 0.1095
		System.out.println("나머지 : " + bd1.remainder(bd2, MathContext.DECIMAL128)); // 0.1095
		
		/* 2021.11.16(화) 숙제 소감
		 * 풀이 과정: 숙제를 하기 전 '자바의 정석' 책을 뒤적이다 우연히 BigDecimal 부분을 보게 되어 문제를 해결할 수 있었는데, 다음부터 새로운 것을 배워야 할 때는 좀 더 적극적으로, 그리고 정확한 키워드로, 구글링해서 찾아내야겠다는 다짐을 하게 되었습니다.
		 * 풀이 결과: 14.578 및 2.8937 double형 실수의 덧셈, 뺄셈, 나눗셈 결과가 정상적으로(?) 나온 것 같은데, 왜 그런 것인지 궁금해졌습니다..
		 * 
		 * 보완할 점: 사용자로부터 실수값 입력받아 연산하는 계산기 형태로 만들어보기 
		 * 추가로 공부할 것: BigInteger, MathContext, DecimalFormat, 실수의 나머지/모듈로 연산
		 */
		
	}

}
