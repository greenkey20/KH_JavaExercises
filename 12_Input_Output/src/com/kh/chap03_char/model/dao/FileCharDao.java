package com.kh.chap03_char.model.dao;

// 단축키 사용 등을 통해 실수를 줄이자

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	public void fileSave() {
		
		// 프로그램 -> 외부매체(파일)
		// 출력
		
		// FileWriter: 파일로 데이터를 2bytes 단위로 출력하는 스트림
		
		FileWriter fw = null;
		try {
			
			// 1. 객체 생성 = 파일과 연결된, 비교적 넓은 통로 생성
			fw = new FileWriter("b_char.txt"); // 입출력 관련해서 예외 발생할 수 있는 바, IOException 예외 처리해야 함 -> try/catch문 자동 완성
			
			// 2. write() 메소드 호출 -> 파일에 쓰기/연결 통로로 데이터 출력
			fw.write("와, I/O 너무 재미있어요~ㅎㅋ\n"); // 문자(열) 가독성을 높이기 위해 개행문자 추가
			fw.write('B');
			
			char[] arr = {'a', 'n', 'a', 'n', 'a'};
			fw.write(arr); // 오버로딩
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. close() -> 통로 닫아주기; 자원 반납
			try {
				fw.close(); // close() 없이 실행해보니 write() 인자로 전달/입력한 문자가 파일에 추가 안 되었음; 자원 반납하기 전에 계속 열어놓고 입력만 받고 있고 저장은 안 되었던 것 같음
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	} // fileSave() 메소드 종료
	
	public void fileRead() {
		
		// FileReader: 파일로부터 데이터를 2bytes 단위로 입력받는 스트림
		
		// 0. 객체 선언
		FileReader fr = null;
		
		try {
			// 1. 객체 생성
			fr = new FileReader("b_char.txt");
			
			// 2. read() 메소드 이용 -> 파일 읽기
			/*
			System.out.println(fr.read()); // 50752('와')
		    // 2bytes에 해당하는 기본자료형 = short(범위 -32768 ~ 32767) vs Java에서는 지원하지 않는 양수 unsigned short로 유니코드 할당되어있음(? 정확히 못 들음..)
			// 지원하는 encoding 방식에 따라 숫자는 조금 다를 수 있음
			// Java에서 표현할 수 없는
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read()); // -1
			System.out.println(fr.read()); // -1
			*/
			
			// 반복문 사용해서 파일 내용 읽어오기
			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char)value); // 유니코드 숫자(?)가 아닌, 문자로 보고 싶으므로 (char)로 형 변환
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileRead() 메소드 종료
	
	// 다음 챕터 chap4~ 내용
	// 1. 속도 향상 목적으로 사용하는 보조스트림
	// 2. 객체 단위로 데이터 입출력하게 도와주는 보조스트림

}
