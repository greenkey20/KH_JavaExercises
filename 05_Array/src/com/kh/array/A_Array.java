package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

// projects 1~4 내용으로 모든 것을 만들 수 있음 -> 앞으로 배우는 것은 생산성 높이는(짧은 시간에 많은 것을 만들어내는) 것을 배우는 것

public class A_Array { // 클래스 영역 시작
	
	/* 변수(variable): 메모리공간(RAM, 기억장치)에 데이터값을 저장하기 위한 공간
	 * 특징
	 * 1. 값이 바뀔 수 있다
	 * 2. 변수(자료형)마다의 크기가 정해져있다
	 * 3. 형 변환
	 * 4. 자료형이 지정되어 있다
	 * 5. 한 블록 내에 선언은 한 번 밖에 못한다; code block 안에서 선언+사용된다..
	 * 6. 참조형은 주소값을 저장한다
	 * 7. 공간이 하나다 -> 주소가 하나다; 값을 하나만 받는다 -> 하나의 공간에 하나의 값만 담을 수 있다
	 */
	
	/* 배열(array): 하나의 공간에, "같은 자료형의" 여러 개의 값들을 담을 수 있음
	 *  - 배열 선언 시 앞에 자료형 써줘야 함
	 * 배열 = 순서가 있는 공간 -> 순서가 있음 = index가 있음 -> index가 있는 공간/칸이 만들어짐
	 * 배열의 각 index("색인, 목록") 자리에 실제 값이 담김 -> index = 배열의 각 방
	 * index는 0부터 시작 + 같은 크기로 만듦
	 */
	
