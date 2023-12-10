package org.example.calculator;

import org.example.all_project_list.AllProjectList;

import java.util.Scanner;

public class CalculatorDisplay {

    CalculatorFunctions calcFunctions = new CalculatorFunctions();
    Scanner sc = new Scanner(System.in);
    public void startCalculator() {
        System.out.println("Welcome to the Calculator!");
        System.out.println("Select an option from the menu:");
        while (true) {
            System.out.println("""
                [-----------------------------------------------------]
                [1] Addition
                [2] Subtractiom
                [3] Multiplication
                [4] Dividation
                [5] Exit
                [-----------------------------------------------------]""");
            String optiopn = sc.nextLine();
            switch (optiopn) {
                case "1" -> addition();
                case "2" -> subtraction();
                case "3" -> multiplication();
                case "4" -> dividation();
                case "5" -> {return;}
            }
        }
    }

    private void addition() {
        System.out.print("Enter the first Number: ");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second Number: ");
        int secondNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("The Sum of the two numbers is: " + calcFunctions.add(firstNumber, secondNumber));
        System.out.println("[-----------------------------------------------------]");
    }

    private void subtraction() {
        System.out.print("Enter the first Number: ");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second Number: ");
        int secondNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("The Sum of the two numbers is: " + calcFunctions.subtract(firstNumber, secondNumber));
        System.out.println("[-----------------------------------------------------]");
    }

    private void multiplication() {
        System.out.print("Enter the first Number: ");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second Number: ");
        int secondNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("The Sum of the two numbers is: " + calcFunctions.multiply(firstNumber, secondNumber));
        System.out.println("[-----------------------------------------------------]");
    }

    private void dividation() {
        System.out.print("Enter the first Number: ");
        int firstNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second Number: ");
        int secondNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("The Sum of the two numbers is: " + calcFunctions.divide(firstNumber, secondNumber));
        System.out.println("[-----------------------------------------------------]");
    }
}
