package src.com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// alt+shift+s -> o -> alt+D -> alt+G -> 기본 생성자
	// alt+shift+s -> o          -> alt+G -> 매개변수 있는 생성자
	// 상단 메뉴 source > generate constructor using fields
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + allInOne;
	}

}
