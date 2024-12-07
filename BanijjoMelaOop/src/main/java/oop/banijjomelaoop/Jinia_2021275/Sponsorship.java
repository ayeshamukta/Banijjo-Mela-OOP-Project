package oop.banijjomelaoop.Jinia_2021275;

import java.util.List;
import java.util.ArrayList;

public class Sponsorship {
    private int id;  // Unique identifier for the sponsorship
    private int sponsorId;  // ID of the sponsor
    private int eventId;  // ID of the event being sponsored
    private String packageDetails;  // Details about the sponsorship package
    private String status;  // Status of the sponsorship (e.g., active, completed, cancelled)

    // Constructor to initialize sponsorship details
    public Sponsorship(int id, int sponsorId, int eventId, String packageDetails, String status) {
        this.id = id;
        this.sponsorId = sponsorId;
        this.eventId = eventId;
        this.packageDetails = packageDetails;
        this.status = status;
    }

    // Method to view all events sponsored by the sponsor
    public static List<Sponsorship> viewSponsoredEvents(int sponsorId) {
        List<Sponsorship> sponsoredEvents = new ArrayList<>();
        // Example sponsored events (normally fetched from a database)
        sponsoredEvents.add(new Sponsorship(1, sponsorId, 101, "Gold Sponsorship Package", "Active"));
        sponsoredEvents.add(new Sponsorship(2, sponsorId, 102, "Silver Sponsorship Package", "Completed"));
        sponsoredEvents.add(new Sponsorship(3, sponsorId, 103, "Bronze Sponsorship Package", "Active"));

        return sponsoredEvents;
    }

    // Method to monitor a specific event's sponsorship by eventId
    public static Sponsorship monitorEvent(int eventId) {
        List<Sponsorship> allSponsorships = viewSponsoredEvents(1001);  // Assuming sponsorId = 1001 for demo
        for (Sponsorship sponsorship : allSponsorships) {
            if (sponsorship.eventId == eventId) {
                return sponsorship;  // Return the sponsorship for the given event
            }
        }
        return null;  // Return null if no sponsorship found for the given event
    }

    // Method to update sponsorship details
    public void updateSponsorshipDetails(int sponsorshipId) {
        if (this.id == sponsorshipId) {
            // Example update (typically would fetch and update from a database)
            this.packageDetails = "Updated Sponsorship Package Details";
            this.status = "Active";  // Marking as active
            System.out.println("Sponsorship details updated successfully!");
        }
    }

    // Optional: Override toString() to display sponsorship details
    @Override
    public String toString() {
        return "Sponsorship{" +
                "id=" + id +
                ", sponsorId=" + sponsorId +
                ", eventId=" + eventId +
                ", packageDetails='" + packageDetails + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
