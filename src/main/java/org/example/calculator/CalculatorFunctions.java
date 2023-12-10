package org.example.calculator;

public class CalculatorFunctions {
    private int firstNumber;
    private int secondNumber;

    public int add(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        if (firstNumber <= 0 || secondNumber <= 0) {
            System.out.println("Invalid number");
        }
        else {
            if (secondNumber > firstNumber) {
                return secondNumber - firstNumber;
            }
        }
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        if (firstNumber <= 0 || secondNumber <= 0) {
            System.out.println("Can't divide by 0");
        }
        return firstNumber / secondNumber;
    }
}
