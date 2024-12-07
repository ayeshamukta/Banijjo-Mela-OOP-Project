package oop.banijjomelaoop.Jinia_2021275;

public class Proposal {
    private int id;
    private int sponsorId;  // ID of the sponsor making the proposal
    private int evtId;  // ID of the event the proposal is related to
    private String details;  // Details of the proposal
    private String status;  // Status of the proposal (e.g., submitted, withdrawn, updated)

    // Constructor to initialize the proposal details
    public Proposal(int id, int sponsorId, int evtId, String details, String status) {
        this.id = id;
        this.sponsorId = sponsorId;
        this.evtId = evtId;
        this.details = details;
        this.status = status;
    }

    // Method to submit the proposal
    public void submitProposal() {
        this.status = "Submitted";
        System.out.println("Proposal ID " + id + " has been submitted for Event ID " + evtId + " by Sponsor ID " + sponsorId);
    }

    // Method to withdraw the proposal
    public void withdrawProposal() {
        this.status = "Withdrawn";
        System.out.println("Proposal ID " + id + " has been withdrawn for Event ID " + evtId);
    }

    // Method to update the proposal details
    public void updateProposal(String newDetails) {
        this.details = newDetails;
        this.status = "Updated";
        System.out.println("Proposal ID " + id + " has been updated for Event ID " + evtId);
    }

    // Optional: Override toString() for better display of proposal details
    @Override
    public String toString() {
        return "Proposal{" +
                "id=" + id +
                ", sponsorId=" + sponsorId +
                ", evtId=" + evtId +
                ", details='" + details + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
