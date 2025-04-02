package com.bridgelabs.regex.extraction;

import java.util.regex.*;
import java.util.Scanner;

public class CapitalizedWordExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input text
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Extract and print capitalized words
        extractCapitalizedWords(text);

        sc.close();
    }

    public static void extractCapitalizedWords(String text) {
        // Regular expression to match words that start with a capital letter
        String regex = "\\b[A-Z][a-z]*\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all capitalized words
        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        if (!found) {
            System.out.println("No capitalized words found.");
        }
    }
}

