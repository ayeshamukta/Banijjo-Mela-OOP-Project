package oop.banijjomelaoop;

public class Register
{
    protected String slots,ownerName;
    protected int stallNumber,stallRow;

    public String getSlots() {
        return slots;
    }

    public void setSlots(String slots) {
        this.slots = slots;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getStallNumber() {
        return stallNumber;
    }

    public void setStallNumber(int stallNumber) {
        this.stallNumber = stallNumber;
    }

    public int getStallRow() {
        return stallRow;
    }

    public void setStallRow(int stallRow) {
        this.stallRow = stallRow;
    }

    public Register(String slots, String ownerName, int stallNumber, int stallRow) {
        this.slots = slots;
        this.ownerName = ownerName;
        this.stallNumber = stallNumber;
        this.stallRow = stallRow;
    }

    public Register()
    {
    }
}
