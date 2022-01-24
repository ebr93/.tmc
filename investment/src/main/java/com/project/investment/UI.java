package com.project.investment;

import java.util.Scanner;

public class UI {
    private Scanner scan;

    public UI(Scanner scan) {
        this.scan = scan;
    }

    public void start() {
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Years to Invest: ");
        int years = Integer.valueOf(scan.nextLine());

        Portfolio portfolio = new Portfolio(name, years);

        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();

            if (command.equals("")) {
                break;
            }

            if (command.equals("add")) {
                add(portfolio);
            }

            if (command.equals("analyze")) {
                analyze(portfolio);
            }

            if (command.equals("schedule")) {
                schedule(portfolio);
            }
        }
    }

    // adds an investment to the portfolio
    public void add(Portfolio portfolio) {
        System.out.println("Investment: ");
        String investment = scan.nextLine();
        System.out.println("Price: ");
        int price = Integer.valueOf(scan.nextLine());
        System.out.println("Own: ");
        double own = Double.valueOf(scan.nextLine());
        System.out.println("Yield (1.XX): ");
        double yield = Double.valueOf(scan.nextLine());
        System.out.println("Crypto or Stock?");
        String answer = scan.nextLine();

        if (answer.equals("crypto")) {
            Crypto newCrypto = new Crypto(investment, price, own, yield);
            portfolio.addInvestments(newCrypto);
        } else {
            Stock newStock = new Stock(investment, price, own, yield);
            portfolio.addInvestments(newStock);
        }
    }

    // generates/updates/prints portfolio information
    public void analyze(Portfolio portfolio) {
        if (portfolio.getInvestments().isEmpty()) {
            System.out.println("There are no investments");
            return;
        }
        portfolio.generatePortfolio();
        portfolio.printPortfolio();
    }

    // generates ROI schedule and prints it
    public void schedule(Portfolio portfolio) {
        if (portfolio.getInvestments().isEmpty()) {
            System.out.println("There are no investments");
            return;
        }
        ROI returnSchedule = new ROI();

        returnSchedule.generateSchedule(portfolio);
        System.out.println(returnSchedule.toString());
    }
}
