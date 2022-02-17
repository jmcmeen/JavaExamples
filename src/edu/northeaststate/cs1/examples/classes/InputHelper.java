package edu.northeaststate.cs1.examples.classes;

import java.util.Scanner;

public class InputHelper {
    public static int promptForInteger(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        return scanner.nextInt();
    }

    public static short promptForShort(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        return scanner.nextShort();
    }

    public static long promptForLong(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        return scanner.nextLong();
    }

    public static float promptForFloat(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        return scanner.nextFloat();
    }

    public static double promptForDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        return scanner.nextDouble();
    }

    public static String promptForString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        return scanner.nextLine();
    }

    public static char promptForChar(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        String s = scanner.nextLine();
        char c = s.charAt(0);

        return c;
    }
}
