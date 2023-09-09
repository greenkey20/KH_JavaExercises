// 2021.11.18(목) 14h35
package src.com.kh.chap01_list.part01_arrayList.run;

import src.com.kh.chap01_list.part01_arrayList.model.vo.Music;

import java.util.ArrayList;

public class GenericRun {

	public static void main(String[] args) {
		
		/* 아까 ArrayList 만들 때 <E>를 붙였어야 하는데, 안 써도 되긴 됐음
		 * 제네릭(Generic) <E>: 컬렉션 안에서 다룰 타입들을 미리 지정해주는 역할
		 * 명시적으로 (쓰면? 설명 제대로 못 들음) <Music>, <String>..
		 * 객체의 형 변환 사용할 필요 없음 -> 내가 사용하고 싶은 타입만 사용할 수 있게 해줌
		 *
		 * <Music>으로 제네릭을 제시한 경우, E(Object) == Music; E가 Music으로 바뀜
		 * vs
		 * 별도의 제네릭 제시 없이 컬렉션 객체 생성 시, E == Object -> 다양한 타입의 값이 담길 수 있음
		 * 
		 * 사용 이유
		 * 1. 저장할 타입에 제한을 두기 위해서; 다른 타입은 저장 안 되도록 제한을 둠
		 * 2. 매번 형 변환하는 절차를 없애기 위해서 -> 편리, 실수 감소..
		 * -> 확고한 목적을 가지고 컬렉션 만드는 경우 제네릭 지정하는 것이 좋음
		 * 
		 * 컬렉션 생성 시 제네릭 설정
		 * 표현법: ArrayList<E> list = new ArrayList<>();
		 */
		ArrayList<Music> list = new ArrayList<>();
		// 제네릭 제시 -> ArrayList인 list에는 Music자료형만 들어갈 수 있음
		System.out.println(list);
		
		// 리스트에 값 추가
		// list.add("안녕"); // 'The method add(Music) in the type ArrayList<Music> is not applicable for the arguments (String)'
		list.add(new Music("square", "백예린"));
		list.add(1, new Music("산책", "백예린"));
		list.add(1, new Music("our love is great", "백예린"));
		list.set(1, new Music("우리 시작", "이진아"));
		
		System.out.println(list);
		
		Music m0 = list.get(0);
		System.out.println(m0.getTitle());
		System.out.println(list.get(1).getTitle()); // list에는 담긴 건 어차피 Music타입 밖에 없으니까 list.get()의 반환값에 대한 형 변환 없이 Music클래스의 메소드(getter 등) 접근/사용 가능
		
		for (Music m : list) {
			System.out.println(m);
		}

	}

}
