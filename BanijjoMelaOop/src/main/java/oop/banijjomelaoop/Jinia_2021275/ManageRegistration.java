package oop.banijjomelaoop.Jinia_2021275;

public class ManageRegistration {
    private int id;
    private int evtId;
    private String attName;
    private String attEmail;
    private String status;

    // Constructor to initialize registration details
    public ManageRegistration(int id, int evtId, String attName, String attEmail, String status) {
        this.id = id;
        this.evtId = evtId;
        this.attName = attName;
        this.attEmail = attEmail;
        this.status = status;
    }

    // Method to add a new registration
    public void addRegistration() {
        // Implementation for adding a new registration
        System.out.println("Registration added for attendee: " + attName + " (Email: " + attEmail + ")");
        this.status = "Registered";
    }

    // Method to update an existing registration
    public void updateRegistration(String newAttName, String newAttEmail, String newStatus) {
        this.attName = newAttName;
        this.attEmail = newAttEmail;
        this.status = newStatus;
        System.out.println("Registration updated for attendee: " + attName + " (Email: " + attEmail + ")");
    }

    // Method to cancel a registration
    public void cancelRegistration() {
        this.status = "Cancelled";
        System.out.println("Registration cancelled for attendee: " + attName + " (Email: " + attEmail + ")");
    }

    // Method to manage the registration (e.g., perform additional actions or checks)
    public void manage() {
        System.out.println("Managing registration for attendee: " + attName + " (Status: " + status + ")");
    }

    // Optional: Override toString() for better display of object details
    @Override
    public String toString() {
        return "ManageRegistration {" +
                "id=" + id +
                ", evtId=" + evtId +
                ", attName='" + attName + '\'' +
                ", attEmail='" + attEmail + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
