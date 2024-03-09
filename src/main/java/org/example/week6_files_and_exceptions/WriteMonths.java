package org.example.week6_files_and_exceptions;

import java.io.*;

public class WriteMonths {
    public static void main(String[] args) throws IOException {
        String fileName = "month.txt";
        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < months.length; i++) {
            bufferedWriter.write(months[i] + "\n");
        }

        bufferedWriter.close();
    }
}
