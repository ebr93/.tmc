package com.project.investment;

import java.util.ArrayList;
import java.util.HashMap;

public class Portfolio {
    private String client;
    private HashMap<String, Investment> investments;
    private double portfolioValue;
    private int stocks;
    private int cryptos;
    private double stockTotal;
    private double cryptoTotal;
    private int years;


    public Portfolio(String client, int years) {
        this.client = client;
        this.investments = new HashMap<>();
        this.portfolioValue = 0;
        this.stocks = 0;
        this.cryptos = 0;
        this.stockTotal = 0;
        this.cryptoTotal = 0;
        this.years = years;
    }

    public HashMap<String, Investment> getInvestments() {
        return this.investments;
    }

    public double getPortfolioValue() {
        return this.portfolioValue;
    }

    public int getYears() {
        return this.years;
    }

    // adds investment to portfolio
    public void addInvestments(Investment investment) {
        if (investment.equals(null)) {
            return;
        }

        if (this.investments.containsValue(investment)) {   // if Map contains the investment already then it won't be added
            return;
        }

        this.investments.put(investment.getName(), investment);
    }

    // generates and updates portfolio information
    public void generatePortfolio() {
        for (String key : this.investments.keySet()) {
            if (this.investments.get(key).getType() == 1) {
                this.stocks ++;
                this.stockTotal += this.investments.get(key).getValue();
            } else {
                this.cryptos++;
                this.cryptoTotal += this.investments.get(key).getValue();
            }
        }
        this.portfolioValue = cryptoTotal + stockTotal;
    }

    // prints portfolio
    public void printPortfolio() {
        for (String key : this.investments.keySet()) {
            System.out.println(this.investments.get(key));
        } 

        System.out.println(client + "'s Portfolio");
        System.out.println("Stocks Owned: " + stocks);
        System.out.println("Stocks Value: " + stockTotal);
        System.out.println("Cryptos Owned: " + cryptos);
        System.out.println("Cryptos Value: " + cryptoTotal);
        System.out.println("Portfolio Value: " + portfolioValue);
    }
}
