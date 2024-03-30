package org.example.week7_object_oriented_programming;

public class SwimmingPoolProgram {
    public static void main(String[] args) {

        // We assign variable 'swimmingPool' (which has a 'Pool' type) to a constructed Pool object.
        Pool swimmingPool = new Pool("Pea", 12.1);

        int numOfLaps = 6;
        double totalSwam = swimmingPool.distanceForLaps(numOfLaps);
        System.out.println("The total distance for " + numOfLaps + " laps is " + totalSwam + "m");

        System.out.println(swimmingPool);
    }
}
