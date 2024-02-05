package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class Welding {
    public static void main(String[] args) {
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?");

        // Checks and prints if you have clothes that will properly protect you from welding.
        if (closedToeShoes && cottonClothes || woolClothes) {
            System.out.println("You are dressed safely.");
        }
        else {
            System.out.println("You must wear cotton or wool clothes and closed toe shoes.");
        }
    }
}
