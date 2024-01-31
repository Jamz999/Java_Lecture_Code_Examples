package org.example.week0_variables;

public class Temp {
    public static void main(String[] args) {
        // date vars
        String currentMonth = "January";
        int dayOfMonth = 11;

        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        double tempDifference = forecastHigh - forecastLow;

        System.out.println("On " + currentMonth + " " + dayOfMonth + "the diffrence between the high and low temperatures is " + tempDifference + "F");

        System.out.printf("On %s %d the difference between the high and low temperatures is %.2fF", currentMonth, dayOfMonth, tempDifference);
    }
}
