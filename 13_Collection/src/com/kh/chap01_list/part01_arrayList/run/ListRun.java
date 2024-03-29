// 2021.11.18(목) 10h45
package src.com.kh.chap01_list.part01_arrayList.run;

import src.com.kh.chap01_list.part01_arrayList.model.vo.Music;

import java.util.ArrayList;
import java.util.List;

public class ListRun {

	// Java = 클래스 기반 언어 -> Java에 있는 모든 내용(제공되는 것 + 내가 만드는 것)은 반드시 어떤 클래스 안에 들어가 있음

	/* 컬렉션(collection): [사전적 의미] 모음, 수집 -> [Java] 자료구조가 내장되어있는 클래스; Java에서 제공하는 자료구조를 담당하는 프레임워크 -> 데이터가 새롭게 추가/삭제/수정되는 기능(알고리즘)들이 이미 정의되어있는 tool
	 * 
	 * 자료구조: 데이터를 효율적으로 다룰 때(자료/데이터를 다루다 = 데이터 조회, 정렬, 추가, 수정, 삭제) 필요한 개념 -> 데이터 관리가 수월해짐
	 * frame(틀)work(작업): 효율적인 기능들이 이미 정의되어 있는 tool/틀?
	 * 
	 * 다량의 데이터를 관리하고자 할 때 지금까지는 배열로 충분히 활용이 가능했음 vs 배열의 단점/불편한 점/한계
	 * 
	 * 배열과 컬렉션의 차이점
	 * 배열의 단점(이지만 장점이 될 수도 있음)
	 * 1. 한 타입(type)의 데이터만 저장 가능
	 * 2. 배열 쓰고자 할 때 크기를 먼저 지정해야 함 -> 한 번 지정된 크기는 변경이 불가능; 새로운 값을 추가하고자 할 때 크기가 over될 경우, 새로운 크기의 배열을 만들고, 기존의 내용들을 복사하는 코드를 직접 짜야 함
	 * 3. 배열 중간 위치에 새로운 데이터를 추가/삭제하는 경우, 기존의 값들을 앞으로 당겨주거나 뒤로 밀어주는 코드를 직접 짜야 함
	 * -> 배열은 메모리 공간을 비교적 효율적으로 사용 가능
	 * 
	 * 컬렉션의 장점
	 * 1. 기본적으로 여러 타입의 데이터 저장 가능 vs generic 설정 -> 같은/한 타입의 데이터만 묶어서도 저장 가능
	 * 2. 크기에 제약 없음; 굳이 크기 지정하지 않아도 됨; 만약 크기 지정을 했고 크기를 over하는 값을 더 추가하고자 할 때 알아서 크기가 늘어남
	 * 3. 중간에 값을 추가/삭제하는 경우, 값을 앞으로 당겨주거나 뒤로 밀어주는 코드가 이미 메소드로 정의되어 있음 -> 그 때 그 때 필요한 메소드들 호출해서 사용하면 됨
	 * -> 배열에 비해 메모리 공간이 조금 더 낭비됨
	 * 
	 * 방대한 데이터를 담아만 두고 '조회'만 할 목적 -> 배열 사용
	 * 방대한 데이터가 추가/수정/삭제될 경우 -> 컬렉션 사용
	 * 
	 * 컬렉션의 종류 3가지; 컬렉션 프레임워크에서는 컬렉션 데이터 그룹을 3가지 타입이 존재한다고 인식 -> 각 컬렉션을 다루는 데에 필요한 기능을 가진 3개의 인터페이스 정의
	 * List 계열: 담고자 하는 값(value)만 저장; 저장 시 순서 유지(index 있음); 중복 값 허용
	 *  e.g. ArrayList(가장 많이 쓰임), LinkedList, Vector, Stack 등
	 * Set 계열: 담고자 하는 값(value)만 저장; 저장 시 순서 유지x; 중복 값 허용x
	 *  e.g. HashSet, LinkedSet, TreeSet 등
	 * Map 계열: 키(key) + 값(value) 세트로 저장; 저장 시 순서 유지x; 중복 키 허용x + 중복 값 허용
	 *  e.g. HashMap, HashTable, TreeMap, Properties 등
	 * -> 용도에 따라 장단점 다름; 개념적으로 어려워서 공부하기 어렵겠지만, 위 예시들 다 개별적으로 공부하기 -> 예시 면접 질문: HashTable 만들어보세요(수행에 10분 정도 소요)
	 */

