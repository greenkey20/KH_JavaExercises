package com.kh.movie.model.vo;

public class CGV extends Cinema { // 영화관 공통(Cinema) 클래스를 상속받는 개별 영화관 CGV의 값을 담을 클래스
	
	// [필드부]
	private Movie[] m = new Movie[5]; // 영화(Movie) 자료형 객체 5개를 담을 수 있는 객체배열 선언 및 할당
	
	// [생성자부]
	public CGV() { // 기본 생성자; 객체 생성 시 상영 일자, 티켓 가격, 상영 영화 목록이 초기화될 수 있게 함
		super("2021-11-09", 10000);
		m[0] = new Movie("아네트",55,"청소년관람가능","드라마");
		m[1] = new Movie("007 노 타임 투 다이",95,"청소년관람가능", "액션");
		m[2] = new Movie("노회찬6411", 60, "청소년관람가능", "다큐멘터리");
		m[3] = new Movie("퍼스트 카우 ", 85, "청소년관람불가", "드라마");
		m[4] = new Movie("시그널 X: 영혼의 구역",70,"청소년관람불가","미스터리");
	}

	// [메소드부]
	// getter, setter는 프로그램 전체에서 필요 없어서 삭제
	
	public Movie[] releaseMovie() { // CGV 영화관에서 상영 중인 영화 5개를 담는 객체배열의 주소값을 반환하는 메소드
		return m;
	}
		
	@Override
	public void publish(int index, int person) { // 부모클래스로부터 상속받아 오버라이딩해서 쓰는 메소드; 영화 선택과 인원 수를 매개변수로 받아 영화관 티켓을 출력하는 메소드 
		System.out.println(m[index].getName() + " 발행 완료! 티켓 가격은 " + super.getTicket() * person + "원입니다.");
	}

}
