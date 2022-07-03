package com.kh.variable.run;

// 다른 클래스에 있는 메소드를 호출(call) 시
import com.kh.variable.A_Variable; // step1) 내가 사용하고자 하는 클래스의 경로 명기해서 import
								   // 다른 프로젝트에 있는 것은 import 못 불러옴
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.casting.Example;

public class Run {
	
	public static void main(String[] args) {
		
		// A_Variable 클래스의 calPay 메소드 사용하기
		A_Variable a = new A_Variable(); // step2) 클래스를 대표하는 이름(a; a에는 주소가 들어있음; a도 변수) -> 생성
		
//		a.calPay();	// . = (a에 들어있는 주소에) 접근/참조		
//		a.declareVariable();
//		a.constant();
		
		B_KeyboardInput b = new B_KeyboardInput();
//		b.inputTest();
//		b.inputTest2();
		
		Example e = new Example();
//		e.autoCasting();
		e.forceCasting();
	}

}
