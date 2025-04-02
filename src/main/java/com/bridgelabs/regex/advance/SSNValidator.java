package com.bridgelabs.regex.advance;

import java.util.regex.*;
import java.util.Scanner;

public class SSNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        String ssn = sc.nextLine();
        sc.close();

        // Regex for SSN validation
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        // Validate SSN
        if (ssn.matches(regex)) {
            System.out.println("\"" + ssn + "\" is valid");
        } else {
            System.out.println("\"" + ssn + "\" is invalid");
        }
    }
}

