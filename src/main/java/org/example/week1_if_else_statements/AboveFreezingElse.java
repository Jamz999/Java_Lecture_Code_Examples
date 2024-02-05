package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class AboveFreezingElse {
    public static void main(String[] args) {
        double temp = doubleInput("Enter today's temperature in F");

        // prints in if statement if 'temp > 32' condition is true, otherwise it prints in the else-statement.
        if (temp > 32) {
            System.out.println("It's above freezing");
        }
        else {
            System.out.println("It's below freezing");
        }
    }
}
