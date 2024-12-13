package oop.banijjomelaoop.ayesha_2022861;

import java.io.Serializable;

public class WishList implements Serializable {
    private String productName;
    private Double productPrice;
    private int proID;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public WishList(String productName, Double productPrice, int proID) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.proID = proID;
    }
}
