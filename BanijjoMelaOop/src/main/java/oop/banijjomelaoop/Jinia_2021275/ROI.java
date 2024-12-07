package oop.banijjomelaoop.Jinia_2021275;

public class ROI {
    private int id;  // Unique identifier for the ROI record
    private int eventId;  // ID of the event associated with the ROI
    private int sponsorId;  // ID of the sponsor associated with the ROI
    private double investment;  // Investment made by the sponsor
    private double returns;  // Returns generated from the investment

    // Constructor to initialize ROI details
    public ROI(int id, int eventId, int sponsorId, double investment, double returns) {
        this.id = id;
        this.eventId = eventId;
        this.sponsorId = sponsorId;
        this.investment = investment;
        this.returns = returns;
    }

    // Method to track the ROI (simulating the tracking process)
    public void trackROI() {
        System.out.println("Tracking ROI for Sponsor ID " + sponsorId + " on Event ID " + eventId);
    }

    // Method to calculate the ROI
    public double calculateROI() {
        if (investment == 0) {
            return 0;  // To avoid division by zero
        }
        return (returns - investment) / investment * 100;  // ROI as a percentage
    }

    // Method to generate an ROI report
    public String generateROIReport() {
        double roi = calculateROI();
        return "ROI Report for Event ID " + eventId + " and Sponsor ID " + sponsorId + ":\n" +
                "Investment: $" + investment + "\n" +
                "Returns: $" + returns + "\n" +
                "Calculated ROI: " + roi + "%";
    }

    // Optional: Override toString() for better display of ROI details
    @Override
    public String toString() {
        return "ROI{" +
                "id=" + id +
                ", eventId=" + eventId +
                ", sponsorId=" + sponsorId +
                ", investment=" + investment +
                ", returns=" + returns +
                '}';
    }
}
