// 2021.11.19(금) 16h
package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties: Map계열 -> key+value 세트로 저장; 단, key와 value 모두 String형을 다룸
		// 표현법: Properties 이름 = new Properties();
		Properties prop = new Properties();
		
		/*
		prop.put("머쉬룸버거", new Burger("고소함", 450));
		System.out.println(prop); // {머쉬룸버거=Burger [flavor=고소함, calorie=450]}
		System.out.println(prop.get("머쉬룸버거")); // Burger [flavor=고소함, calorie=450]
		*/
		/* Map계열이기 때문에 key+value 세트로 저장이 됨 + 굳이 String형이 아니어도 put()를 통해 잘 저장됨
		 * 그러면 왜 String, String으로 다뤄야 하는가? -> Properties의 용도 = 파일 입/출력을 위해 e.g. key+value 세트 파일로 기록, 파일로부터 읽어오는 용도 등
		 * .Properties 확장자 파일 = 자주 변경되지 않는/고정해두는 설정 파일, 해당 프로그램이 기본적으로 가져야할 정보 담는 파일
		 * 
		 * String, String형으로 담아보기
		 */
		
		/*
		prop.put("List", "ArrayList");
		prop.put("SET", "HashSet");
		prop.put("Map", "HashMap");
		prop.put("Map", "Properties"); // Map계열은 key값 중복 허용x -> 나중에 사용한(?) key값의 value로 덮어쓰기
		*/
		
		// Properties에서만 쓸 수 있는 메소드
		prop.setProperty("List", "ArrayList");
		prop.setProperty("SET", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties"); 
		
		System.out.println(prop); // {SET=HashSet, List=ArrayList, Map=Properties}
		
		Properties inputProp = new Properties();
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test"); // import java.io.FileNotFoundException; + FileNotFound 예외 처리
			// store(OutputStream os, String Comments): 파일 기록 시 사용하는 메소드 -> key=value 형태로 파일에 출력됨; # 뒤의 내용은 주석(Comments 내용 + 파일 생성 날짜)
			
			// 입력
			System.out.println("여기서부터는 Properties의 내용을 Eclipse에 입력받은 내용");
			inputProp.load(new FileInputStream("test.properties")); // {SET=HashSet, List=ArrayList, Map=Properties}
			// load(InputStream is): 파일로부터 읽어올 때 쓰이는 메소드
			
			System.out.println(inputProp); // 읽어온 것을 찍어/출력해보기 -> 주석은 안 읽힘
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 부모클래스가 위에 있으면 부모클래스가 모든 예외를 처리하기 때문에, 자식클래스(FileNotFoundException 처리 catch문)가 필요없는, 죽은, 코드가 됨
			e.printStackTrace();
		}

	} // main() 종료

} // 클래스 영역 끝
