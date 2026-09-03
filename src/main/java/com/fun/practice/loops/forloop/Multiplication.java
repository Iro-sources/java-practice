package com.fun.practice.loops.forloop;

import java.util.Scanner;

public class Multiplication {
        public static void main(String[]args){
            System.out.println("Hello world!");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int i;
            for(i=1; i<=10; i++){
                System.out.println(n * i);
            }

            sc.close();
        }
}
