package com.kh.teamwork2.casino.model.vo;

public class Blackjack extends Game {

	private int[] Dealdeck = new int[5];
	private int[] Mydeck = new int[5];

//	 메소드가 받아오는 매개변수의 값을 셋을 통해서 현재 클래스의 필드부에 저장시킨다.
//	 셋을통해 받아온 값을 리턴값으로 같은 정수배열 자료형으로 겟을 통해서 반환해준다.

	public int[] getDealdeck() {
		return Dealdeck;
	}

	public void setDealdeck(int[] dealdeck) {
		Dealdeck = dealdeck;
	}

	public int[] getMydeck() {
		return Mydeck;
	}

	public void setMydeck(int[] mydeck) {
		Mydeck = mydeck;
	}

	public void start() {
		for (int i = 0; i < 2; i++) {
			Mydeck[i] = (int) ((Math.random() * 13) + 1);
			Dealdeck[i] = (int) ((Math.random() * 13) + 1);
		}
	}
//		정확히 몇번 반복되어야하는지 알고있음으로 포문을 통해 2번 반복할수잇는 초기식
//		조건식 증감식을 세우고 실행구문안에서 마이덱과 딜덱 0,1번째 인덱스에 1~13까지 발생하는 랜덤의
//		숫자를 인트형으로 강제 형변환 해서 대입시켯다.

	public void hit(int j) {
		if (j < 5) {
			Mydeck[j] = (int) ((Math.random() * 13) + 1);
			Dealdeck[j] = (int) ((Math.random() * 13) + 1);

		}
	}
//		필드부에 선언 해뒀던 j라는 정수형 레퍼런스가 5보다 작을때 실행할수있는 구문을 만들고
//		구문안에선 처음 호출될때 마이덱과딜덱의 인덱스 2번 즉 3번째 자리에 랜덤으로만든숫자를
//		대입하고 현재 클래스에 있는 변수 J에 증감해 1을 증가시키고 이프문을 종료한다.
//		고로 다시 힛이라는 메소드가 호출될때 J	는 2가아닌 3으로 시작함으로 다음 배열에 값을
//		대입할수 있다.

	@Override
	public int payFee() {// 컨트롤러에서 직접 입력
		return 0;
	}

}
