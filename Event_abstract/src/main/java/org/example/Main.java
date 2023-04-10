package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1.Exhibition");
        System.out.println("2.StageEvent");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter the details in CSV format");
            String input = scanner.nextLine();
            String[] values = input.split(",");

            if (values.length != 6) {
                System.out.println("Invalid input format");
                return;
            }

            String name = values[0];
            String detail = values[1];
            String type = values[2];
            String organiser = values[3];
            int noOfStalls = Integer.parseInt(values[4]);
            double rentPerStall = Double.parseDouble(values[5]);

            Exhibition exhibition = new Exhibition(name, detail, type, organiser, noOfStalls, rentPerStall);
            System.out.println("Exhibition Details");
            System.out.println("Event Name:" + exhibition.getName());
            System.out.println("Detail:" + exhibition.getDetail());
            System.out.println("Type:" + exhibition.getType());
            System.out.println("Organiser Name:" + exhibition.getOrganiser());
            System.out.println("Total Cost:" + exhibition.calculateAmount());
        } else if (choice == 2) {
            System.out.println("Enter the details in CSV format");
            String input = scanner.nextLine();
            String[] values = input.split(",");

            if (values.length != 6) {
                System.out.println("Invalid input format");
                return;
            }

            String name = values[0];
            String detail = values[1];
            String type = values[2];
            String organiser = values[3];
            int noOfShows = Integer.parseInt(values[4]);
            double costPerShow = Double.parseDouble(values[5]);

            StageEvent stageEvent = new StageEvent(name, detail, type, organiser, noOfShows, costPerShow);
            System.out.println("Stage Event Details");
            System.out.println("Event Name:" + stageEvent.getName());
            System.out.println("Detail:" + stageEvent.getDetail());
            System.out.println("Type:" + stageEvent.getType());
            System.out.println("Organiser Name:" + stageEvent.getOrganiser());
            System.out.println("Total Cost:" + stageEvent.calculateAmount());
        } else {
            System.out.println("Invalid choice");
        }
    }
}