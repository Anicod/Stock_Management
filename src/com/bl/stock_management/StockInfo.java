package com.bl.stock_management;

public class StockInfo {
    private String shareName;
    private int numberOfShare;
    private double sharePrice;

    public StockInfo(String shareName, int numberOfShare, double sharePrice) {
        this.shareName = shareName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
}
