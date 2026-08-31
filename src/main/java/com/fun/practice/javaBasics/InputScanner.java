package com.fun.practice.javaBasics;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your total score");
        int marks = sc.nextInt();


        System.out.println("Please enter your marks");
        float score = sc.nextFloat();

        double percent = (score/marks) * 100;
        System.out.println("Your percent score is: " + percent);
    }
}
