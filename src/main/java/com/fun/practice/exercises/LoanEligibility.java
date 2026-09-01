package com.fun.practice.exercises;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your monthly salary");
        double monthlySalary = sc.nextDouble();

        boolean hasLoan = sc.nextBoolean();
        if (age >=18 && monthlySalary >= 2000 && !hasLoan){
            System.out.println("You are eligible to take a loan");
        }
        else {
            System.out.println("You are not eligible to take a loan");
        }

        sc.close();
    }
}
