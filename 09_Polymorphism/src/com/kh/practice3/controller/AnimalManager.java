package com.kh.practice3.controller;

import java.util.Scanner;

import com.kh.practice3.model.vo.*;

public class AnimalManager {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kind = 0;
		
		Animal[] aArr = new Animal[5];
		
		for (int i = 0; i < aArr.length; i++) {
			kind = (int)(Math.random() * 2);
			
			if (kind == 0) {
				System.out.print("강아지 이름 입력 > ");
				String name = sc.nextLine();
				System.out.print("종류 입력 > ");
				String kinds = sc.nextLine();
				System.out.print("몸무게 입력 > ");
				double weight = sc.nextDouble();
				sc.nextLine();
				aArr[i] = new Dog(name, kinds, weight);
//				aArr[i].toString();
			} else {
				System.out.print("고양이 이름 입력 > ");
				String name = sc.nextLine();
				System.out.print("종류 입력 > ");
				String kinds = sc.nextLine();
				System.out.print("서식지 입력 > ");
				String location = sc.nextLine();
				System.out.print("색상 입력 > ");
				String color = sc.nextLine();
				aArr[i] = new Cat(name, kinds, location, color);
//				aArr[i].toString();
			}
			
			aArr[i].speak();
			
		}

	}

}
