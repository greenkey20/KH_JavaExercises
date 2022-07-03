package com.kh.teamwork2.movie.model.vo;

public class Movie extends Seat {

	private String title;
	private String time;
	private int star; // 별점
	private Seat[] seat = { // 남은 좌석
			new Seat("VIP", VIP), new Seat("R", R), new Seat("R", R), new Seat("A", A), new Seat("A", A),
			new Seat("B", B), new Seat("B", B) };

	public Movie() {
	}

	public Movie(String title, String time, int star) {
		this.title = title;
		this.time = time;
		this.star = star;
	}

	public String getTitle() {
		return title;
	}

	public void setName(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public Seat[] getSeat() {
		return seat;
	}

	// 좌석 지우기
	public void setSeat(int i) {
		this.seat[i] = new Seat("0", 0);
		// 이미 팔린 좌석에 null값을 대입하는 방법을 사용해보니, null 대입 후 전체 seat[] 배열을 읽어올 때
		// nullPointException 오류가 발생했습니다.
		// 팔린 좌석에 0을 대입하고 전체 배열을 읽을 때 0을 제외하는 방법으로 오류가 나지 않도록 했습니다.
	}

	@Override
	public String toString() {
		return "title=" + title + ", time=" + time + ", star=" + star;

	}

	// 남아있는 좌석의 수를 출력해주는 부분
	@Override
	public String restSeat() {
		return super.restSeat();
	}

}
