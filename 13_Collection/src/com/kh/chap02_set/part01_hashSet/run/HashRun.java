// 2021.11.19(금) 9h
package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class HashRun {

	public static void main(String[] args) {
		
		/* HashSet: hash를 사용하는 set; 담고자 하는 값(value)만 저장 + index 개념 없는 바, 저장하고 꺼낼 때 순서 유지x + 바구니에 새로 넣는 값과 기존 값 비교해서, 중복 값 허용x -> 똑같은 요소는 넣을 수 없는 + 순서 없는 커다란 바구니; 원하는 순서대로 뽑아내기 어려움
		 * 특징이 조금 다르지만, 사용하는 방법은 list와 똑같음
		 * 중복 체크해야 할 때 e.g. 웹사이트 방문자 수, 회원 가입 시 같은 사람은 중복되면 안 될 때 등
		 * 
		 * hash알고리즘을 이용해서 10진수 정수값으로 반환해줌
		 * e.g. 비밀번호 변경(? 찾기?)
		 * ID는 암호화를 해두지 않음 -> ID는 찾을 수 있음
		 * 비밀번호는 암호화됨 -> 기존 비밀번호와 새로운 비밀번호의 hash값을 비교
		 * 같은 값에 같은 hash알고리즘을 돌리면 같은 hash값이 나옴
		 * 요새는 슈퍼컴퓨터를 쓰는 해커들도 있을 수 있는 바 hash알고리즘이 완벽하게 안전하다고 할 수 없는 바, hash알고리즘보다 더 강화된 보안방법을 씀
		 * 
		 * 표현법: HashSet 객체이름 = new HashSet(); // 빈 HashSet
		 * 
		 * 요소로써 문자열만 넣을/들어갈 수 있는 HastSet을 만드려면 제네릭 설정 
		 */
		HashSet<String> hs = new HashSet<>();
		
		// HashSet에 값 추가
		// add(추가할 값)
		hs.add(new String("반갑습니다"));
		hs.add(new String("반갑습니다"));
		hs.add("반갑습니다");
		// 1. String클래스는 equals 메소드가 오버라이딩 되어있음 -> 주소값(x) 문자열 값(O) 비교 -> equals()에 의해 같은 객체로 판단 
		// 2. String클래스는 문자열을 가지고 해시코드를 만듦 -> hashcode()로도 같은 객체로 판단
		// 위 "반갑습니다"는 동일한 객체로 인식됨
		// 나의 질문 = HashSet에서 동일 객체를 판단하는 데에 string pool과는 어떤 연관이 있/없나?
		hs.add("친구들아");
		hs.add("금요일이야");
		hs.add("친구들아");
		hs.add("우헤헤헤헤");
//		hs.add(new Student()); // 제네릭 설정 때문에 Student타입 입력 불가능; 'The method add(String) in the type HashSet<String> is not applicable for the arguments (Student)'
		
		System.out.println(hs); // [반갑습니다, 우헤헤헤헤, 금요일이야, 친구들아]; 생긴 건 list와 같음 + 저장 순서 유지 안 됨 + 중복 저장 안 됨
		
		// 크기 구하기
		// size()
		System.out.println("hs의 크기 : " + hs.size()); // hs라는 바구니에 들어있는 요소의 갯수 -> 4
		
		// 값 삭제
		// remove(삭제할 값)
		hs.remove("반갑습니다");
		System.out.println(hs); // [반갑습니다, 금요일이야, 친구들아]
		
		// 모든 값 삭제
		// clear()
		hs.clear();
		System.out.println(hs); // []
		
		// HashSet만의 특징
		// Student 객체만 담을 수 있는, 'stds'라는 이름의, HashSet(Set) 만들기
		HashSet<Student> stds = new HashSet<>(); // 수업용이니까 객체명 줄여서 씀; 프로젝트 시에는 full name(Student) 쓰기
		
		// stds에 Student 객체(만) 넣어줌
		stds.add(new Student("판다", 2, 87));
		stds.add(new Student("미피", 3, 92));
		stds.add(new Student("곰돌", 5, 95));
		stds.add(new Student("해피", 4, 85));
		stds.add(new Student("미피", 3, 92)); // new로 생성되어 heap영역의 주소값 다름 -> equals() 및 hashcode()를 통해 다른 객체로 판단됨
		
		System.out.println(stds); // 저장 순서 유지 안 됨 + 2개의 미피 객체가 동일 객체로 판단되지 않았기 때문에 중복 저장되어있음(두번째 미피 객체도 stds 바구니에 들어가있음)
		// HashSet의 특징: 값이 추가될 때마다 equals() 메소드와 hashcode()로 비교 후, 둘 다 결과가 true일 경우 동일 객체로 판단
		// equals(): 현재 객체의 주소값을 비교해서 결과 반환 -> 반환형 = boolean(같으면 true)
		// hashcode(): 현재 객체의 주소값을 해싱해서 10진수로 반환 -> 반환형 = int(4bytes 크기의 기본자료형, -21억~21억 정도 총 43억개 정수 표현 가능)
		
		/* HashSet에 객체를 담을 때 내부적으로 equals()와 hashCode() 기준으로 값이 일치하는지를 비교하고 담음
		 * Object클래스의 equals(): 두 객체의 주소값을 비교해서 일치하면 true
		 * Object클래스의 hashCode(): 객체의 주소값을 해싱해서 10진수 형태로 반환
		 * -> 반환한 결과들끼리 비교 -> 두 결과가 모두 일치해야 동일 객체; equals() 결과가 true이면서/그리고 hashCode()의 값이 일치하면 동일 객체로 판단 -> 중복 저장 x
		 * 
		 * hash알고리즘이 쓰이는 곳은 많지만, Java에 한정해서 설명해보자면..
		 * 1. 해시코드가 같으면(e.g. 3, 3) 반드시 같은 주소값인가?
		 * 나의 생각 = 해싱 알고리즘에 따라(?) 다른 객체인데 같은 해시코드를 가질 수 있다 -> X -> correct: 해시코드가 같아도 반드시 같은 주소값은 아님
		 * 만약 내가 생성한 객체가 44억개라면 44억개의 주소값 vs hashCode()의 반환형이 4bytes이기 때문에 43억개 정도의 해시코드만 생성이 가능한 바, 해시코드가 같더라도 다른 객체일 경우가 있음(hash 충돌(collision?))
		 * 
		 * 2. 해시코드가 다르면(e.g. 3, 4) 반드시 다른 주소값인가?
		 * 나의 생각 = 일단 해시코드가 다르면 다른 객체이다 -> O -> correct: 해시코드가 다르면 반드시 다른 주소값임
		 * e.g. 같은 값에 (나만의) 해시알고리즘(e.g. * 31 - 1)을 적용한다면 같은 값이 나옴 vs 다른 값에 해시알고리즘을 적용한다면 다른 값이 나올 수 밖에 없음
		 * 
		 * 내용물이 같은데 주소값이 달라서 동일 객체가 아닌 것으로 판단이 되면서 중복 저장이 됨 vs 방지하고 싶다면 equals()와 hashCode()를 오버라이딩해서 사용해야 함
		 * 해결 방법 = HashSet이 동일 객체를 인식할 수 있도록 equals()와 hashcode() 오버라이딩
		 * (학우님들이 말한 다른 아이디어 3가지 정도 제대로 못 들음/이해 못함)
		 * 
		 * Student클래스에 가서 3개 필드의 값이 모두 일치하면 true를 반환하도록 equals() 오버라이딩 + 3개 필드의 값을 더해(+) 문자열로 만들고 그 문자열의 해시코드 값을 만들어서 반환하도록 hashCode() 오버라이딩
		 * 목적/용도/상황에 따라 나만의 equals(), hashCode() 
		 */
		
		// API 가서 Object클래스 들여다보기 -> Object클래스에는 7개의 메소드가 있다?
		
		// HashSet에 들어있는 모든 값들을 출력하는 방법
		System.out.println("----------------------");
		// 1. index 개념 없지만, 아래 반복문 사용해서 조회 가능
		for (Student s : stds) { // 제네릭 사용 -> 강제 형 변환할 필요 없음
			System.out.println(s);
		}
		
		// 2. HashSet의 내용물을 ArrayList에 담아 인덱스를 이용하여 반복문 출력
		// HashSet에 담길 때 순서가 보장이 안 되므로, ArrayList에 담길 때 담길 때도 순서가 랜덤이라고 보면 됨
		System.out.println("----------------------");
		// 방법1)
		// 단계1) ArrayList 생성
		ArrayList list = new ArrayList();
		// 단계2) addAll() 메소드 -> 통째로 추가
		list.addAll(stds);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------");
		// 방법2) 단계1+2 한 번에; 생성과 동시에 값 초기화
		ArrayList<Student> students = new ArrayList<>(stds);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("----------------------");
		// 3. HashSet클래스에서 제공하는 iterator(반복자) 사용(11h35쯤 강사님 설명 잘 못 듣고 필기만 함 ㅠ.ㅠ)
		// String클래스의 StringTokenizer와 비슷한 원리
		// iterator(): List계열 및 Set계열에서만 사용 가능 vs Map계열에서는 바로 호출 불가능
		// 인터페이스 Iterator 
		
		Iterator<Student> it = stds.iterator();
		// Iterator it에는 'stds'라는 Set에 들어있던 요소들이 들어있음 -> 이 요소들을 확인하려면 next() 메소드 사용
		
		/* 방법1) 똑같은 행위를 반복
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println(it.next()); // No Such Element(꺼내올 요소가 없음) Exception
		*/
		
		// 방법2) 반복문 사용해서 반복 행위 방지 -> 요소가 없는데 꺼내려고 하면 exception이 발생함 -> 요소가 남아있을 때만(<- hasNext() 메소드로 확인) 반환해주고자 함
		while (it.hasNext()) { // it에 next로 더 빼올 값이 남았는가? -> 있으면 true, 없으면 false
			System.out.println(it.next());
		}

	} // main() 메소드 종료

} // 클래스 영역 끝
