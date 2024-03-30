package org.example.week7_object_oriented_programming;

public class Tire implements Comparable<Tire> {

    private String name;
    private double price;
    private int warrantyMiles;

    public Tire(String name, double price, int warrantyMiles) {

        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePer1000Miles() {

        return (price / warrantyMiles) * 1000;
    }

    public double getSetPrice() {
        return price * 4;
    }

    @Override
    public String toString() {

        double pricePer1000 = pricePer1000Miles();
        double priceForSet = getSetPrice();

        return String.format("The %s tire costs $%.2f per tire.\n" +
                        "Cost per 1000 miles is $%.2f\n" +
                        "A set of four tires would cost $%.2f",
                name, price, pricePer1000, priceForSet);
    }


    @Override
    public int compareTo(Tire otherTire) {
        return Double.compare(pricePer1000Miles(), otherTire.pricePer1000Miles());
    }
}
