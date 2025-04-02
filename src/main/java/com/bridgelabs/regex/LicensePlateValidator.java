package com.bridgelabs.regex;

import java.util.Scanner;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for a license plate number
        System.out.print("Enter a license plate number: ");
        String plateNumber = sc.nextLine();

        // Validate the license plate
        if (isValidLicensePlate(plateNumber)) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }

        sc.close();
    }

    public static boolean isValidLicensePlate(String plate) {
        // Regular expression to match the format: Two uppercase letters + four digits
        String regex = "^[A-Z]{2}\\d{4}$";

        // Check if plate matches the pattern
        return plate.matches(regex);
    }
}

