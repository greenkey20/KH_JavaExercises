package com.kh.movie.model.vo;

public class Movie { // 영화관에서 상영 중인 영화 각각의 정보를 담는 클래스
	
	private String name;
	private int time;
	private String ageLimit;
	private String genre;
	
	public Movie() {
//		super();
	}

	public Movie(String name, int time, String ageLimit, String genre) {
//		super();
		this.name = name;
		this.time = time;
		this.ageLimit = ageLimit;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return "[이름 : " + name + ", 시간 : " + time + ", 연령 제한 : " + ageLimit + ", 장르 : " + genre + "]";
	}

}
