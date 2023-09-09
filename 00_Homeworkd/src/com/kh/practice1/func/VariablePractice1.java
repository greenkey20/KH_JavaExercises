package src.com.kh.practice1.func;

import java.util.Scanner; // java.util 라이브러리의 Scanner 클래스 사용할 수 있도록 불러옴

public class VariablePractice1 { // 변수과제1 클래스 영역 시작 
	// 클래스명 : VariablePractice1
	// 메인메소드를 제외한 모든 메소드 이 클래스에 작성
	
	public void methodQ1() { // 1번 문제 풀이를 위한 메서드 영역 시작
		// 1번 문제
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		// ex. 
		// 첫 번째 정수 : 23
		// 두 번째 정수 : 7
		//
		// 더하기 결과 : 30
		// 빼기 결과 : 16
		// 곱하기 결과 : 161
		// 나누기 몫 결과 : 3
		
		System.out.println("[1번 문제]"); // 문제 번호 표시
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스의 별명 짓고 이 메소드에서 사용할 수 있도록 함
		
		System.out.print("정수 두 개를 입력하세요(첫 번째 정수 입력 후, \"Enter\" 또는  \"스페이스바\"를 치고 두 번째 정수를 입력하세요) : "); // 사용자 입력 유도 서비스메시지
		int num1 = sc.nextInt(); // 정수값을 입력받는 nextInt() 메서드를 이용해서 사용자로부터 첫 번째로 입력받은 정수값을 정수형(int) 변수 num1에 저장 
		int num2 = sc.nextInt(); // 사용자로부터 두 번째로 입력받은 정수값을 정수형(int) 변수 num2에 저장 
		
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		System.out.println(); // 콘솔 출력에서 가독성 향상을 위한 한 줄 띄어쓰기
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));	
		System.out.println("나누기 나머지 결과 : " + (num1 % num2));
		System.out.println(); // 콘솔 출력에서 가독성 향상을 위한 한 줄 띄어쓰기
		
		sc.close();
		
	} // 1번 문제 풀이를 위한 메서드 영역 끝
	
	public void methodQ2() { // 2번 문제 풀이를 위한 메서드 영역 시작
		// 2번 문제
		// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		// 계산공식 ) 면적 : 가로 * 세로
		//         둘레 : (가로 + 세로) * 2
		// ex.
		// 가로 : 13.5
		// 세로 : 41.7
		//
		// 면적 : 562.95
		// 둘레 : 110.4
		
		System.out.println("[2번 문제]"); // 문제 번호 표시
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스의 별명 짓고 이 메소드에서 사용할 수 있도록 함
		
		System.out.print("사각형의 가로 길이 및 세로 길이를 입력하세요(가로 길이 입력 후, \"Enter\" 또는 \"스페이스바\"를 치고 세로 길이를 입력하세요) : "); // 사용자 입력 유도 서비스메시지
		double width = sc.nextDouble(); // 실수값을 입력받는 nextDouble() 메서드를 이용해서 사용자로부터 첫 번째로 입력받은 실수값을 실수형(double) 변수 width에 저장
		double height = sc.nextDouble(); // 사용자로부터 두 번째로 입력받은 실수값을 실수형(double) 변수 height에 저장
		
		System.out.println("사각형의 가로 길이 : " + width);
		System.out.println("사각형의 세로 길이 : " + height);
		System.out.println(); // 콘솔 출력에서 가독성 향상을 위한 한 줄 띄어쓰기
		
		System.out.println("사각형의 면적 : " + (width * height));
//		System.out.printf("사각형의 면적 : %.2f\n", width * height); // 계산 결과의 표시를 소수점 이하 몇 자리로 특정할 때 사용하려면 이 코드 사용
		System.out.println("사각형의 둘레 : " + ((width + height) * 2));
//		System.out.printf("사각형의 둘레 : %.2f\n", (width + height) * 2); // 계산 결과의 표시를 소수점 이하 몇 자리로 특정할 때 사용하려면 이 코드 사용
		System.out.println(); // 콘솔 출력에서 가독성 향상을 위한 한 줄 띄어쓰기
		
		sc.close();
		
	} // 2번 문제 풀이를 위한 메서드 영역 끝
	
	public void methodQ3() { // 3번 문제 풀이를 위한 메서드 영역 시작
		// 3번 문제
		// 영어 알파벳 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		//
		// ex. 
		// 문자열을 입력하세요 : apple
		//
		// 첫 번째 문자 : a
		// 두 번째 문자 : p
		// 세 번쨰 문자 : p
		
		System.out.println("[3번 문제]"); // 문제 번호 표시
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스의 별명 짓고 이 메소드에서 사용할 수 있도록 함
		
		System.out.print("문자열(세 개 문자 이상)을 입력하세요 : "); // 사용자 입력 유도 서비스메시지
		String str = sc.nextLine(); // 개행문자가 나오기 전까지의 문장/문자열을 입력받는 nextLine() 메서드를 이용해서 사용자로부터 입력받은 문자열 1개를 참조형 클래스 String으로 str라는 이름/변수/저장공간에 저장
//		char c1 = sc.nextLine().charAt(0); // 95~97행처럼 입력받으면 문자열 3개를 입력받게 되는 바, 이 코드들 사용하지 않음 
//		char c2 = sc.nextLine().charAt(1);
//		char c3 = sc.nextLine().charAt(2);
		
		System.out.println("첫 번째 문자 : " + str.charAt(0)); // str에 저장된 문자열 내 특정 위치(x번째)의 문자(글자 하나)를 출력 -> charAt(0) = 첫 번째 문자 지정
		System.out.println("두 번째 문자 : " + str.charAt(1)); // charAt(1) = 두 번째 문자 지정
		System.out.println("세 번째 문자 : " + str.charAt(2)); // charAt(2) = 세 번째 문자 지정
		System.out.println(); // 콘솔 출력에서 가독성 향상을 위한 한 줄 띄어쓰기
		
		sc.close();
		
	} // 3번 문제 풀이를 위한 메서드 영역 끝
	
	public void methodQ4() { // 4번 문제 풀이를 위한 메서드 영역 시작
		// 4번 문제
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		//
		// ex.
		// 이름 : 이승철
		// 학년(숫자만) : 3
		// 반(숫자만) : 4
		// 번호(숫자만) : 15
		// 성적(소수점 아래 둘째자리까지) : 85.75
		
		//3학년 4반 15번 이승철 남학생의 성적은 85.75이다.
		
		System.out.println("[4번 문제]"); // 문제 번호 표시
		
		Scanner sc = new Scanner(System.in); // Scanner 클래스의 별명 짓고 이 메소드에서 사용할 수 있도록 함
		
		System.out.print("이름 : "); // 사용자 입력 유도 서비스메시지
		String name = sc.nextLine(); // 개행문자가 나오기 전까지의 문장/문자열을 입력받는 nextLine() 메서드를 이용해서 사용자로부터 입력받은 사용자 이름을 참조형 클래스 String으로 name이라는 이름/변수/저장공간에 저장
		
		System.out.print("학년(숫자만) : "); // 사용자 입력 유도 서비스메시지
		int year = sc.nextInt(); // 정수값을 입력받는 nextInt() 메서드를 이용해서 사용자로부터 입력받은 학년(정수값)을 정수형(int) 변수 year에 저장
		
		System.out.print("반(숫자만) : "); // 사용자 입력 유도 서비스메시지
		int classNum = sc.nextInt(); // 정수값을 입력받는 nextInt() 메서드를 이용해서 사용자로부터 입력받은 반(정수값)을 정수형(int) 변수 classNum에 저장
		
		System.out.print("번호(숫자만) : "); // 사용자 입력 유도 서비스메시지
		int studentNum = sc.nextInt(); // 정수값을 입력받는 nextInt() 메서드를 이용해서 사용자로부터 입력받은 번호(정수값)를 정수형(int) 변수 studentNum에 저장
		
		sc.nextLine(); // 앞서 nextInt() 메서드를 통해 사용자로부터 입력받은 데이터로 변수 초기화를 하는 과정에서 버퍼공간에 남아있는 개행문자(\n)를 사용해 없애주기 위해 nextLine() 메서드 1회 추가/사용
					   // 이렇게 하지 않으면 버퍼공간에 남아있던 개행문자로 인하여 별도의 사용자 입력 없이도 아래 nextLine() 메서드가 바로 작동됨 
		
		System.out.print("성별(남성 또는 여성) : "); // 사용자 입력 유도 서비스메시지
		char gender = sc.nextLine().charAt(0); // char형(문자 1개) 자료를 입력받는 메서드가 따로 없기에, nextLine() 메서드로 입력 받은 성별 문자(열)의 첫 번째 글자(charAt(0))에 접근해서 char형 변수 gender에 저장
		
		System.out.print("성적 : "); // 사용자 입력 유도 서비스메시지
		double grade = sc.nextDouble(); // 실수값을 입력받는 nextDouble() 메서드를 이용해서 사용자로부터 입력받은 성적(실수값)을 실수형(double) 변수 classNum에 저장
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f점이다.", year, classNum, studentNum, name, gender, grade);
		// printf() 출력 메서드를 이용해서, 사용자로부터 입력받은 정보 6가지를 표시할 구멍 6개를 순서대로 뚫고, 각각 적당한 자료형으로 표시되도록 함
		// 성적의 경우 출력 시 소수점 아래 둘째자리까지 표시되도록 함
		
		sc.close();
		
	} // 4번 문제 풀이를 위한 메서드 영역 끝

} // 변수과제1 클래스 영역 끝
