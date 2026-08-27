package com.fun.practice.basics;

public class TypeCasting {
    public static void main(String[] args){
        short currentYear = 2030;
        byte age = 39;
        int birthYear = currentYear - age;
        short age2 = age;

        float a = 39.5f;
        int b = 200;
        float d = a + b;

        int c = (int) (a + b);


        double x = 39.5;
        int y = 200;
        double zy = a + b;

        int z = (int) (a + b);

        //Casting int value to a double
        int my_Int = 9;
        double num = my_Int;
        System.out.println(num);

        System.out.println();
        //Casting double value to an int
        double doubleValue = 9.85;
        int resul = (int)doubleValue;
        System.out.println(resul);
    }
}
