package oop.banijjomelaoop.Jinia_2021275;

public class Agreement {
    private int id;  // Unique identifier for the agreement
    private int sponsorId;  // ID of the sponsor involved in the agreement
    private int eventId;  // ID of the event the agreement is related to
    private String terms;  // Terms of the sponsorship agreement
    private String status;  // Status of the agreement (e.g., "Active", "Terminated")

    // Constructor to initialize agreement details
    public Agreement(int id, int sponsorId, int eventId, String terms, String status) {
        this.id = id;
        this.sponsorId = sponsorId;
        this.eventId = eventId;
        this.terms = terms;
        this.status = status;
    }

    // Method to create the agreement
    public void createAgreement() {
        this.status = "Active";
        System.out.println("Agreement created for Event ID " + eventId + " with Sponsor ID " + sponsorId);
    }

    // Method to update the agreement terms
    public void updateAgreement(String newTerms) {
        this.terms = newTerms;
        this.status = "Updated";
        System.out.println("Agreement updated for Event ID " + eventId);
    }

    // Method to terminate the agreement
    public void terminateAgreement() {
        this.status = "Terminated";
        System.out.println("Agreement for Event ID " + eventId + " has been terminated.");
    }

    // Method to view the agreement details
    public String viewDetails() {
        return "Agreement{" +
                "id=" + id +
                ", sponsorId=" + sponsorId +
                ", eventId=" + eventId +
                ", terms='" + terms + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // Optional: Override toString() for better display of agreement details
    @Override
    public String toString() {
        return "Agreement{" +
                "id=" + id +
                ", sponsorId=" + sponsorId +
                ", eventId=" + eventId +
                ", terms='" + terms + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
