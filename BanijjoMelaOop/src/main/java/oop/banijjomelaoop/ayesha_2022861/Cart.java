package oop.banijjomelaoop.ayesha_2022861;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable
{

    private String name,division,address,paymentOption, pName;
    private int phnNum,quantity;
    private Double price;

    private ArrayList<Product>products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public int getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(int phnNum) {
        this.phnNum = phnNum;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cart(String pName, int quantity, Double price) {
        this.pName = pName;
        this.quantity = quantity;
        this.price = price;
    }
}
