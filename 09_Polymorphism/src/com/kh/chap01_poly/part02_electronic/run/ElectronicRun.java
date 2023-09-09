package src.com.kh.chap01_poly.part02_electronic.run;

import src.com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import src.com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import src.com.kh.chap01_poly.part02_electronic.model.vo.*;

public class ElectronicRun {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("제품명", "브랜드", 100, 16);
		System.out.println(d);
		
		Test t = new Test(1);
		// t라는 객체의 모양 = private 필드 int 1, public getter/setter <- Test라는 클래스/자료형을 이렇게 만들었기 때문에
//		method(t); // Test 자료형 t(객체의 주소값을 가지고 있는 식별자/변수)를 인자로 받아 method() 메소드를 호출 
		
		// 납품업체
		// 1. 다형성 적용 안 했을 경우(ElectronicController1)
		// ElectronicController1 자료형을 이용해서 객체 ec를 생성 -> 객체(재고 담을 필드들)는 heap 영역에 올라감
		// -> 이 객체는 인스턴스변수로 전자제품 자료형(변수니까 공간; 참조자료형 -> 기본값은 null, 아직 주소값을 가지지는 못함) 3개가 있음
		ElectronicController1 ec1 = new ElectronicController1();
		
		// 객체 간의 상호작용
		
		// 재고 추가
		ec1.insert(new Desktop("짱짱데스크탑", "Apple", 3500000, 32)); // Desktop 클래스 객체를 생성(new)하며 생성자에 인자를 넣어 초기화를 시키고, 그 객체를 ec1 객체의 insert() 메소드 호출 시 인자로 넣음
		ec1.insert(new SmartPhone("갤럭시pro12", "삼성", 220000, "010-8217-4120"));
		ec1.insert(new NintendoSwitch("동물의숲 에디션", "Nintendo", 310000, true));
		
		// 가게에 있는 제품들을 조회
		Desktop dt = ec1.selectDesktop(); // selectDeskop() 메소드의 반환형 = Desktop 자료형 -> 대입연산자의 특성에 따라 Desktop 자료형의 변수에 저장해주어야 함
		SmartPhone s = ec1.selectSmartPhone();
		NintendoSwitch ns = ec1.selectNintendoSwitch();
		
		System.out.println(dt);
		System.out.println(s);
		System.out.println(ns);
		
		// 2. 다형성 적용했을 경우(ElectronicController2)
		// 객체 생성
		ElectronicController2 ec2 = new ElectronicController2();
		
		// 재고 추가
		ec2.insert(new Desktop("짱짱데스크탑", "Apple", 3500000, 32), 0);
		ec2.insert(new SmartPhone("갤럭시pro12", "삼성", 220000, "010-8217-4120"), 1);
		ec2.insert(new NintendoSwitch("동물의숲 에디션", "Nintendo", 310000, true), 2);
		
		// 하나씩 재고 조회: 강제형변환 필요
		Desktop dt2 = (Desktop)ec2.select(0); // select() 메소드의 반환형 = Electronic(부모) 자료형 -> 부모님은 자식의 자료형을 받은 적이 없는 바 사용할 수 없음(자식 것은 자식만 사용 가능)
		SmartPhone s2 = (SmartPhone)ec2.select(1);
		NintendoSwitch ns2 = (NintendoSwitch)ec2.select(2);
		
		System.out.println(dt2);
		System.out.println(s2);
		System.out.println(ns2);
		
		// 재고 전체 조회
		Electronic[] elec = ec2.selectAll(); // 얕은 복사 = 좌항과 우항의 참조 주소가 같아짐; ec2.elec의 elec에는 Electronic형의 배열이 있는 주소값이 담겨있음 -> 그 주소값을 따라가면 각 index에 스마트폰, 데스크탑, 닌텐도 객체의 주소가 담긴 배열이 있음 -> 
		
		// 얕은복사: 주소값만 복사 -> 같은 곳을 가리키고 있음
		// 깊은복사: 새로운 공간을 만들어
		
		// 강제형변환 한 적 없음 <- 
		for (int i = 0; i < elec.length; i++) {
			System.out.println(elec[i]/*.toString() 생략해줘도 자동으로 붙음*/); // index i 안에 주소값이 있음 -> 
		}
		// Electronic형 배열 = 부모클래스 -> 자식클래스의 오버라이딩된 메소드가 우선순위를 갖기 때문에 형변환 없이
		
		/* 다형성 사용 이유
		 * 1. 부모 type의 객체 배열로 다양한 (types의) 자식 객체들을 받을 수 있음; 부모 type 하나로 자식 객체들을 모두 다룰 수 있음
		 * 2. 메소드의 갯수가 줄어듦
		 * 3. source codes 길이가 줄어들어 -> 효율성, 가독성, 생산성 향상
		 */
		
		// 2021.10.28(목)까지 다형성 개념은 끝
		// 2021.10.29(금) 수업 계획: 추상클래스, 인터페이스(3hrs), 예외 처리(3hrs), Java 복습(2hrs)
		// 2021.11.1(월) 조별 협업 경험

	}

}
