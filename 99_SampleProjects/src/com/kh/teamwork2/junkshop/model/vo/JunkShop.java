package com.kh.teamwork2.junkshop.model.vo;

public class JunkShop extends GodSeungCheol implements Discount, Icalc {

	private int paperResutlPrice;
	private int plasticResultPrice;
	private int ironResultPrice;
	private int copperResultPrice;
	private int bottleResultPrice;

	// 외부에서의 접근을 막기 위해 프라이빗을 사용하여 변수를 지정함
	public JunkShop() {
		super();
	}

	public JunkShop(int paper, int plastic, int iron, int copper, int bottle, int paperResutlPrice,
			int plasticResultPrice, int ironResultPrice, int copperResultPrice, int bottleResultPrice) {
		super(paper, plastic, iron, copper, bottle);
		this.paperResutlPrice = paperResutlPrice;
		this.plasticResultPrice = plasticResultPrice;
		this.ironResultPrice = ironResultPrice;
		this.copperResultPrice = copperResultPrice;
		this.bottleResultPrice = bottleResultPrice;
	}

	public int getPaperResutlPrice() {
		return paperResutlPrice;
	}

	public void setPaperResutlPrice(int paperResutlPrice) {
		this.paperResutlPrice = paperResutlPrice;
	}

	public int getPlasticResultPrice() {
		return plasticResultPrice;
	}

	public void setPlasticResultPrice(int plasticResultPrice) {
		this.plasticResultPrice = plasticResultPrice;
	}

	public int getIronResultPrice() {
		return ironResultPrice;
	}

	public void setIronResultPrice(int ironResultPrice) {
		this.ironResultPrice = ironResultPrice;
	}

	public int getCopperResultPrice() {
		return copperResultPrice;
	}

	public void setCopperResultPrice(int copperResultPrice) {
		this.copperResultPrice = copperResultPrice;
	}

	public int getBottleResultPrice() {
		return bottleResultPrice;
	}

	public void setBottleResultPrice(int botttleResultPrice) {
		this.bottleResultPrice = botttleResultPrice;
	}

	// Setter를 사용해 전달받은 값을 내부에서 가공해 필드에 넣어주는 방식을 사용하고
	// 마찬가지로 필드 값을 가져올 때도, Getter를 사용해 본 필드의 값을 숨긴 채
	// 내부에서 가공된 값을 꺼낼 수 있기때문에 겟셋을 사용함.

}
