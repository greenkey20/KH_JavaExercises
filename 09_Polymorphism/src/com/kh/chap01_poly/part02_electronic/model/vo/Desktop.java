package src.com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic {
	
	public static final String cpu = "intel"; // CPU는 반드시 intel을 사겠다 -> 이 변수는 변화시키지 않는 상수로 쓰겠다
	// final -> static
	// final
	// final int 출근시간 = 9시; // 절대 바뀌면 안 됨; 고정
	// final int 퇴근시간; // 18시, 19시, 22시 등 여러 가지 대입 가능
	// 이런 변수는 stack 영역에 저장
	
	// 인스턴스변수 @heap 영역 -> 객체 생성 시 마다 cpu라는 메모리 영역 생김
	
	// static 영역(-> 프로그램 실행 중 언제든지 가져다 쓸 수 있음)에서 바뀌지 않는 값으로 사용하겠다
	// static final, final static -> 메모리 static 영역에 들어감; 프로그램 실행 시 할당되어 종료 시까지 쓸 수 있음; 프로그램 실행 중에는 언제든지 가져다 쓸 수 있음
	// 어차피 누구나 사용 가능하고 어차피 수정 불가능 -> public
	// 프로그램 중에 하나의 값을 사용 -> 객체마다 메모리를 할당받아 사용(x) static에 하나 만들어놓고 필요할 때마다 사용(o) -> 메모리 절약 -> 관례적으로/암묵적인 약속에 따라 final 변수에는 static 붙임
	// 환경설정 파일, 파일 경로 등 public static 씀
	
	private int ram;

	
	public Desktop() {
		
	}
	
	public Desktop(String name, String brand, int price, int ram) { // 객체 생성 시 값 초기화
		super(name, brand, price);
		this.ram = ram;
	}
	
	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", CPU : " + cpu + ", RAM : " + ram;
	}

}
