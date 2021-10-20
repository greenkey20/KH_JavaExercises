package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile { // 클래스 영역 시작
	
	/* do-while문
	 * 별도의 조건 검사 없이 무조건 1회는 실행
	 * 조건이 맞지 않더라도 1회는 실행
	 * while(false) -> 1회는 실행
	 * 
	 * 표현법
	 * do {
	 * 		System.out.println("한 번 해봐~");
	 * 		증감식; // 필수 아님
	 * } while (조건식);
	 * 
	 * while과 do-while 차이점
	 * while문은 처음 수행할 때도 조건식 검사 후 true여야 실행
	 * vs d0-while문은 첫 실행은 별도의 조건검사 없이 무조건 1번 실행(일단 해 봐)
	 * 
	 */
	
	public void method1() {
		// 애초에 조건이 맞지 않아도 1번은 실행
		
		int num = 1; // 초기식
		
		do {
			System.out.println("무조건 한 번 해봐~");
		} while(num == 0);
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i++ + " "); // 증감식 포함해서 1줄로 작성; 좋은 코드라는 건 아님..
//			System.out.print(i + " ");
//			i++; // 눈에 잘 보이는/직관적인 표기..
		} while (i <= 5);
	}
	
	public void method3() { // method3 영역 시작
		// gugudan()의 while문 버전: 사용자로부터 몇 단인지 입력받고, while문 사용해서 구구단 출력
		// -> 어제 과제로 for문으로 만든 것 while문으로 써보기
		// -> 같은 결과를 구현하는 경우(if-switch, for-while 등) 내가 더 사용하기 편한 구문 사용하면 됨(성능은 나중에 고려할 것임)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		int i = 1; // 제어변수 선언 및 초기화, ~9
		
		while(i <= 9) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
			i++;
		}
		
	} // method3 영역 끝

} // 클래스 영역 끝
