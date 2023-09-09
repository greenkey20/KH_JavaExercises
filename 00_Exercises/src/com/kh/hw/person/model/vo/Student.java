package com.kh.hw.person.model.vo;

public class Student extends Person {
	
	// [필드부]
		private int grade;
		private String major;
		
		// [생성자부]
		public Student() {
			
		}
		
		public Student(String name, int age, double height, double weight, int grade, String major) {
			super(name, age, height, weight);
			this.grade = grade;
			this.major = major;
		}
			
		// [메소드부]
		public int getGrade() {
			return grade;
		}
		
		public void setGrade(int grade) {
			this.grade = grade;
		}
		
		public String getMajor() {
			return major;
		}
		
		public void setMajor(String major) {
			this.major = major;
		}
		
		@Override
		public String toString() {
			return super.toString() + ", " + grade + "학년, " + major;
		}

}
