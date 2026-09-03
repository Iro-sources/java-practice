package com.fun.practice.loops.forloop;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[]args) {
        //Given a number N, print sum of all even numbers from 1 to N.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i += 2){
            sum += i;
            }
        System.out.println(sum);
    }
}


