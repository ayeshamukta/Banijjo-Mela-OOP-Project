package oop.banijjomelaoop.ayesha_2022861;

import java.util.ArrayList;

public class Cart
{
    private String name,division,address,paymentOption;
    private int phnNum;

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




}
