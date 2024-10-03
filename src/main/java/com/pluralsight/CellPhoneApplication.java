package com.pluralsight;

public class CellPhoneApplication {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Constructor with default values
    public CellPhoneApplication() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Getters and Setters
    public int getSerialNumber() {
        return serialNumber;  // Fixed return value
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;  // Fixed assignment
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {  // Added void return type
        this.model = model;
    }

    public String getCarrier() {
        return carrier;  // Fixed case of carrier
    }

    public void setCarrier(String carrier) {  // Fixed case of method and assignment
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;  // Fixed assignment
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

