package org.example.week6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Writes the Unicode Index of the int
        bufferedWriter.write(data1);
        bufferedWriter.write(data2);
        bufferedWriter.write(data3);

        //!!!bufferedWriter.write(number); // Doubles can never be indexes, which is why it causes an error.
        bufferedWriter.write(" test\n\n");

        // Putting a string var or literal at the end will actually write the integer.
        bufferedWriter.write(data1 + " ");
        bufferedWriter.write(Integer.toString(data2));
        bufferedWriter.write(data3 + " ");

        bufferedWriter.write(number + " "); // Same for double values
        bufferedWriter.write(" test");

        bufferedWriter.close();
    }
}
