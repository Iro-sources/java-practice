package com.fun.practice.loops.forloop;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

//        int l;
//        for (l = 1; l < 10; l *= 2) {
//            System.out.println(l);
//        }
//        System.out.println(l);
    }
}
