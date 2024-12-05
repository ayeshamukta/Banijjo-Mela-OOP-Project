package oop.banijjomelaoop.ayesha_2022861;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class Product
{
    private String productName,productType;
    private int productID,productQuantity;
    private double productPrice;
    private String productStatus;
    private Image productImg;

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

    public Image getProductImg() {
        return productImg;
    }

    public void setProductImg(Image productImg) {
        this.productImg = productImg;
    }

    public Product() {
    }

    public Product(String productName, String productType, int productID, int productQuantity, double productPrice, String productStatus, Image productImg) {
        this.productName = productName;
        this.productType = productType;
        this.productID = productID;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.productImg = productImg;
    }

    public Product(String productName, String productType, int productID, int productQuantity, double productPrice, String productStatus) {
        this.productName = productName;
        this.productType = productType;
        this.productID = productID;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
    }
}
