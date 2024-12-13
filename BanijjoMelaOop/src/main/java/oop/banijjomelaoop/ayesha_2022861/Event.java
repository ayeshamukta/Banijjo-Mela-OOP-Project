package oop.banijjomelaoop.ayesha_2022861;

import java.io.Serializable;

public class Event implements Serializable {
    private String event;
    private int orderId;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Event(String event, int orderId) {
        this.event = event;
        this.orderId = orderId;
    }
}
