package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedReader, BufferedWriter 보조스트림(BufferedXXX) -> 버퍼 공간 제공해서 모아뒀다가 한꺼번에 입출력 진행 -> 속도 향상
	// scanner nextLine 개행
	
	// 보조스트림은 외부매체와(?) 직접 연결 불가능 -> 보조스트림은 단독으로 존재할 수 없음; 기반스트림이 있어야/통로를 뚫어놔야지만..
	// 표현법: 보조스트림클래스이름 객체이름 = new 보조스트림클래스이름(기반스트림객체);
	
	public void fileSave() {
		// 프로그램 -> 외부매체(파일)
		// 출력
		
		// BufferedWriter: 버퍼공간 제공해서 한꺼번에 출력 진행
		// 기반스트림이 Input/Output 계열일 경우, 보조스트림도 Input/Output 계열 사용
		// 기반스트림이 Reader/Writer 계열일 경우, 보조스트림도 Reader/Writer 계열 사용
		
		FileWriter fw = null; // 기반스트림 객체 선언; 언제/어디서 사용할지 모르니까 미리 선언만 해 둔 것임
		BufferedWriter bw = null; // 보조스트림 객체 선언
		
		try {
			// 1. 기반스트림 객체 생성 = 연결통로 만들기
			fw = new FileWriter("c_buffer.txt");
			
			// 2. 보조스트림 객체 생성
			bw = new BufferedWriter(fw);
			// bw = new BufferedWriter(new FileWriter("c_buffer.txt")); // 이렇게 1줄로 기반스트림과 보조스트림 객체 동시에 생성 가능
			
			// 3. write() 메소드 호출 -> 파일에 쓰기
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다\n");
			bw.write("잘 가셔요~");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. close() -> 자원이 생성된 순서의 역순으로 자원 반납
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		// log file = 어떤 일이 일어났는지 세세하게 기록됨 -> 양이 많음; 개발자는 로그파일 만들고(Output 사용), 시스템관리자, 보안담당자 등이 받아서 분석/사용
		
	} // fileSave() 메소드 종료

	public void fileRead() {
		// 프로그램 <- 외부매체(파일)
		// 입력
		
		// FileReader 기반으로 BufferedReader 추가해서 사용
		
		/*
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// 1. 기반스트림 객체 생성
			fr = new FileReader("c_buffer.txt");
			// 2. 보조스트림 객체 생성
			br = new BufferedReader(fr);
			
			// 3. read() -> 읽어오기
			 * 
			// System.out.println(br.read()); // 50504
			System.out.println(br.readLine()); // BufferedReader에는 1줄 통째로(다음 개행문자까지? 설명 제대로 못 들음) 읽어오는 + 문자열로 출력해주는 메소드 readLine() 있음
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // null(아무 값도 없음)
			
			String value = null;
			while ((value = br.readLine()) != null){
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. close() -> 자원 반납; 언제 어디서 문제가 발생할지 모르므로, 원칙에 따라 close해주는 것이 좋음
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// 실수로 자원 반납을 까먹는 경우 등 누가 대신 close 해 줄 수 있을까?
		/* try ~ with ~ resource 구문
	 	 * JDK7 버전 이상부터 가능
	 	 * 표현법:
	 	 * try {
	 	 * 		예외가 발생할법한 구문
	 	 * } catch(예외클래스이름 e) {
	 	 * 		해당 예외가 발생했을 때 실행할 구문
	 	 * }
	 	 * 스트림객체(+선언 부분?)를 try에 넣어버리면 스트림 객체 생성 후 해당 블록의 구문이 실행 완료되면 알아서 자원 반납이 됨
	 	 * 객체 생성을 여러 개 할 경우 마지막 생성부는 ; 붙여도 되고 안 붙여도 됨
	 	 */
		
		// close 안 써도 되는 방법(?) 설명/실습 통째로 못 따라감..
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			
			// 방법1) 수업시간에 한 방법
			String value = null;
			while ((value = br.readLine()) != null){
				System.out.println(value);
			}
			
			// 방법2) 강사님께서 수업 후 올려주신 방법
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // fileRead() 메소드 종료

}
