package com.tradefair.admin;

import java.util.ArrayList;
import java.util.List;

public class AdminDashboard {
    private List<String> messages = new ArrayList<>();
    private List<String> exhibitors = new ArrayList<>();

    public void sendMessage(String message) {
        messages.add(message);
        System.out.println("Message sent: " + message);
    }

    public void addExhibitor(String exhibitor) {
        exhibitors.add(exhibitor);
        System.out.println("Exhibitor added: " + exhibitor);
    }

    public void viewExhibitors() {
        System.out.println("Exhibitors: " + exhibitors);
    }
}
