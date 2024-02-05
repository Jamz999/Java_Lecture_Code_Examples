package org.example.week1_if_else_statements;

import static input.InputUtils.*;

public class CanYouBePresident {
    public static void main(String[] args) {
        System.out.println("Are you eligible to become President of the United States?");
        System.out.println("Please answer these three questions.");

        boolean isNaturalBornCitizen = yesNoInput("Were you born in the United States?");
        int age = positiveIntInput("What is your age, in years?");
        int yearsLivedInUSA = positiveIntInput("How many years have you lived in the United States?");

        if (isNaturalBornCitizen && age >= 35 && yearsLivedInUSA >= 14) {
            System.out.println("You meet the eligibility requirements to become presidient. Good luck!");
        }
    }
}
