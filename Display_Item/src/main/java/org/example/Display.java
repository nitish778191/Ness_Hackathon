package org.example;

public class Display {

    private String name;
    private double costPerDay;

    private double deposit;

    public void setName(String name) {
        this.name = name;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void display(){
        System.out.println("Item type details");
        System.out.println("Name: "+getName());
        System.out.println("CostPerDay : "+getCostPerDay());
        System.out.println("Deposit : "+getDeposit());
    }
}
