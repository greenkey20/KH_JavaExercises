package src.com.kh.chap01_list.part02_mvc.view;

import src.com.kh.chap01_list.part02_mvc.controller.MusicController;
import src.com.kh.chap01_list.part02_mvc.model.vo.Music;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicView { // 사용자가 보는 화면 처리/시각적인 요소 + 입력, 출력
	
	// 사용자가 입력하는 값들 
	
	// [필드부]
	private Scanner sc = new Scanner(System.in); // Scanner는 교육용; 웹개발에서 입력은 웹에서 오는데, 아직 못하니까..
	private MusicController mc = new MusicController(); // Controller에 넘겨줘야 하니까/Controller를 많이 쓸 것 같아서, MusicView의 필드로 만듦
	
	// [생성자부]
		
	// [메소드부]
	// 프로그램을 실행하면 사용자가 가장 먼저 보는 화면/메인화면 만들기 -> Run 클래스에서 접근 가능해야 하므로 접근제한자는 public + 특별히 값 return할 건 없으므로 반환형은 void
	public void mainMenu() { // mainMenu() 영역 시작
		
		// 프로그램 종료 전까지는 계속 반복되며 사용자와 상호작용하는 프로그램 만들고자 함 -> while문
		while (true) {
			System.out.println("==== 초록숲♬ 음악 세상 ====");
			System.out.println("1. 새로운 곡 추가"); // add()
			System.out.println("2. 곡 전체 조회"); // 반복문 ou toString
			System.out.println("3. 특정 곡 검색"); // 반복문 + get()
			System.out.println("4. 특정 곡 삭제"); // remove()
			System.out.println("5. 특정 곡 수정"); // set()
			System.out.println("0. 프로그램 종료");
			
			// 각 메뉴별 서브메뉴로 넘어가기 위해 사용자로부터 입력받음
			System.out.print("메뉴 입력 > ");
			int menu = sc.nextInt();
			sc.nextLine(); // 한 칸/줄 띄어지도록(?)
	
			// 조건문 -> 각 메뉴
			switch(menu) {
			case 1 : // 새로운 곡을 추가할 수 있는 서브메뉴(화면) 호출해서 보여주기
				insertMusic();
				break;
			case 2 : // 곡 전체 조회할 수 있는 서브메뉴(화면) 호출해서 보여주기
				selectMusic();
				break;
			case 3 : // 특정 곡을 검색할 수 있는 서브메뉴(화면) 호출해서 보여주기
				searchMusic();
				break;
			case 4 : // 특정 곡을 삭제할 수 있는 서브메뉴(화면) 호출해서 보여주기
				deleteMusic(); // 강사님 말씀 = 삭제/수정 메뉴 같이 만들어도 된다?
				break;
			case 5 : // 특정 곡을 수정할 수 있는 서브메뉴(화면) 호출해서 보여주기
				updateMusic();
				break;
			case 0 : // while 반복문 더 이상 돌지 않고, 프로그램 종료됨
				System.out.println("프로그램을 종료합니다.");
				return; // 또는 System.exit(0);
			default: System.out.println("없는 메뉴입니다. 메뉴를 다시 입력해주세요~");
				break;
			} // switch문 영역 끝
			
			
			
		} // while문 영역 끝
		
	} // mainMenu() 종료
	
	// 메뉴1 -> 새로운 곡을 추가할 수 있는 서브메뉴(화면)
	public void insertMusic() { 
		System.out.println("-- 곡 추가 --");
		System.out.print("곡명 입력 > ");
		String title = sc.nextLine(); // vo의 필드명과 동일하게 
		System.out.print("가수명 입력 > ");
		String artist = sc.nextLine();
		
		// 사용자가 곡 추가해달라고 View단에서 요청한 것 -> Controller에서 처리 -> Controller클래스의 insertMusic() 메소드 호출
		mc.insertMusic(title, artist);
		
		System.out.println("성공적으로 추가되었습니다."); // 'x번째 곡이 추가되었다'고 보여주고 싶다..
	} // insertMusic() 종료
	
	// 메뉴2 -> 전체 곡 조회할 수 있는 서브메뉴(화면)
	public void selectMusic() {
		System.out.println("-- 전체 곡 조회 --");
		
		// 사용자가 전체 곡 조회해달라고 View단에서 요청한 것 -> 보여줄 내용은 Controller의 list에게 있음 + Controller에서 처리 -> list의 요소들을 보여줌
		ArrayList<Music> list = mc.selectMusic(); // mc.selectMusic()로부터 반환받은 list에 대해 반복문을 돌리기 위해, 해당 list를 우선 어딘가에 넣어주기(나의 질문 = 왜 꼭 그래야 하지?)
		
		if (list.isEmpty()) { // list가 비어있는 경우
			System.out.println("저장되어있는 노래가 없습니다.");
		} else { // list가 비어있지 않으면 list의 요소들 출력해서 보여주기
			for (Music m : list) {
				System.out.println(m); // '총 x개 곡이 있다'고 보여주고 싶다..
			}
		}
		
	} // selectMusic() 종료
	
	// 메뉴3 -> 특정 곡을 검색할 수 있는 서브메뉴(화면)
	public void searchMusic() {
		// 2021.11.18(목) 수업시간에는 곡명으로만 검색 -> 가수 이름 검색은 숙제
		System.out.println("-- 특정 곡 검색 --");
		System.out.print("키워드 입력 > ");
		String keyword = sc.nextLine();
		
		// 키워드가 들어간 곡명을 검색해 달라고 사용자가 View단에서 요청 -> Controller에서 처리
		ArrayList<Music> list = mc.searchMusic(keyword); // mc.searchMusic()로부터 반환받은 검색 결과를 어딘가에 담고자 하는데, 검색 결과가 다수일 수 있으므로 list에 받기로 함
		
		if (list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else { // 검색 결과가 있다면, 검색 결과에 포함된 노래들을 하나씩 보여주기 vs syso(list)와의 차이점 확인해보기
			for (Music m : list) {
				System.out.println(m);
			}
		}
		
	} // searchMusic() 종료
	
	// 메뉴4 -> 특정 곡을 삭제할 수 있는 서브메뉴(화면)
	public void deleteMusic() {
		System.out.println("-- 특정 곡 삭제 --");
		System.out.print("삭제할 곡명 > ");
		String title = sc.nextLine();
		
		// 입력된 제목의 노래를 삭제해 달라고 View단에서 사용자가 요청 -> Controller에서 처리
		int result = mc.deleteMusic(title);
		// idea1) boolean 반환값 사용 -> 삭제 성공이면 true 반환하여 아래 조건문에 사용
		// idea2) 수업시간에는 int 반환값 사용하고자 함
		
		if (result > 0) {
			System.out.println("성공적으로 삭제했습니다.");
		} else { // 삭제할 곡이 없는 경우
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	} // deleteMusic() 종료
	
	// 메뉴5 -> 특정 곡을 수정할 수 있는 서브메뉴(화면)
	public void updateMusic() {
		System.out.println("-- 특정 곡 수정 --");
		// 검색용 기존 곡명, 수정할 곡명 및 수정할 가수명을 입력받아야 함
		// 똑같은 제목(또는 추후 가수명)이 2개일 경우 처리는 어떻게 할까? -> 오늘 수업시간에서는 제외
		System.out.print("기존 곡명 > ");
		String title = sc.nextLine();
//		sc.nextLine(); // 이게 필요할 거라고 생각했는데, 필요 없음; 오히려 작동 잘 안 됨
		
		System.out.print("수정할 곡명 > ");
		String newTitle = sc.nextLine();
//		sc.nextLine();
		System.out.print("수정할 가수명 > ");
		String newArtist = sc.nextLine();
		
		// 입력된 가수의 노래를 수정해 달라고 View단에서 사용자가 요청 -> Controller에서 처리
		int result = mc.updateMusic(title, newTitle, newArtist);
		
		if (result > 0) {
			System.out.println("성공적으로 수정했습니다.");
		} else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
	} // updateMusic() 종료

} // View 클래스 영역 끝
