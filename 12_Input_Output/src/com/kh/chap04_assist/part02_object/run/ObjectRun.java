package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
//		od.fileSave("d_object.txt"); // "d_object.txt" 파일은 생성되었으나, 'java.io.Not Serializable(직렬화) Exception'
		/* 오류 msg -> Phone 클래스에 가서 '직렬화'해야 함
		 * java.io.NotSerializableException: com.kh.chap04_assist.part02_object.model.vo.Phone
			at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1193)  // 읽기 단계4)
			at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:353) // 읽기 단계3)
			at com.kh.chap04_assist.part02_object.model.dao.ObjectDao.fileSave(ObjectDao.java:28) // 읽기 단계2) fileSave() 메소드
			at com.kh.chap04_assist.part02_object.run.ObjectRun.main(ObjectRun.java:10) // 읽기 단계1) ObjectRun 클래스의 10행에서 호출한
		 * 
		 */
		
		od.fileRead("d_object.txt");

	}

}
