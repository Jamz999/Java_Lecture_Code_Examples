package org.example.week2_loops;

import static input.InputUtils.*;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        // This loop keeps continuing until the user does not want to calculate anymore.
        while(moreCalculations) {
            price = doubleInput("Type in price");
            double priceInclTax = price * salesTax;
            System.out.println("The price plus sales tax is " + priceInclTax);

            // input if the user wants to continue or exit the loop.
            moreCalculations = !yesNoInput("Exit?");
        }

        System.out.println("Exiting...");
    }
}
