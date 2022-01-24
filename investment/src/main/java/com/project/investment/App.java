package com.project.investment;

import java.util.Scanner;

import javax.sound.sampled.Port;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Example without UI
        Investment tesla = new Stock("Tesla", 1100, 5, 1.2);
        Investment nike = new Stock("Nike", 1100, 4, 1.2);
        Investment rivian = new Stock("Rivian", 200, 10, 1.1);
        Investment amazon = new Stock("Amazon", 3300, 4, 1.07);
        Investment bitcoin = new Crypto("Bitcoin", 67000, 1.34, 1.3);
        Investment ethereum = new Crypto("Ethereum", 3800, 17.5, 1.3);

        Portfolio pt = new Portfolio("Steve");
        pt.addInvestments(tesla);
        pt.addInvestments(nike);
        pt.addInvestments(rivian);
        pt.addInvestments(amazon);
        pt.addInvestments(bitcoin);
        pt.addInvestments(ethereum);

        pt.generatePortfolio();
        pt.printPortfolio();

        ROI returnSchedule = new ROI();
        returnSchedule.generateSchedule(pt);
        System.out.println(returnSchedule);
        */

        UI userInterface = new UI(scan);
        userInterface.start();
    }
}
