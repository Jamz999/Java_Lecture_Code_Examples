package org.example.week2_loops;

public class January {
    public static void main(String[] args) {
        String suffix = "";
        for (int day = 1; day <= 31; day++) {
            /*
            *  % in Java is the remainder calculation. If we for example do 20 % 2, then we get 0,
            *  or if we do 63 % 4, then we get 3. If we do any integer % 10, then we can get the
            *  first digit from the integer.
            */
            if (day%10 == 1) {
                suffix = "st";
            }
            else if (day%10 == 2) {
                suffix = "nd";
            }
            else if (day%10 == 3) {
                suffix = "rd";
            }
            else {
                suffix = "th";
            }

            System.out.println("January " + day + suffix);
        }
    }
}
