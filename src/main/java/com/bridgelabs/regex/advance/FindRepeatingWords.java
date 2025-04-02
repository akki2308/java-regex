package com.bridgelabs.regex.advance;

import java.util.regex.*;
import java.util.Scanner;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        sc.close();

        // Regex to find consecutive repeating words
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";

        // Compile regex pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Find and print repeated words
        while (matcher.find()) {
            System.out.println(matcher.group(1)); // Print the repeated word
        }
    }
}


// \b - Word boundary to ensure full words are matched
// (\w+) - Capturing group that matches a word (letters, digits, underscores)
// \b - Ensures the captured word is a complete word
// \s+ - Matches one or more spaces between words
// \1 - Backreference to the captured word, meaning it must appear again after the space
// \b - Ensures the repeated word is also a complete word