	public void method1() { // method1 영역 시작
		
		/* 배열 사용 이유
		 * 변수만 이용해서 프로그래밍을 하면 0, 1, 2, 3, 4.. 값이 늘어날 때마다 변수를 만들어서 기록(?)..
		 * 
		 * 변수 선언 시
		 * int num1 = 1;
		 * int num2 = 3;
		 * int num3 = 7;
		 * int num4 = 4;
		 * int num5 = 12;
		 * 
		 * 변수값 출력 시
		 * System.out.println(num1);
		 * System.out.println(num2);
		 * System.out.println(num3);
		 * System.out.println(num4);
		 * System.out.println(num5);
		 * 
		 * num1~num5 합 계산 시
		 * int sum = 0;
		 * for (i = 1; i <= 5; i++) {
		 * 		sum = sum + numi; // 반복문에서 numi를 변수명(x)식별자(o)로 인식해서 작동 안 함
		 * }
		 * 
		 * sum = num1 + num2 + num3 + num4 + num5; // 변수 하나하나 더해줌
		 * 
		 * 변수가 100개가 되면? num1000까지 있다면..? -> 해결책 = 배열
		 */
		
		/* 1. 배열 선언
		 * 표현법
		 * 변수 선언: 자료형 변수식별자; e.g. int a; // 정수형 변수 선언
		 * 배열 선언: 방법1) 자료형 배열명[]; e.g. int arr[]; // 정수형 배열 선언
		 * 		   방법2) 자료형[] 배열명;(이 방법을 주로 사용) e.g. int[] arr; // 정수형 배열 선언
		 *
		 * 2. 배열 할당: 이 배열에 몇 개의 값이 들어갈지/index 몇 개 쓸지/공간 몇 개 필요한지, 배열의 크기를 정해주는 과정 -> 지정한 갯수만큼 값이 들어갈 공간이 만들어짐
		 * 표현법
		 * arr = new int[5]; // 배열 선언은 위에서 했고, 선언한 그 배열에 크기 할당
		 * int[] arr = new int[5]; // 배열 선언과 동시에 할당
		 * 
		 * 참조형 자료형 String: String str = new String(); -> 배열도, 객체도 참조형 -> new 사용 가능
		 */
		
		int[] arr1; // 배열 선언 + 논리적인 한 문장 끝났으니까 ;
		arr1 = new int[15]; // 배열 할당 -> 2줄로 표현
		
		int[] arr2 = new int[5]; // 배열 선언과 동시에 할당 -> 1줄로 표현
		
		/* 3. 배열의 각 index 자리에 값 대입
		 * 표현법
		 * 배열이름[index값] = 대입하고자 하는 값; 
		 */
		
		// 변수 사용하듯이 작성
		arr2[0] = 1;
		arr2[1] = 3;
		arr2[2] = 7;
		arr2[3] = 4;
		arr2[4] = 12;
		
		System.out.println(arr2); // 배열은 참조형 자료인 바, 주소값이 저장되어 있고, 따라서 주소값이 출력됨
		
		// 아래와 같이 출력하면 변수 사용과 다름이 없음; 변수는 출력 시 반복문 사용 불가
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		// 배열의 가장 큰 장점 = 반복문 사용 가능 -> 값 대입
		for (int i = 0; i < arr1.length; i++) { // i = 0~14일 때 15번 반복
			arr1[i] = (i + 1); // i번 index 방에 i+1 값을 대입; 우항 괄호는 생략 가능
		}
		
//		for (int i = 0; i <= arr1.length; i++) { // i = 15일 때 조건식 true -> arr1[15] = 16(arr1 배열(방 15개짜리) 16번째 방(없는 방)에 16을 대입하고자 함)
//												 // -> "array index out of bounds" exception(오류) 발생 + "Index 15 out of bounds for length 15"라고 상세한 이유 알려줌
//			arr1[i] = (i + 1); // i번 index 방에 i+1 값을 대입
//		}
		
		for (int i = 0; i <= (arr1.length - 1); i++) { // i = 0~14일 때 15번 반복
			System.out.println(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) { // i = 0~4일 때 5번 반복
			System.out.println(arr2[i]);
		}
		
	} // method1 영역 끝
	
	public void method2() { // method2 영역 시작
		
		// String형 배열
		// 1. 배열 선언 및 할당
		// 배열 이름 지을 때 보통 '복수형' 사용 e.g. nums, names..
		String[] names = new String[30];
		
		// 2. 배열의 index에 값을 대입
		names[0] = "강은영";
		names[1] = "고려진";
		names[2] = "고정인";
		names[3] = "곽주현";
		names[4] = "김경휘";
		names[5] = "김관민";
		names[6] = "김다은";
		names[7] = "김미라";
		names[8] = "김민정";
		names[9] = "김호";
		names[10] = "문수정";
		names[11] = "박종혁";
		names[12] = "박주연";
		names[13] = "박현빈";
		names[14] = "설윤수";
		names[15] = "손민성";
		names[16] = "안소영";
		names[17] = "우윤희";
		names[18] = "유은비";
		names[19] = "이다솔";
		names[20] = "이대성";
		names[21] = "이선민";
		names[22] = "이지은";
		names[23] = "임세현";
		names[24] = "정유경";
		names[25] = "조정욱";
		names[26] = "주승원";
		names[27] = "최선진";
		names[28] = "허소윤";
		names[29] = "허지만";

//		names[100] = "이승철"; // 빨간줄 안 뜸 -> 문법적으로는 맞게 썼음/문법은 틀린 것 없음
		// 실행시키면 오류 이유 알려줌: ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 30(배열의 index의 범위를 벗어남); 30개 밖에 방이 없는데 101번 방을 달라고 하니 오류
		// 오류 위치도 알려줌: at com.kh.array.A_Array.method2(A_Array.java:147); A_Array라는 클래스의 method2의 155행에서 오류가 발생했음
		
		System.out.println("names 배열의 첫번째 칸(0번 index)에 저장된 값 : " + names[0]);
		
		System.out.println("names 배열의 크기 : " + names.length);
		
		
		// 방법1-a)
//		for (int i = 0; i <= (names.length - 1); i++) {
//			System.out.printf("출석번호 %d번 %s\n", i + 1, names[i]); // %s 구멍 뚫는 것 까먹고 코드 작성하면 문법적 오류(빨간줄)는 없으나, 실행하면 예상치 못한 결과가 나옴 = 논리적 오류
//		}
		
		// 방법1-b)
		for (int i = 0; i < names.length; i++) {
			System.out.printf("출석번호 %d번 %s\n", i + 1, names[i]);
		}
		
		// 방법2-a)
//		for (int i = 1; i <= names.length; i++) { // i의 초기값이 바뀌면 index가 0부터 시작하도록 바꿔야 함 -> 배열 크기에 맞게 반복 횟수 확인
//			System.out.printf("출석번호 %d번 %s\n", i, names[i - 1]);
//		}
		
		// 방법2-b)
//		for (int i = 1; i < (names.length + 1); i++) { // i = 1~30일 때 30번 반복
//			System.out.printf("출석번호 %d번 %s\n", i, names[i - 1]);
//		}
		
	} // method2 영역 끝
	
	public void method3() { // method3 영역 시작
		// 사용자로부터 입력을 통해 배열에 값을 담아서 해당 배열에서 가장 작은 값(최소값)을 구하는 메소드 만들기
		// 정보처리기사 알고리즘 문제 ou 취업 시 간단한 코딩테스트..
		
		int[] nums = new int[5]; // 5칸짜리 정수형 배열 "nums" 선언 및 할당
		
		System.out.println(nums.length);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <= (nums.length - 1); i++) { // 사용자로부터 숫자 5개 입력 받아야 함 = 반복되는 행위 -> 명확한 반복 횟수가 정해진 경우 for문 vs 반복 횟수가 정해지지 않은 경우 while문 사용
			System.out.print("정수를 입력해주세요 > ");
			nums[i] = sc.nextInt();
			System.out.println("nums 배열의 " + i + "번째 index에 들어가는 값 : " + nums[i]);
		}
		
		System.out.println(Arrays.toString(nums)); // 위 for을 통해 배열 nums 잘 만들어졌는지 확인하기 위한 출력문
		
		int min = nums[0]; // 최소값이라는 변수 만들어 nums 배열 첫번째 칸에 있는 값 대입해둠
		
		for (int i = 0; i <= (nums.length - 1); i++) {
			if (nums[i] <= min) { // 반복문에서 현재 확인 중인 index i에 저장된 값이 min 값보다 같거나 작으면,
				min = nums[i]; // nums[i]를 최소값에 대입함
			}
		}
		
		System.out.println("배열 nums의 최소값 : " + min);
			
	} // method3 영역 끝
	
