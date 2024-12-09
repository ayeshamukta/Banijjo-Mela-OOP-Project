package com.tradefair.security;

public class SecurityDashboard {

    public void monitorSurveillance() {
        System.out.println("Monitoring live surveillance feeds...");
    }

    public void logIncident(String incident) {
        System.out.println("Incident logged: " + incident);
    }

    public void performBagCheck(String visitorName) {
        System.out.println("Performed bag check for visitor: " + visitorName);
    }
}
