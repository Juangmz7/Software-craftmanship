package com.juangomez.stockMarket;


public class StockMarketTest {
    public static void main(String[] args) {

        // Exercise 1
        var concreteStock = new ConcreteStock("AAPL", 200);
        var individualInvestor = new IndividualInvestor();
        var institutionalInvestor = new InstitutionalInvestor();

        // Subscribe to the stock
        concreteStock.addInvestor(individualInvestor);
        concreteStock.addInvestor(institutionalInvestor);
        concreteStock.updateStockPrice(300);

    }
}