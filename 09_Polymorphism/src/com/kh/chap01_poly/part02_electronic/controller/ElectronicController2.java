package src.com.kh.chap01_poly.part02_electronic.controller;

import src.com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//다형성 적용 후: 용산 전자상가에 부모님으로부터 상속받아 새로, 더 좋게, 차린 가게 -> Controller1에 비해 codes가 훨씬 간결해짐 -> 생산성 향상 
public class ElectronicController2 {
	
	// [필드부]
	// Desktop, NintendoSwitch, SmartPhone은 Electronic으로부터 다(자료형, 필드, 메소드) 상속받음
	private Electronic[] elec = new Electronic[3];
	
	// [메소드부]
	// 자료가 들어오면 Electronic 자료형의 3칸짜리 배열에 담음 <- index에 담을 객체와 index 번호를 받음 
	public void insert(/*객체, index번호*/Electronic any, int i) {
		this.elec[i] = any; // 이 클래스의 필드 Electronic 자료형 객체 배열의 i번째 index에 매개변수로 받은 any(Electronic 자료형)를 대입/저장
	}
	
	// 재고 1개를 조회하는 메소드 -> Electronic형 배열의 1칸 조회
	// hint: 부모님 것도 내 것
	public Electronic select(int i) {
		return elec[i];
	}
	
	// 배열 사용의 장점 = codes 중복 줄임 <- 반복문 사용 가능
	// 재고 전체 조회하는 메소드
	public Electronic[] /*반환형 = Electronic 배열형*/ selectAll() {
		return elec;
	}

}
