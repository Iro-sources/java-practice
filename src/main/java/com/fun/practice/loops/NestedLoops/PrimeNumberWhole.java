package com.fun.practice.loops;
import java.util.Scanner;

public class PrimeNumberWhole {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 2; i <= n; i++) {
                boolean flag = true;

                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            System.out.println("Not Prime");
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        //System.out.println("Prime");
                        System.out.println(i);
                    }
                }
            sc.close();
            }

        }

