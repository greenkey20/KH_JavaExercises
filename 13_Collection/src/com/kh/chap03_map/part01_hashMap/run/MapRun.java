// 2021.11.19(금) 12h
package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map; // The import java.util.Map is never used
import java.util.Map.Entry;
import java.util.Set;
//import java.util.HashMap.EntrySet; // 15h50 오류 msg = The type java.util.HashMap.EntrySet is not visible -> 무슨 뜻일까 ㅠ.ㅠ

import com.kh.chap03_map.part01_hashMap.model.vo.Burger;

public class MapRun {

	public static void main(String[] args) {
		
		/* HashMap
		 * 표현법: HashMap 이름 = new HashMap();
		 * HashMap 만들 때 key(식별자) + value(값) 세트로 추가
		 */
		
		HashMap<String, Burger> hm = new HashMap(); // 비어있는 HashMap 객체
		// 제네릭을 쓰려고 할 때 <Key,Value>와 같이 2개 타입 입력해야 함
		// key = 식별자 / value = 값
		// 버거 이름    / 맛, 열량
		
		// 비어있는 HashMap에 추가
		// Map계열 put() 메소드 사용 -> key + value 세트로 추가
		// != List계열, Set계열은 Collection 인터페이스를 구현한 클래스 -> 사용할 수 있는 메소드가 비슷함 e.g. ArrayList와 HashSet에 추가 시 add() 메소드 사용
		
		// 1. put(K key, V value) -> 맴 공간에 key + value 세트 추가
		hm.put("머쉬룸버거", new Burger("고소함", 450));
		hm.put("머쉬룸버거", new Burger("고소함", 450)); // key값은 중복 안 됨
		hm.put("아보카도버거", new Burger("상큼함", 419));
		hm.put("플랜트와퍼", new Burger("풍부함", 482)); // value값의 중복 저장 허용
		hm.put("비건치즈버거", new Burger("풍부함", 482)); // value값의 중복 저장 허용
		hm.put("토마토버거", new Burger("새콤달콤", 425));
		hm.put("두부버거", new Burger("담백함", 431));
		
		System.out.println(hm);
		// {key=value, key=value, ...}로 표시 + 값 저장 순서 유지x + value값의 중복 저장 허용 vs key값은 중복되면 안 됨
		
		// 기존의 key값으로 다른 value를 추가하면/key값이 중복되면 덮어씌워짐 -> 나중에 그 key를 사용한 요소(?)의 값으로 value가 변경됨
		// key는 식별자 개념 -> key로 value를 찾아감
		hm.put("머쉬룸버거", new Burger("모르겠어요", 0));
		System.out.println(hm);
		
		// 2. 제네릭 안 써준 경우 get(Object key) -> 반환형 = Object
		// 제네릭 설정을 해줬으므로 매개변수는 String, 반환형은 Burger
		// 해당 key값에 해당되는 value를 돌려주는 메소드
		System.out.println(hm.get("아보카도버거")); // Burger [flavor=상큼함, calorie=419]
		
		// Burger b = (Burger)hm.get("비건치즈버거"); // hm 선언 시 제네릭 설정 안 했다면, 부모는 자식의 자료형 사용 불가능 -> Burger타입의 변수에 get() 반환값(Object타입)을 대입하려고 했더니 error; Type mismatch: cannot convert from Object to Burger -> Object를 Burger타입으로 downcasting해야 함
		Burger b = hm.get("비건치즈버거");
		
		Burger c = hm.get(8);
		System.out.println(c); // null
		
		// 3. size(): 컬렉션에 담겨있는 갯수
		System.out.println(hm.size()); // 6
		
		// 4. replace(K key, V value): key는 식별자 -> 해당 key값을 찾아서 value를 변경시켜줌
		hm.replace("머쉬룸버거", new Burger("고소+짭짜름", 449));
		// 기존에 존재하지 않는 key값을 제시하면, 추가 안 됨(key값으로 찾아보고 없으면, 해당 key값이 없으면 넘어감)
		hm.replace("머시룸버거", new Burger("맛있음", 453));
		System.out.println(hm);
		
		// 5. remove(Object key) -> 해당 key값을 찾아서 -> key + value 세트를 지워줌
		hm.remove("머쉬룸버거");
		System.out.println(hm);
		
		// HashMap에 들어있는 모든 요소들에 순차적으로 접근하고자 할 때
		// (향상된)for문 사용 불가능 + List에 addAll 하는 방법?(왜 안 되는지? 설명 못 들음; map은 collection이 아니라서?) + Iterator 사용(단, 바로 호출은 안 됨)
		// Map계열을 Set계열로 바꿔서 Iterator 사용
		// 방법1) HashMap에서 제공하는 메소드 keySet() 이용 -> Set에 key들만 담아줌 -> 반환형 = Set -> 번거로운/불편한 방법
		// 단계1) key들만 Set에 담음 vs values는 중복이 가능하기 때문에 values를 Set에 담으면 값이 없어질 수 있음
		Set<String> keySet = hm.keySet();
		
		// 단계2) 1단계에서 만들어진 Set의 내용물들을 Iterator에 담기
//		Iterator itKey = keySet.iterator();
		// Iterator<E> iterator(); -> key값들이 Object타입으로 itKey에 들어가 있음 -> itKey.next();로 반환형 = Object타입(= 모든 클래스/자료형의 부모; 모든 클래스/자료형은 Object로부터 Object자료형을 물려받고 있음)
		
		Iterator<String> itKey = keySet.iterator();
		// key값으로 String자료형만 넣을 것이므로, Iterator에 제네릭으로 자료형 제한 둠 -> 형 변환할 필요 없음
		
		
		// 단계3) Iterator로부터 반복문 이용해서 순차적으로 뽑기
		while (itKey.hasNext()) { // 출력문 결과 = 요소들이 한 줄 한 줄 나오게
			// 내가 시도했던 방법 -> 실패
			// System.out.println(itKey.next() + " = " + hm.get(itKey.next())); // 이렇게 쓰면 No Such Element Exception
			
			// 강사님 방식
//			Object key = itKey.next(); // Iterator에 제네릭 제시하지 않은 경우
			String key = itKey.next();
			Burger value = hm.get(key);
			System.out.println("key : " + key + " = value " + value);
		}
		
		// 방법2) HashMap에서 제공하는 메소드 entrySet() 이용
		// 단계1) Entry형식으로 Set에 담기
		Set<Entry<String, Burger>> entrySet = hm.entrySet();
		// 제네릭 사용 이유 = 컬렉션에 들어가는 자료형을 제한 -> Set의 요소로 Entry자료형만 들어갈 수 있음 -> EntryentrySet에는 String타입 key와 Burger타입 value가 Entry라는 형식으로 묶여서; Entry처럼 생긴 String타입 key와 Burger타입 value가 들어감
		
		/* entrySet에 마우스 올려 상세내역 확인해 봤는데 이해 안 됨
		 * public Set<Map.Entry<K,V>> entrySet() { // Entry 같이 생긴..
        Set<Map.Entry<K,V>> es;
        return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
    }
		 */
		
		// 단계2) Iterator에 옮겨담기
		Iterator<Entry<String, Burger>> itEntry = entrySet.iterator();
		// entrySet에 담겨있던 것을 entrySet.iterator();를 통해 Object로 반환받아(맞게 이해한건가? 15h40) Iterator 타입의 itEntry에 저장
		
		// 단계3) 반복문 이용
		while (itEntry.hasNext()) {
			Entry<String, Burger> e = itEntry.next(); // Object자료형을 Entry형 변수에 담으려고 하니까 에러; 'Type mismatch: cannot convert from Object to Map.Entry'
			// -> Iterator에 제네릭 <Entry<String, Burger>> 설정 + 더 명확하게 하기 위해 윗줄 Entry에도 제네릭 설정
			// (itEntry에는 entrySet이 들어가 있는데, entrySet은 Entry 모양임 -> next() 메소드로 Set(o) Set 안에 들어가 있는 요소(x)를 꺼낸 것 = Entry 모양)
			// 다형성에서 가장 중요한 점 = ☆☆☆☆☆☆☆☆☆☆☆ 양변의 자료형이 같아야 함 ☆☆☆☆☆☆☆☆☆☆☆
			// 변수, 반복문, 조건문을 밑바닥까지 파기(단, 일단 반복문, 조건문은 작동/기능하게 만들면 됨)
			
			// next()로 나오는 결과 = Object타입
			
			// 16h while문 내용 마저 필기 못함
			
			System.out.println();
		}
		
		// for문?도 필기 못함
		
		/* Map계열 특성상 요소들에 순차적으로 접근할 직접적인 방법 없음
		 * Map계열을 Set계열로 바꿈(2가지 방법 = keySet(), entrySet()) -> 
		 * 방법1) 반복문 사용 (필기 연결고리 이해 안 됨; ou?) ArrayList로 바꿔서 반복문 사용
		 * 방법2) Iterator 사용
		 * (위 방법 분류 등 이해 못하고 그냥 씀; 분류 확인/수정 등 필요)
		 */

	} // main() 메소드 종료

} // 클래스 영역 끝
