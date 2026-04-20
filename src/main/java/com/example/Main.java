package com.example;

public class Main {

    public static void main(String[] args) {

        String companyName = "BlueSoft";
        double revenue = 40000;
        double salaries = 22000;
        double rent = 5000;
        double tools = 3000;
        double marketing = 2000;

        double totalCost = salaries + rent + tools + marketing;
        double profit = revenue - totalCost;

        boolean profitable = profit > 0;
        boolean makingLoss = profit < 0;
        boolean canOperate = revenue >= totalCost;

        System.out.println("Company: " + companyName);
        System.out.println("Revenue: " + revenue);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Profit: " + profit);
        System.out.println("Profitable: " + profitable);
        System.out.println("Making loss: " + makingLoss);
        System.out.println("Can operate: " + canOperate);

        System.out.println();

        Company company1 = new Company("BlueSoft", 40000, 22000, 5000, 3000, 2000);
        Company company2 = new Company("GreenCode", 36000, 18000, 4000, 2500, 1500);

        company1.printSummary();

        company2.printSummary();

        System.out.println();

        if (company1.calculateProfit() > company2.calculateProfit()) {
            System.out.println(company1.getName() + " has higher profit.");
        } else if (company2.calculateProfit() > company1.calculateProfit()) {
            System.out.println(company2.getName() + " has higher profit.");
        } else {
            System.out.println("Both companies have the same profit.");
        }

        System.out.println();

        FinancialReport.printReport(company1);
    }
}