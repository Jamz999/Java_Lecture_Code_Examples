package org.example.week2_loops;

public class OilChange {
    public static void main(String[] args) {
        int miles = 150000;
        int oilChange_Interval = 3000;

        for (int i = 0; i < 8; i++) {
            miles += oilChange_Interval;
            System.out.println("Change oil next: " + miles + " miles");
        }
    }
}
