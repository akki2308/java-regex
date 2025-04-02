package com.bridgelabs.regex.replaceandmodify;

import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of bad words to censor
        String[] badWords = {"Bastard", "stupid", "Dumb"};

        // Prompt user for input text
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Replace bad words with "****"
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        // Print the censored sentence
        System.out.println("Censored Text: " + text);

        sc.close();
    }
}

