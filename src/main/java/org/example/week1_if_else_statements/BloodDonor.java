package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class BloodDonor {

    public static void main(String[] args) {
        double weight = doubleInput("What is your weight?");
        int age = intInput("What is your age?");

        // Checks if user is elible to be a blood donor through weight and age.
        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor");
            return; // early return for guard clause.
        }

        // Tells user that they are not eligible and also specifically why.
        System.out.println("Sorry you are not eligible");
        if (weight < 110) {
            System.out.println("You do not weigh enough. You must weigh 110lb or more.");
        }
        if (age < 17) {
            System.out.println("You are not old enough. You must 17 or more.");
        }
    }
}
