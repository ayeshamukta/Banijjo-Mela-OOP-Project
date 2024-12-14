package oop.banijjomelaoop.ayesha_2022861;

import javafx.collections.ObservableList;

import java.io.Serializable;
import java.time.LocalDate;

public class Stall implements Serializable
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

    public Stall(int stallNum, int stallRow, String ownerName,  String slots, String businessCategory) {
        this.stallNum = stallNum;
        this.stallRow = stallRow;
        this.ownerName = ownerName;
        this.slots = slots;
        this.businessCategory = businessCategory;

    }

    @Override
    public String toString() {
        return "Stall Number :"  + stallNum +  ", Stall Row :" + stallRow + ", Owner Name : " + ownerName +  ", Slots :" + slots +  ", Business Category :" + businessCategory +  "\n";
    }
}



