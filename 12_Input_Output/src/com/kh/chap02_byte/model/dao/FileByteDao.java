package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(data access object): 데이터가 보관되어있는 공간에 직접 접근해서 데이터를 입출력하는 메소드들을 모아둔 클래스; model.dao 패키지에 모아둠
// 기능별로 클래스를 구분(model.vo, controller, view..)해서 필요한 것들 모아두는 이유 = 유지/보수의 용이성

public class FileByteDao { // FileByteDao 클래스 영역 시작 
	
	// 바이트스트림 실습 -> 입력, 출력
	
	public void fileSave() {
		// 프로그램 -> 외부매체(파일)
		// 출력 = 프로그램 내의 데이터를 파일로 내보내기/파일에 기록
		
		// FileOutputStream: '파일'로 데이터를 출력하되, 1byte 단위로 출력
		
		FileOutputStream fout = null; // 나의 질문 = 이 선언을 클래스(o) 메소드(x) 영역에 쓰면 왜 오류가 나지?
	
		try {
			// 1. FileOutputStream 객체 생성 = 해당 파일과 직접 연결되는 통로 생성
			// 해당 파일이 존재하지 않는 경우, 해당 파일이 생성되면서 통로도 연결됨
			// 해당 파일이 존재하는 경우, 그냥 통로만 연결됨 + 옵션(뒤에 계속 이어서 쓸지 ou 파일 덮어쓸지) 지정 가능
			// 옵션 = true를 씀(해당 파일에 내용이 있을 경우 이어서 작성) ou true를 안 씀(기본값; 내용을 덮어씀)
			fout = new FileOutputStream("a_byte.txt"/*, true*/); // 기본생성자로는 객체 생성 불가능
			
			// 2. write() 메소드 호출 -> 연결 통로로 데이터 출력
			// cf. 1byte 자료형 (표현) 범위 = -128 ~ 127 숫자 출력 가능
			// 0 ~ 127 숫자만 사용 가능 + 음수는 사용 불가능 cf. ASCII table(코드표)
			// 데이터 출력
			// fout.write(97); // a; "Unhandled exception type IOException" -> 예외 처리 필요(자동완성으로 하기)
			// fout.write(98); // b; 윗줄 a 인자 메소드 호출 주석 처리 후, 이 줄 메소드 호출 -> a_byte.txt 파일에는 b가 입력되어있음 -> 쓸 때마다 덮어쓰게 됨 -> FileOutpuStream 생성자에 true 옵션 쓴 뒤 다시 실행해보면 'bb' 입력되어있음
			
			fout.write(97); // a
			fout.write(98); // b
			fout.write(99); // c
			fout.write(100); // d
			// e(101), f(102), g(103)를 한 번에 입력하고 싶다면, 배열 사용 -> byte형을 전달할 수 있는 스트림이므로 다음 char[] arr = {101, 102, 103}, int[] 배열 사용 불가
			byte[] arr = {101, 102, 103};
			fout.write(arr); // efg 추가; 메소드의 오버로딩 -> byte형 정수, byte형 배열 등 여러 종류의 매개변수 사용 가능
			fout.write(arr, 1, 2); // arr배열의 1번 index부터 2개만 씀 -> fg 추가
			
			fout.write('A');
			fout.write('B');
			fout.write('C'); // ASCII 코드표에 있는, 1byte짜리니까 입력 가능 -> ABC 추가
			
			fout.write('강');
			fout.write('미');
			fout.write('피'); // 한글은 2bytes이기 때문에 깨져서 저장됨(�< 추가) -> 바이트 스트림으로는 불가능 -> 문자 스트림을 사용하여 해결 가능
			
			// 3. 스트림을 다 사용했다면, 반드시/꼭 자원 반납(스트림 닫기) -> 내가 안 하면 garbage collector가 해주긴 하지만, 안 하면 추후 문제 발생 가능성이 있으므로, 하는 습관 들이기 
			// fout.close(); // 이렇게 try문 안에 써둔 경우, 위에서 예외가 발생했다면 (그 예외 처리를 위해 catch문으로) passing 되어서 실행 안 될 가능성 있음 
			
		} catch (FileNotFoundException e) { // 파일을 찾을 수 없는 예외가 발생할 수 있으니 처리해줘; 이 예외는 IOException을 상속받고 있음/IOException의 한 종류
			e.printStackTrace();
		} catch (IOException e) { // 강사님께서 이 catch구문 어떻게 자동완성으로 넣었는지 + catch구문 순서 설명 등 제대로 못 들음..
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // try문에 포함되는 것(try + catch + finally); 어떤 예외가 발생했든 (catch한 뒤) 반드시 실행할 구문을 finally 블럭 안에 작성 -> 자원 반납
			try {
				fout.close(); // 이 메소드 실행 시 IOException이 발생할 수도 있다는 오류 메시지 -> try/catch문으로 감싸줌
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // finally문 영역 끝
		
	} // fileSave() 메소드 종료
	
	public void fileRead() {
		// 프로그램 <- 외부매체(파일)
		// 입력 = 파일로부터 데이터를 가지고 옮
		// FileInputStream: 파일로부터 데이터를 가져와서 입력하되, 1byte 단위로 입력받음
		
		FileInputStream fin = null;
		
		try {
			// 1. 객체 생성 = 스트림을 엶
			fin = new FileInputStream("a_byte.txt"); // // 연결할 것(?)을 생성자의 인자로 전달해서 객체 생성 -> 외부매체(파일)과 연결할 통로 생성
			
			// 2. read() 메소드 이용 -> 통로로 데이터 입력받기
			// 1byte 단위로 하나씩 읽어옴
			
			/*
			System.out.println(fin.read()); // 97(a)
			System.out.println(fin.read()); // 98(b)
			System.out.println(fin.read()); // 99(c)
			System.out.println(fin.read()); // 100(d)
			System.out.println(fin.read()); // 101(e)
			System.out.println(fin.read()); // 102(f)
			System.out.println(fin.read()); // 103(g)
			System.out.println(fin.read()); // 102(f)
			System.out.println(fin.read()); // 103(g)
			System.out.println(fin.read()); // 65(A)
			System.out.println(fin.read()); // 66(B)
			System.out.println(fin.read()); // 67(C)
			System.out.println(fin.read()); // 21(강)
			System.out.println(fin.read()); // 248(미)
			System.out.println(fin.read()); // 60(피)
			
			System.out.println(fin.read()); // -1 = 제일 뒤/끝; 파일의 끝을 만나는 순간 fin.read() 호출하면 -1 반환
			*/
			
			// 위와 같이 하나하나 일일이 찍어보니 불편한 점 = 중복된 코드의 반복 -> 비효율적 vs 반복문 사용
			// 파일에 몇 bytes가 있는지 모르므로 (-> 반복 횟수 모르므로) while문 사용
			
			/* 아래 방법의 문제점 = read문이 2번 호출됨; '퐁당퐁당' 하나씩 걸러 fin.read() 출력됨
			while (fin.read() != -1) { // fin.read()가 -1일 때까지 반복
				System.out.println(fin.read());
			}
			
			실행 순서
			1. 조건식 = read() 메소드 호출 -> 97과 -1 비교한 결과 다르므로 반복문 안으로 들어감
			2. read() 메소드 호출해서 98 출력
			3. read() 메소드 호출해서 99와 -1 비교
			4. read() 메소드 호출해서 100 출력
			5. read() 메소드 호출해서 101과 -1 비교
			6. read() 메소드 호출해보니 남아있는 것 없으므로 출력 못함
			6. while문 조건식으로 돌아가 read() 메소드 호출하니 -1 반환됨 -> 반복문 빠져나감
			*/
			
			
			/* 나의 시도 ㅠ.ㅠ -> 문제 해결 실패
			int i = 0;
			
			while (fin.read(byte[i], 0, 15) != -1) {
				System.out.println(fin.read());
				i--;
			}
			*/
			
			// 손민성님 idea -> 문제점 = 마지막에 -1이 출력됨
			/* 
			while (true) {
				int a = fin.read();
				System.out.println(a);
				if (a < 0) {
					break;
				}
			}
			*/
			
			// 강사님 idea = 조건식 안에 대입문 사용
			int value = 0;
			while ((value = fin.read()) != -1) { // 비교연산자의 결과는 논리값
				System.out.println(value);
			}
			/* 실행 순서
			 * 1. value = 0이었는데 while문 조건식 들어가서 value에 fin.read() 첫번째 호출해서 return받은 값 97을 입력 -> value에 저장된 값과 -1 비교 -> 반복문 안으로 들어감
			 * 2. value에 저장된 값 97 출력
			 * 3. 두번째 read() 호출해서 return 받은 값 98을 value에 저장
			 * 4. value 98 출력
			 * 5. 세번째 read() 호출해서 return 받은 값 99를 value에 저장
			 * 6. value 99 출력..
			 */
			
			// 3. 마지막으로 해야 할 일 = close() 메소드 이용 -> 자원 반납
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileRead() 메소드 종료

} // FileByteDao 클래스 영역 끝
