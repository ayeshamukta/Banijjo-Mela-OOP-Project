package oop.banijjomelaoop.Jinia_2021275;

import java.util.Date;

public class Event {
    private int id;
    private String name;
    private String desc;
    private Date date;
    private String loc;
    private String status;

    // Constructor to initialize an event
    public Event(int id, String name, String desc, Date date, String loc, String status) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.date = date;
        this.loc = loc;
        this.status = status;
    }

    // Method to create a new event
    public void createEvent() {
        // Implementation for creating an event
        System.out.println("Event created: " + name);
    }

    // Method to update existing event information
    public void updateEventInfo(String newName, String newDesc, Date newDate, String newLoc, String newStatus) {
        this.name = newName;
        this.desc = newDesc;
        this.date = newDate;
        this.loc = newLoc;
        this.status = newStatus;
        System.out.println("Event updated: " + name);
    }

    // Method to delete the event
    public void deleteEvent() {
        System.out.println("Event deleted: " + name);
        // Clear all properties
        this.id = 0;
        this.name = null;
        this.desc = null;
        this.date = null;
        this.loc = null;
        this.status = null;
    }

    // Optional: Override toString() for better object display
    @Override
    public String toString() {
        return "Event {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", date=" + date +
                ", loc='" + loc + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
