package oop.banijjomelaoop.ayesha_2022861;

public class CartItem {
//    cartItem.add(new Product(proName,proId,proQuan,proPrice));
   private String proName;
    private  int proID,proQuan;
    private double proPrice;

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public int getProQuan() {
        return proQuan;
    }

    public void setProQuan(int proQuan) {
        this.proQuan = proQuan;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public CartItem(String proName, int proID, int proQuan, double proPrice) {
        this.proName = proName;
        this.proID = proID;
        this.proQuan = proQuan;
        this.proPrice = proPrice;
    }

    public CartItem() {
    }
}
