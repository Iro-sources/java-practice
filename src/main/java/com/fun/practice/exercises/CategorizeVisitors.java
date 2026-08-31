package com.fun.practice.exercises;

import java.util.Scanner;

public class CategorizeVisitors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 4){
            System.out.println("Infants");
        }
        else if (age < 12){
            System.out.println("Children");
        }
        else if (age < 64){
            System.out.println("Adults");
        }
        else {
            System.out.println("Seniors");
        }

        int a=10,b=15;
        if(a>b)
        {
            System.out.print("a");
        }
        else
        {
            System.out.print("b ");
        }
        System.out.print("is greater");
    }
}
