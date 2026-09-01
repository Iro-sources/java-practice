package com.fun.practice.controlFlow;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade");
        int grade = sc.nextInt();

        boolean flag = true;
        if (grade < 0 || grade > 100){
            System.out.println("Invalid score");
            flag = false;
        }
        if (flag) {
            switch (grade / 10) {
                case 10:
                    break;
                case 9:
                    System.out.println("A");
                    break;

                case 8:
                    System.out.println("B");
                    break;

                case 7:
                    System.out.println("C");
                    break;

                case 6:
                    System.out.println("D");
                    break;

                default:
                    System.out.println("F");
            }
        }

        sc.close();
    }
    }
