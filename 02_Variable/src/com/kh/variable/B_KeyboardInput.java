package com.kh.variable;

import java.util.Scanner; // java.util에 있는 Scanner라는 클래스를 가져옴

public class B_KeyboardInput { // 클래스 영역 시작
	
	public void inputTest() { // 메서드 생성/영역 시작
		/* 키보드로 사용자로부터 값을 입력받으려면 Java에서 사용자의 편의를 위해 이미 제공하고 있는 java.util.Scanner라는 클래스를 사용함
		 * -> Scanner 클래스 안에 있는 메서드들을 호출해서 사용
		 * -> 그러기 위해 3행처럼 import
		 */
		
		Scanner sc = new Scanner(System.in); // System 클래스 안에 있는 in(System.in; 입력받은 값들을 받아들이겠다, byte 단위로)을 사용하자..
		// Scanner는 이름이 대문자로 시작하니 클래스이지만 괄호()가 붙어있으니 메서드(기능을 가진.. 생성자)
		// [KEY 이해 내용] Scanner는 클래스이자 참조형 -> 이 type의 변수 sc는 어떤 주소값을 갖는다..
		
		// 사용자의 인적사항(이름, 나이, 성별, 키, 주소)을 입력받아 출력해보자
		// 입력받고자 하는 내용을 먼저 질문(service msg)해서 입력을 유도
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메서드: nextLine(), next(), nextInt()..
		String name; // 사용자의 이름을 받을 변수 선언/공간 받아둠
		name = sc.nextLine(); // 메서드 nextLine()가 있는 위치(=Java가 만들어서 제공해주는 클래스 Scanner)를 알려줘야 함 -> 참조연산자 . 사용
							  // 오른쪽에 있는 값을 왼쪽에 대입/저장함
		// nextLine(): 사용자가 입력한 값 중 공백이 있을 경우, 공백에 무관하게 한 문장을 다 출력 e.g. 주소
		//  - \n이 나올 때까지 한 라인을 입력받고 \n을 버린 나머지를 반환함
		//  - 개행문자 전까지의 문자열 입력받기
		// next(): 사용자가 입력한 값 중 공백이 있을 경우, 공백 이전까지만 입력 받음 e.g. 이름
		//  - 다음 입력받은 것을 반환함
		// nextInt(), nextDouble(), nextFloat(), nextLong(): 다음 입력받은 특정 자료형을 반환함; \n 등 무시하고 자신에게 필요한 자료만 가져감
		
		System.out.println(name + "님, 안녕하세요!");
		
		System.out.print("당신의 나이는 몇 세입니까?");
		int age = sc.nextInt();
		System.out.println(name + "님은 " + age + "세입니다.");
		
		System.out.print("당신의 키는 어떻게 됩니까?");
		double height = sc.nextDouble();
		System.out.println(name +"님의 키는 " + height + "cm입니다.");
		
		// nextLine(); 개행문자를 없애주기 때문에, 필요한 경우 한 번 더 사용이 가능함
		sc.nextLine(); // nextLine 앞에서 사용한 next(Int) 등으로 인해 (입력)buffer공간에 남아있는 \n을 사용해서 없애주어 buffer를 비움
		
		System.out.print("당신은 어디에 사십니까? : ");
		String address1;
		address1 = sc.nextLine();
		System.out.println("1. nextLine() 출력 : " + name + "님의 주소는 " + address1 + "입니다.");	

		System.out.print("당신은 어디에 사십니까? : ");
		String address2;
		address2 = sc.next();
		System.out.println("2. next() 출력 : " + name + "님은 " + address2 + "에서 거주하고 있습니다.");	
		
		sc.close();
	}
	
	public void inputTest2() { // 메서드(이름: inputTest2) 만들기
		// 변수(식별자) 생성해서 대입하고,
		// 이름, 나이, 성별(M/F), 주소 각각의 정보 입력받고,
		// 아래 표시형식으로 출력	
		// ------- 회원 가입 -------
		// OOO 님의 개인정보
		// OOO 님의 이름 : OOO
		// OOO 님의 나이 : OO
		// OOO 님의 성별 : M/F
		// OOO 님의 주소 : OOO OO OO
		
		System.out.println("------- 회원 가입 -------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇 세입니까? (정수로 입력 부탁드립니다)");
		int age = sc.nextInt(); //next()로 입력받아도 됨..
		
		sc.nextLine();
		
		System.out.print("당신의 성별은 무엇입니까?");
		char gender = sc.nextLine().charAt(0); // 단일문자만 입력받는 입력 메소드가 없음 -> charAt() 이용해서 한 글자만 입력받을 수 있음 -> charAt(0): 문자열을 입력받은 후 그 문자열의 0번째 문자를 추출하는 메서드
		// 만약에 해당 문자열의 길이보다 더 큰 숫자를 index범위(괄호 안)에 적게 되면 StringIndexOutOfBounds 오류("exception") 발생
		// 메서드(method) = 특정 자료형/클래스에 사용할 수 있는 기능 -> charAt() 메서드는 문자열 자료형에 사용할 수 있는 기능
		// 문자열 변수(참조자료형) 선언 시 String 키워드 사용 + String은 클래스
		
//		sc.nextLine(); // nextLine 앞에서 next(Int) 등이 사용된 경우 이 줄 코드를 써서 buffer를 비워야 함; 여기서는 nextLine(79행)()를 사용했으므로 이 줄 필요 없는 듯 [KEY 이해 내용]
		
		System.out.print("당신은 어디에 살고 계십니까?");
		String address = sc.nextLine();
		
		System.out.println(name + " 님의 개인정보");
		System.out.println(name + " 님의 이름 : " + name);
		System.out.println(name + " 님의 나이 : " + age);
		System.out.println(name + " 님의 성별 : " + gender);
		System.out.println(name + " 님의 주소 : " + address);
		System.out.println("----------------------");
		
		System.out.println("그나저나 " + name + " 님, " + (age - 3) + "세로 보여요 >.<");
		
		sc.close();
	} // inputTest2 메서드 영역 끝

} // 클래스 영역 끝
