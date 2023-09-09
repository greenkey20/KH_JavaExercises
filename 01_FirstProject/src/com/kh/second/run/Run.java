package src.com.kh.second.run;

// 다른 클래스에 있는 메소드를 호출(call) 시
import src.com.kh.second.MethodTest; // step1) import문: (같은 프로젝트 내) 해당 패키지(위치)에 있는 다른 클래스를 가져다 씀; "import 위치.클래스명;"으로 씀
								 // . 참조연산자(하위 위치 의미)
import src.com.kh.first.HelloWorld;

public class Run { // 클래스 Run 영역 시작
	public static void main(String[] args) { // main() 메서드 영역 시작
		// MethodTest 클래스를 import 해왔지만, 아직 메서드 public void methodA(); 객체를 생성해주지 않음
		// -> 호출/사용하기 위해서는 메소드/객체 먼저 만들어줘야 함(추후 '객체' 수업시간에 이론적으로 깊게 다룰 것임)
		// -> 호출할 메소드가 존재하는 클래스를 생성(new)
		// 표현법: "클래스 이름" "그 클래스를 대변할/대표하는 이름(별명)" = new "클래스 이름"();
		MethodTest mt = new MethodTest(); // step2) MethodTest 클래스에 있는 것을 mt라는 이름으로 대표로 해서 가져다 쓰겠다 + 생성자
		
		mt.methodA(); // . = (mt에 들어있는 주소에) 접근/참조
		mt.methodB();
		mt.methodC();
		
		System.out.println();		
		
//		HelloWorld hw = new HelloWorld();
//		hw.printMyJob(); // public static void 메서드(); -> 경고msg = "the static method printMyJob() from the type HelloWorld should be accessed in a static way"
		System.out.println("---- \"HelloWorld\" 클래스의 메인 메소드() 출력 ----");
		HelloWorld.main(args); // 위 경고msg에 대한 quick fix 중 하나; static 메소드 -> 객체 생성하지 않아도 호출 가능
		System.out.println();
		
		HelloWorld.printMyJob(); 
		HelloWorld.printMyAge();
		
	} // main() 메서드 영역 끝
} // 클래스 Run 영역 끝
