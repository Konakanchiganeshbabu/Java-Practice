package com;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Created Thread");
	}
}
