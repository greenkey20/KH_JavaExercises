package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Person;
import com.kh.chap01.abstraction.model.vo.Rabbit;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main메소드 영역 시작
		
		/* 객체(object) 지향(oriented) 프로그래밍(programming): 현실세계에서 독립적인 존재(객체)들 간의 상호작용(행위)을 프로그래밍 언어를 통해 코드를 구현하는 것
		 * 객체: ____(앞으로 계속 배워나갈 것) 
		 * 
		 * 구현하고자 하는 프로그램 상의 객체(변수)를 만들기/생성하기 위해서는 클래스라는 틀을 먼저 만들어야 함; 객체를 만들기 위해서는 클래스가 있어야 함
		 * 클래스 = blueprint(설계도), 붕어빵 틀, 공장; 각 객체/객체들의 모양/속성(정보/변수+행위/기능)을 담아내는 그릇/틀; value(값; 값을 담고 있는) object -> (재료만 있다면) 똑같은 것을 여러 개 만들어낼 수 있음 
		 */
		
		Person eunyoungKang; // Person이라는 내가 만든(사용자 정의) 참조자료형(=클래스); Person이라는 클래스 형태의 자료형 -> 참조자료형으로 선언한 변수 'eunyoungKang' = 객체

		// 클래스 하나를 가지고 Person 형태를 가진 객체 여러 개 만들어냈음
		Person 토미;
		Person 미피;
		Person 판다;
		Person 해피;
		Person 무민;
		Person 스노크메이든;
		Person 혁;

		/* 클래스는 어떻게 만드는가?
		 * Rabbit(클래스) 우리집토끼(객체)
		 * 우리집토끼의 특징:
		 *   이름은 해피 -> String name;
		 *   눈이 까맣다 -> String eyesColour;
		 *   코가 분홍색이다 -> String noseColour;
		 *   몸은 베이지색이다 -> String bodyColour;
		 *   옷은 분홍색이다 -> String dressColour;
		 *       literal
		 * 단계1) 이러한 멤버변수들을 포함하는 토끼(Rabbit) 클래스 만들기
		 */
		
		// 단계2) 우리집토끼 객체("ourRabbit") 만들기
		Rabbit ourRabbit = new Rabbit();
		// Rabbit 클래스 = 사용자 정의 참조자료형 = RAM의 heap 영역의 주소값이 저장되어 있음
		// 객체(ourRabbit) 생성 시 new 키워드 사용 -> 메모리의 heap 영역 공간에 할당됨
		
		// 토끼 클래스의 두번째 객체(우리집토끼의 친구) 만들어주기
		Rabbit rabbit2 = new Rabbit();
		
		// 단계3) 우리집토끼(객체)의 성질 입력
		ourRabbit.name = "해피";
		// 참조/직접접근 연산자 . 사용해서 우리집토끼 객체에 접근
		// 접근(access)제어자(modifier): public 등을 통해 다른 패키지의 클래스에서도 접근 가능할 수 있도록 -> 객체에 직접 접근해서 값 대입해줌
		ourRabbit.age = 4;
		ourRabbit.weight = 450.95;
		ourRabbit.eyesColor = "검은색";
		ourRabbit.noseColor = "분홍색";
		ourRabbit.bodyColor = "베이지색";
		ourRabbit.dressColor = "분홍색";
		
		System.out.println(ourRabbit); // 객체 ourRabbit이 만들어져있는(?) heap 영역의 주소가 출력됨
		
		// 객체의 각 성질(?) 값이 잘 입력되었는지 직접 접근해서 조회 및 출력해서 확인해보기
		System.out.println(ourRabbit.name + "의 눈 색깔은 " + ourRabbit.eyesColor + ", 몸 색깔은 " + ourRabbit.bodyColor + 
				", 코 색깔은 " + ourRabbit.noseColor + ", 나이는 " + ourRabbit.age + "세, 몸무게는 " + ourRabbit.weight + "g입니다 ^^");
		
		// 객체2(우리집토끼의 친구 토끼)의 성질 입력
		rabbit2.name = "토미";
		rabbit2.age = 5;
		rabbit2.weight = 195.87;
		rabbit2.eyesColor = "갈색";
		rabbit2.noseColor = "황토색";
		rabbit2.bodyColor = "분홍색과 흰색";
		rabbit2.dressColor = "없음";
		
		System.out.println(rabbit2);
		System.out.println(rabbit2.name + "의 눈 색깔은 " + rabbit2.eyesColor + ", 몸 색깔은 " + rabbit2.bodyColor + 
				", 코 색깔은 " + rabbit2.noseColor + ", 나이는 " + rabbit2.age + "세, 몸무게는 " + rabbit2.weight + "g입니다 ^^");
		
		// 위와 같이 직접적으로 접근해서 값을 대입하거나 조회 시 vs 토끼의 키는 성장환경, 식습관, 운동 등 행동(메소드)에 따라 달라져야 함; 직접 접근 시 누군가 악의적으로/불합리하게 값 바꾸는 등 보안의 문제 생길 수 있음
		// Q. 직접 접근을 막는 방법은 무엇인가요? -> 정보 은닉(객체 지향 설계 원칙 중 하나) -> 정보 은닉을 하기 위한 기술 중 하나 = 캡슐화(encapsulation)
//		ourRabbit.weight = -3;
//		System.out.println(ourRabbit.name + "의 몸무게는 " + ourRabbit.weight + "g입니다 ^^");
		
		ourRabbit.eat(5); // eat(먹기) 행동/메소드에 의해 내가 먹인(=메소드에 input한 값)만큼 살찜
		System.out.println(ourRabbit.name + "의 몸무게는 " + ourRabbit.weight + "g입니다");
		
		rabbit2.eat(2);  // 내가 먹인만큼 살찜
		rabbit2.eat(3);
		rabbit2.eat(1);
		System.out.println(rabbit2.name + "의 몸무게는 " + rabbit2.weight + "g입니다");
		
		ourRabbit.jump(); // jump(뛰기 운동) 행동/메소드에 의해 체중 감소
		System.out.println(ourRabbit.name + "의 몸무게는 " + ourRabbit.weight + "g입니다");

	} // main메소드 영역 끝

} // 클래스 영역 끝
