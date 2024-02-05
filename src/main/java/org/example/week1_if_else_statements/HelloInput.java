package org.example.week1_if_else_statements;

// '*' in an import statement is a shortcut for importing every method in the package "input.InputUtils."
import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

        // input string of your name=.
        String name = stringInput("Please enter your name:");
        System.out.println("Hello, " + name + "!");

        // input number of classes taking.
        int numberOfClasses = intInput("How many classes are you taking?");

        // pluralizes the word "classes" if there is >1 classes.
        String classes = "classes";
        if (numberOfClasses == 1) {
            classes = "class";
        }

        System.out.println("You are taking " + numberOfClasses + " " + classes + " this semester.");
    }
}
