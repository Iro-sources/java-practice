package com.fun.practice.controlFlow;

import java.util.Scanner;

public class ScholarshipEligible {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your total marks");
        int totalMarks = sc.nextInt();

        System.out.println("Enter your GBA");
        double score = sc.nextFloat();

        System.out.println("Enter your stars in Sports");
        int stars = sc.nextInt();

        if (totalMarks >= 65 && (score > 3.5 || stars > 3)){
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
