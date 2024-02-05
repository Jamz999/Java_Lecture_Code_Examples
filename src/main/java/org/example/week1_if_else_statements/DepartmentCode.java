package org.example.week1_if_else_statements;

import java.util.Locale;

import static input.InputUtils.*;

public class DepartmentCode {
    public static void main(String[] args) {

        String departmentCode = stringInput("Enter department code");

        // Checks for valid codes and prints the code name in uppercase.
        if (departmentCode.length() == 4) {
            System.out.println("The code is valid.");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("The code is " + departmentCode);
        }
        else {
            System.out.println("The code is not valid.");
        }

    }
}
