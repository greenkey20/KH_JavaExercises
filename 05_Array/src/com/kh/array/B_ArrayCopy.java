package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/* 배열 복사
	 * 1. 얕은 복사: 배열의 주소값만을 복사
	 * 2. 깊은 복사: 동일한 새로운 배열을 하나 생성해서 실제 내부값까지 복사
	 */
	
	// 1. 얕은 복사
	public void method1() {
		
		System.out.println("1. 얕은 복사");
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("--- 원본 배열 출력 ---");
		for (int i = 0; i <= origin.length - 1; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// 복사본 배열: 원본 배열의 주소를 대입해서 만듦 = 얕은 복사 -> 복사본 배열이 원본 배열의 주소를 가리키고 있음
		int[] copy = origin; // 대입연산자 =: 우항의 값(배열 origin이 저장되어 있는 주소값)을 좌항에 대입
		
		System.out.println("\n--- 복사본 배열 출력 ---");
		for (int i = 0; i <= copy.length - 1; i++) {
			System.out.print(copy[i] + " ");
		}
		
		origin[2] = 99; // origin의 index2(세번째) 공간에 값 99를 대입
		
		System.out.println("\n\n=== 원본 배열 수정 완료 ===");
		// 원본 배열만 수정을 했는데 복사한 배열도 수정이 되어있다 -> origin에 저장되어 있는 주소값 = copy에 저장되어 있는 주소값 -> 각각이 같은 내용/주소를 가리키고 있음
		
		System.out.println("--- 원본 배열 출력 ---");
		for (int i = 0; i <= origin.length - 1; i++) {
			System.out.print(origin[i] + " ");
		}
	    
		System.out.println("\n--- 복사본 배열 출력 ---");
		for (int i = 0; i <= copy.length - 1; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드 : " + origin.hashCode()); // 한 번 hashcode로 바꾼 것(hashing)은 많은 연산을 거쳐야만 돌이킬 수 있음
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		// hascodes가 같다고 해서 둘이 같다고 할 수는 없으나, hashcodes가 다르면 둘은 다름 
		
	}
	
	// 2-a. 깊은 복사
	public void method2() {
		
		System.out.println("\n2-a. 깊은 복사");
		
		int[] origin = {1, 2, 3, 4, 5};
		
		//
		int[] copy = new int[origin.length]; // 정수형 값을 담을 배열 "copy" 선언 및 할당(origin 배열의 길이(정수값 5) 크기)
		
		/* copy[0] = origin[0]
		 * copy[내가 넣고자 하는 index] = origin[내가 복사하고자 하는 index]
		 */
		
		for (int i = 0; i <= copy.length - 1; i++) {
			copy[i] = origin[i];
		}
		
		origin[2] = 33; // origin의 index2(세번째) 공간에 값 33를 대입
		
		System.out.println("=== 원본 배열 수정 완료 ===");
		// 원본 배열만 수정을 했고, 복사한 배열도 수정x -> origin에 저장되어 있는 주소값 != copy에 저장되어 있는 주소값
		
		System.out.println("--- 원본 배열 출력 ---");
		for (int i = 0; i <= origin.length - 1; i++) {
			System.out.print(origin[i] + " ");
		}
	    
		System.out.println("\n--- 복사본 배열 출력 ---"); // 원하는 배열 내부 값들이 복사된 것을 확인 가능; 주소값 복사x
		for (int i = 0; i <= copy.length - 1; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
	}
	
	// 2-b. arraycopy() 메소드를 이용한 깊은 복사 -> 생산성 향상
	public void method3() {
		
		System.out.println("\n2-b. arraycopy() 메소드를 이용한 깊은 복사");
		
		// 새로운 배열을 생성한 후, System. 클래스 > arraycopy() 메소드 호출
		// 몇 번 index부터 '몇 개를' '어느 위치부터' 넣을 것인지, 괄호() 안에 작성하여 직접 지정 가능
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0으로 초기화 되어있음
		
		// 표현법: System.arraycopy(원본배열 이름, 원본배열에서 복사를 시작할 index, 복사본배열 이름, 복사본배열에서 복사가 시작될 index, 복사할 갯수);
		System.arraycopy(origin, 0, copy, 0, 5); // copy 배열 = 1 2 3 4 5 0 0 0 0 0
		System.arraycopy(origin, 0, copy, 2, 5); // copy 배열 = 1 2 1 2 3 4 5 0 0 0
//		System.arraycopy(origin, 2, copy, 9, 2); // ArrayIndexOutOfBounds(방 없어) 오류
		
		System.out.println("--- 복사본 배열 출력 ---"); // 원하는 배열 내부 값들이 복사된 것을 확인 가능; 주소값 복사x
		for (int i = 0; i <= copy.length - 1; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
	}
	
	// 2-c. copyOf() 메소드를 이용한 깊은 복사
	public void method4() {
		
		System.out.println("\n2-c. copyOf() 메소드를 이용한 깊은 복사");
		
		// Arrays 클래스에서 제공하는 copyOf() 메소드
		// 표현법: 복사본 배열 = Arrays.copyOf(원본배열 이름, 복사할 갯수);
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy1 = Arrays.copyOf(origin, 3); // 배열 선언과 동시에 초기화
		int[] copy2 = Arrays.copyOf(origin, 10);
		
		System.out.println("--- 복사본 배열 출력 ---");
		for (int i = 0; i <= copy1.length - 1; i++) {
			System.out.print(copy1[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i <= copy2.length - 1; i++) {
			System.out.print(copy2[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열1의 해시코드 : " + copy1.hashCode());
		System.out.println("복사본 배열2의 해시코드 : " + copy2.hashCode());
		
	}
	
	/* System.arraycopy(): 몇 번 index부터 몇 개를 어느 위치의 index에 복사할 것인지 모두 지정 가능
	 * Arrays.copyOf(): 무조건 원본배열의 0번 index부터 복사 진행
	 */
	
	// 2-d. clone() 메소드를 이용한 깊은 복사
	public void method5() {
		
		System.out.println("\n2-d. clone() 메소드를 이용한 깊은 복사");
		
		// 표현법: 복사본배열 이름 = 원본배열 이름.clone();
		
		int[] origin = {1, 2, 3, 4, 5};
		
//		int[] copy = origin; // 얕은 복사
		int[] copy = origin.clone(); // 깊은 복사; index 및 복사할 갯수 직접 지정x; 원본배열과 완전히 같음
		System.out.println("--- 복사본 배열 출력 ---");
		System.out.println(Arrays.toString(copy));
		// 메소드 Arrays.toString(내용 출력하고 싶은 배열의 식별자 입력); 예쁘게 보기 위해서 사용 -> [1, 2, 3, 4, 5]
		
		System.out.println("원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
	}

}
