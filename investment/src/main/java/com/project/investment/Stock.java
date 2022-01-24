package com.project.investment;

public class Stock extends Investment {
    
    public Stock(String name, int price, double own, double yield) {
        super(name, price, own, yield);
        this.type = 1;
    }

    @Override
    public String toString() {
        return "Stock: " + super.getName() + "\nPrice: " + super.getPrice() + "\nOwn: " + super.getOwn() + "\nValue: " + this.value + "\n";
    }
}
