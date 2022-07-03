package com.kh.variable;

public class A_Variable {
	// 변수의 필요성
	
	// 시급과 근무시간과 근무일수를 곱해서 주급을 계산하는 메소드 calPay() 시작
	public void calPay() {
		System.out.println("-------변수 사용하기 전-------"); // 문자열은 쌍따옴표" "로 묶어서 처리
		
		System.out.println("시급 : 9380원"); // System도 클래스이기 때문에 대문자로 시작; 시급 8950원에서 9380원으로 인상
		System.out.println("근무시간 : 8시간/일"); // 근무시간 6시간 --> 8시간/일 변동
		System.out.println("근무일수 : 5일/주");
		
		// 주급 = 시급 * 근무시간 * 근무일수
		// 출력 형식: "이름 : xx원"
		// + 기호: 숫자 더하기; 값과 값을 붙일 때 사용
		// * 기호: 숫자 곱하기
		
		System.out.println("은영 : " + (9380 * 8 * 5) + "원"); // 9380 * 6 * 5가 수식 한 묶음임을 명확하게 하기 위해/가독성을 위해 괄호로 묶어줌
		System.out.println("토미 : " + (9380 * 8 * 5) + "원");
		System.out.println("미피 : " + (9380 * 8 * 5) + "원");
		System.out.println("해피 : " + (9380 * 8 * 5) + "원");
		System.out.println("무민 : " + (9380 * 8 * 5) + "원");
		System.out.println("판다 : " + (9380 * 8 * 5) + "원");
		// 변수 사용 전에는 인수(?)의 값 변할 때마다 각 직원의 수식 일일이 고쳐줌 -> 실수 발생할 가능성 크고, 번거롭고..
		
		System.out.println("-------변수 사용 후-------");
		// 시급, 근무시간, 근무일수라는 값을 각각 담을 공간(변수)을 만들고 값을 담음 = 변수 사용 -> 생산성 증가
		// pay, time, day는 공간에 이름 붙인 것임
		int pay = 9420; // 시급; 시급 8980원에서 9420원으로 인상
					    // 등호(=): 대입(assignment) 연산자(오른쪽의 값을 왼쪽에 담는다)(o) 같다(equality)(x);
		int time = 8; // 근무시간
		int day = 5; // 근무일수
		
		System.out.println("시급 : " + pay + "원");
		System.out.println("근무시간 : " + time + "시간/일");
		System.out.println("근무일수 : " + day + "일/주");
		
		System.out.println("혁이 : " + (pay * time * day) + "원");
		System.out.println("유베 : " + (pay * time * day) + "원");
		System.out.println("스노크메이든 : " + (pay * time * day) + "원");	
		// 변수 사용 후에는 변수에 대입되는 값만 고쳐주면 모든 직원의 주급 계산에 적용됨
		
		/* 변수 사용 이유
		 * 1. 변수는 (naming을 통해) 값에 의미를 부여 -> 가독성 높여줌
		 * 2. 단 한 번의 값을 기록함으로써 필요할 때마다 재사용 가능 -> 재사용성 높여줌
		 * 3. 가독성과 재사용성 높아짐으로써 유지/보수 용이해짐 
		 */		
	} // 메소드 calPay() 영역 끝
	
