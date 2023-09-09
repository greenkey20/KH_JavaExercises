package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	
	// [필드부]
	private StudentController ssm = new StudentController();
	
	// [생성자부]
	public StudentMenu() { // 기본생성자; 학생 정보, 성적, 결과 등 출력
		
		System.out.println("======== 학생 정보 출력 ========");
		
		for (int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}
		
		System.out.println("======== 학생 성적 출력 ========");
		
		System.out.println("학생 점수 합계 : " + ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);
		
		System.out.println("======== 성적 결과 출력 ========");
		
		for (int i = 0; i < ssm.printStudent().length; i++) {
			
			if (ssm.printStudent()[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(ssm.printStudent()[i].getName() + " 학생은 재시험 대상입니다.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + " 학생은 통과입니다.");
			}
		}
	}

}
