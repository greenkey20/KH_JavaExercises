// 2021.11.18(목) 11h
package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music {

	// [필드부]
	// 노래 제목, 가수 이름
	private String title;
	private String artist;

	// [생성자부]
	public Music() { // 기본 생성자

	}

	public Music(String title, String artist) { // 매개변수로 필드 전부를 가지고 있는 생성자
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

	@Override
	public String toString() { // toString() 메소드 오버라이딩
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

}
