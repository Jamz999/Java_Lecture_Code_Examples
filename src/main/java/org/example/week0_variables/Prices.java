package org.example.week0_variables;

public class Prices {
    public static void main(String[] args) {
        String productName = "Packet of spaghetti";
        double price = 1.60;
        int quantity = 4;

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName
                + " at $" + price + " each costs a total of $" + totalPrice);


    }
}