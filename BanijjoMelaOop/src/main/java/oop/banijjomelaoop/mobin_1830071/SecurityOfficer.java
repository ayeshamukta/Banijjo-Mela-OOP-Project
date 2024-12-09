package com.tradefair.security;

public class SecurityOfficer {
    private String username;
    private String password;

    public SecurityOfficer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    public void logout() {
        System.out.println("Security Officer logged out.");
    }
}