	public static void main(String[] args) {
		
		/* Array(배열)List(목록) 선언 방법
		 * 표현법
		 * 1. 크기 지정x(기본 크기 = 10칸 정도 -> 꽉 차면 자동으로 5칸 정도(기존 크기의 절반씩) 늘어남)
		 * ArrayList 객체이름 = new ArrayList();
		 * 2. 크기 지정해서 ArrayList 생성 -> 크기의 범위를 벗어날 경우 자동으로 크기가 늘어남
		 * ArrayList 객체이름 = new ArrayList(크기);
		 */

		/* ArrayList 자료형에 대해 ctrl + 클릭해서 상세 설명 보기
		 * 추상클래스 AbstractList 상속받음 + public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable구현함

		E: Object로 이해하기(특정 타입) -> <E> = '제네릭'이라고 불림
		
		public class ArrayList<E> extends AbstractList<E>
		        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		{
		    @java.io.Serial
		    private static final long serialVersionUID = 8683452581122892189L; // static -> 상수 필드
		 */
		
		List list = new ArrayList(3); // 내부적으로 크기가 3짜리 ArrayList가 생성됨
		// 수업 시작할 때는 ArrayList 참조자료형으로 ArrayList 만들었는데, 앞으로는 반드시 ArrayList로 만들어야 하는 상황이 아니라면 List로 ArrayList를 만들자(2021.11.18(목) 14h 수업) -> 선언, 초기화 부분 제대로 필기했는지 모르겠음 + 2022.4.15(금) 22h35 나의 질문 why?
		System.out.println(list); // []
		// index = 위치
		// 리스트/배열에 들어간 내용물 = 요소/element -> data가 ,(comma)로 구분되어 list 안에 나열됨
		
		// 1. Music 객체를 만들어서/생성해서(new Music()) 비어있는 list에 추가하기
		// add(): 인자로 전달된 요소를 해당 리스트의 끝에 추가시켜주는 메소드
		// E = element(요소): 제네릭(generic); Object타입
		list.add(new Music("Awake", "이진아")); // Music 객체를 list에 담을 때 Object타입으로 넣음/추가
		list.add(new Music("Seattle", "Sam KIM"));
		list.add(new Music("별은 반짝임으로 말하죠", "루시드폴"));
//		list.add(new Music("Seattle", "Sam KIM")); // 데이터(value)의 중복 저장 가능; 7번 메소드 실습에서도 확인 가능
		list.add("끝"); // 3칸짜리로 만들었는데 자동으로 크기 늘어남(아마 4~5칸 정도로 늘어났을 것임) + 여러 타입의 값을 담을 수 있음
		// index 개념 있음 -> 순서가 유지되면서 저장됨
		
		System.out.println(list); // Music 클래스에서 toString() 안 만들면 주소값 출력됨
		
		// add() 사용 시 오버로딩된 형태 사용해보기
		// add(int index, E e): 전달된 e를 리스트의 index 자리에 추가
		list.add(0, "1"); // 0번 인덱스에 문자열 "1" 추가
		list.add(3, new Music("whatever", "Oasis")); // 중간에 값 추가 시 기존의 값들을 알아서 뒤로 한 칸씩 밀어주는 작업이 내부적으로 진행됨
		
		System.out.println(list);
		
		// 12h
		// 2. 값(객체의 요소) 수정
		// set(int index, E e): 전달된 e로 리스트의 index 자리의 값을 변경
		list.set(0, "시작");
		list.set(3, new Music("Sunday", "Oliver SCHORIES"));
		
		System.out.println(list);
		
		// 3. 값 삭제
		// remove(int index): 리스트의 index 자리에 담긴 값을 삭제
		list.remove(0); // 실행 후 새로운 0번 인덱스의 값 = 'Awake' 노래의 정보
//		list.remove(5); // 'Index Out Of Bounds Exception: Index 5' 발생 -> 인덱스의 값을 잘 고려해서 삭제해야 함
		list.remove(list.size() - 1); // 2022.7.2(토) 0h25 보완 = list의 인덱스가 몇 번까지 있는지 잘 모르겠지만 맨 뒤의 자료를 삭제 <- 이해는 하는데, 필기하느라 강사님 설명 잘 못 듣고 넘어감
		System.out.println(list);
		
		// 4. 리스트의 크기 반환 받기
		// size(): 리스트의 크기(= 담겨있는 데이터/요소의 갯수) 반환
		System.out.println("리스트에 담긴 데이터/요소의 갯수 : " + list.size());
		System.out.println("리스트의 마지막 인덱스 번호 : " + (list.size() - 1));
		
		// 5. 리스트의 해당 인덱스에 담긴 요소를 반환 받기
		// get(int index) -> 반환형 = E
		Music m0 = (Music)list.get(0); // 부모는 자식 type 쓸 수 없음(Type mismatch: cannot convert from Object to Music) -> 강제 형 변환 필요; 다형성
		System.out.println(m0);
		System.out.println(list.get(0)); // 이렇게 해도 윗줄과 똑같이 출력 가능
		
		// 1번 인덱스의 곡 제목 반환 받기
		System.out.println("1번 인덱스의 곡 제목 : " + ((Music)list.get(1)).getTitle()); // Music 클래스의 getter 사용하기 위해서는 list.get()의 반환형 Object타입을 자식클래스(Music 클래스)로 downcasting 해줘야 함; Object-Music 클래스는 상속관계인 바, 형 변환 가능
		// 3번 인덱스의 가수 이름 반환 받기
		System.out.println("3번 인덱스의 가수 이름 : " + ((Music)list.get(3)).getArtist());
		
		// list의 각 인덱스의 곡 제목 반환 받기
		// 인덱스 개념 + getter() -> 반복문 -> for문 사용
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println((i + 1) + "번째 곡 : " + ((Music)list.get(i)).getTitle());
		}
		
