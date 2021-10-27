package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Homework { // 클래스 영역 시작
	
	// 이번 숙제까지가 절차적/구조적(structural, 컴퓨터가 생각하는대로) 프로그래밍/컴퓨터처럼 생각하기 vs 사람처럼 생각(객체지향 프로그래밍)
	// 도움을 받아서 할 수 있으면 됨..

	public void exercise1() { // exercise1 메소드 영역 시작
		
		System.out.println("[2021.10.21자 숙제1번: 1~10 난수 10개 최대/소값]");
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
		// e.g. 5 3 2 7 4 8 6 10 9 10
		// 최대값 : 10
		// 최소값 : 2
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
			System.out.print(nums[i] + " "); // random 발생하는 숫자 하나씩 출력
		}
		
		// 응용) 10개 숫자 반복되는 것 없이 난수 생성
//		for (int 0 = 1; i < nums.length; i++) {
//			nums[i] = (int)(Math.random() * 10) + 1;
//			for (int j = 1; j <= i; j++) {
//				if (nums[i] == nums[i - j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
//		System.out.println("\n" + Arrays.toString(nums)); // for문 안에서 숫자 하나씩 출력하는 방식 사용해봄
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (max <= nums[i]) { // 나는 nums[i] >= max 이렇게 썼었는데, 강사님 제시 답안이 가독성이 나은 듯
				max = nums[i];
			} else if (min >= nums[i]) { // 나는 nums[i] <= min 이렇게 썼었는데, 가독성을 위해 수정
				min = nums[i];
			}
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min + "\n");

	} // exercise1 메소드 영역 끝

	public void exercise2() { // exercise2 메소드 영역 시작
		
		System.out.println("[2021.10.21자 숙제2번: lotto 번호 자동 생성기]");

		// 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 출력하세요
		// e.g. 39 1 41 34 2 27
		
		int[] nums = new int[6]; // lotto 번호 저장할, 정수 6개 저장할 배열 "nums" 선언 및 할당
		
		for (int i = 0; i < nums.length; i++) { // 첫번째 for문 영역 시작; lotto 번호 배열에 난수 6개를 채워넣을 반복문 
			nums[i] = (int)(Math.random() * 45) + 1; // 배열 nums의 index 0~(배열 크기-1)에 lotto 번호 하나씩 대입/저장해줌
			
			if (i > 0) { // i = 0일 때/1개 뽑았을 때는 비교할 필요 없음
				for (int j = 0; j < i; j++) { // 강사님께서 더 간단히 알려주신 코드
					if (nums[i] == nums[j]) {
						i--;
						break;
					}
				}
			}
			
//			for (int j = 1; j <= i; j++) { // 내가 지금 뽑아놓은 숫자만큼 비교하면 됨; 단 1개 뽑았을 때는 비교할 필요 없음
//				if (nums[i] == nums[i - j]) { // 배열 nums에서 자신(현재 검사 중인 i)보다 앞에 오는 원소들(i-j)과 자신의 값이 같다면
//					i--; // 첫번째 for문의 증감식에 의해 i의 값이 증가하지 않도록 여기서 i의 값을 하나 감소시킨 뒤,
//					break; // 첫번째 for문의 증감식으로 돌아가 현재 i의 lotto 번호를 다시 받을 수 있게 함
//				}
//			}
		} // 첫번째 for문 영역 끝
		
		Arrays.sort(nums); // Arrays 클래스에서 제공하는 sort() 정렬(올림차순)하는 기능 활용
		
		/* input -> 메소드 = 마법상자/클래스 안에 만들어놓은 함수/멤버함수 -> output
		 * 
		 * 지금까지 본 메소드(기능)
		 * main(String[] args) // String 배열을 매개변수(인자?)로 받음
		 * input = 배열 -> Arrays.sort(정렬할 대상) -> output = 정렬된 배열
		 * Arrays.toString(보여줄 배열 이름);
		 * Arrays.sort(정렬할 대상);
		 * 문자열.equals(비교 대상 문자열);
		 * Scanner(System.in); // Scanner클래스의 생성자
		 * next();
		 * input = 문자열 -> charAt(index번호) -> output = 문자 하나
		 * print();
		 * Math.random();
		 */
		
		// 출력방법1)
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		// 출력방법2)
		System.out.println("\n☆행운과 행복의 lotto 번호☆ : " + Arrays.toString(nums) + "\n"); // toString() 기능 = 예쁘게 보여줌
		
		// lotto 번호 정렬 시도..
//		int min = nums[1];
//		int temp = 0;
//		
//		for (int i = 1; i < nums.length; i++) {
//			if (nums[i] <= min) {
//				temp = nums[i - 1];
//				nums[i - 1] = nums[i];
//				nums[i] = temp;
//			}
//		}
//		
//		System.out.println("정렬된 lotto 번호 : " + Arrays.toString(nums));

	} // exercise2 메소드 영역 끝

	public void exercise3() { // exercise3 메소드 영역
		
		System.out.println("[2021.10.21자 숙제3번: 문자열의 문자 검사]");

		// 변별력 문제 -> 반장/조장 찾기
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력
		// e.g. 문자열 : application
		// 문자열에 있는 문자 : a, p, l, i, c, t, o, n
		// 중복되지 않는 문자 개수 : 8 (= 입력받은 문자열의 길이 - 중복된 문자의 갯수)
		
		Scanner sc = new Scanner(System.in); // Scanner 새 거 쓴다
		
		System.out.print("문자열을 입력하세요 > "); // e.g. alias
		String input = sc.next(); // 단어 입력받기; String 변수 input에는 문자열이 저장된 메모리의 주소가 저장되어 있음
		
		// 2021.10.22 아침 강사님 설명)
//		String list = "문자열에 있는 문자 : " + input.charAt(0) + " "; // 사용자가 입력한 문자열에 사용된 문자를 순차적으로 + 중복 없이 저장할 문자열
//		int count = input.length(); // String 변수 input에 저장된 주소에 담겨있는 문자열의 길이; 5
//		
//		for (int i = 1; i <= input.length() - 1; i++) { // index 1부터 문자열의 길이-1(4)까지 반복; index0은 list에서 뺐기 때문에 반복 안 해도 됨
//			// 반복문으로 charAt(i)번째 index와 charAt(j)번째 index까지 비교
//			for (int j = 0; j <= i - 1; j++) {
//				if (input.charAt(i) == input.charAt(j)) {
//					count--;
//					break;
//				} // 중복되지 않은 값을 넣어야 하는데..
//				else if (input.charAt(i) != input.charAt(j) && j == i - 1) {
//					list += input.charAt(i) + " ";
//				}
//			}
//		}
		
		// 내가 숙제로 제출한 것 + 강사님 설명 활용
		// 나는 count--하는 대신, '반복되지 않는 문자를 쌓은 문자열의 길이 = 반복되지 않는 문자의 수' 계산해봄
		String list = "" + input.charAt(0);
		
		for (int i = 1; i < input.length(); i++) { // 사용자가 입력한 문자열의 문자 하나하나 검사하기 위해
			for (int j = 0; j < i; j++) {
				if (input.charAt(i) != input.charAt(j) && j == i - 1) {
					list += input.charAt(i);
				} else if (input.charAt(i) == input.charAt(j)) {
//					count--;
					break;
				}
			}
		}
		
		// 반복되지 않는 문자를 쌓은 문자열을 좀 더 보기 좋게 표현하기 위해(문자 간 띄어쓰기) 아래와 같은 배열을 만들어 출력
		char[] result = new char[list.length()];
		
		for (int i = 0; i < list.length(); i++) {
			result[i] = list.charAt(i);
		}

		System.out.println("문자열에 있는 문자 : " + Arrays.toString(result)); // 그냥 list를 출력하면 반복되지 않은 문자들이 띄어쓰기 없이 다닥다닥 붙어서 출력됨
		System.out.println("중복되지 않는 문자 개수 : " + list.length());

	} // exercise3 메소드 영역 끝

	/* 2021.10.21(목) 숙제 소감
	 * 1번은 수업시간에 배운 내용을 활용해서 쉽게 풀 수 있었습니다.
	 * 2번은 로또 번호 반복 체크하는 중첩if문 조건을 생각해내는데 약간의 고민이 필요했으나,
	 * 각 i별로 체크해야 하는 index 숫자 등 연습장에 쓰고 그려보며 아주 어렵지는 않게 찾아낼 수 있었습니다(30분 이내 소요된 것 같습니다).
	 * 3번은 결국 못 풀었습니다.. 사용된 문자를 스트링이나 배열에 쌓고 싶은데, 중복 없이 어떻게 쌓아야 되는지 아직 못 찾았습니다.
	 * 잘 때도 생각나고 일어나서도 생각납니다. 어서 풀고 싶습니다 ㅠ.ㅠ
	 * 
	 * 매일 열정적이고 친절하게 강의해주시고 지도해주셔서 정말 감사합니다!
	 */

} // 클래스 영역 끝
