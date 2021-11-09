package com.kh.movie.controller;

import java.util.Scanner;

import com.kh.movie.model.vo.CGV;
import com.kh.movie.model.vo.Cinema;
import com.kh.movie.model.vo.LotteCinema;
import com.kh.movie.model.vo.Movie;

public class CinemaController {
	
	private Scanner sc = new Scanner(System.in);
	private Cinema[] c = {new CGV(), new LotteCinema()};
//	private int select;
	private int cinemaSelect;
	private int movieSelect;
	private int person;
	
//	public void ticketing() { // ticketing 메소드 영역 시작
//		
//		System.out.println("영화관을 선택하세요");
//		System.out.println("1. CGV");
//		System.out.println("2. 롯데시네마");
//		System.out.print("영화관 선택 : ");
//		select = sc.nextInt();
//		
//		if (select == 1) {
//			Movie[] m = ((CGV)c[0]).releaseMovie();
//			System.out.println("CGV 영화의 개봉 날짜 : " + c[0].getRelease() + " / 티켓 가격 : " + c[0].getTicket());
//			for (int i = 0; i < m.length; i++) {
//				System.out.println(i + 1 + ". "+ m[i]);
//			}
//			System.out.print("영화를 선택하세요! : ");
//			select = sc.nextInt();
//			System.out.print("인원수를 입력하세요! : ");
//			person = sc.nextInt();
//			
//			switch(select) {
//			case 1 : ((CGV)c[0]).publish(select-1,person); break;
//			case 2 : ((CGV)c[0]).publish(select-1,person); break;
//			case 3 : ((CGV)c[0]).publish(select-1,person); break;
//			case 4 : ((CGV)c[0]).publish(select-1,person); break;
//			case 5 : ((CGV)c[0]).publish(select-1,person); break;
//			default : 
//				break;
//			} 
//		} else if(select == 2){
//			Movie[] m = ((LotteCinema)c[1]).releaseMovie();
//			System.out.println("롯데시네마 영화의 개봉 날짜 : " + c[1].getRelease() + " / 티켓 가격 : " + c[1].getTicket());
//			for (int i = 0; i < m.length; i++) {
//				System.out.println(i + 1 + ". "+ m[i]);
//			}
//			System.out.print("영화를 선택하세요! : ");
//			select = sc.nextInt();
//			System.out.print("인원수를 입력하세요! : ");
//			person = sc.nextInt();
//			
//			switch(select) {
//			case 1 : ((LotteCinema)c[1]).publish(select-1,person); break;
//			case 2 : ((LotteCinema)c[1]).publish(select-1,person); break;
//			case 3 : ((LotteCinema)c[1]).publish(select-1,person); break;
//			case 4 : ((LotteCinema)c[1]).publish(select-1,person); break;
//			case 5 : ((LotteCinema)c[1]).publish(select-1,person); break;
//			default : 
//				break;
//			}
//		}
//		
//	} // ticketing 메소드 영역 끝
	
	public void ticketing2() { // ticketing2 메소드 영역 시작
		
		System.out.println("영화관을 선택하세요");
		System.out.println("1. CGV");
		System.out.println("2. 롯데시네마");
		System.out.print("영화관 선택 > ");
		cinemaSelect = sc.nextInt();
		
		if (cinemaSelect == 1) {
			System.out.println("CGV 영화의 개봉 날짜 : " + c[cinemaSelect - 1].getRelease() + " / 티켓 가격 : " + c[cinemaSelect - 1].getTicket());
			for (int i = 0; i < ((CGV)c[cinemaSelect - 1]).releaseMovie().length; i++) {
				System.out.println((i + 1) + ". "+ ((CGV)c[cinemaSelect - 1]).releaseMovie()[i]);
			}
		} else if(cinemaSelect == 2){
			System.out.println("롯데시네마 영화의 개봉 날짜 : " + c[cinemaSelect - 1].getRelease() + " / 티켓 가격 : " + c[cinemaSelect - 1].getTicket());
			for (int i = 0; i < ((LotteCinema)c[cinemaSelect - 1]).releaseMovie().length; i++) {
				System.out.println((i + 1) + ". "+ ((LotteCinema)c[cinemaSelect - 1]).releaseMovie()[i]);
			}
		}
		
		System.out.print("영화를 선택하세요! : ");
		movieSelect = sc.nextInt();
		System.out.print("인원수를 입력하세요! : ");
		person = sc.nextInt();
		
		c[cinemaSelect - 1].publish(movieSelect - 1, person);
		
	} // ticketing2 메소드 영역 끝
	
}
