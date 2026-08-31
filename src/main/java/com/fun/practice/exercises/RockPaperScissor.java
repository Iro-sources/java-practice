package com.fun.practice.exercises;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Let us play");

            System.out.print("Type 0 for rock, 1 for paper, 2 for scissors: ");
            int userChoice = scanner.nextInt();

            int computerChoice = random.nextInt(3);
            System.out.println("Computer choice: " + computerChoice);

            if (userChoice >= 3 || userChoice < 0) {
                System.out.println("You entered a wrong number. You lose");
            }
            else if (userChoice == computerChoice) {
                System.out.println("Draw");
            }
            else if (computerChoice == 0 && userChoice == 2) {
                System.out.println("You lose");
            }
            else if (computerChoice == 2 && userChoice == 0) {
                System.out.println("You win");
            }
            else if (computerChoice > userChoice) {
                System.out.println("You lose");
            }
            else {
                System.out.println("You win");
            }

            scanner.close();
        }
    }

