package com.kh.operator.run;

public class Quiz {
	
	public static void main(String[] args) {
		
		int a = 5; // 5 -> 6 -> 7
		int b = 10; // 10 -> 9
		int c = (++a) + b; // 6 + 10 = 16 -> 15
		int d = c / a; // 16 / 6 = 2 -> 1
		int e = c % a; // 16 % 6 = 4 -> 5 -> 6
		int f = e++; // 4
		int g = (--b) + (d--); // 9 + 2 = 11 -> 10
		int h = 2; // 2
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); // 연산자와 피연산자 띄어쓰기 -> 가독성 향상
		//    = 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		//    = 6 + 9 / 3 * 10 % 8
		//    = 6 + 30 % 8
		//    = 6 + 6
		//    = 12
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
				
	}

}
