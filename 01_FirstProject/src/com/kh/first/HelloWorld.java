// project 먼저 생성 > packages > classes
// 우리가 쓰는 건 Java version 1.8
// 문법은 googling하면 다 나옴; 컴퓨터 작동 원리를 이해하자
// 컴퓨터 프로그램은 위->아래 실행 + 컴퓨터는 0과 1 밖에 모름

package src.com.kh.first; // 패키지 선언부; 현재 클래스의 위치
	
	/* 패키지
	 * 한 패키지 안에 여러 개의 클래스들이 존재할 수 있음; 단, 동일한 이름의 클래스는 존재할 수 없음
	 * 모든 클래스들이 동일한 패키지 안에 존재하고 있으면 관리가 힘듦 -> 클래스들을 용도에 맞게 구분해서 패키지에 보관하는 것이 좋음
	 * 
	 * 권장사항!
	 * 1. 패키지는 적어도 3단계 이상으로 만들어 주는 것을 권장
	 *  e.g. com.kh.first
	 *       com(레벨1).회사이름(레벨2).프로젝트/팀/카테고리 이름 등(레벨3, 어떤 작업인지 표시)
	 * 2. 패키지의 두번째 레벨까지는 도메인의 역순으로 만듦
	 * 왜냐하면 도메인 주소(e.g. kh, google, naver 등)는 고유한 값이기 때문에 중복 방지 가능
	 * 왜냐하면 도메인 주소만 봐도 어느 회사에서 제작한 프로젝트인지 파악 가능
	 */

	// 주석의 종류
	// 1. 한 줄 주석(//): 주석 내용이 한 줄일 때 사용; "//" 다음부터 줄의 끝까지의 내용이 주석으로 간주
	/* 2. 여러 줄 주석(/* ...): 여러 줄의 주석이 필요할 때 사용
	 * 이
	 * 사이의
	 * 모든
	 * 내용이
	 * 주석으로
	 * 간주
	 */
	
	/** 누가 만들었고
	 * 용도는 뭐고..
	 * library 만들 때 사용하는 주석
	 * 지금 나는 필요 없을 것..
	 */
	
	/* 주석문
	 * 주석은 프로그램의 실행에 영향을 끼치지 않음; 어느 데나 있어도 됨 
	 * 코드를 작성한 후 그 코드를 이해하기 쉽도록 하기 위해 작성
	 * 주석을 달아놓으면, 설명을 달아놓았기 때문에, 유지/보수 시간을 줄일 수 있음
	 */

public class HelloWorld { // 클래스 이름은 HelloWorld로 지었음; 클래스 영역 시작
						  // 중괄호{ }: 각 요소마다 갖는 scope(영역, code block) 설정; 변수는 이 안에서 선언되고 사용됨
	
	// main 메소드(): 프로그램의 시작점(entry point); 호출하지 않아도 프로그램이 실행되면 실행됨; 프로그램(여기서 정확한 의미는 무엇인가?)당 최소 1개는 갖고 있어야 함
	public static void main(String[] args) { // main 메소드 영역 시작
		/* 메소드(method): 사전적으로는 '기능'을 의미 -> 하나의 기능 단위
		 * 뒤에 괄호() 붙어있음
		 * 하나의 클래스 안에 여러 개의 메소드가 존재할 수 있음
		 * 메소드를 사용할 때 "호출(call)"이라고 함
		 */
		
		// semi-colon(;): 논리적인 한 문장이 끝날 때 반드시 세미콜론을 붙임
		
		System.out.println("Hello, World!" // out = 출력, println() = 출력해서 보여주는 기능의 메소드; syso ctrl+space
				+ " My name is Eunyoung."
				+ " Happy to meet you all! How are you today?"); // run as java application, ctrl+F11
		
		printMyName(); // 메소드 호출
		printMyAge();
		printMyJob();
	} // main 메소드 영역 끝
	
	public static void printMyName() { // 내 이름을 출력하는 새로운 메소드 생성; 호출하지 않으면 기능 안 함; static으로 만들었기 때문에 다른 영역(?)에서 new 생성하지 않고도 호출/사용 가능(line58)
		System.out.println("제 이름은 은영입니다.");		
	}
	
	public static void printMyAge() {
		System.out.println("제 나이는 36세입니다.");
	}
	
	public static void printMyJob() {
		System.out.println("제 직업은 백엔드웹개발자입니다.");
	}
	
} // 클래스 영역 끝