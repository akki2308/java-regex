package com.bridgelabs.regex.advance;

import java.util.regex.*;
import java.util.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Define regex for currency values
        String regex = "\\$?\\d+\\.\\d{2}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store matched currency values
        List<String> currencyValues = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print extracted values
        System.out.println(currencyValues);
    }
}

