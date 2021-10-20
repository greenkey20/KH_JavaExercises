package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class Run {
	
	public static void main(String[] args) { // "main" 타이핑하고 ctrl+space 치고, 첫번째 옵션 선택하면 main 메서드 자동 생성
		
		A_If a = new A_If(); // ctrl+shift+o -> 3행 import 자동 입력
//		a.method1();
//		a.method2();
//		a.method3();
		
		B_Else b = new B_Else();
//		b.method1();
//		b.method2();
//		b.method3();
//		b.method4();
//		b.method5();
		
		C_Switch c = new C_Switch();
//		c.method1();
//		c.method2();
//		c.fruitMarket(); // c. = 해당/관련 클래스의 주소 -> 그 클래스 내 해당 메서드 호출&실행
		c.method4();

	}

}
