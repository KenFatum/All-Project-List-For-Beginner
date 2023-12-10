package org.example.all_project_list;

import org.example.calculator.CalculatorDisplay;
import org.example.guess_the_right_number.GuessTheRightNumber;

import java.util.Scanner;

public class AllProjectList {
    Scanner scanner = new Scanner(System.in);
    CalculatorDisplay calculatorDisplay = new CalculatorDisplay();
    GuessTheRightNumber guessTheRightNumberDisplay = new GuessTheRightNumber();
    public void start() {
        System.out.println("Welcome to the ALL PROJECT LIST program! \n");
        System.out.println("This program will list all the projects that the creator did. \n");
        System.out.println("So which project yould you like to choose? \n");

        while (true) {
            System.out.println("""
                [----------------------------------------]
                [1] Calculator
                [2] Guess the Number Game
                [3] ToDo-List
                [4] Currency converter
                [5] Temperature converter
                [6] Word Counter
                [7] Simple file manager
                [8] Library management system
                [9] RPG Game
                [0] Exit the Program
                [----------------------------------------]""");

            String option = scanner.nextLine();

            switch (option) {
                case "1" -> calculatorDisplay.startCalculator();
                case "2" -> guessTheRightNumberDisplay.startGuessTheRightNumber();
                case "3" -> System.out.println("ToDo-List is not implemented yet!");
                case "4" -> System.out.println("Currency converter is not implemented yet!");
                case "5" -> System.out.println("Temperature converter is not implemented yet!");
                case "6" -> System.out.println("Word Counter is not implemented yet!");
                case "7" -> System.out.println("Simple file manager is not implemented yet!");
                case "8" -> System.out.println("Library management system is not implemented yet!");
                case "9" -> System.out.println("RPG Game is not implemented yet!");
                case "0" -> System.exit(0);
            }
        }




    }
}
