package org.example.fun_projects.Triangle;

import java.util.Arrays;

public class Triangle {

    private String[] coloredSidesNames = new String[3];

    public Triangle (String colorName1, String colorName2, String colorName3) {
        coloredSidesNames[0] = colorName1.toLowerCase();
        coloredSidesNames[1] = colorName2.toLowerCase();
        coloredSidesNames[2] = colorName3.toLowerCase();
    }

    public Triangle (Triangle triangle) {
        for (int i = 0; i < coloredSidesNames.length; i++) {
            coloredSidesNames[i] = triangle.coloredSidesNames[i];
        }
    }

    public boolean matchesWithTriangle(Triangle tri) {

        Triangle otherTri = new Triangle(tri);

        for (int i = 0; i < 3; i++) {
            if (Arrays.equals(coloredSidesNames, otherTri.coloredSidesNames)) {
                return true;
            }
            swivelTriangleSides(otherTri);
        }

        return false;
    }

    private void swivelTriangleSides(Triangle tri) {

        String[] rotatedColoredSidesNames = new String[3];

        rotatedColoredSidesNames[0] = tri.coloredSidesNames[2];
        rotatedColoredSidesNames[1] = tri.coloredSidesNames[0];
        rotatedColoredSidesNames[2] = tri.coloredSidesNames[1];

        tri.coloredSidesNames = rotatedColoredSidesNames;

    }

    @Override
    public String toString() {
        return "Triangle\n" +
                "Side 1 color: " + coloredSidesNames[0] + "\n" +
                "Side 2 color: " + coloredSidesNames[1] + "\n" +
                "Side 3 color: " + coloredSidesNames[2] + "\n---\n";
    }

    public String toString(int ID) {
        return "Triangle " + ID + " \n" +
                "Side 1 color: " + coloredSidesNames[0] + "\n" +
                "Side 2 color: " + coloredSidesNames[1] + "\n" +
                "Side 3 color: " + coloredSidesNames[2] + "\n---";
    }
}
