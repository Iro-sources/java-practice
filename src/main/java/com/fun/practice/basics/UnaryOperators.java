package com.fun.practice.basics;

public class UnaryOperators {
    public static void main(String[] args)
    {
        int a = -10;
        System.out.println(a);

        //Increment operator
        int b = 1;
        //postfix
        //b++;
        //System.out.println(b++);

        //prefix

        System.out.println(++b);

        //++b;
       // System.out.println(++b);

       //Decrement
        int num = 2;
//      System.out.println(num--);
        System.out.println();

        int num2 = 2;
        System.out.println(--num);

        int c = 50;
        c += 5 + (c) + (c);
        System.out.print(c++);
    }
}
