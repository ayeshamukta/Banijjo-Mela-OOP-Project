package oop.banijjomelaoop.Jinia_2021275;

import java.util.Date;

public class Termination {
    private int id;  // Unique identifier for the termination record
    private int agreementId;  // ID of the agreement being terminated
    private String reason;  // Reason for the termination
    private Date terminationDate;  // Date when the agreement is terminated

    // Constructor to initialize termination details
    public Termination(int id, int agreementId, String reason, Date terminationDate) {
        this.id = id;
        this.agreementId = agreementId;
        this.reason = reason;
        this.terminationDate = terminationDate;
    }

    // Method to terminate the agreement (simulating termination process)
    public void terminateAgreement() {
        System.out.println("Agreement ID " + agreementId + " has been terminated due to: " + reason + " on " + terminationDate);
    }

    // Method to notify the event organizer about the termination
    public void notifyOrganizer() {
        System.out.println("Event Organizer has been notified about the termination of Agreement ID " + agreementId);
    }

    // Method to generate a termination report for the given agreement ID
    public String generateTerminationReport(int agreementId) {
        return "Termination Report for Agreement ID " + agreementId + ":\n" +
                "Termination Reason: " + reason + "\n" +
                "Termination Date: " + terminationDate.toString();
    }

    // Optional: Override toString() for better display of termination details
    @Override
    public String toString() {
        return "Termination{" +
                "id=" + id +
                ", agreementId=" + agreementId +
                ", reason='" + reason + '\'' +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
