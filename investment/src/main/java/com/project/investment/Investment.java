package com.project.investment;

public abstract class Investment {
    private String name;
    private int price;
    private double yield;
    private double own;
    protected int type; // helps to separate type of investments in Portfolio class
    protected double value;
    
    public Investment(String name, int price, double own, double yield) {
        this.name = name;
        this.price = price;
        this.own = own;
        this.yield = yield;
        this.type = 0;
        this.value = this.price * this.own;
    }

    public int getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public double getOwn() {
        return this.own;
    }

    public void setOwn(double own) {
        this.own = own;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        long temp;
        temp = Double.doubleToLongBits(yield);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Investment other = (Investment) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (Double.doubleToLongBits(yield) != Double.doubleToLongBits(other.yield))
            return false;
        return true;
    }
    
}
