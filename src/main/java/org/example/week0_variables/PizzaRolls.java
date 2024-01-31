package org.example.week0_variables;

public class PizzaRolls {
    public static void main(String[] args) {

        double pizzaRolls = 40;
        int people = 7;

        // Divides per person
        double rollsPerPerson = pizzaRolls / people;

        System.out.println("Each person gets " + rollsPerPerson + " pizza rolls");
        // prints rounded.
        System.out.printf("Each person gets %.1f pizza rolls", rollsPerPerson);

    }
}