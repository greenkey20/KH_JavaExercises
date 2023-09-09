package com.kh.practice.student.controller; // 기능은 여기서 할 것임

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	// [필드부]
	private Student[] sArr = new Student[5]; // Student형 클래스가 어디 있는지 경로 써줘야 함 = import
	
	public static final int CUT_LINE = 60; // 초기값 60으로 초기화
	
	// [생성자부]
	public StudentController() { // 기본생성자; 5개의 객체 배열(이 클래스의 필드부에 만들어둠)을 샘플 데이터 값으로 초기화
		sArr[0] = new Student("김길동", "Java", 100); // new 키워드로 객체에 올리고, 매개변수 3개 있는 Student 생성자 사용해서 값 초기화
		sArr[1] = new Student("박길동", "DataBase", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "Server", 60);
		sArr[4] = new Student("홍길동", "Java", 20);
	}
	
	// [메소드부]
	public Student[] printStudent() { // 객체 배열에 있는 데이터를 반환하는 메소드; 반환형 = Student[] 배열; 지문 상 반환해야 할 '데이터'가 뭔지 헷갈렸음
		return sArr; // 여기에 있는 Student[] 배열은 sArr
	}
	
	public int sumScore() { // 객체 배열의 점수를 합한 값을 반환하는 메소드
		int sum = 0; // 나는 변수명 sumScore로 지었었는데 메소드 이름과 겹치는 게 좋은 것 같지 않아서, 강사님 sum으로 변경
		
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		
		return sum;
	}
	
	public double[] avgScore() { // double 배열을 만들어 sumScore의 반환값을 0번째 index에, 합의 평균을 1번째 index에 저장 -> 배열 반환하는 메소드
//		StudentController sc = new StudentController(); // 나는 처음에 뭔가 막혀서 이렇게 StudentController 객체 만들고 했는데, 필요 없는 듯
		
		double[] avg = new double[2]; // 나는 배열명 avgScore로 지었었는데 메소드 이름과 겹치는 게 좋은 것 같지 않아서, 강사님 avg으로 변경
		
		avg[0] = sumScore();
		avg[1] = sumScore() / sArr.length;
		
		return avg;
	}

}
