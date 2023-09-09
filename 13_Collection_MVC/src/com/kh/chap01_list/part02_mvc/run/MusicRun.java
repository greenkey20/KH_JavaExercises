package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicView;

public class MusicRun {
	
	/* MVC패턴 적용한 음악 관리 프로그램
	 * 용도별 패키지 구분
	 * M: Model; 데이터를 담당하는 역할(model.vo: 값을 담음; model.dao: 값 처리)
	 * V: View; 사용자가 보는 화면 처리/시각적인 요소 + 입력, 출력 -> View가 아닌 곳에서 입/출력문 사용 자제하기
	 * C: Controller; 사용자가 화면을 통해 요청한 것을 받아서 처리하고 결과를 돌려주는 역할
	 * 
	 * vo 클래스 먼저 생성
	 * 프로그램 설계가 이미 끝났다면 View단부터 만들기
	 */

	public static void main(String[] args) {
		
		// 메인화면 띄우기
		new MusicView().mainMenu(); // MusicView 클래스의 기본 생성자 호출해서 객체 생성하고, 그 객체의 mainMenu() 메소드 호출

	}

}