	public void method4() { // method4 영역 시작 
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5]; 
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요 > ", i + 1);
			nums[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(nums));
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= max) {
				max = nums[i];
			} else if (nums[i] <= min) { // else if로 묶어도 되는지 정확히 모르겠음(2021.10.21자 숙제 풀이에서 강사님은 묶어서 하심); else if로 묶으면 2개의 if문으로 썼을 때보다 연산이 1회 적어지는 경우가 생기는 것 같음
				min = nums[i]; 
			}
		}
		
		System.out.println("배열 nums의 최대값 :" + max);
		System.out.println("배열 nums의 최소값 :" + min);
		
	} // method4 영역 끝
	
	public void method5() { // method5 영역 시작
		
		// 오늘 배운 배열(array) 내용 정리해보기
		// 1. 배열 선언 및 크기 할당
		int[] iArr = new int[3]; // 정수값 담는 index 3칸(0번, 1번, 2번)
		int[] iArr2 = new int[3];
		double[] dArr = new double[5]; // 실수값 담는 index 5칸(0번, 1번, 2번, 3번, 4번)
		
		// 배열이름.length: 배열의 길이/크기 -> 정수 값 반환
		System.out.println("iArr의 크기 : " + iArr.length); // 3
		System.out.println("dArr의 크기 : " + dArr.length); // 5
		
		// 배열 iArr 및 dArr에 초기화해주지는 않은 상태
		System.out.println(iArr[0]); // 0
		System.out.println(dArr[0]); // 0.o
		
		/* 기본 자료형: 실제 값을 바로 담을 수 있는 변수; 일반 변수
		 *  - boolean, char, byte, short, int, long, float, double 8가지
		 * 
		 * 참조 자료형: 실제 값이 저장되어있는 주소값을 담고 있는 변수; 참조(reference) 변수
		 *  - String, 배열(int[], double[], short[]..)
		 *  - 참조 자료형끼리 동등비교(==)하면 주소값을 비교하므로 내가 일반적으로 원하는/기대하는 값을 얻을 수 없음 -> 문자열끼리 같은지 비교하려면 메소드 '문자열명.equals(비교할 문자열);' 사용
		 */
		
		System.out.println(iArr); // 알아보기 힘든 형태의 주소값이 출력됨
		System.out.println(dArr);
		
		System.out.println("iArr의 해시코드 값 : " + iArr.hashCode()); // 해시코드: 주소값을 10진수 형태로 나타낸 것 cf. 비둘기집 원리로 설명..
		System.out.println("iArr2의 해시코드 값 : " + iArr2.hashCode());
		System.out.println("iArr == iArr2 ? : " + (iArr == iArr2)); // false
		
		System.out.println("dArr의 해시코드 값 : " + dArr.hashCode());
		
		// 반복문: 0번 index에서부터 마지막 index까지 1씩 증가하면서 순차적으로 출력 가능
		// 마지막 index의 값 == 배열의 크기 - 1
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " "); // 배열에 값 초기화해주지 않은 상태에서 값들은 0(.0)
		}
		
		System.out.println();
		
	} // method5 영역 끝
	
	public void method6() { // method6 영역 시작
		int[] arr = new int[5]; // index 5개(0~4번 index)
		
		arr[0] = 5;
		arr[1] = 15;
		arr[2] = 156;
		arr[3] = 20165;
		arr[4] = 4894;
		
		System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]); // 하드코딩
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("배열 arr의 원소의 합 : " + sum);
		
	} // method6 영역 끝
	
	/* 배열의 아쉬운 점: 한 번 지정한 배열의 크기는 변경 불가함
	 * -> 배열의 크기를 변경하고자 한다면? 어쩔 수 없이 배열을 다시 만들어야 함; '죽었다 깨어나면' 다른 크기로 사용 가능
	 * -> 배열 다시 만들기 = 할당 다시 하기 = 배열의 이름만 가져다 씀
	 */
	public void method7() { // method7 영역 시작 
		String[] sArr = new String[3];
		// 이 참조형의 이름 sArr은 단순한 이름/식별자일 뿐; 식별하기 위한 도구; 프로그래머가 지어준 것; 얘가 뭔가를 갖고 있는 것 아님; 이 이름으로 사용하는 것..
		
		sArr[0] = "강은영";
		sArr[1] = "강해피";
		sArr[2] = "강판다";
		
		System.out.println("sArr의 해시코드 : " + sArr.hashCode()); // sArr이 가지고 있는 주소값을 10진수로 변환하여 표시
		
		for (int i = 0; i < sArr.length; i++) { // sArr(참조형)를 부르면 나오는/sArr이 가리키고 있는(point) 주소 = kh종로 -> 그 주소에 가면 kh종로가 있음
			System.out.println(sArr[i]);
		}
		
		sArr = new String[7]; // new = 새로 만들기("객체 생성 연산자"(내일 2021.10.22(금) 배울 용어..))
							  // sArr이라는 이름으로 이제/새로이 가리키는(재할당) 주소 = kh강남; 이 주소에 가면 kh강남이 있음
							  // -> 이제 kh종로를 가리키는/참조하는 게 없어짐(=참조(reference)하고 있는 count가 0개); kh종로는 둥둥 떠다님..
		
		System.out.println("--- sArr이 죽었다 살아났나(=sArr이 가리키고 있는 주소값이 바뀌었나)? ---");
		System.out.println("죽었다 살아난 sArr의 해시코드 : " + sArr.hashCode());
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]); // 기존 sArr에 저장되어 있던 값을 날아감(?); 각 index에는 null 값(참조자료형의 기본값)이 들어가 있음
		}
		
		/* 배열은 항상 고유한 주소값이 부여됨(이 명제가 항상 참인 것은 아님; 우리 수업에서는 참이라고 생각해도 됨) -> 주소값이 다르면 다른 배열; 비둘기집 원리/hash 충돌 (!= 기존에 생성된 주소와 절대 겹치지 않는다)
		 * 기존 배열 이름에 '할당'만 다시 하면, 기존에 참조하고 있던 연결이 끊기고 새로운 배열과 연결됨 -> 새로운 곳을 참조
		 * -> 연결이 끊어진 기존의 배열은 heap 영역의 메모리에 둥둥 떠다니다가 일정 시간이 지나면 garbage collector(쓰레기 모으는 자)가 삭제시켜줌 = 자동 메모리 관리; reference(참조) count(숫자 세는 것)가 0이면 garbage collector가 와서 소중한 메모리 자원을 가져감
		 */
		
		// 현재 연결고리를 끊고만 싶다면?
		sArr = null; // "주소에는 아무 것도 없어" "'아무 주소도 없다'고 씌여있음" "주소값이 없다"; null = '아무 것도 존재하지 않음'을 의미; 많이 쓰임 -> kh강남으로 가리키는 것 끊음/없앰 
		
		System.out.println(sArr); // 출력 결과 = null 값 -> 아무 것도 존재하지 않음을 의미하는 null이 있음(o) 아무 것도 없는, 텅텅 비어있는 것(x)
