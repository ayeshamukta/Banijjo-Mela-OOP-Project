package oop.banijjomelaoop.Jinia_2021275;

import java.util.List;
import java.util.ArrayList;

public class SponsorshipPackage {
    private int id;
    private String packageName;
    private double cost;
    private String details;
    private boolean availability;

    // Constructor to initialize sponsorship package details
    public SponsorshipPackage(int id, String packageName, double cost, String details, boolean availability) {
        this.id = id;
        this.packageName = packageName;
        this.cost = cost;
        this.details = details;
        this.availability = availability;
    }

    // Method to explore available sponsorship packages
    public static List<SponsorshipPackage> exploreSponsorship() {
        List<SponsorshipPackage> packages = new ArrayList<>();
        // Example packages (normally fetched from a database or another source)
        packages.add(new SponsorshipPackage(1, "Gold", 5000, "Top-tier sponsorship package with prime placement", true));
        packages.add(new SponsorshipPackage(2, "Silver", 3000, "Mid-level sponsorship package with decent exposure", true));
        packages.add(new SponsorshipPackage(3, "Bronze", 1500, "Basic sponsorship package with minimal placement", false));

        return packages;
    }

    // Method to view details of a specific package based on packageId
    public static SponsorshipPackage viewPackageDetails(int packageId) {
        List<SponsorshipPackage> packages = exploreSponsorship();
        for (SponsorshipPackage pkg : packages) {
            if (pkg.id == packageId) {
                return pkg;
            }
        }
        return null; // Return null if no package is found with the given id
    }

    // Method to update a package details
    public void updatePackage(int packageId) {
        if (this.id == packageId) {
            // Simulating package update
            this.details = "Updated sponsorship package details";
            this.cost = 6000; // Example update
            this.availability = true; // Marking the package as available
            System.out.println("Package updated successfully!");
        }
    }

    // Method to delete a package based on packageId
    public void deletePackage(int packageId) {
        if (this.id == packageId) {
            System.out.println("Package " + packageId + " deleted successfully.");
            // Normally, you would remove the package from a database or list here
        }
    }

    // Optional: Override toString() to display package details
    @Override
    public String toString() {
        return "SponsorshipPackage{" +
                "id=" + id +
                ", packageName='" + packageName + '\'' +
                ", cost=" + cost +
                ", details='" + details + '\'' +
                ", availability=" + availability +
                '}';
    }
}
