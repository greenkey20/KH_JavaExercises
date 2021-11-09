package com.kh.movie.model.vo;

public abstract class Cinema {
	
	private String release;
	private int ticket;
	
	public Cinema() {
//		super();
	}

	public Cinema(String release, int ticket) {
//		super();
		this.release = release;
		this.ticket = ticket;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
	public abstract void publish(int index, int person);

}