package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	
	// [필드부]
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10]; 
	
	// [생성자부]
		
	// [메소드부]
	public int[] personCount() { // 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
		int[] counts = new int[2];
		
		int studentCount = 0;
		int employeeCount = 0;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				studentCount++;
			}
		}
		
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				employeeCount++;
			}
		}
		
		counts[0] = studentCount;
		counts[1] = employeeCount;
		
		return counts;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		// 매개변수로 받아온 데이터를 학생 객체배열 중 빈 곳에 저장하는 메소드
		Student st = new Student(name, age, height, weight, grade, major);
		s[personCount()[0]] = st;
	}
	
	public Student[] printStudent() { // 학생 객체배열의 주소를 반환하는 메소드
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		// 매개변수로 받아온 데이터를 사원 객체배열 중 빈 곳에 저장하는 메소드
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
			}
		}
	}
	
	public Employee[] printEmployee() { // 사원 객체배열의 주소를 반환하는 메소드
		return e;
	}

}
