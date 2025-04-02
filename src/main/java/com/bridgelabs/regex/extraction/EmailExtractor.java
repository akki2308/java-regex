package com.bridgelabs.regex.extraction;

import java.util.regex.*;
import java.util.Scanner;

public class EmailExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        extractEmails(text);

        sc.close();
    }

    public static void extractEmails(String text) {
        // Regular expression for email addresses
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find and print all email addresses
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No email addresses found.");
        }
    }
}

