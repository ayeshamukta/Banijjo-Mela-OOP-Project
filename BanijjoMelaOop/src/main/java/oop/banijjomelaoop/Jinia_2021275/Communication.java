package oop.banijjomelaoop.Jinia_2021275;

import java.util.ArrayList;
import java.util.List;

public class Communication {
    private int id;  // Unique identifier for the communication
    private int senderId;  // ID of the sender of the message
    private int recipientId;  // ID of the recipient of the message
    private String message;  // The content of the message
    private String timestamp;  // Timestamp when the message was sent

    // Constructor to initialize communication details
    public Communication(int id, int senderId, int recipientId, String message, String timestamp) {
        this.id = id;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.message = message;
        this.timestamp = timestamp;
    }

    // Method to send a message (simulating the sending process)
    public void sendMessage() {
        System.out.println("Message sent from Sender ID " + senderId + " to Recipient ID " + recipientId + " at " + timestamp);
    }

    // Method to receive messages for a specific recipient (simulating receiving messages)
    public static List<Communication> receiveMsg(int recipientId) {
        // In a real application, this would likely fetch messages from a database or data source
        // For simplicity, we'll return a sample list of communications
        List<Communication> messages = new ArrayList<>();
        messages.add(new Communication(1, 1001, recipientId, "Hello! How are you?", "2024-12-07T10:30:00"));
        messages.add(new Communication(2, 1002, recipientId, "Reminder: Event tomorrow!", "2024-12-07T11:00:00"));
        return messages;
    }

    // Method to view messages (list of communications)
    public static List<Communication> viewMessages() {
        // In a real application, this would fetch all communications for the current user
        // Returning a sample list here for illustration
        List<Communication> messages = new ArrayList<>();
        messages.add(new Communication(1, 1001, 1003, "Hello! How are you?", "2024-12-07T10:30:00"));
        messages.add(new Communication(2, 1002, 1003, "Reminder: Event tomorrow!", "2024-12-07T11:00:00"));
        return messages;
    }

    // Optional: Override toString() for better display of communication details
    @Override
    public String toString() {
        return "Communication{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", recipientId=" + recipientId +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
