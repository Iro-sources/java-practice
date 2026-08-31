package com.fun.practice.exercises;

public class BitWise {
    public static void main(String[]args){
        int x = 7;
        int y = 3;
        int result1 = x << y;
        int result2 = x >> y;
        int result3 = x >>> y;

        int a = 12;
        int b = 7;
        int c = 1;

        System.out.println(a << c);
        System.out.println(b >> c);

        System.out.println("The left shift of " + x + " << " + y + " = " + result1);
        System.out.println("The signed right shift of " + x + " >> " + y + " = " + result2);
        System.out.println("The unsigned right shift of " + x + " >>> " + y + " = " + result2);
    }
}
