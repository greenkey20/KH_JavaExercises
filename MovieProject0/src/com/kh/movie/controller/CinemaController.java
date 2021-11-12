package com.kh.movie.controller;

import java.util.Scanner;

import com.kh.movie.model.vo.CGV;
import com.kh.movie.model.vo.Cinema;
import com.kh.movie.model.vo.LotteCinema;
import com.kh.movie.model.vo.Movie;

public class CinemaController { // 영화 예매를 위한 기능을 모아둔 클래스
	
	// [필드부]
	private Scanner sc = new Scanner(System.in); // 사용자로부터 값을 입력받기 위한 Scanner 클래스의 객체 생성
	private Cinema[] c = {new CGV(), new LotteCinema()}; // 예매 가능한 영화관들(2곳)의 객체(Cinema 자료형)를 담는 2칸짜리 객체배열 선언 및 초기화
														 // 각 영화관 객체는 정보(공통: 상영 일자, 1인당 티켓 가격; 개별: 상영 영화 목록)
	private int select; // 영화 예매 시 사용자의 선택 값을 담을 정수형 변수 필드 선언
	private int person; // 관람 인원을 담을 정수형 변수 필드 선언
	
	private int cinemaSelect; // 개인적으로 구현한 메소드에서 사용할 변수
	private int movieSelect; // 개인적으로 구현한 메소드에서 사용할 변수
	
	// [메소드부]
	public void ticketing() { // 영화 예매를 처리할 ticketing 메소드 영역 시작
		
		// CinemaMenu 클래스의 메인메뉴에서 "1. 영화 예매"를 선택했을 때 사용자로부터 필요한 정보를 입력받음 
		System.out.println("영화관을 선택하세요");
		System.out.println("1. CGV");
		System.out.println("2. 롯데시네마");
		System.out.print("영화관 선택 : ");
		select = sc.nextInt();
		
		if (select == 1) {
			Movie[] m = ((CGV)c[0]).releaseMovie();
			System.out.println("CGV 영화의 개봉 날짜 : " + c[0].getRelease() + " / 티켓 가격 : " + c[0].getTicket());
			for (int i = 0; i < m.length; i++) {
				System.out.println(i + 1 + ". "+ m[i]);
			}
			System.out.print("영화를 선택하세요! : ");
			select = sc.nextInt();
			System.out.print("인원수를 입력하세요! : ");
			person = sc.nextInt();
			
			switch(select) {
			case 1 : ((CGV)c[0]).publish(select-1,person); break;
			case 2 : ((CGV)c[0]).publish(select-1,person); break;
			case 3 : ((CGV)c[0]).publish(select-1,person); break;
			case 4 : ((CGV)c[0]).publish(select-1,person); break;
			case 5 : ((CGV)c[0]).publish(select-1,person); break;
			default : 
				break;
			} 
		} else if(select == 2){ // 사용자가 "2. 롯데시네마"로 영화관을 선택한 경우
			Movie[] m = ((LotteCinema)c[1]).releaseMovie(); // 이 클래스의 필드인 객체배열 c의 두번째 인덱스에 저장된 "롯데시네마" 객체의
															// releaseMovie()(상영 중인 영화 5개를 담는 객체배열의 주소값을 반환하는 메소드) 접근/호출해서
															// 반환받은 영화 목록 배열의 주소값을 Movie 자료형 배열 변수 m에 저장함
															// 단, releaseMovie() 메소드는 자식클래스("롯데시네마")에만 있고 부모클래스("Cinema")에는 없는데, 
															// c[1]의 "롯데시네마" 객체는 "Cinema" 자료형으로 취급되고 있는 바, 자식의 것을 부모가 사용할 수 없기 때문에
															// "롯데시네마" 객체의 releaseMovie() 메소드를 접근/사용하기 위해서는 다운캐스팅이 필요함
															// 생각해볼 점: Movie 자료형을 이 클래스에서 바로 쓸 수 있는 이유는? import 했네 ^^;
			System.out.println("롯데시네마 영화의 개봉 날짜 : " + c[1].getRelease() + " / 티켓 가격 : " + c[1].getTicket()); // 필드의 영화관 객체배열 c의 두번째 인덱스의 release, ticket 필드의 getter에 접근해서 관련 정보를 받아와 출력 
			for (int i = 0; i < m.length; i++) { // 상영영화 목록 객체배열의 길이만큼 반복문 돌려서
				System.out.println(i + 1 + ". "+ m[i]); // 목록의 (i+1)번째 영화 정보 출력
			}
			System.out.print("영화를 선택하세요! : "); // 사용자로부터 예매할 영화 번호를 선택/입력받고자 물어봄
			select = sc.nextInt(); // 필드 select 정수형 변수로 입력받음
			System.out.print("인원수를 입력하세요! : "); // 사용자로부터 관람 인원 수를 입력받고자 물어봄
			person = sc.nextInt(); // 필드 person 정수형 변수로 입력받음
			
			switch(select) { // 사용자가 선택한 영화가
			case 1 : ((LotteCinema)c[1]).publish(select-1,person); break; // 1번인 경우, c[1]에 저장되어 있는 "롯데시네마" 객체의 publish() 메소드를 호출해서 티켓을 출력해줌; publish() 메소드는 영화 선택(정수 값) 및 인원 수(정수 값)를 매개변수로 받음
																		  // "롯데시네마" 객체의 publish() 메소드는 첫번째 매개변수 인덱스에 저장된 상영 영화 제목과 "두번째 매개변수 * 1인당 티켓 가격 정보"를 보여줌
																		  // 여기서 사용자가 1번을 선택했다면(select 변수에 저장된 값 = 1), "롯데시네마" 객체 필드의 상영 영화 목록의 0번(1 - 1) 인덱스에 저장된 영화의 제목을 보여주는 것임 
			case 2 : ((LotteCinema)c[1]).publish(select-1,person); break;
			case 3 : ((LotteCinema)c[1]).publish(select-1,person); break;
			case 4 : ((LotteCinema)c[1]).publish(select-1,person); break;
			case 5 : ((LotteCinema)c[1]).publish(select-1,person); break;
			default : 
				break; // 1~5번 영화 이외에 다른 정수를 사용자가 입력한 경우 switch문을 빠져나감
			} // switch문 영역 끝
		} // else if문 영역 끝
		
	} // ticketing 메소드 영역 끝
	
	// 2021.11.10(수) 리뷰 후 소감: 조장님께서 추상화와 구조를 짜 주신 뒤 조원들과 함께 구현했지만, 혼자서 한 줄 한 줄 뜯어보니 정확히 설명하기 힘들거나 잘 이해가 안 가는 부분도 있습니다.
	// 저희 조 프로젝트 명세서를 보며 다시 만들어 봐야겠다는 생각이 들고, 기능을 추가해서 발전시켜 나가고 싶습니다.
	// 구현하고 보니 이렇게 실현 가능한(+재미있는) 주제 아이디어를 내신 조원분들의 능력과 선견지명도 다시 한 번 존경스럽다는 생각이 듭니다.
	
	// 개인 프로젝트: 위 기능을 다르게 구현해 봄; 의도 = 코드의 반복 줄이기 
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
