package com.kh.hw.person.view;

import java.util.Scanner;
import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	
	// [필드부]
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	// [생성자부]
		
	// [메소드부]
	public void mainMenu() { // 메인 메뉴를 출력하는 메소드
		while (true) {
			System.out.println("학생은 최대 " + pc.printStudent().length + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("학생은 최대 " + pc.printEmployee().length + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 > ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 : studentMenu();
				break;
			case 2 : employeeMenu();
				break;
			case 9 : System.out.println("종료합니다");
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
			}
		}
	}
	
	public void studentMenu() { // 학생 메뉴를 출력하는 메소드
		while (true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인 메뉴로");
			
			if (pc.personCount()[0] == pc.printStudent().length) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 \"1. 학생 추가\" 메뉴는 더 이상 활성화되지 않습니다.");
			}
			
			System.out.print("메뉴 번호 > ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 : if (pc.personCount()[0] == pc.printStudent().length) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
						break;
					} else {
						insertStudent();
						return;
					}
			case 2 : printStudent();
				return;
			case 9 : System.out.println("메인 메뉴로 돌아갑니다.");
				mainMenu();
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
			}
		}
	}
	
	public void employeeMenu() { // 사원 메뉴를 출력하는 메소드
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인 메뉴로");
			
			if (pc.personCount()[1] == pc.printEmployee().length) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 \"1. 사원 추가\" 메뉴는 더 이상 활성화되지 않습니다.");
			}
			
			System.out.print("메뉴 번호 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : if (pc.personCount()[1] == pc.printEmployee().length) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
						break;
					} else {
						insertEmployee();
						return;
					}
			case 2 : printEmployee();
				return;
			case 9 : System.out.println("메인 메뉴로 돌아갑니다.");
				mainMenu();
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
			}
		}
	}
	
	public void insertStudent() { // 사용자로부터 객체배열에 저장할 학생 데이터를 받는 메소드
		while (true) {
			if (pc.personCount()[0] == pc.printStudent().length) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				studentMenu();
				return;
			} else if (pc.personCount()[0] < pc.printStudent().length) {
				sc.nextLine();
				
				System.out.print("학생 이름 > ");
				String name = sc.nextLine();
				
				System.out.print("학생 나이 > ");
				int age = sc.nextInt();
				
				System.out.print("학생 키 > ");
				double height = sc.nextDouble();
				
				System.out.print("학생 몸무게 > ");
				double weight = sc.nextDouble();
				
				System.out.print("학생 학년 > ");
				int grade = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("학생 전공 > ");
				String major = sc.nextLine();
				
				pc.insertStudent(name, age, height, weight, grade, major);
				
				System.out.print("그만 하시려면 N 또는 n을, 이어하시려면 아무 키나 누르세요 > ");
				String key = sc.next();
				
				switch(key) {
				case "N" :
				case "n" : studentMenu();
					break;
				default : continue;
				}
			}
		}
	}
	
	public void printStudent() { // 객체배열에 저장된 학생 데이터를 출력하는 메소드
		for (int i = 0; i < pc.printStudent().length; i++) {
			if (pc.printStudent()[i] == null) {
				System.out.println("출력할 학생 데이터가 없습니다. 학생 메뉴로 돌아갑니다.");
				studentMenu();
				return;
			} else {
				System.out.println(pc.printStudent()[i].toString());
			}
		}
	}
	
	public void insertEmployee() { // 사용자로부터 객체배열에 저장할 사원 데이터를 받는 메소드
		while (true) {
			System.out.print("사원 이름 > ");
			String name = sc.nextLine();
			
			System.out.print("사원 나이 > ");
			int age = sc.nextInt();
			
			System.out.print("사원 키 > ");
			double height = sc.nextDouble();
			
			System.out.print("사원 몸무게 > ");
			double weight = sc.nextDouble();
			
			System.out.print("사원 급여 > ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("사원 부서 > ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if (pc.personCount()[1] < pc.printEmployee().length) {
				System.out.print("그만 하시려면 N 또는 n을, 이어하시려면 아무 키나 누르세요");
				String key = sc.next();
				
				switch(key) {
				case "N" :
				case "n" : return;
				default : continue;
				}
			} else if (pc.personCount()[1] == pc.printEmployee().length) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				studentMenu();
				return;
			}
		}
	}
	
	public void printEmployee() { // 객체배열에 저장된 사원 데이터를 출력하는 메소드
		for (int i = 0; i < pc.printEmployee().length; i++) {
			if (pc.printEmployee()[i] == null) {
				System.out.println("출력할 사원 데이터가 없습니다. 사원 메뉴로 돌아갑니다.");
				employeeMenu();
				return;
			} else {
				System.out.println(pc.printEmployee()[i].toString());
			}
		}
	}

}
