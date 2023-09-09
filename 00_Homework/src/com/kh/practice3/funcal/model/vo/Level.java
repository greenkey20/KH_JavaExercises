package com.kh.practice3.funcal.model.vo;

public class Level {
	
	// [필드부]
	private int rightAnswer;
	private int wrongAnswer;
	private int answer;
	private String question;
	
	// [생성자부]
//	public level() {
//		
//	}
	
	public Level() {
		rightAnswer = 0;
		wrongAnswer = 0;
		answer = 0;
		question = "";
	}
	
	public Level(int rightAnswer, int wrongAnswer, int answer, String question) {
		this.rightAnswer = rightAnswer;
		this.wrongAnswer = wrongAnswer;
		this.answer = answer;
		this.question = question;
	}

	// [메소드부]
	public int getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(int rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public int getWrongAnswer() {
		return wrongAnswer;
	}

	public void setWrongAnswer(int wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	@Override
	public String toString() {
		return "rightAnswer : " + rightAnswer + ", wrongAnswer : " + wrongAnswer + ", answer : " + answer + ", question : " + question;
	
	}
	
	

}
