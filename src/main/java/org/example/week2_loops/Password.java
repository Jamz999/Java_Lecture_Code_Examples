package org.example.week2_loops;

import static input.InputUtils.*;

public class Password {



    public static void main(String[] args) {
        System.out.println();
        String secretPassword = "kittens";
        String userPassword = stringInput("Enter Password: ");
        int maxGuesses = 5;

        while (!userPassword.equals(secretPassword) && maxGuesses > 0) {
            maxGuesses--;
            System.out.println("Incorrect Password, try again.");
            userPassword = stringInput("Enter Password: ");
        }

        if (maxGuesses > 0) {
            System.out.println("Access Granted!");
        }
        else {
            System.out.println("Reached max number of password attempts.");
            System.exit(0);
        }

        // Secret face.
        String nose = "   [   ";
        String eyes = " *    * ";
        String mouth = "--------(";

        System.out.println(eyes + "\n" + nose + "\n" + mouth);
    }
}
