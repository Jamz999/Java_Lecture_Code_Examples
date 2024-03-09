package org.example.week6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {
        int classCode = 2454;
        double averageEnrollment = 22.16;
        String className = "Java";

        FileWriter writer = new FileWriter("Java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Works like how you would think how a print function works.
        // However, using numbers by themselves and not with strings will result in unexpected results (Unicode indexes, Errors, etc.)
        bufferedWriter.write(classCode + "\n");
        bufferedWriter.write(averageEnrollment + "\n");
        bufferedWriter.write(className + "\n");

        //writer.close();
        bufferedWriter.close(); // you can close either one, doing this will reduce confusion with variable names though.
    }
}
