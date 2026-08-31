package com.fun.practice.javaBasics;

public class OperationsCharAndString {
    public static void main(String[] args){
        String firstName = "Abdi";
        String lastName = "Hassan";
        //String fullName = firstName + "" + lastName;
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        char ch = 'a';
        char ch2 = 'b';
        System.out.println(ch + ch2);

        char ch3 = 'c';
        char ch4 = (char)(ch3+1);
        //int num = 1;
        //System.out.println(ch3+num);
        String word = "hello";
        System.out.println(word+ch3);
        System.out.println(ch4);

        String names = "hello";
        int numbers = 88;
        System.out.println(names + numbers );

    }
}
