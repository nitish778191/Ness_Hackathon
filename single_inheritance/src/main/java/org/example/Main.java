package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = scanner.nextLine();
        System.out.println("Enter Date of Birth :");
        String dateOfBirthString = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter Gender :");
        String gender = scanner.nextLine();
        System.out.println("Enter Mobile Number :");
        String mobileNumber = scanner.nextLine();
        System.out.println("Enter Blood Group :");
        String bloodGroup = scanner.nextLine();

        // Read donor details
        System.out.println("Enter Blood Bank Name :");
        String bloodBankName = scanner.nextLine();
        System.out.println("Enter Donor Type :");
        String donorType = scanner.nextLine();
        System.out.println("Enter Donation Date :");
        String donationDateString = scanner.nextLine();
        LocalDate donationDate = LocalDate.parse(donationDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        // Create donor object
        Donor donor = new Donor(name,dateOfBirthString,gender,mobileNumber,bloodGroup,bloodBankName,donorType,donationDateString);
        donor.displayDonationDetails();




    }
}