package com.bridgelabs.regex.advance;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for card number
        System.out.print("Enter a credit card number: ");
        String cardNumber = sc.nextLine();

        // Validate and print result
        if (isValidCreditCard(cardNumber)) {
            System.out.println("Valid Credit Card Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }

        sc.close();
    }

    public static boolean isValidCreditCard(String card) {
        // Regular expression for Visa and MasterCard
        String regex = "^(4\\d{15}|5[1-5]\\d{14})$";

        // Match the card number with the pattern
        return Pattern.matches(regex, card);
    }
}

