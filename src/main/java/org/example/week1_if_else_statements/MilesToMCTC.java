package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("You live " + km + " kkilometers from school.");

        if (miles > 10) {
            System.out.println("You live more than 10 miles away.");
        }
        else if (miles == 10) {
            System.out.println("You live exactly 10 miles away.");
        }
        else {
            System.out.println("You live less than 10 miles away.");
        }
    }
}
