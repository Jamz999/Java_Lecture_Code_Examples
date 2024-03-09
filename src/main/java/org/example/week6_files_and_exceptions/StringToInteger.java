package org.example.week6_files_and_exceptions;

import java.sql.SQLOutput;

public class StringToInteger {
    public static void main(String[] args) {

        String hopeThisIsANumber = "50";

        // try catch makes it so the code block in the try section does not terminate the program early.
        // if try found an error it will start doing something in the catch block.
        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {
            System.out.println(hopeThisIsANumber + " is not a valid a valid integer string!!");
        }

        System.out.println("This is the end of the program");
    }
}
