package com.kh.chap03_override.model.vo;

public class Book /* extends Object */ { // 모든 클래스의 최상위 부모클래스 = Object -> 생략 가능
	
	// [필드부]
	// 제목, 저자명, 가격
	private String title;
	private String author;
	private int price;
	
	// [생성자부]
	public Book() {
		
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// [메소드부]
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString도 자동완성 가능: source > generate toString
	@Override
	public String toString() {
		return "Book [title = " + title + ", author = " + author + ", price = " + price + "]";
	}
	
	/* overriding: 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의/재작성하는 것 -> 부모클래스가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * 자식클래스의 오버라이드된 메소드가 우선권을 가져서 호출됨
	 * 동일한 메소드명으로 완전히 다른 기능을 하기 위해서 사용
	 * 
	 * 성립 조건:
	 * 1. 부모메소드의 메소드명과 동일
	 * 2. 매개변수의 자료형, 갯수, 순서가 동일; 매개변수명과는 무관 vs 매개변수의 자료형, 갯수, 순서가 다르면 overloading
	 * 3. 반환형이 동일
	 * 4. 부모메소드의 접근제한자보다 같거나 공유 범위가 더 넓어야 함 -> 접근제한자를 바꾸는 경우는 많지 않으니 이 점을 신경쓸 일은 별로 없을 것임; '규약(convention)' 개념; 안 되는 건 아님
	 * 
	 * @Override
	 * annotation; 일종의 주석; 생략 가능하지만, 작성하는 습관 들이기; 개발자들끼리의 약속 + 컴파일러에게 알려주기 -> 누가 봐도 overriding이라고 표시 -> 실수 줄이는 방법 -> 생산성 향상
	 *  cf. codes에서 주석 = 프로그램 실행 시 실행 안 됨/무시됨
	 * 명시 안 해도 부모메소드와 형태가 같으면 overriding된 것으로 판단
	 */

}
