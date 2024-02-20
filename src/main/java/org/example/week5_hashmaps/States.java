package org.example.week5_hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class States {
    public static void main(String[] args) {
        // From what I see Map is a generic keyword for a map type like Hashmap or Treemap.
        // What a treemap does is it organizes the maps in order, in this instance, alphabetical order.
        Map<String, String> stateAbbreviations = new TreeMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        // if key is not in hashmap, then key is returned null.
        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        // Key is case-sensitive, wisconsinAbbreviation equates to null if Wisconsin is lowercase.
        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

        System.out.println();
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        System.out.println();
        for (String abbreviation : stateAbbreviations.values()) {
            System.out.println(abbreviation);
            System.out.println(stateAbbreviations.get(abbreviation));
        }


        // Searching for Initials.
        String searchAbbreviation = "MI";

        System.out.println();
        for (String stateName : stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        // Reverses String Orientation.
        HashMap<String, String> abbreviaitonsStateNames = new HashMap<>();

        for (HashMap.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviaitonsStateNames.put(abbreviation, state);
        }

        System.out.println(stateAbbreviations);
        System.out.println(abbreviaitonsStateNames);
    }
}
