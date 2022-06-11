package com.bl.stock_management;

import java.util.Scanner;

public class StockMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the stock management");
        StockPortfolio stockPortfolio = new StockPortfolio();
        System.out.println("enter the stock number");
        int stockNumber = scanner.nextInt();
        for(int index = 1; index<=stockNumber; index++ ){
            stockPortfolio.readTheStock(index);
        }

        stockPortfolio.calculateStock();
        while(true){
            System.out.println("enter a positive number");
            int var = (scanner.nextInt()>0) ? stockPortfolio.debit() : 0;
            if(var == 0)
                System.out.println("Process terminated");
        }


    }

}
