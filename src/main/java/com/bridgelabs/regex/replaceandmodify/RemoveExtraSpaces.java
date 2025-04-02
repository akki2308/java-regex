package com.bridgelabs.regex.replaceandmodify;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input text
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Replace multiple spaces with a single space
        String result = text.replaceAll("\\s+", " ");

        // Print the cleaned-up text
        System.out.println("Processed Text: " + result);

        sc.close();
    }
}

