package com.kh.homework.run;

import com.kh.homework.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// 1. 첫번째 문제점
		// 숙제 overriding 안 했음
		JavaStudent js = new JavaStudent();
		js.homework();
		
		// 2. 두번째 문제점
		// 어느 반 학생인가요?
//		Student st = new Student();
		Student st;
		st = new SecurityStudent();
		System.out.println(st);

	}

}