//		System.out.println(sArr.hashCode()); // 아무 것도 없는데 hashcode 어떻게 구하니? 오류 msg 뜸
		
		String[] arr = null;
		System.out.println(sArr == arr); // 동등비교는 값을 비교하는 것; 출력 결과 = true
		
//		sArr[0] = "수강생 500배"; // 현재 sArr에는 아무 주소도 없음 -> Null Pointer Exception: 가리키는 게 아무 것도 없는데/주소가 없는데 어떻게 접근/대입할래? Cannot store to object array because "sArr" is null
//		System.out.println(sArr[0]); // 실행해보니 위와 같은 오류 msg 뜸
		
		/* 기본 자료형에는 없는 개념
		 * 참조 자료형에는 null이라는 개념 추가 -> 주소값이 있나, 없나?
		 * 
		 * 기본 자료형은 기본값이 
		 * int a = 0;
		 * double b = 0.0;
		 * char c = ' ';
		 * 
		 * 참조 자료형의 기본값은 null(주소값이 없다)
		 * int[] iArr = null;
		 * double[] dArr = null;
		 * Scanner sc = null;
		 */
		
//		String str; // String은 참조 자료형이지만, 자동으로 null로 초기화되지는 않음(예외사항)
//		str = null; // 이렇게 null로 대입해주어야 함
		String str = null; // 이게 올바른 사용방법
//		String str = new String(); // 이건 좋지 않은 사용방법
		System.out.println(str); // 출력 결과 = null
		
	} // method7 영역 끝
	
	public void method8() {
		// 배열 선언 및 할당과 동시에 초기화/대입까지 한 번에 끝내는 방법
		
		// 방법1)
		/* arr1[0] = 1; 
		/* arr1[1] = 2; 
		/* arr1[2] = 3; 
		/* arr1[3] = 4; 
		 */
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		// 방법2)
		int[] arr2 = {1, 2, 3, 4};
		String[] students = {"판다", "미피", "해피", "스노크메이든"}; // 하드코딩 = 비효율적.. 실무에서 시간 없을 때 어쩔 수 없이 이렇게 하기도 하지만, 좋은 건 아님
		students[0] = "혁";
		
		for (int i = 0; i <= students.length - 1; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("arr1 == arr2 ? : " + (arr1 == arr2)); // false <- arr1과 arr2에는 각기 다른 주소값이 저장되어 있음
		System.out.println("arr1의 해시코드 : " + arr1.hashCode());
		System.out.println("arr2의 해시코드 : " + arr2.hashCode());
	}

} // 클래스 영역 끝
