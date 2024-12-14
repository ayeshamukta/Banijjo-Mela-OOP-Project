package oop.banijjomelaoop.ayesha_2022861;

public class login {
    private String name, group;
    private int pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public login(String name, int pass, String group) {
        this.name = name;
        this.pass = pass;
        this.group = group;
    }

    public login() {
    }
}
