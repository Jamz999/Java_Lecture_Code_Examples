package org.example.week0_variables;

public class Address {
    public static void main(String[] args) {
        String city = "Minneapolis";
        String state = "mn";

        // toUpperCase() makes the whole string upper case
        String cityState = city + ", " + state.toUpperCase();

        System.out.println(cityState);
    }
}
