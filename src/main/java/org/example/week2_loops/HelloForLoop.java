package org.example.week2_loops;

public class HelloForLoop {
    public static void main(String[] args) {
        /*
        * A for-loop is a loop that iterates until a specified condition is reached.
        * The first parameter for the for-loop is the starting point for the loop and where we can declare our scoped variable,
        * The second parameter is the condition of the loop where it stops looping if the condition is false.
        * The third parameter is the increment for the value, most commonly ++ which means to increment the variable by one.
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello #" + i + "!");
        }
    }
}
