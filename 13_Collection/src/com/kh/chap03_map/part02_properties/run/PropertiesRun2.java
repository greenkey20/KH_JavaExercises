// 2021.11.19(금) 16h
package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		
		// .xml(확장자가 xml인 파일): 다양한 프로그래밍 언어 간 호환성이 좋음
		// 나중에 css 배울 때쯤(?) 중요해짐
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Set2", "HashSet");
		
		System.out.println(prop); // {Set=HashSet, List=ArrayList}
		System.out.println(prop.getProperty("Set")); // ArrayList
		
		Properties inputXml = new Properties();
		
		try {
			// XML로 저장
			prop.storeToXML(new FileOutputStream("test.xml"), "hej ^^");
			//storeToXML(OutputStream os, String comments) -> Properties의 key+value 세트를 XML파일로 저장
			
			/* xml파일의 source 형태
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties> // 부모요소 -> 아래 자식요소 3개
	<comment>hej ^^</comment> // 태그 + 닫는태그 = 요소(element); 가운데 들어가 있는 것(대부분 text) = content(? 제대로 못 들음)
	<entry key="Set">HashSet</entry>
	<entry key="List">ArrayList</entry>
</properties>
			 */
			
			// loadToXML(InputStream is) -> 불러오기
			System.out.println("여기서부터는 xml의 내용을 Eclipse에 입력받은 내용");
			inputXml.load(new FileInputStream("test.xml")); // {SET=HashSet, List=ArrayList, Map=Properties}
			System.out.println(inputXml); // 읽어온 것을 찍어/출력해보기 -> 요소가 1개만 출력됨; 강사님 설명 = xml파일 내용 중 'entry key='로 key가 중복되어 다 덮어쓰기된 것 같음
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // main() 종료

} // 클래스 영역 끝
