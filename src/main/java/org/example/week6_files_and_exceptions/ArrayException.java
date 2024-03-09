package org.example.week6_files_and_exceptions;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class ArrayException {
    public static void main(String[] args) {
        String[] classNames = {"Web", "Java", "C#"};

        for (int i = 0; i < 5; i++) {
            System.out.println(classNames[i]);
        }

        List<Integer> classCodes = List.of(2560, 2545, 2505);

        for (int i = 0; i < 5; i++) {
            System.out.println(classCodes.get(i));
        }

        Random rnd = makeRandomNumberGenerator();
        System.out.println(getRandomNumber(rnd));
    }

    public static Random makeRandomNumberGenerator() {
        return new Random();
    }

    public static int getRandomNumber(Random rnd) {
        return rnd.nextInt(10);
    }
}
