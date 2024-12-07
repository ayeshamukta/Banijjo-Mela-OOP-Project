package oop.banijjomelaoop.Jinia_2021275;

import java.time.LocalDateTime;

public class PublishSchedule {
    private int id;
    private int evtId;
    private LocalDateTime startTim;
    private LocalDateTime endTim;
    private String details;

    // Constructor to initialize schedule details
    public PublishSchedule(int id, int evtId, LocalDateTime startTim, LocalDateTime endTim, String details) {
        this.id = id;
        this.evtId = evtId;
        this.startTim = startTim;
        this.endTim = endTim;
        this.details = details;
    }

    // Method to publish a schedule
    public void publishSchedule() {
        System.out.println("Schedule published for Event ID: " + evtId);
        System.out.println("Details: " + details);
        System.out.println("Start Time: " + startTim + ", End Time: " + endTim);
    }

    // Method to update an existing schedule
    public void updateSchedule(LocalDateTime newStartTim, LocalDateTime newEndTim, String newDetails) {
        this.startTim = newStartTim;
        this.endTim = newEndTim;
        this.details = newDetails;
        System.out.println("Schedule updated for Event ID: " + evtId);
        System.out.println("New Details: " + details);
        System.out.println("Start Time: " + startTim + ", End Time: " + endTim);
    }

    // Method to delete a schedule
    public void deleteSchedule() {
        System.out.println("Schedule deleted for Event ID: " + evtId);
        this.startTim = null;
        this.endTim = null;
        this.details = null;
    }

    // Optional: Override toString() for better display of schedule details
    @Override
    public String toString() {
        return "PublishSchedule {" +
                "id=" + id +
                ", evtId=" + evtId +
                ", startTim=" + startTim +
                ", endTim=" + endTim +
                ", details='" + details + '\'' +
                '}';
    }
}
