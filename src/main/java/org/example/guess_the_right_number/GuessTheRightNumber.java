package org.example.guess_the_right_number;

import java.util.Scanner;

public class GuessTheRightNumber {
    private int guess;
    private int randomNumber = (int) (Math.random() * 100);
    private int tries = 0;
    Scanner scanner = new Scanner(System.in);

    public void startGuessTheRightNumber() {
        System.out.println("Welcome to Guess the Right Number Game!");
        guessTheRightNumber(guess);
    }

    private void guessTheRightNumber(int guess) {
        this.guess = guess;

        while (true) {
            System.out.println("Guess a number between 1 and 100.");
            System.out.print(">> ");
            guess = scanner.nextInt();
            tries++;
            if (guess < randomNumber) {
                System.out.println("Too low");

            }
            else if (guess > randomNumber) {
                System.out.println("Too high");

            }
            else {
                System.out.println("You guessed it right!");
                System.out.println("It took you " + tries + " tries.");
                break;
            }
        }
    }
}
