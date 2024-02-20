package org.example.week5_hashmaps;

import org.example.week2_loops.January;

import static input.InputUtils.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Snow {
    public static void main(String[] args) {
        HashMap<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);

        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        //System.out.println("The snow in January is " + snowfall.get("January") + " inches");

        //System.out.println("The snow in July is " + snowfall.get("July") + " inches");
        double snowfall_sum = 0.0;
        for (String month : snowfall.keySet()) {
            if (snowfall.containsKey(month)) {
                snowfall_sum += snowfall.get(month);
            }
        }
        System.out.println("The annual snowfall is: " + snowfall_sum);

        while (true) {
            System.out.println("\n" + snowfall);
            String month = stringInput("Type in month: ('q' to quit.)\n"); if (month.equals("q")) { break; }
            double snowInches = doubleInput("Type in snowfall in inches");

            if (snowfall.containsKey(month)) {
                boolean overrideChanges = yesNoInput("Month '" + month + "' already added! Do you want to override?");
                if (!overrideChanges) {
                    System.out.println("Month not Overridden");
                    continue;
                }
            }
            snowfall.put(month, snowInches);
        }

        System.out.println("The new annual snowfall is: " + snowfall_sum);
        /*if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        }
        else {
            System.out.println("There was no snow in July!");
        }*/

    }
}
