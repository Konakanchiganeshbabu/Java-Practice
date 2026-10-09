package com;

public class Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("HII");
	}
}
