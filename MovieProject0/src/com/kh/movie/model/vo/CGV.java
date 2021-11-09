package com.kh.movie.model.vo;

public class CGV extends Cinema {
	
	private Movie[] m = new Movie[5]; 
	
	public CGV() {
		super("2021-11-09",10000);
		m[0] = new Movie("아네트",55,"청소년관람가능","드라마");
		m[1] = new Movie("007 노 타임 투 다이",95,"청소년관람가능", "액션");
		m[2] = new Movie("노회찬6411", 60, "청소년관람가능", "다큐멘터리");
		m[3] = new Movie("퍼스트 카우 ", 85, "청소년관람불가", "드라마");
		m[4] = new Movie("시그널 X: 영혼의 구역",70,"청소년관람불가","미스터리");
	}

	public Movie[] releaseMovie() {
		return m;
	}
		
	@Override
	public void publish(int index, int person) {
		System.out.println(m[index].getName() + " 발행 완료! 티켓 가격은 " + super.getTicket() * person + "원입니다.");
	}

}
