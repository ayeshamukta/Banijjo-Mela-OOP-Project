package oop.banijjomelaoop.Jinia_2021275;

public class TrackPerformance {
    private int evtId;
    private int attendCo; // Attendance Count
    private double feedback; // Average Feedback Score
    private double revGen; // Revenue Generated

    // Constructor to initialize performance tracking details
    public TrackPerformance(int evtId, int attendCo, double feedback, double revGen) {
        this.evtId = evtId;
        this.attendCo = attendCo;
        this.feedback = feedback;
        this.revGen = revGen;
    }

    // Method to track event performance (attendance, feedback, revenue)
    public void trackPerformance(int attendCo, double feedback, double revGen) {
        this.attendCo = attendCo;
        this.feedback = feedback;
        this.revGen = revGen;
        System.out.println("Tracking performance for Event ID: " + evtId);
        System.out.println("Attendance: " + attendCo + " attendees");
        System.out.println("Feedback: " + feedback + " / 5.0");
        System.out.println("Revenue Generated: $" + revGen);
    }

    // Method to generate a performance report as a string
    public String generatePerfReport() {
        return "Performance Report for Event ID: " + evtId + "\n" +
                "Attendance: " + attendCo + " attendees\n" +
                "Feedback: " + feedback + " / 5.0\n" +
                "Revenue Generated: $" + revGen;
    }

    // Optional: Override toString() to display the current performance data
    @Override
    public String toString() {
        return "TrackPerformance {" +
                "evtId=" + evtId +
                ", attendCo=" + attendCo +
                ", feedback=" + feedback +
                ", revGen=" + revGen +
                '}';
    }
}
