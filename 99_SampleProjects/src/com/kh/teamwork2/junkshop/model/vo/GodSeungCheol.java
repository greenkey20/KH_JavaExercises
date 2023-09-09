package com.kh.teamwork2.junkshop.model.vo;

public class GodSeungCheol {

	private int paper;
	private int plastic;
	private int iron;
	private int copper;
	private int bottle;

	// 외부에서의 접근을 막기 위해 프라이빗을 사용하여 변수를 지정함

	public GodSeungCheol() {
	}

	public GodSeungCheol(int paper, int plastic, int iron, int copper, int bottle) {
		this.paper = paper;
		this.plastic = plastic;
		this.iron = iron;
		this.copper = copper;
		this.bottle = bottle;
// this를 사용하면, 메서드의 인수나 변수에 필드와 같은 이름을 붙여도 그것들을 구분하여 사용할 수 있기때문에 this를 사용하였습니다. 
	}

	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}

	public int getPlastic() {
		return plastic;
	}

	public void setPlastic(int plastic) {
		this.plastic = plastic;
	}

	public int getIron() {
		return iron;
	}

	public void setIron(int iron) {
		this.iron = iron;
	}

	public int getCopper() {
		return copper;
	}

	public void setCopper(int copper) {
		this.copper = copper;
	}

	public int getBottle() {
		return bottle;
	}

	public void setBottle(int bottle) {
		this.bottle = bottle;
	}

	// Setter를 사용해 전달받은 값을 내부에서 가공해 필드에 넣어주는 방식을 사용하고
	// 마찬가지로 필드 값을 가져올 때도, Getter를 사용해 본 필드의 값을 숨긴 채
	// 내부에서 가공된 값을 꺼낼 수 있기때문에 겟셋을 사용함.

}
