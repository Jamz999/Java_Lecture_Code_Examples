package org.example.week7_object_oriented_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class TireComparison {

    public static void main(String[] args) {
        List<Tire> tireList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireList.add(tire);
        } while (yesNoInput("Compare more tires?"));

        Collections.sort(tireList);
        printReportTable(tireList);
    }

    private static Tire getTireInfo() {
        String name = stringInput("Enter name of tire:");
        double price = positiveDoubleInput("Enter price of " + name + ":");
        int mileWarranty = positiveIntInput("Enter number of miles warranty");

        Tire tire = new Tire(name, price, mileWarranty);
        return tire;
    }

    private static void printReportTable(List<Tire> tireReports) {
        for (Tire tire : tireReports) {
            System.out.println(tire + "\n-----");
        }
    }
}
