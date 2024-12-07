package oop.banijjomelaoop.Jinia_2021275;

public class Invoice {
    private int id;  // Unique identifier for the invoice
    private int eventId;  // ID of the event associated with the invoice
    private int sponsorId;  // ID of the sponsor associated with the invoice
    private double amount;  // Amount mentioned in the invoice
    private String status;  // Status of the invoice (e.g., "Paid", "Unpaid")

    // Constructor to initialize invoice details
    public Invoice(int id, int eventId, int sponsorId, double amount, String status) {
        this.id = id;
        this.eventId = eventId;
        this.sponsorId = sponsorId;
        this.amount = amount;
        this.status = status;
    }

    // Method to access a specific invoice by ID (simulating fetching the invoice)
    public static Invoice accessInvoice(int invoiceId) {
        // Here, you would typically fetch the invoice from a database or a list
        // For simplicity, returning a sample invoice
        return new Invoice(invoiceId, 101, 1001, 5000.0, "Unpaid");
    }

    // Method to generate a new invoice (simulating invoice generation)
    public void generateInvoice() {
        System.out.println("Invoice generated for Sponsor ID " + sponsorId + " and Event ID " + eventId);
        this.status = "Unpaid";  // Default status when an invoice is generated
    }

    // Method to update the invoice details (e.g., amount or status)
    public void updateInvoice(double newAmount, String newStatus) {
        this.amount = newAmount;
        this.status = newStatus;
        System.out.println("Invoice for Event ID " + eventId + " updated with new amount and status.");
    }

    // Method to view the invoice details by invoice ID
    public String viewInvoice(int invoiceId) {
        return "Invoice Details for ID " + invoiceId + ":\n" +
                "Event ID: " + eventId + "\n" +
                "Sponsor ID: " + sponsorId + "\n" +
                "Amount: $" + amount + "\n" +
                "Status: " + status;
    }

    // Optional: Override toString() for better display of invoice details
    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", eventId=" + eventId +
                ", sponsorId=" + sponsorId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
