package com.kh.chap01_file.run;

// Java input/output은 개념 정도 알기

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		// Eclipse를 써서 a.txt 파일을 만드는 것 = 출력 = 프로그램에서 내보내는 것
		// (Java)프로그램을 기준으로 외부에서 뭔가 들어오면 '입력' vs 밖으로 나가면 '출력'
		
		// Eclipse에서 하드디스크에 파일 만들기 = 출력; Java에서 파일을 어떻게 만들까? java.io 패키지에 존재하는 File 클래스를 가지고 작업
		
		// File 클래스 객체 생성
		try { // try문에는 예외 상황이 발생할 수도 있고 발생 안 할 수도 있는 구문을 넣음
			
			// 1. 별도의 경로 지정을 하지 않고, 파일명만 제시해서 생성 -> 현재 이 프로젝트 폴더 내에 파일 생성됨 
			// 기본생성자로 객체 생성하려고 했더니 오류 메시지 = "The constructor File() is undefined" -> 생성자 호출 시 인자(argument != parameter(매개변수))를 전달해줘야 함
			File file1 = new File("test.txt"); // 파일명 = 인자 -> File 객체 생성 -> 이 객체를 가지고 파일 생성할 수 있음
			file1.createNewFile(); // 이렇게만 쓰니 "Unhandled exception type IOException" 오류 메시지 vs 파일 만드는/다루는 일 등 외부환경의 영향을 받는 작업 수행 시 예외처리를 반드시 하도록 언어 차원에서 강제하고 있음
			// createNewFile(): 파일을 생성해주는 메소드
			
			// 2. 실제 존재하는 경로(e.g. C:\aaa)를 지정한 파일명을 제시해서 파일 생성
			// C드라이브에 만들면 관리자 권한 등 조금 복잡할 수 있어서 D드라이브에 새 폴더 'aaa' 만들어 실습 권장(C드라이브 밖에 없으면 어쩔 수 없음.. C드라이버에 관리자 권한 문제 생기면 Eclipse 실행부터 관리자 권한으로..) 
			File file2 = new File("C:\\aaa\\test.txt"); // "Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )" vs \를 \로 쓰고 싶다면 \ 하나 더 붙여주면 됨 -> file2 객체 생성
			// "C:\aaa\test.txt" = 절대경로
			// cf. 역slash(\) + tab = 8칸 공백 띄어쓰기
			file2.createNewFile(); // 위 경로에 파일 생성
			
			// 3. 별도의 경로 지정하지 않고 폴더 생성하고, 그 안에 파일도 생성
			File folder = new File("eee"); /// 'eee'라는 폴더를 만듦
			folder.mkdir();
			// mkdir() : make directory(Windows folder = 유닉스 directory); 폴더를 생성해주는 메소드
			
			File file3 = new File("eee\\test.txt"); // 'eee' 폴더 안에 'text.txt' 파일 생성
			file3.createNewFile();
			
			// 4. 경로 지정해서 폴더 생성 후 파일 생성
			File folder2 = new File("C:\\bbb");
			folder2.mkdir();
			
			File file4 = new File("C:\\bbb\\text.txt");
			file4.createNewFile();
			
			// cf. printStackTrace(): 오류를 차곡차곡 쌓아두었다가 오류가 발생한 부분을 찾아가서 알려줌?
			
			// File 클래스에서 제공하는 메소드들
			
			// isFile(): 파일이면 true, 폴더이면 false 반환
			System.out.println("파일입니까? : " + file4.isFile()); // file4 = 파일 -> true
			System.out.println("파일입니까? : " + folder2.isFile()); // folder2 = 폴더 -> false
			
			System.out.println("파일 이름 : " + file4.getName()); // 파일명 추출
			System.out.println("상위폴더 : " + file4.getParent()); // 상위폴더명 추출
			System.out.println("파일 용량 : " + file4.length()); // 파일 크기 추출
			System.out.println("절대경로 : " + file4.getAbsolutePath()); // 절대경로 추출
			
		} catch (IOException e) { // 이 exception이 발생하면 잡아서
			e.printStackTrace(); // 실행할 구문
		} 
		// cf. throw = 나를 호출한 곳으로 예외 처리를 떠넘김
		// 실행 -> console에는 아무 것도 안 뜸 + 내컴퓨터 C:\workspace\12_Input_Output에 test.txt 파일 생성되어 있음
		// Eclipse > Package Explorer > 현재 이 프로젝트 폴더 refresh(마우스 오른쪽 클릭, 새로고침)하면 목록에 생성된 파일 볼 수 있음
		
		/* 프로그램 상의 데이터를 외부매체(모니터/스피커 등 출력장치, "파일")로 출력하거나 입력장치(키보드, 마우스, 마이크, "파일")로 입력받는 과정 = IO/Input & Output/입출력
		 * 이번 주 Java 공부 후 SQL문을 활용해 데이터베이스(데이터가 테이블로 저장되는 곳)로 입출력 = JDBC -> 그럴 듯한 것을 만들 수 있음
		 * 
		 * IO이 되는 원리
		 * IO를 진행하고 싶다면 우선적으로 '반드시' 프로그램과 외부매체와의 '통로(Stream, 스트림)'를 만들어줘야 함
		 * 
		 * 스트림의 특징
		 * 1. 단방향 -> 입력이면 입력, 출력이면 출력; 입/출력용 스트림 따로 존재 vs 동시에 입출력을 하고자 한다면, 하나의 스트림으로는 불가능 -> 입/출력 스트림 둘 다 갖고 있어야 함
		 * 2. 스트림은 좁음 -> 선입 선출(먼저 들어간 것이 먼저 나옴, first-in first-out/FIFO, 자료구조의 큐(queue)의 개념, 순서대로 들어가서 나옴) -> 시간 지연 문제 발생 가능 
		 * 나의 질문 = 시간 지연 문제가 무엇인가요? 자료가 빨리빨리 안 나올 수 있다는 것인가요?
		 * 
		 * 스트림의 구분
		 * 1. 통로의 사이즈에 따라
		 * byte 스트림: 1byte짜리가 이동할 수 있는 좁은 통로; 입력 스트림 = XXXInputStream, 출력 스트림 = XXXOutputStream
		 * 문자 스트림: 2byte(문자)짜리가 이동할 수 있는 비교적 넓은 통로; 입력 스트림 = XXXReader, 출력 스트림 = XXXWriter
		 * 
		 * 2. 외부매체와의 직접적인 연결 여부에 따라
		 * 기반 스트림: 외부매체와 직접적으로 연결되는 통로
		 * 보조 스트림: 기반 스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림 -> 기반 스트림을 만들고 추가해주는 용도인 바, 단독 사용 불가; 속도 향상, 자료형에 맞춰서 변환, 객체 단위로 입출력하도록 도움 등 
		 */

	}

}
