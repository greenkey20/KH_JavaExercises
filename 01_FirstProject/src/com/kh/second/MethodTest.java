package src.com.kh.second;

public class MethodTest { //MethodTest라는 클래스 영역 시작
	
	public void methodA() { //methodA라는 메소드 영역 시작 
		System.out.println("메소드 A 호출!");
	} //methodA 메소드 영역 끝
	
	public void methodB() { //methodB라는 메소드 영역 시작 
		System.out.println("메소드 B 호출!");
	} //methodB 메소드 영역 끝
	
	public void methodC() { //methodC라는 메소드 영역 시작 
		System.out.println("메소드 C 호출!");
	} //methodC 메소드 영역 끝

	// 클래스에 main() method가 꼭 있을 필요 없음; 없는 경우 많음
	// 클래스마다 역할이 다름(앞으로 실행 클래스와 기능 클래스 구분할 것임) -> 이 클래스의 실행은 다른 패키지/클래스(run)에서 하기로 함
	
} //MethodTest 클래스 영역 끝
