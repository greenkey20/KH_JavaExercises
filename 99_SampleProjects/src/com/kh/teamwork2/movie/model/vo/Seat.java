package com.kh.teamwork2.movie.model.vo;

public class Seat implements SeatPrice { // seatPrice에 작성해둔 상수를 가져와서 사용하도록 했습니다.

	private String grade; // 좌석 등급
	private int price; // 좌석 가격

	public Seat() {
	}

	public Seat(String grade, int price) {
		this.grade = grade;
		this.price = price;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 남은 좌석을 출력하는 메소드
	public String restSeat() {
		return "Seat [grade=" + grade + ", price=" + price + "]";
	}

}
