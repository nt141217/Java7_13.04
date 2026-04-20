package com.example;

public class FinancialReport {

    public static void printReport(Company company) {
        System.out.println("=== FINANCIAL REPORT ===");
        System.out.println("Company: " + company.getName());
        System.out.println("Revenue: " + company.getRevenue());
        System.out.println("Total cost: " + company.calculateTotalCost());
        System.out.println("Profit: " + company.calculateProfit());
        System.out.println("Profitable: " + company.isProfitable());
        System.out.println("Making loss: " + company.isMakingLoss());
        System.out.println("Can operate: " + company.canOperate());
    }
}