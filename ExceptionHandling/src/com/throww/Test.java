package com.throww;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();

        Person p = new Person();

        try {
            p.checkAge(age);
            System.out.println("Eligible to vote");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }finally {
        	sc.close();
        }
    }
}
