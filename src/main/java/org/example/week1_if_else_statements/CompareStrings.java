package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class CompareStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        // We have to use .equals() instead of '==' because '==' compares the exact identity of two primitives.
        // Since Strings are objects and not primitive, they can have different identities, meaning '=='
        // will give incorrect results.
        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, MCTC!");
        }
        else {
            System.out.println("Too bad, you should check out MCTC.");
        }
    }
}
