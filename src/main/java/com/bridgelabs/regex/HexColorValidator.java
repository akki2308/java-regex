package com.bridgelabs.regex;

import java.util.Scanner;

public class HexColorValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for a hex color code
        System.out.print("Enter a hex color code: ");
        String colorCode = sc.nextLine();

        // Validate the hex color code
        if (isValidHexColor(colorCode)) {
            System.out.println("Valid Hex Color Code");
        } else {
            System.out.println("Invalid Hex Color Code");
        }

        sc.close();
    }

    public static boolean isValidHexColor(String color) {
        // Regular expression to match the format: # followed by exactly six hexadecimal characters
        String regex = "^#[0-9A-Fa-f]{6}$";

        // Check if the color code matches the pattern
        return color.matches(regex);
    }
}
