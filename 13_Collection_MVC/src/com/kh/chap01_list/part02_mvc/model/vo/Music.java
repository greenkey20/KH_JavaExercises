package src.com.kh.chap01_list.part02_mvc.model.vo;

public class Music { // 값을 담을 vo 클래스; 한 번 만들어놓으면 더 건들일 일 없으므로, 먼저 빠르게 만들기(shift + alt + s -> 자동 완성)
	
	// [필드부]
	// 노래 제목, 가수명
	private String title;
	private String artist;
	
	// [생성자부]
	// 기본 생성자 생성
	public Music() {
		super();
	}

	// 매개변수 있는 생성자 생성
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	// [메소드부]
	// getters, setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	// toString() 오버라이딩; 단축키 = shift + alt + s -> s -> alt + g
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

}
