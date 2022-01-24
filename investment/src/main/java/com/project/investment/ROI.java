package com.project.investment;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class ROI {
    private ArrayList<String> schedule;

    public ROI() {
        this.schedule =  new ArrayList<>();
    }

    public void generateSchedule(Portfolio portfolio) {
        DecimalFormat df = new DecimalFormat("###.##");
        double yieldAverage = 0;
        double tracker = 0;
        double moneyInvested = portfolio.getPortfolioValue();

        for (String key : portfolio.getInvestments().keySet()) {
            yieldAverage += portfolio.getInvestments().get(key).getYield();
            tracker++;
        }
        yieldAverage = yieldAverage / tracker;
        this.schedule.add("Year 1: " + df.format(moneyInvested));

        int iteration = 1;
        while (iteration < portfolio.getYears()) {
            iteration++;
            moneyInvested = moneyInvested * yieldAverage;
            this.schedule.add("Year " + iteration + ": " + df.format(moneyInvested));
        }
    }

    @Override
    public String toString() {
        String string = "\n";
        for (String schedules : this.schedule) {
            string += schedules + "\n";
        }
        return string;
    }

}
