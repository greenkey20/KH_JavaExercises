package com.kh.teamwork2.movie.controller;

import com.kh.teamwork2.movie.model.vo.*;

public class MovieController implements SeatPrice {

	private Movie[] m = { new Movie("모아나", "10:00", 5), new Movie("라푼젤", "12:00", 5), new Movie("토이스토리3", "14:00", 5) };

	// 예약자들이 들어갈 배열
	private Person[] reservePerson = new Person[21];

	// 현재 예약 인원
	public int personCount() {
		int count = 0;

		for (int i = 0; i < reservePerson.length; i++) {
			if (reservePerson[i] != null)
				count++;
		}

		return count;
	}

	// 전체 영화 출력하기
	public Movie[] movieList() {
		return m;
	}

	// 제목과 영화 배열을 비교하는 코드가 자주 사용되기 때문에 따로 메소드로 작성하여 코드를 간결하게 만들었습니다.
	// 입력받은 영화이름과 같은 영화이름 찾아서 영화번호 받아오기
	public int selectMovie(String title) {

		// 배열 인덱스와 겹치지 않는 번호인 -1을 선택하여 인덱스 사용에 지장이 없도록 하였습니다.
		int movieNum = -1;

		// 영화 제목과 고객이 입력한 제목을 비교하여 같은 제목인 인덱스를 movieNum에 저장하고 반복문을 탈출하도록 했습니다.
		for (int i = 0; i < m.length; i++) {
			if (title.equals(m[i].getTitle())) {
				movieNum = i;
				break;
			}
		}

		return movieNum;
	}

	// 현재 잔여좌석 확인하기
	public Seat[] availableSeat(String title) {
		int movieNum = selectMovie(title);
		Seat[] seat = m[movieNum].getSeat();

		return seat;
	}

	// 영화 예매하기
	public void reserveMovie(String title, String name, int phone, String seatGrade) {
		for (int i = 0; i < reservePerson.length; i++) {
			if (reservePerson[i] == null) { // 예약자공간이 비어있다면 예약자 추가하기
				reservePerson[i] = new Person(name, phone, title, seatGrade);
				break; // break로 한 명만 저장하고 나오기
			}
		}

		// 팔린좌석 지우기
		int movieNum = selectMovie(title);
		Seat[] movieSeat = m[movieNum].getSeat(); // 현재영화의 잔여좌석
		for (int i = 0; i < movieSeat.length; i++) {
			if (seatGrade.equals(movieSeat[i].getGrade())) { // 현재 선택한 좌석 타입이 같다면
				m[movieNum].setSeat(i); // 좌석에 0을 대입
				return; // 하나만 삭제하고 끝내기
			}
		}
	}

	// 예약자 확인하기
	public Person[] reservationList(String rName) {

		return reservePerson;
	}

}
