package org.example.week2_loops;

import static input.InputUtils.*;

public class SquareScreen {
    public static void main(String[] args) {
        int sqScreen_x = positiveIntInput("How wide do you want the square screen?");
        int sqScreen_y = positiveIntInput("How long do you want the square screen?");

        for (int y = 0; y < sqScreen_y; y++) {
            for (int x = 0; x < sqScreen_x; x++) {
                // println means "print line" meaning to print and then create a new line.
                // print just prints the command letting us stack multiple prints on the same line.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
