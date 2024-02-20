package org.example.week5_hashmaps;

import input.InputUtils.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.doubleInput;


public class RoadTripPlanner {
    public static void main(String[] args) {
        //HashMap<String, Integer> cityDistances = new HashMap<>();
        Map<String, Integer> cityDistances = Map.of(
                "Duluth", 154,
                "Brainerd" , 127,
                "Stillwater", 26,
                "Ely", 245,
                "Red Wing", 54);
/*
        cityDistances.put("Duluth", 154);
        cityDistances.put("Brainerd", 127);
        cityDistances.put("Stillwater", 26);
        cityDistances.put("Ely", 245);
        cityDistances.put("Red Wing", 54);
*/
        // Since I could not find a intInput I'll have to cast the doubleInput to an int.
        int maxDistance = (int)(doubleInput("Enter the maximum distance you want to drive on your road trip") + 0.5);

        ArrayList<String> citiesInRange = new ArrayList<>();
        for (String city: cityDistances.keySet()) {
            int distance = cityDistances.get(city);
            if (distance <= maxDistance) {
                citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, no Minnesota cities are within your driving maximum distance");
        } else {
            System.out.println("Here are " + citiesInRange.size() + " cities you can drive to");
            for (String city : citiesInRange) {
                System.out.println(city);
            }
        }
    }
}
