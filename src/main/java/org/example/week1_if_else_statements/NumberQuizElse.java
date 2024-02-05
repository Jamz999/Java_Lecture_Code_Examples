package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class NumberQuizElse {
    public static void main(String[] args) {
        int secretNumber = 6;

        int guess = intInput("Guess the number I am thinking of");

        // display that you got it correct if guessed secret number correctly, otherwise print incorrect statement.
        if (guess == secretNumber) {
            System.out.println("You've guessed it correctly!");
        }
        else {
            System.out.println("Sorry, I was thinking of " + secretNumber);
        }
    }
}
