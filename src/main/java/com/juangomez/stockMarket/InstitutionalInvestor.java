package com.juangomez.stockMarket;

public class InstitutionalInvestor implements Investor {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Individial investor: " + stockSymbol + " has updated its value to " + price);
    }
}
