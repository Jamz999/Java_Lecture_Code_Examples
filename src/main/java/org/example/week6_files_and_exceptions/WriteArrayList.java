package org.example.week6_files_and_exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        String filename = "ITEC_Classes.txt";
        List<String>  classNames = List.of("Java", "Web", "C#");
        List<Integer>  classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));

        for (int i = 0; i < classCodes.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);

            String outputLine = String.format("ITEC %d %s \n", code, name);
            bufferedWriter.write(outputLine);
        }

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();
        while (line != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }

        System.out.println("End of file reached.");
        System.out.println(classDescriptions);
    }
}
