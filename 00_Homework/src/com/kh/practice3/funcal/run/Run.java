package com.kh.practice3.funcal.run;

import com.kh.practice3.funcal.view.FunCalMenu;

public class Run {

	public static void main(String[] args) {
		FunCalMenu fm = new FunCalMenu();
		fm.mainMenu();
		
	}

/* 2021.11.1자 숙제 회고
 * 수행: 내용 클래스 하나와 Run 클래스 하나에 성능 구현은 점심시간 종료 시까지 완성하였습니다. 수업 후에는 객체지향 스타일로 만들어보고 싶어 도전했습니다.
 * 어려운 점: 1) 다형성을 딱히 사용하지는 않았는데, 어떻게 적용할 수 있을지 더 생각해보고 싶습니다.
 * 		   2) Level 클래스를 상속받는 상/중/하 난이도 클래스의 활용도가 낮았는데, 어떻게 더 적극적으로 활용할 수 있을지 더 고민해보고 싶습니다.
 * 		   3) FunCalController에서 게임 문제 내는 메소드를 더 작은 단위의 메소드로 나눠서 만들 수 있을지 더 고민해보고 싶습니다.
 * 		   4) FunCalMenu에서 사용자가 게임 시작 시 바로 멈추고 싶을 때 숫자가 아닌 문자를 입력했을 때만 종료할 수 있도록 예외처리(?)하고 싶었는데, 어떻게 숫자만 분류해낼지 잘 모르겠어서 일단 구현을 안 했습니다.
 * 
 *  감사합니다. 남은 한 주도 건강하게 보내시길 바랍니다!
 */
	
}
