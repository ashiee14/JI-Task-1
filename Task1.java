package com.example.app;

/**
 * Task1
 * Demonstrates command-line arguments and basic Java output
 */
public class Task1 {

    public static void main(String[] args) {

        System.out.println("Java Program Started");

        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments received:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
