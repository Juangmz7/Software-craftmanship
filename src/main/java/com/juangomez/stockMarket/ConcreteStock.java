package com.juangomez.stockMarket;

import java.util.HashSet;
import java.util.Set;

public class ConcreteStock implements Stock{

    private String stockSymbol;
    private double stockPrice;
    Set<Investor> investors = new HashSet<>();

    public ConcreteStock(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
    }

    @Override
    public void addInvestor(Investor investor) {
        investors.add(investor);
        System.out.println("Investor subscribed to stock");
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
        System.out.println("Investor " + investor + " removed");
    }

    public void updateStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyInvestors();
    }

    @Override
    public void notifyInvestors() {
        investors.forEach(investor -> investor.update(this.stockSymbol, this.stockPrice));
    }
}
