package org.example.week2_loops;

import static input.InputUtils.*;

public class BusExpenses {
    public static void main(String[] args) {

        double money_spent = 0.00;

        System.out.println("WEEKLY BUS PAYMENT CALCULATOR");
        for (int i = 1; i <= 7; i++) {
            money_spent += doubleInput("On day " + i + " of the week, what did you spend on bus fares?");
        }
        System.out.printf("For the week, you spent $%.2f for bus fares.", money_spent);
    }
}
