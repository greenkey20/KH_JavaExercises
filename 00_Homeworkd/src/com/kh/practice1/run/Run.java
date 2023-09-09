package src.com.kh.practice1.run;

import com.kh.practice1.func.VariablePractice1; // main 메서드에서 접근할 클래스의 경로를 써서 불러옴

public class Run { // Run 클래스 영역 시작
	
	public static void main(String[] args) { // main 메서드 영역 시작
		
		VariablePractice1 vp1 = new VariablePractice1(); // 변수과제1 풀이 소스코드를 포함하고 있는 클래스 "VariablePractice1"의 별명을 짓고 여기서 사용할 수 있도록 함
		
		vp1.methodQ1(); // "VariablePractice1" 클래스의 methodQ1 메서드 호출
		vp1.methodQ2(); // "VariablePractice1" 클래스의 methodQ2 메서드 호출
		vp1.methodQ3(); // "VariablePractice1" 클래스의 methodQ3 메서드 호출
		vp1.methodQ4(); // "VariablePractice1" 클래스의 methodQ4 메서드 호출
		
	} // main 메서드 영역 끝

} // Run 클래스 영역 끝
