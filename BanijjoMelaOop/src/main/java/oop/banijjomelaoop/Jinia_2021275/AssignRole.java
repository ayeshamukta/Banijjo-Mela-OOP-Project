package oop.banijjomelaoop.Jinia_2021275;

public class AssignRole {
    private int id;
    private int evtId;
    private String memName;
    private String role;

    // Constructor to initialize team member details
    public AssignRole(int id, int evtId, String memName, String role) {
        this.id = id;
        this.evtId = evtId;
        this.memName = memName;
        this.role = role;
    }

    // Method to assign a role to a team member
    public void assignRole(String role) {
        this.role = role;
        System.out.println("Role '" + role + "' assigned to team member: " + memName);
    }

    // Method to update the role of a team member
    public void updateRole(String newRole) {
        this.role = newRole;
        System.out.println("Role updated to '" + newRole + "' for team member: " + memName);
    }

    // Method to remove a team member from the event
    public void removeTeamMember() {
        System.out.println("Team member '" + memName + "' with role '" + role + "' has been removed.");
        // Clear the team member's details
        this.memName = null;
        this.role = null;
    }

    // Optional: Override toString() for better object display
    @Override
    public String toString() {
        return "AssignRole {" +
                "id=" + id +
                ", evtId=" + evtId +
                ", memName='" + memName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
