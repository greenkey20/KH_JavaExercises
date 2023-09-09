package src.com.kh.hw.person.controller;

import src.com.kh.hw.person.model.vo.*;

public class PersonController {
	
	// [필드부]
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	// [생성자부]
		
	// [메소드부]
	public int[] personCount() { // 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
		int[] counts = new int[2]; // 김민정 학우님 의견: 필드에서 선언 안 하고 내부에서 선언해서 호출하면 값이 저장이 안 된다..?! 
		
//		int studentCount = 0;
//		int employeeCount = 0;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				counts[0]++; // 입력된 학생 (객체) 수 구하기 
			}
		}
		
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				counts[1]++; // 입력된 사원 (객체) 수 구하기
			}
		}
		
		return counts;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		// 매개변수로 받아온 데이터를 학생 객체배열 중 빈 곳에 저장하는 메소드
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				s[i] = new Student(name, age, height, weight, grade, major);
			}
		}
	}
	
	public Student[] printStudent() { // 학생 객체배열의 주소를 반환하는 메소드
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		// 매개변수로 받아온 데이터를 사원 객체배열 중 빈 곳에 저장하는 메소드
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
//				e[i].setName(name);
//				e[i].setAge(age);
//				e[i].setHeight(height);
//				e[i].setWeight(weight);
//				e[i].setSalary(salary);
//				e[i].setDept(dept);
			}
		}
	}
	
	public Employee[] printEmployee() { // 사원 객체배열의 주소를 반환하는 메소드
		return e;
	}

}
