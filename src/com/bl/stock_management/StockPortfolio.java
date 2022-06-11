package com.bl.stock_management;

import com.bl.stock_management.StockInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<StockInfo> stockList = new ArrayList<StockInfo>();
    StockInfo stockInfo;
    Scanner scanner = new Scanner(System.in);

    void readTheStock(int stockNumber) {
        System.out.println("stock details for the stock " + stockNumber);
        System.out.println("enter the name of the Share");
        String nameOfShare = scanner.next();
        System.out.println("enter number of the share");
        int numberOfShare = scanner.nextInt();
        System.out.println("enter the share price");
        int sharePrice = scanner.nextInt();
        stockInfo = new StockInfo(nameOfShare, numberOfShare, sharePrice);
        stockList.add(stockInfo);
        System.out.println("details added successfully for " + stockNumber);
    }

    void calculateStock() {
        double totalValueOfStock = 0;
        for (StockInfo index : stockList) {
            double valueOfeachStock = index.getNumberOfShare() * index.getSharePrice();
            totalValueOfStock += valueOfeachStock;
            System.out.println("value of the " + index.getShareName() + "is " + valueOfeachStock);
        }
        System.out.println("The total value of the stock is " + totalValueOfStock);


    }
}





