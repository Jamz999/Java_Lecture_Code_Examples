package org.example.week6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        String fileName = "numbers.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        while (line != null) {
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.printf("\"%s\" is not an integer, Ignoring.\n", line);
            }
            line = bufferedReader.readLine();
        }

        System.out.println("---\nNUMBERS:\n" + numbers);
    }
}
