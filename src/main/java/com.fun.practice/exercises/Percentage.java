package com.fun.practice.exercises;

public class Percentage {
    public static void main(String[] args){
        int totalMarks = 800;
        int scored = 540;
        //double scored = 540;
        double percentage = ((double)scored/totalMarks) * 100;

        System.out.println(percentage);

        float total = 2501.4f;
        double monthS = 3200.50;
        double percent = (monthS/total) * 100;

        System.out.println(percent);

        int num = 10;
        double result = (double) num / 4;
        System.out.println(result);
    }
}
