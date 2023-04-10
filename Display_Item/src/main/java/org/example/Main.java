package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item type name");
        String itemName=sc.nextLine();
        System.out.println("Enter the cost per day");
        double cpd=sc.nextDouble();
        System.out.println("Enter the deposit");
        double deposit=sc.nextDouble();
        Display dispItem=new Display();
        dispItem.setName(itemName);
        dispItem.setCostPerDay(cpd);
        dispItem.setDeposit(deposit);
        dispItem.display();
        sc.close();
    }
}