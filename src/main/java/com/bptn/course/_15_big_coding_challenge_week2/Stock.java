package com.bptn.course._15_big_coding_challenge_week2;

public class Stock {

    // Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
      this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.percentChange = 0;
        this.totalShares = totalShares;
        this.marketCap = totalShares * price;
    }

    // Create the methods 

    public void adjustPrice(int change){
      this.price += change;
      this.percentChange = ((double)change / this.price) * 100;// data types have to be the same with where its being stored.
      this.marketCap = ((long)totalShares * price);
    }

    public String toString(){
      return ("Ticker Symbol: "+ tickerSymbol + "\n"+
      "Company: " + companyName+"\n"+
      "Current Price: $" + price + "(" + percentChange +  "%)\n"+
      "Market Cap: $" + marketCap);
    }
    
    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}