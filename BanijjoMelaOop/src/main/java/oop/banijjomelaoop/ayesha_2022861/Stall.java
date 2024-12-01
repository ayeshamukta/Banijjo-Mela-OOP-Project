package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Stall
{
    private int stallNum,stallRow;
    private String ownerName, businessCategory, slots;


    public int getStallNum() {
        return stallNum;
    }

    public void setStallNum(int stallNum) {
        this.stallNum = stallNum;
    }

    public int getStallRow() {
        return stallRow;
    }

    public void setStallRow(int stallRow) {
        this.stallRow = stallRow;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getSlots() {
        return slots;
    }

    public void setSlots(String slots) {
        this.slots = slots;
    }

    public Stall() {
    }

    public Stall(int stallNum, int stallRow, String ownerName, String businessCategory, String slots) {
        this.stallNum = stallNum;
        this.stallRow = stallRow;
        this.ownerName = ownerName;
        this.businessCategory = businessCategory;
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Stall{" +
                "stallNum=" + stallNum +
                ", stallRow=" + stallRow +
                ", ownerName='" + ownerName + '\'' +
                ", businessCategory='" + businessCategory + '\'' +
                ", slots='" + slots + '\'' +
                '}';
    }
}
