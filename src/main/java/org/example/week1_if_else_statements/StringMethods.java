package org.example.week1_if_else_statements;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        // length
        String secretPassword = "fjtyh5ir7rt,k45";
        int numCharactersInPassword = secretPassword.length();
        System.out.println(numCharactersInPassword);

        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure, good choice");
        }
        else {
            System.out.println("Consider using a longer password");
        }

        // lowercase
        // emails are usually lowercase
        String email = "Clara.James@MINNEAPOLIS.edu";
        email = email.toLowerCase();
        System.out.println(email);

        // uppercase
        // The department code is uppercase
        String classIdentifier = "itec 2545";
        classIdentifier = classIdentifier.toUpperCase();
        System.out.println(classIdentifier);

        //ends with
        // Is this email a .edu email?
        System.out.println(email.endsWith(".edu"));
        System.out.println(email.endsWith(".com"));

        String exampleEmail = "test@gmail.com";
        if (exampleEmail.endsWith(".edu")) {
            System.out.println("This is an education email address");
        }
        else {
            System.out.println("This is not an education email address");
        }

        // starts with
        // Is a class an ITEC class?
        System.out.println(classIdentifier.startsWith("ITEC"));
        if (classIdentifier.startsWith("ITEC")) {
            System.out.println("This is an ITEC class");
        }
        else {
            System.out.println("This is NOT an ITEC class");
        }

        // contains
        // Look for support ticket requests that contain the text "server"
        String supportTicketDescription1 = "The Server is down!";
        String supportTicketDescription2 = "My mouse mat is missing";
        String supportTicketDescription3 = "All the servers need to be rebooted.";
        String supportTicketDescription4 = "server problem - All the servers need to be rebooted.";
        String supportTicketDescription5 = "I dropped my drink into the server";
        String supportTicketDescription6 = "SERVER DOWN!!!";

        System.out.println(supportTicketDescription1.contains("server"));
        System.out.println(supportTicketDescription2.contains("server"));
        System.out.println(supportTicketDescription3.contains("server"));
        System.out.println(supportTicketDescription4.contains("server"));
        System.out.println(supportTicketDescription5.contains("server"));
        System.out.println(supportTicketDescription6.contains("server")); // false because .contains() is case-sensitive.

        String serverProblem = "The SERVER US DOWN!!!";
        String searchTerm = "server";
        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())) {
            System.out.println("Found a server problem");
        }
        else {
            System.out.println("This is not a server problem");
        }

        // assigns uppercase version of variables "serverProblem" and "serverProblem"
        String uppercaseServerProblem = serverProblem.toUpperCase();
        String uppercaseSearchTerm = searchTerm.toUpperCase();
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            System.out.println("Server problem");
        }
        else {
            System.out.println("Not a server problem");
        }

        //split sentence into words
        String sentence = "IntelliJ is a Java intergrated development environment ";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String firstWord = words[0];
        System.out.println(firstWord);

        String javaIDEs = "IntelliJ,Eclipse,NetBeans,Notepad++,VSCode";

        String[] ides = javaIDEs.split(",");
        System.out.println(Arrays.toString(ides));
        for (int i = 0; i < ides.length; i++) {
            System.out.println(ides[i]);
        }

        // Split class identifier into department and code
        String javaClass = "ITEC 2545";
        String[] javaClassIdentifierParts = javaClass.split(" ");
        String department = javaClassIdentifierParts[0];
        String code = javaClassIdentifierParts[1];
        System.out.println(department);
        System.out.println(code);

        // Trim. Removes white space like spaces, tabs, and newlines at the start and end of string
        String userAddressInput = "     1503 Hennepin Avenue   ";
        userAddressInput = userAddressInput.trim();
        System.out.println(userAddressInput);

        // Format strings
        // printf. No newline and \n needs to be added if newline needed.
        String className = "Java Programming";
        double credits = 6.0;
        int studentsEnrolled = 24;
        String format = "Online";

        System.out.printf("The %s is %.3f credits, delivered %s, there are %d students enrolled\n",
                className, credits, format, studentsEnrolled);
    }
}
