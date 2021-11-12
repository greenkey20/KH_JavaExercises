package com.kh.jonggak.model.vo;

public class CloudLecture extends Lecture {
	
	public CloudLecture() {
		
	}
	
	public CloudLecture(String name, String major) {
		super(name, major);
	}
	
	@Override
	public void startLecture() {
		System.out.println("cloud 강의 시작합니다~");
	}

}
