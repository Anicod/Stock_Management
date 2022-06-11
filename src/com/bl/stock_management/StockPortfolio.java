package com.bl.stock_management;

import com.bl.stock_management.StockInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<StockInfo> stockList = new ArrayList<StockInfo>();
    StockInfo stockInfo;
    double totalValueOfStock = 0;
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

        for (StockInfo index : stockList) {
            double valueOfeachStock = index.getNumberOfShare() * index.getSharePrice();
            totalValueOfStock += valueOfeachStock;
            System.out.println("value of the " + index.getShareName() + "is " + valueOfeachStock);
        }
        System.out.println("The total value of the stock is " + totalValueOfStock);


    }

    int debit() {
        double withdrawlAmount;
        System.out.println("enter amount to withdraw");
        withdrawlAmount = scanner.nextDouble();
        if (totalValueOfStock - withdrawlAmount <= 0)
            System.out.println("you have an insufficient balance");
        else if (withdrawlAmount == 0)
            System.out.println("enter the valid withdrawl amount");
        else {
            System.out.println("amount " + withdrawlAmount + " from the account");
            if (withdrawlAmount > 0) {
                totalValueOfStock = totalValueOfStock - withdrawlAmount;
                System.out.println("The amount " + withdrawlAmount + " withdraw successfully");
                System.out.println("The total amount after withdrawl " + totalValueOfStock);
            } else {
                System.out.println("process is terminated back to the main menue");
                return 1;
            }
        }
        return 1;
    }
}






