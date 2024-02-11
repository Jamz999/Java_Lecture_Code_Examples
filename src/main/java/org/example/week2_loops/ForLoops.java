package org.example.week2_loops;

public class ForLoops {
    public static void main(String[] args) {
        // final means that the variable cannot be changed after it's been assigned in the line it was created.
        // Also known as a constant.
        final int MAX = 5;
        for (int i = 1; i <= MAX; i++) {
            if (i != MAX) {
                System.out.print(i + ", ");
            }
            else {
                System.out.println(i);
            }
        }

        System.out.println("\nRocket taking off to space in:");
        for (int i = 10; i >= 0; i--) {
            if (i != 0) {
                System.out.print(i + "...");
            }
            else {
                System.out.println(i + "!!!");
            }
        }
    }
}
