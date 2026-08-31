package com.fun.practice.exercises;

public class InchesToMeters {
    public static void main(String[] args) {
        int inch;
        int lineCounter = 0;
        for (inch = 1; inch <= 144; inch++) {
            System.out.printf(inch + " * " + " 0.0254 " + " = " + "%.4f%n", inch * 0.0254);

            lineCounter++;
            if (lineCounter == 12) {
                System.out.println();
                lineCounter = 0;
            }
        }
    }
}