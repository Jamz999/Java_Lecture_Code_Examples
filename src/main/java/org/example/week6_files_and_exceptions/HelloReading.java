package org.example.week6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        while ( line != null ) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
