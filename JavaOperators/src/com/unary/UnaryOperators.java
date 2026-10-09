package com.unary;

public class UnaryOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = a++ + a-- + ++a + --a;
		// 10++ + 10-- + ++10 + --10
		// 10 + 11 + 11 + 10
		System.out.println(a);
		// 10
		System.out.println(b);
		// 41
	}
}
