package com.project.investment;

public class Crypto extends Investment {
    
    public Crypto(String name, int price, double own, double yield) {
        super(name, price, own, yield);
        this.type = 2;
    }

    @Override
    public String toString() {
        return "Crypto: " + super.getName() + "\nPrice: " + super.getPrice() + "\nOwn: " + super.getOwn() + "\nValue: " + this.value + "\n";
    }
}
