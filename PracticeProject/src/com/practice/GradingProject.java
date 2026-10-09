package com.practice;

import java.util.Scanner;

public class GradingProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();

        String grade = percentage > 90 && percentage <= 100 ? "Grade A" :
                       percentage > 80 ? "Grade B" :
                       percentage > 70 ? "Grade C" :
                       percentage > 60 ? "Grade D" :
                       percentage > 35 ? "Grade E" :
                       percentage >= 0 && percentage <= 35 ? "Failed" : "Invalid Input";
                 
        sc.close();

        System.out.println(grade);
    }
}