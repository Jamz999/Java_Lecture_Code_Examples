package org.example.week6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {
        // Overwrites File if it exists.
        FileWriter writer = new FileWriter("Hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello!\n");
        bufferedWriter.newLine(); // provides a new line, same as "\n"
        bufferedWriter.write("More data here\n");
        bufferedWriter.newLine();
        bufferedWriter.write("Goodbye!\n");
        bufferedWriter.newLine();

        bufferedWriter.close(); // stops any more prompts for writing. otherwise, it won't write to the txt file.

        // having true on the second argument does not overwrite the file but instead adds more to the end of the file.
        FileWriter writer2 = new FileWriter("Hello.txt",true);
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Goodbye!\n");
        bufferedWriter2.newLine(); // provides a new line, same as "\n"
        bufferedWriter2.write("Less data here\n");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello!\n");

        bufferedWriter2.close();
    }
}
