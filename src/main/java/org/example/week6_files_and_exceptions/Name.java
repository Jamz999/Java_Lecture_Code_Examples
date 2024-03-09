package org.example.week6_files_and_exceptions;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {
        String fileName = "data.txt";
        String name = "James";
        String favoriteColor = "blue";
        int classCode = 2454;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor);
        bufferedWriter.newLine();
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
