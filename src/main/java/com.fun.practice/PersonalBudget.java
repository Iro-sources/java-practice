package com.fun.practice;

public class PersonalBudget {
    public static void main(String[]args){
    String name = "Alex";
    byte age = 25;
    char currency = '$';
    double monthlySalary = 3200.50;

    float rent = 1100.00f;
    float food = 450.75f;
    float transportation =  200.25f;
    float otherExpenses =  300.00f;

    float totalExpenses = rent+food+transportation+otherExpenses;
    double moneyRemaining = monthlySalary - totalExpenses;
    double percentageOfSalarySpent = (totalExpenses / monthlySalary) * 100;

    double yearlyIncome = monthlySalary * 12;
    double yearlyMoneyRemaining =  moneyRemaining * 12;
    int savingsGoal=  15000;

    int workingDaysPerMonth = 22;
    short subscriptions = 4;
    boolean savingsAccount = true;
    long bankAccount = 123456789012L;

    System.out.println("*** Hi, " + name + " here is your personal budget calculation ***");
    System.out.println("Your total expenses are: " + currency + totalExpenses);
    System.out.println("Your remaining amount is: " + currency + moneyRemaining);
    System.out.println("The percentage amount of salary spent is: " + percentageOfSalarySpent);

    System.out.println("Yearly income: " + currency + yearlyIncome);
    System.out.println("Yearly money remaining: " + currency + yearlyMoneyRemaining);
    }
}
