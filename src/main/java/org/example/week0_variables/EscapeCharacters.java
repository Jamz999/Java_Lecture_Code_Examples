package org.example.week0_variables;

public class EscapeCharacters {
    public static void main(String[] args) {
        // \" adds the " character without causing syntax errors.
        String message = "This class is \"Java Programming\"!";
        System.out.println(message);

        // \n does a new line.
        String anotherMessage = "Welcome, everyone!\nI hope you enjoy the class!";
        System.out.println(anotherMessage);

        // \t adds a tab
        String andAnotherMessage = "Videos\tLabs\tZoom";
        System.out.println(andAnotherMessage);

    }
}
