package com.kh.teamwork2.movie.model.vo;

public class Person {

	private String name;
	private int phone;
	private String movieTitle;
	private String seatGrade;

	public Person() {
	}

	public Person(String name, int phone, String movieTitle, String seatGrade) {
		this.name = name;
		this.phone = phone;
		this.movieTitle = movieTitle;
		this.seatGrade = seatGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getSeatGrade() {
		return seatGrade;
	}

	public void setSeatGrade(String seatGrade) {
		this.seatGrade = seatGrade;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")님이 예매하신 영화는 " + movieTitle + "(" + seatGrade + ")좌석입니다.";
	}

}
