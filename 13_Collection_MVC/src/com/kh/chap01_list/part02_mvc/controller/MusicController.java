package src.com.kh.chap01_list.part02_mvc.controller;

import src.com.kh.chap01_list.part02_mvc.model.vo.Music;

import java.util.ArrayList;

public class MusicController { // 사용자가 화면을 통해/View에서 요청한 것을 받아서 처리 -> 처리 결과를 View로 반환
	
	// 음악 리스트 만들어놓고, 그 리스트에 추가, 검색, 삭제, 수정 등의 처리를 하고자 함
	
	// [필드부]
	// 음악 리스트 생성; Music자료형만 담을 것이므로 제네릭 설정
	private ArrayList<Music> list = new ArrayList<>();
	// 나의 질문 = 이번에는 참조자료형 List 대신  ArrayList 사용해보는 것인가요?
	{ // 초기화 블록 = 객체 생성 시 무조건 수행되는 블록
		list.add(new Music("waltz no.17", "F. Chopin"));
		list.add(new Music("캔디피아니스트", "이진아"));
	}
	
	// [생성자부]
		
	// [메소드부]
	// 메뉴1 관련해서 새로운 곡 추가 요청이 있을 때 실행되는 메소드
	// 반환형 boolean으로 만들고, body에 조건문 추가해서 잘 추가되면 true, 잘 추가 안 되면 false 반환할 수도 있음 
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
//	public boolean insertMusic(String title, String artist) {
//		list.add(new Music(title, artist));
//		
//		return 
//	}
	
	// 메뉴2 관련해서 전체 곡 조회 요청이 있을 때 실행되는 메소드
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	// 메뉴3 관련해서 키워드가 들어간 특정 곡 검색 요청이 있을 때 실행되는 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		// 검색된 결과가 담길 ArrayList<Music> 객체 생성; 이 메소드가 호출될 때 만들어지면 됨 vs 클래스 소속(필드부)일 필요 없음
		ArrayList<Music> searched = new ArrayList<>(); // 빈 리스트 [] 생성
		
		// 맞는 keyword만 searched 리스트에 추가
		for (int i = 0; i < list.size(); i++) { // list의 모든 노래들을 일단 조회해야 함
			if (list.get(i).getTitle().contains(keyword)) { // list의 요소(=Music객체)의 노래 제목에 keyword가 포함되면
				// 문자열.contains(포함되어 있는지 궁금한 단어): 해당 문자열이 포함되어 있으면 true, 없으면 false 반환
				searched.add(list.get(i)); // 현재 조회한/list의 i번째 요소 Music객체를 searched 리스트에 추가
			} // if문 영역 끝
		} // for문 영역 끝
		
		return searched; // 곡명에 키워드를 가지고 있는 특정 곡들의 리스트를 반환
	}
	
	// 메뉴4 관련해서 특정 곡 삭제 요청이 있을 때 실행되는 메소드
	public int deleteMusic(String title) {
		// 결과/반환값을 담을 변수 생성 -> 삭제가 진행된 횟수 저장
		int result = 0;
		
		// view단의 삭제 요청 처리
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
			}
		}
		
		return result; // result가 0이면 곡 삭제가 이루어지지 않음 vs result가 0이 아니라면 곡 삭제가 1개 이상 이루어짐
	}
	
	// 메뉴5 관련해서 특정 곡 수정 요청이 있을 때 실행되는 메소드
	public int updateMusic(String title, String newTitle, String newArtist) {
		// 결과/반환값을 담을 변수 생성 -> 수정이 진행된 횟수 저장
		int result = 0;
		
		// view단의 수정 요청 처리
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				// 방법1) 강사님 방식: 굳이 객체 만들지 않고
				list.get(i).setTitle(newTitle);
				list.get(i).setArtist(newArtist);
				// 방법2) 내가 생각+실험해 봄 -> 작동함
				// list.set(i, new Music(newTitle, newArtist));
				result++;
			}
		}
		
		return result;
	}

} // Controller 클래스 영역 끝
