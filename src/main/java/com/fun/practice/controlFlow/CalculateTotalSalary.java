package com.fun.practice.controlFlow;

import java.util.Scanner;

public class CalculateTotalSalary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //The user has to enter the basic salary and the grade, separated by a space.
        System.out.println("salary grade,");
        int basic = sc.nextInt();
        //and use the grade as a character, depending upon which the total salary is calculated as:
        char grade = sc.next().toUpperCase().charAt(0);

        double hra = (20.0 / 100) * basic;
        double da = (50.0 / 100) * basic;;
        double pf = (11.0 / 100) * basic;

        int allow = 0;

        if (grade == 'A'){
            allow = 1700;
        }
        else if (grade == 'B'){
            allow = 1500;
        }
        else {
            allow = 1300;
        }

        double totalSalary = (basic + hra + da  + allow) -pf;

        System.out.println(Math.round(totalSalary));
    }
}
