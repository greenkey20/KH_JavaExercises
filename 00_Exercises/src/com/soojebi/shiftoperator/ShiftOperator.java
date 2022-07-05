package com.soojebi.shiftoperator;

/**
 * @author greenpianorabbit
 * 2022.7.4(월) 23h45 정보처리기사 실기 프로그래밍 언어 활용 6-34
 * shift 연산자 = 피연산자의 2진수 표현의 각 자리를 오른쪽(>>) 또는 왼쪽(<<)으로 이동(shift)
 * 
 * 프로그램의 실행 속도 vs 코드의 가독성
 */
public class ShiftOperator {

	public static void main(String[] args) {
		System.out.println(8 >> 3); // 1
		System.out.println(3 << 2); // 12
	}

}
