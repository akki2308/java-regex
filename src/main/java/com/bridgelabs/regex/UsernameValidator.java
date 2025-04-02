package com.bridgelabs.regex;


import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for a username
        System.out.print("Enter a username: ");
        String username = sc.nextLine();

        // Validate the username
        if (isValidUsername(username)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }

        // Close the scanner
        sc.close();
    }

    public static boolean isValidUsername(String username) {
        // Regular expression for validation
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // Check if username matches the regex pattern
        return username.matches(regex);
    }
}
