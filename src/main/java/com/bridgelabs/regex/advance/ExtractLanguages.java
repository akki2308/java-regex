package com.bridgelabs.regex.advance;

import java.util.regex.*;
import java.util.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Define regex for programming languages
        String regex = "\\b(JavaScript|Java|Python|Go)\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store matched languages
        List<String> languages = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        // Print extracted languages
        System.out.println(languages);
    }
}

