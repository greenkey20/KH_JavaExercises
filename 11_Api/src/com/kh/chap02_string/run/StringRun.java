package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMethodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;
import com.kh.chap02_string.controller.ToUpperCaseController;

public class StringRun {

	public static void main(String[] args) {
		
		A_StringPoolTest strA = new A_StringPoolTest();
		
//		strA.method1();
//		strA.method2();
//		strA.method3();
//		strA.method4();
//		strA.method5();
		
		B_StringMethodTest strB = new B_StringMethodTest();
//		strB.method1();
//		strB.method2();
		
		C_StringTokenizerTest strC = new C_StringTokenizerTest();
//		strC.method1();
//		strC.method2();
		
		ToUpperCaseController tuc = new ToUpperCaseController();
		tuc.toUpperCase();

	}

}
