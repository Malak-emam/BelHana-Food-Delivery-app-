package org.example.ObserverPattern;

public class ObserverAdmin implements Observer {
    private String adminName;

    public ObserverAdmin(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public void update(String status) {
        System.out.println("Admin " + adminName + " received status update: " + status);
    }
}