	// 변수의 선언
	public void declareVariable() { // 메소드 declareVariable() 영역 시작
		
		/* 변수 선언 방법
		 * int pay; 변수타입(자료형) 변수이름;
		 * 같은 타입의 변수를 선언할 때는 한꺼번에 선언할 수 있음 e.g. int pay, day, time; -> 가독성이 좋지 않아(?) 권장하지는 않음 
		 * 
		 * 변수 선언 후 처음 값을 저장하는 것 = 초기화(initialization), 대입 -> 초기화 진행해서 넣어준 값 = 초기값
		 */
		
		// System.out.println(pay); // 다른 메소드 내에서 선언된 변수(local variable, 지역변수) 사용 불가능; 변수는 중괄호{}(scope, 영역, code block) 안에서 선언되고 사용됨
		// Java에는 전역변수 없음; 전역변수처럼 사용할 수 있는 방법들은 여러 가지 있음 e.g. static으로 선언 등(project01 > first > HelloWorld > printMyName() 메소드)
		
		/* 식별자(identifier): 클래스명, 메소드명, 변수명 등 사용자가 만들어서 이용하는 고유한 이름; 각자 구분되도록..
		 * 
		 * 식별자 생성 시 꼭 지켜야 하는(안 지키면 안 만들어지는) 규칙
		 * 1. 대/소문자 구분 int Day != int day
		 * 2. 길이 제한은 없음
		 * 3. 문자, 숫자, _(under bar? underscore?), $를 식별자에 포함할 수 있음; @, ! 등 기타 특수기호 사용 불가
		 * 4. 문자, _, $로 시작할 수 있음 -> 숫자로는 시작할 수 없음
		 * 5. 공백은 포함할 수 없음
		 * 6. keywords(예약어)는 식별자로 사용할 수 없음
		 * 
		 * 식별자 이름 규칙(개발자들의 약속/암묵적인 rules, coding convention)
		 * 1. 클래스/인터페이스 이름 규칙
		 * - 명사, 형용사를 서술적으로 연결해서 사용 -> 이름만 봐도 역할/용도를 한눈에 알 수 있도록
		 * - 첫글자는 대문자로 표기 
		 * - 연결된 단어의 첫글자도 대문자로 표기 e.g. HelloWorld, MethodTest
		 * - 수업 진행을 위해 클래스명에 _ 사용하고 있으나, 클래스명에 _ 안 쓰는게 좋음
		 * 
		 * 2. 변수 이름 규칙
		 * - 명사적 의미를 갖게 만듦
		 * - 첫글자를 소문자로 표기 + 연결된 단어의 첫글자는 대문자로 표기 e.g. phoneNumber, redApple
		 * 
		 * 3. 메소드/메서드/method 이름 규칙
		 * - 동사적 의미를 갖게 만듦
		 * - 첫글자는 소문자로 표기 + 연결된 단어의 첫글자는 대문자로 표기
		 * - 메서드명 뒤에는 한 쌍의 괄호()가 붙음
		 * - 매서드명은 일반적으로 _ 사용하지 않음 e.g. calPay(), declareVariable(), join()
		 * 
		 * 4. 상수 이름 규칙
		 * - 모든 문자를 대문자로 표기
		 * - 단어와 단어 사이는 _로 구분함 e.g. LOGIN_OK
		 */
		
		// 자료형 4가지
		
		// 1. 논리형 자료형(논리값): 1byte
		// 논리형 자료형에는 true, false 2가지가 존재함
		// 형 변환 제외(불가능?)
		boolean isTrue; // 변수 선언
		isTrue = false; // 다음 줄에서 변수 초기화
		boolean isFalse = true; // 변수 선언하면서 초기화 -> 강사님께서는 이 방법 사용을 권장하심
		
		// 2. 숫자형 자료형
		
		/* 2-1. 정수형
		 * 정수형에는 4가지 유형이 있음
		 * 정수형 예약어 byte, short, int, long형이 있고, int형 주로 사용
		 * 정수형은 10진수 뿐만 아니라 2진수, 8진수, 16진수 표현 가능
		 * 정수형의 기본형은 int이고, long형 사용할 때는 할당한 숫자 뒤에 "L"을 붙여야 함	 
		 */
		byte bNum = 5; // 1byte
		short sNum = -6; // 2bytes
		int iNum = 7; // 4bytes
		long lNum = -8L; // 8bytes, long형 literal임을 알려주기 위해 뒤에 대/소문자 L(가독성을 위해 권장)/l 붙여줌
		
		// 변수에 대입되는, 변하지 않는, 수정할 수 없는 값 = literal (!= 프로그래밍에서의 상수)
		
		/* 2-2. 실수형
		 * 실수형에는 2가지 유형이 있음
		 * 실수형 예약어 float, double형이 있고, 주로 double형 사용
		 * float형 사용하려면 할당할 숫자 뒤에 f(또는 F) 붙여야 함
		 */
		float fNum = 25.678f; // 4bytes, 보통 소문자 f 붙여줌
		double dNum = -7.894; // 8bytes
		
		// 3. 문자형
		char ch = 'a'; // 단일문자에는 반드시 홑따옴표를 넣음
		
		// String은 클래스(Eclipse dark theme에서 청록색으로 표시됨), 참조형(크기는 4bytes)(o) 자료형(x)
		// 4. 문자열형(String): 참조자료형 -> 주소를 담음
		String str; // str에는 문자열이 저장된 주소값이 담김
		str = "abc";
		
		/* 1. 지금까지 9개의 자료형을 위와 같이 선언했고,
		 * 2. 9개의 값을 초기화 진행했음
		 * 3. 9개의 값이 제대로 들어갔는지 확인해보기
		 * 출력양식: "변수이름 : 변수값"; Run 클래스에서 실행 
		 */			
		System.out.println("isTrue : " + isTrue);
		System.out.println("isFalse : " + isFalse);
		System.out.println(); // 콘솔 출력에서 가독성을 위해 한 줄 띄어쓰기
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println();
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println();
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		System.out.println();
		// System.out.println("어쩌고 : " + 저쩌고);
		
		// 출력문의 종류
		// System(클래스).out(출력 관련).println(), print(), printf() 등은 메서드
		// 1. System.out.println(); 줄(ln = line의 약자)바꿈(개행, 행을 열어줌/바꿔줌)해서 콘솔에 출력함
		// 2. System.out.print(); 줄바꿈하지 않고 출력
		System.out.print(isTrue);
		System.out.println(isFalse);
		System.out.println();
		
		// 3. System.out.printf("출력하고자 하는 데이터 형식"); 구멍 뚫은 부분의 변수의 값을 형식(format)에 맞춰서 출력; 줄바꿈은 해주지 않음; 구멍과 메꿀 변수의 갯수,순서,종류가 명확해야 함
		// System.out.printf(str, null);		
		System.out.printf("isTrue의 값은 %b입니다.\n", isTrue); // \n 개행(줄바꿈); printf() 메서드 안에서 사용 가능한 escape character(탈출 문자)
		System.out.printf("isFalse의 값은 %b입니다.\n\n", isFalse);
		// %b: true, false 논리형 변수를 담을 수 있게 뚫어주는 구멍
		
		System.out.printf("bNum : %d\n", bNum);
		System.out.printf("sNum : %d\n", sNum);
		System.out.printf("iNum : %d\n", iNum);
		System.out.printf("lNum : %d\n\n", lNum);
		// %d: byte, short, int, long 정수형 변수를 담을 수 있게 뚫어주는 구멍
		System.out.printf("fNum : %.4f\ndNum : %.1f\n\n", fNum, dNum);
		// %f: 실수형 변수를 담을 수 있게 뚫어주는 구멍; 소수점 아래 7번째에서 반올림되어 6번째 자리까지만 출력이 되는 형식
		// %.1f: 소수점 아래에서 2번째 자리로부터 반올림되어 1번째 자리까지만 출력이 되는 형식
		
		System.out.printf("소문자 ch : %c\n대문자 ch : %C\n", ch, ch);
		System.out.printf("소문자 str : %s\n대문자 str : %S\n\n", str, str);
		// %c : 문자형 변수를 담을 수 있게 뚫어놓은 구멍; 대문자를 소문자로 변경하는 것은 불가능
		// %C : 해당 문자형 변수를 담을 수 있는데, 대문자로 변경해서 출력할 수 있게 해주는 포맷
		// %s : 문자열형 변수를 담을 수 있게 뚫어놓은 구멍; 대문자를 소문자로 변경하는 것은 불가능
		// %S : 해당 문자열형 변수를 모두 대문자로 변경해서 출력할 수 있게 해주는 포맷
		
		System.out.printf("개행은 \"\\n\"를 사용합니다.\n"); // 강조하고자 하는 특수문자(", \ 등) 앞 escape문자 \는 printf() 뿐만 아니라 println()에서도 사용 가능
		System.out.println("스트링은 한 쌍의 \"\"\"로 앞뒤를 감싸주세요.");
	} // 메소드 declareVariable() 영역 끝
	
	// 상수 : 변하지 않는 수(수학에서의 상수), 값의 개념(x) 변경하지 않을 변수, 공간의 개념(o)
	public void constant() {
		int khNum; // khNum = 변수 -> 이 공간에 담는 값은 바꿀 수 있음
		khNum = 1; // khNum 메모리(RAM) 공간에 담는 값이 1이었다가,
		System.out.println(khNum);
		khNum = 2; // khNum 메모리(RAM) 공간에 담는 값이 2가 될 수도 있음
		System.out.println(khNum);
		
		// 상수
		// 프로그래밍에서의 상수는 변하지 않는 값을 담을 공간; 한 번 초기화하면 값 변화시키지 않음
		// e.g. 1760년부터 올해까지의 연 수(올해 연도 - 1760)를 계산하는 메소드 -> 1760은 고정인 값/변하지 않음, 올해 값은 이 메소드를 사용하는 해마다 변동..
		// 표현법 : final 자료형 상수이름;
		final int START_YEAR = 1760;
		double PI = 3.14; // 원주율 값은 변하지 않음
		System.out.println(START_YEAR);
		System.out.println(PI);
	}
	
} // 클래스 A_Variable 영역 끝
