package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch { // 클래스 C_Switch 영역 시작
	
	/* switch문
	 * 위->아래로 순차적으로 실행(o) 해당 값 case로 jump/pass(x); 단, c언어 등에서는 goto를 통해 진짜 jump하는 코드 있긴 함
	 * 동등비교 -> 해당 case(층수) 버튼 누르고 (다른 층들 거쳐 해당 case 층으로) 엘리베이터 타고 내려감
	 * 
	 * 표현식: 
	 * switch(아래에 기술할 값들과 동등 비교를 할 대상자) {
	 * switch(정수, 문자, 문자열) {
	 * 
	 *  case 값1(정수, 문자, 문자열) : 대상자(값) == 값1이 true일 경우 실행할 코드1; // 지금까지 배운 '값' = literal값; Java 최신 version에서만 값 이외에도 변수명 입력 가능 
	 *  															   // 동등 비교 결과가 false인 경우 다음 case로 넘어감
	 *  	break; // switch 영역을 빠져나감
	 *  case 값2 : 대상자 == 값2가 true일 경우 실행할 코드2;
	 *  	break;
	 *  case 값n : 대상자 == 값n이 true일 경우 실행할 코드n;
	 *  	break;
	 *  default : 실행할 코드; // if else구문에서 'else'와 같은 의미; 진짜 끝 의미 -> break 작성x
	 * } 
	 */
	
	public void method1() { // method1 영역 시작
		// 홀/짝수 판별(양/음수는 판단하지 않음)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 가능한 경우의 수는 두 가지(0: 짝수, 1: 홀수; 정수)
		
		// oddEven == 0인 경우 위->아래 모든 스위치/cases 모두 실행 -> 아래 스위치 모두 실행시키지 않으려면 break
		// oddEven == 1인 경우 (엘리베이터 스위치 버튼처럼, 가고자 하는 층이 아닌 층도 순차적으로 거쳐서) 바로(?) 값 1 case로 감 
		switch(oddEven) { // switch 우측 괄호 안에 쓴 조건(?)에 따라 case 값 결정됨..
		
		case 0 : System.out.println("짝수입니다"); // oddEven == 0인 경우
			break; // switch문에서 벗어나기/탈출하기 위해서 씀; 이 break; 쓰지 않으면 짝수일 때도 "홀수입니다" 출력됨
		case 1 : System.out.println("홀수입니다"); // oddEven == 1인 경우
			break; // 맨 아래 case는 break; 필요 없지만, 추후 수정 시/추가해야 하는 경우 등을 대비하여 적어주는 게 낫다
		}
		
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		// 1. 사용자로부터 주민번호 입력받기: String personId = 000000-0000000
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(- 포함) : ");
		String personId = sc.nextLine();
		// 문자열(String) 변수를 선언 및 대입 <- 문자열을 입력받는 스캐너 기능(Scanner라는 특정 클래스에서 사용할 수 있는 메서드 중 하나)을 이용
		// 문자열 = 순서가 있는 문자의 집합
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자 추출
		char gender = personId.charAt(7);
		// 단일문자(char) 변수를 선언 및 대입 <- 문자열에서 내가 지정한 index에 있는 단일문자 하나만 추출하는 기능을 이용
		// charAt() = 문자열에 사용할 수 있는 기능 -> 문자 추출 -> char 변수로 대입
		
		// 3. switch문 사용해서 조건문 작성
		switch(gender) {
		
		// 출력될 문장이 반복/중복됨 -> 생산성 저하 -> 내가 컴퓨터라고 생각하고 어떻게 개선할 수 있을지/중복을 없앨 수 있을지 생각해보자
		case '1' : // char형 변수 gender의 값과 동등비교할 '문자' literal '숫자' -> gender == '1'
				   // 이 case에 break;가 없으면 아래 case(s)까지 순차적으로 실행(?)되는 성질을 이용하여 출력문과 break;문 중복을 피함
		case '3' : System.out.println("남자입니다"); // gender == '3'
					break;
		case '2' : // gender == '2'
		case '4' : System.out.println("여자입니다"); // gender == '4'
					break;
		case '5' : // gender == '5'
		case '7' : System.out.println("외국인 남자입니다"); // gender == '7'
					break;
		case '6' : // gender == '6'
		case '8' : System.out.println("외국인 여자입니다"); // gender == '8'
					break;			
		default : System.out.println("외계인입니다"); // 뒤에 더 이상 실행할 조건들이 없기 때문에 break; 쓰지 않음
		}
		
	} // method2 영역 끝
	
	// 과일 가게 switch; '과일 가게'라는 기능을 가진 메서드
	public void fruitMarket() { // fruitMarket 메서드 영역 시작
		// 사용자에게 구매할 과일 이름을 입력받아 각 과일마다의 가격 출력
		// 샤인머스켓, 바나나, 메론, 수박, 귤
		// 20000, 4000, 8000, 5000, 30000
		// 그 외의 과일 입력 시 "죄송합니다, 저희 가게에서 판매하지 않는 과일입니다. 안녕히 가세요!"
		
		System.out.println("-- Welcome to Green Fruit Market --");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하시는 과일 이름을 입력해주세요: ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch(fruit) {
		case "샤인머스켓" : price = 20000; // System.out.println(fruit + " 가격은 20000원입니다")
					break;
		case "바나나" : price = 4000;
					break;
		case "메론" : price = 8000;
					break;
		case "수박" : price = 5000;
					break;
		case "귤" : price = 30000;
					break;
		default : System.out.println("죄송합니다, 저희 가게에서 판매하지 않는 과일입니다. 안녕히 가세요!");
					return; // switch > default는 할일 다 마쳤으니까 자신을 부른 곳(Run 클래스의 main 메서드)으로 돌아감
							// return: 현재 실행되고 있는 메서드 영역을 빠져나가 그 메서드를 호출한 부분으로 돌아감
 		}
		
		// 아래 (if문과) 출력문이 메서드 안에서는 무조건 실행된다.. 
//		if (price != 0) { // switch > default 부분의 return을 쓰면 이 조건 필요 없음
			System.out.printf("%s의 가격은 %d원입니다\n", fruit, price);
//		}
		
	} // fruitMarket 메서드 영역 끝

} // 클래스 C_Switch 영역 끝
