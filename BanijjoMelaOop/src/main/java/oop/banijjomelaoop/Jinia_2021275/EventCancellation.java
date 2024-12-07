package oop.banijjomelaoop.Jinia_2021275;

import java.util.Date;

public class EventCancellation {
    private int id;
    private String name;
    private String desc;
    private String reason;
    private Date date;
    private String loc;
    private String status;

    // Constructor to initialize event cancellation details
    public EventCancellation(int id, String name, String desc, String reason, Date date, String loc, String status) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.reason = reason;
        this.date = date;
        this.loc = loc;
        this.status = status;
    }

    // Method to cancel the event
    public void cancelEvent() {
        this.status = "Cancelled";
        System.out.println("Event '" + name + "' has been cancelled.");
    }

    // Method to notify participants about the cancellation
    public void notifyCancellation() {
        System.out.println("Notification: The event '" + name + "' scheduled for " + date + " at " + loc + " has been cancelled.");
        System.out.println("Reason for cancellation: " + reason);
    }

    // Optional: Override toString() for better display of event cancellation details
    @Override
    public String toString() {
        return "EventCancellation {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                ", loc='" + loc + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
