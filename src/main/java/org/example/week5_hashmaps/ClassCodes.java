package org.example.week5_hashmaps;

import java.util.HashMap;

public class ClassCodes {
    public static void main(String[] args) {
        HashMap<Integer, String> classCodes = new HashMap<>();

        classCodes.put(2545, "Java");
        classCodes.put(1425, "Datacom");
        classCodes.put(2560, "Web");

        for (HashMap.Entry<Integer, String> entry: classCodes.entrySet()) {
            int numCode = entry.getKey();
            String className = entry.getValue();
            printClassCode(numCode, className); // I created a method for practice and convenience.
        }

        System.out.println("You are taking " + classCodes.size() + "class(es)");

        int searchCode = 2417; // Android programming

        printKeyFound(searchCode, classCodes);


        int searchCode2 = 2545; // That's Intro to Java!

        printKeyFound(searchCode2, classCodes);
    }

    public static void printClassCode(int numberCode, String classname) {
        System.out.println("ITEC " + numberCode + " " + classname);
    }

    public static void printKeyFound (int searchCode, HashMap<Integer, String> codeClass) {
            String className = codeClass.get(searchCode);
        if (className != null) {
            System.out.println("This class is found in the Hashmap. The class name is " + className);
            return;
        }

        System.out.println("Search code " + searchCode + " not Found!");
    }
}
