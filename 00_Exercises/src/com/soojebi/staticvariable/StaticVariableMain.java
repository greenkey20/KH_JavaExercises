package com.soojebi.staticvariable;

/**
 * @author greenpianorabbit
 * 2022.6.23(목) 20h50 정보처리기사 실기 프로그래밍 언어 활용 6-8
 */
public class StaticVariableMain {

	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		
		sv.count++;
		System.out.println(sv.count); // 1
		
		sv.count++;
		System.out.println(sv.count); // 2
	}

}
