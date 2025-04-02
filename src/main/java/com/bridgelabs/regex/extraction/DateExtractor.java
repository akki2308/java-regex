package com.bridgelabs.regex.extraction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence :");
        String sentence = sc.nextLine();

        // Extract and print dates
        extractDates(sentence);

        sc.close();
    }

    //Method to extract dates
    public static void extractDates(String sentence) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

        // Compile pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        //  Print found dates
        System.out.println("Extracted dates: ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
