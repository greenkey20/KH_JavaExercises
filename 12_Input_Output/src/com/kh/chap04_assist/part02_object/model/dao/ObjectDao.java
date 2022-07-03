// 2021.11.18(목) 9h
package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	public void fileSave(String fileName) { // 파일 이름을 입력받아서 지정
		
		// 프로그램 -> 외부매체(파일)
		// 출력
		
		// ObjectOutputStream: 객체 단위(객체 데이터)를 파일에 출력하고자 할 때 필요한 보조스트림
		
		Phone ph = new Phone("아이폰", "14pro", "Apple", 1990000); // 파일에 넣을 객체 생성
		
		// 단계1) FileOutputStream -> 기반스트림(1byte 단위 전송)
		// 단계2) ObjectOutputStream -> 보조스트림
		
		// 단계4) close() -> 자원 반납
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			// 단계3) writeObject -> 객체 데이터를 파일에 출력
			oos.writeObject(ph); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // fileSave() 메소드 종료
	
	// 객체를 파일로 출력했더니 깨져서 나오고 직렬화 exception -> 객체를 직렬화 -> 다시 파일 출력해보니 읽기 어려운 데이터가 나옴
	// 파일에 객체가 잘 담겼는지 확인해 보기 위해 다시 입력해보자
	public void fileRead(String fileName) {
		
		// 프로그램 <- 외부매체(파일)
		// 입력
		
		// ObjectInputStream: 파일로부터 객체 단위로 읽어올 때 사용하는 보조스트림 
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			// 단계1) FileInputStream -> 기반스트림 생성
			fis = new FileInputStream(fileName);
			
			// 단계2) ObjectInputStream -> 보조스트림 생성
			ois = new ObjectInputStream(fis);
			
			// 단계3) readObject -> 객체 데이터를 파일로부터 읽어오기
			// 역직렬화는 readObject()가 알아서 해줌
			
			Phone ph = (Phone)ois.readObject(); // Object 모양(부모클래스)으로 생긴, 읽어온 데이터를 Phone 객체(자식클래스)에 넣으려고 함; Phone 클래스(자식클래스)는 Object 클래스를 상속받음 -> 'Type mismatch: cannot convert from Object to Phone' -> Phone 클래스로 downcasting 필요; 다형성
			System.out.println(ph);
			
			
		} catch (FileNotFoundException e) { // 파일이 없어서 발생하는 예외
//			System.out.println("파일이 잘못되었습니다. 파일을 다시 입력해주세요"); // 출력 예시 문구 제대로 못봄; 프로그램 사용자들은 예외의 구체적인 내용을 알면/보면 안 됨 -> 사용자들에게는 '파일을 잘 넣어주세요'라고 알려줌
			e.printStackTrace(); 
		} catch (IOException e) { // 입출력 관련 문제(? 제대로 못 들음 10h18)
			e.printStackTrace();
		} catch (Exception e) { // 모든 예외사항 퉁쳐서 처리해도 됨
			e.printStackTrace();
//			System.out.println("오류가 발생했습니다");
		} finally {
			// 4. 객체 생성 순서와 역순으로 자원 반납
			try {
				ois.close(); // 보조스트림 닫기
				fis.close(); // 기반스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	} // fileRead() 메소드 종료

}
