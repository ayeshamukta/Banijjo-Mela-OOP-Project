package oop.banijjomelaoop.ayesha_2022861;

import java.io.Serializable;

public class Product implements Serializable
{
    private String productName,productType;
    private int productID,productQuantity;
    private double productPrice;
    private String productStatus;
    private String imgPath;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Product(String productName, String productType, int productID, int productQuantity, double productPrice, String productStatus, String imgPath) {
        this.productName = productName;
        this.productType = productType;
        this.productID = productID;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.imgPath = imgPath;
    }

    public Product(String productName, String productType, int productID, int productQuantity, double productPrice, String productStatus) {
        this.productName = productName;
        this.productType = productType;
        this.productID = productID;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
    }

    public Product() {
    }

    public Product(String imgPath, String productName, double productPrice, int productQuantity) {
        this.imgPath = imgPath;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public Product(String productName, double productPrice, String imgPath) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.imgPath = imgPath;
    }
}
