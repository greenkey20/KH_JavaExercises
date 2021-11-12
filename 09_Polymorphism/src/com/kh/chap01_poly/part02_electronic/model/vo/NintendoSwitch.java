package com.kh.chap01_poly.part02_electronic.model.vo;

public class NintendoSwitch extends Electronic {
	
	private boolean isTouch; // 터치 여부

	public NintendoSwitch() {
		
	}

	public NintendoSwitch(String name, String brand, int touch, boolean isTouch) {
		super(name, brand, touch);
		this.isTouch = isTouch;
	}

	public boolean getIsTouch() {
		return isTouch;
	}

	public void setIsTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 터치 여부 : " + isTouch;
	}

}
