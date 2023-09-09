package com.kh.jonggak.run;

import com.kh.jonggak.model.vo.*;

public class King {

	public static void main(String[] args) {
		
		JavaLecture lee = new JavaLecture("이승철", "Java");
		JavaLecture go = new JavaLecture("고토미", "Java");
		JavaLecture kim = new JavaLecture("김해피", "Java");
		SecureLecture u = new SecureLecture("유미피", "Security");
		SecureLecture da = new SecureLecture("이판다", "Security");
		SecureLecture ho = new SecureLecture("강혁", "Security");
		CloudLecture gom = new CloudLecture("강곰돌", "Cloud");
		CloudLecture kang = new CloudLecture("강은영", "Cloud");
		
		System.out.println("정각");
		lee.startLecture();
		go.startLecture();
		kim.startLecture();
		u.startLecture();
		da.startLecture();
		ho.startLecture();
		
		System.out.println("50분");
		lee.stopLecture();
		go.stopLecture();
		kim.stopLecture();
		u.stopLecture();
		da.stopLecture();
		ho.stopLecture();
		
		// 위와 같이 호출하면 번거로움 -> 공통적인 요소들(과목끼리) 묶어 배열 만들기
		JavaLecture[] jArr = new JavaLecture[3];
		jArr[0] = lee;
		jArr[1] = go;
		jArr[2] = kim;
		
		SecureLecture[] sArr = new SecureLecture[3];
		sArr[0] = u;
		sArr[1] = da;
		sArr[2] = ho;
		
		System.out.println("정각");
		for (int i = 0 ; i < jArr.length; i++) {
			jArr[i].startLecture();
		}
		for (int i = 0 ; i < sArr.length; i++) {
			sArr[i].startLecture();
		}
		
		System.out.println("50분");
		for (int i = 0 ; i < jArr.length; i++) {
			jArr[i].stopLecture();
		}
		for (int i = 0 ; i < sArr.length; i++) {
			sArr[i].stopLecture();
		}
		
		// 상속하면 필드, 메소드(이상 부수적인 것), type(자료형) 물려받음 -> 자식클래스가 부모클래스의 필드, 메소드, 자료형를 사용할 수 있다
		// points!
		// 부모클래스로부터 상속을 받으면 자식클래스로 만든 객체는 부모클래스의 타입을 사용할 수 있음
		// 부모클래스 타입으로 형변환을 하더라도 오버라이딩된 자식클래스의 메소드가 우선권을 가짐
		//  e.g. 상속받은 자식 객체의 (오버라이딩된) 메소드가 호출된 경우, 먼저 자식 객체(자기 자신)에 그 메소드가 오버라이딩 되어있는지 확인하고(-> 있으면 오버라이딩된 자식클래스의 메소드가 우선순위를 가져 실행됨), 없으면 부모클래스에 있는지 확인하여 사용
		
		// 다양한 자료형을 Lecture 자료형 하나로 사용 가능함 = 다형성
		Lecture[] lArr = new Lecture[8]; // Lecture 자료형을 8개 담는 배열 lArr 선언 및 할당
		lArr[0] = /*(Lecture) 생략되어 있음*/lee; // lArr은 부모클래스(Lecture 자료형) <- lee는 자식클래스(JaveLecture 자료형; Lecture를 상속받았음 -> 자식은 부모의 것을 사용 가능)가 자동형변환되어 대입됨
		lArr[1] = go; // JavaLecture 자료형
		lArr[2] = kim; // JavaLecture 자료형
		lArr[3] = u; // JavaLecture 자료형
		lArr[4] = da; // JavaLecture 자료형
		lArr[5] = ho; // JavaLecture 자료형
		lArr[6] = gom; // JavaLecture 자료형
		lArr[7] = kang; // JavaLecture 자료형
		
		System.out.println("정각");
		for (int i = 0 ; i < lArr.length; i++) {
			lArr[i].startLecture(); // 부모자료형으로 자동형변환되어 부모의 필드를 빌려다 쓰되, 오버라이딩된 메소드는 내 것이 우선권을 가지는 바 사용 가능
									// 자식자료형
		}
		
		// 자료형만 변한 것 + 참조하는 객체는 안 변한 것인가?
		// 자료형은 (이 객체를) '어떻게 다룰까' 하는 것/다루는 방법 vs (실제 필드)값/데이터는 객체에 들어있음
		
		System.out.println("50분");
		for (int i = 0 ; i < lArr.length; i++) {
			lArr[i].stopLecture();
		}
		
		/* binding = 호출하는 값과 실제 호출되는 값을 묶는 것
		 * 동적 바인딩
		 * 
		 * Lecture(부모 type) 자료형
		 * JavaLecture(자식 type) 자료형 -> 오버라이딩
		 * 실제 객체 안에 들어가 있는.. (필기된 문장이 어떤 의미인지 못 들었음)
		 */
		
		// 추후 개념 배우고 더 간단하게 할 수 있는 방법
		// startAndStop();
//		public static void startAndStop() {
//			
//		}

	}

}
