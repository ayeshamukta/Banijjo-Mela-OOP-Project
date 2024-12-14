package oop.banijjomelaoop.ayesha_2022861;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class Promotion implements Serializable {
    private int id, disscount;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDisscount() {
        return disscount;
    }

    public void setDisscount(int disscount) {
        this.disscount = disscount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Promotion(int id, int disscount, String code) {
        this.id = id;
        this.disscount = disscount;
        this.code = code;
    }


    @Override
    public String toString() {
        return "Product Id : "+ id+ "  "+ "Disscounted Amount : " + disscount+"%"+ "  " + "Promo Code : "+ code+"\n";
    }
}
