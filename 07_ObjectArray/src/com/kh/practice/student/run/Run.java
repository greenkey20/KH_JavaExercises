package com.kh.practice.student.run;

import com.kh.practice.student.view.StudentMenu;

public class Run {

	public static void main(String[] args) { // StudentMenu 실행
		
		StudentMenu sm = new StudentMenu();

	}

/* 2021.10.28자 숙제 수행 소감
 * [Student 클래스] 과제 명세에 따라 무난하게 작성하였습니다.
 * 
 * [StudentController 클래스] 객체 배열을 완전히 이해하지는 못한 상태로 과제 명세를 따라 한 줄 한 줄 적어내려갔습니다.
 * 즉, sArr이 정확히 무엇인지 모르겠는데, 메소드들을 만들다보니 Student[] 배열의 내용이 필요하니 일단 사용했고, 해 보니 되었습니다. 스스로 잘 모르고 썼는데, 왜 되는지 더 생각을 해봐야 할 것 같습니다.
 * avgScore() 메소드 만들 때는 조금 더 막혔는데, 같은 클래스의 다른 메소드(sumScore)의 반환값을 사용하기 위해 해당 클래스의 객체를 만들어서 써봤는데, 이렇게밖에 접근이 안 되는지 의아합니다. 복습을 좀 더 해야 할 것 같습니다.
 * 
 * [StudentMenu 클래스] StudentController 클래스 생성자로 만든 객체 배열(의 인덱스)에 어떻게 접근하는지 몰라 한참을 헤매다가, 친구에게 도움을 청해 ssm.printStudent()[i]와 같이 printStudent() 메소드 호출하는 법(?)을 듣고 활용해서 완성했습니다.
 * 
 * [총평] 객체 배열을 사용하는 것, 클래스 간 왔다갔다 하는 것이 익숙하지 않아서인지 어려웠지만, 잘 모르겠어서 실습해 보고 싶었던 부분들을 실습해 봐서 좋았습니다.
 * 이번 한 주도 열정적으로 지도해 주셔서 감사합니다! 
 */
	
}
