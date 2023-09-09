package com.kh.movie.model.vo;

public class LotteCinema extends Cinema {
	
	private Movie[] m = new Movie[5];

	public LotteCinema() {
		super("2021-11-10", 8000);
		m[0] = new Movie("이터널스", 155, "청소년관람불가", "액션");
		m[1] = new Movie("듄",155,"청소년관람가능", "모험");
		m[2] = new Movie("고장난 론", 106, "청소년관람가능", "애니메이션");
		m[3] = new Movie("보이스", 109, "청소년관람가능", "액션");
		m[4] = new Movie("빌리 홀리데이",130, "청소년관람불가", "드라마");
	}
	
	public Movie[] releaseMovie() {
		return m;
	}
	
	@Override
	public void publish(int index, int person) {
		System.out.println(m[index].getName() + " 발행 완료! 티켓 가격은 " + super.getTicket() * person +"원 입니다.");
	}

}
