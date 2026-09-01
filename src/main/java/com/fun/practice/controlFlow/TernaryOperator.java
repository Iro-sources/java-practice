package com.fun.practice.controlFlow;

import java.util.Scanner;

import static java.lang.Math.max;

public class TernaryOperator {
    public static void main(String[] args){
        int x = 10;
        int y = 5;

        int result = (x > y) ? x : y;
        //int result = Math.max(x,y);
        System.out.println(result);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your experience in years");
        int yearsOfExperience = sc.nextInt();

        String role = yearsOfExperience >= 5 ? "Senior" : "Junior";
        System.out.println(role);

        //Nested Ternary Operator
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        int greatestNum = (num1 > num2) ? ((num1 > num3) ? num1 : num2) : ((num2 > num3) ? num2 : num3);
        System.out.println("The maximum value if: " + greatestNum);

        sc.close();
    }
}