		// list의 각 인덱스에 요소로 담긴 객체 뽑아보기
		// 향상된 for문/for each문 -> 값을 조회하는 목적으로 사용; for (값을 받아줄 변수 : 순차적으로 접근할 배열/컬렉션)
		for (Object o : list) { // 리스트 list(=ArrayList처럼 생긴 객체)에는 Object객체가 들어있음 -> 뺄 때도 Object타입으로 빼야 함 vs 
			System.out.println(o);
		}
		
		// 6. 리스트의 부분만 추출
		// sublist(int index1, int index2) -> 반환형 = List(List를 뽑아내는 것); index1부터 index2까지의 데이터값들을 추출해서 새로운 리스트로 반환시켜줌
		// cf. 문자열의 부분만 추출 <- substring()
		List sub = list.subList(0, 2);
		// ArrayList 등은 java.util.List 인터페이스를 구현하고 있음 -> 인터페이스의 모든 메소드는 추상메소드인 바, 그 안에 메소드 구현되어있지 않음
		// ArrayList 사용할 때 참조자료형은 List로 하는 것이 좋음 -> List타입 변수 sub의 사용 범위가 넓어짐(Array/LinkedList, Vector 등 사용 가능) + List를 상속받는 다형성 사용 가능
		System.out.println(sub);
		
		// 7. 리스트 + 리스트
		// addAll(Collection c) : 다른 컬렉션에 있는 데이터들을 통째로 해당 리스트에 추가
		list.addAll(sub);
		System.out.println(list); // 데이터(value)의 중복 저장 가능
		
		// 8. 리스트가 비어있는지 확인하는 메소드
		// isEmpty(): 비어있으면 true/채워져있으면 false 반환 -> '리스트에 값이 있/없을 시'와 같이 조건으로 사용 가능
		System.out.println(list.isEmpty()); // false
		
		// 9. 해당 리스트를 통째로 비워주는 메소드
		// clear()
		list.clear();
		System.out.println(list.isEmpty()); // 바로 윗줄에서 리스트를 비워줬기 때문에 isEmpty = true

	}

}
