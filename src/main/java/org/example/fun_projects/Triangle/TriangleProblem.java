package org.example.fun_projects.Triangle;

import java.util.ArrayList;
import java.util.Random;

public class TriangleProblem {

    private static final String COLORS [] = {
            "red",
            "green",
            "blue"
    };

    private static Triangle[] triangles = new Triangle[10];
    private static Random rand = new Random();

    public static void main(String[] args) {

        int numMatchedTris = 0;
        ArrayList<String> matchedTriangles = new ArrayList<>();

        for (int i = 0; i < triangles.length; i++) {

            String randColor1 = COLORS[rand.nextInt(COLORS.length)];
            String randColor2 = COLORS[rand.nextInt(COLORS.length)];
            String randColor3 = COLORS[rand.nextInt(COLORS.length)];

            triangles[i] = new Triangle(randColor1, randColor2, randColor3);
            System.out.println(triangles[i].toString(i + 1));
        }

        for (int i = 0; i < triangles.length; i++) {
            for (int j = i + 1; j < triangles.length; j++) {

                if (triangles[i].matchesWithTriangle(triangles[j])) {
                    numMatchedTris++;
                    matchedTriangles.add(
                            String.format("Triangle %d matches with Triangle %d", i+1, j+1)
                    );
                }

            }
        }

        System.out.println(numMatchedTris + " matches found!\n---");
        for (String tri : matchedTriangles) {
            System.out.println(tri);
        }

    }

}
