package com.kh.chap02.loop.run;

import com.kh.chap02.loop.A_For;
import com.kh.chap02.loop.B_While;
import com.kh.chap02.loop.C_DoWhile;

public class Run {
	
	public static void main(String[] args) {
		A_For a = new A_For(); // 클래스 A_For에 a라는 별명을 붙여 사용하겠다
//		a.method1(); 
//		a.method2();
//		a.gugudan();
		
//		String str = "안녕";
//		str.gugudan(); // gugudan이라는 메서드는 A_For라는 클래스에 대해서만 사용할 수 있는 것 -> 메서드는 특정 클래스에 들어가있는 기능 
		// 정수끼리 할 수 있는 기능 = 산술연산(+, -, *, /, %)
		// 문자열끼리 할 수 있는 기능 = +, equals. (o) -, *, /, % (x)
		
//		a.method5();
		
		B_While b = new B_While();
//		b.method1();
//		b.methodSum();
//		b.method2();
//		b.method3();
//		b.method4();
//		b.method5();
		
		C_DoWhile c = new C_DoWhile();
//		c.method1();
//		c.method2();
		c.method3();
		
	}

}
