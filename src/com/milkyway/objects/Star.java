package com.milkyway.objects;

public class Star {
    private String name;
    private double radius;
    private double mass;
    private String spectralClass;
    
    public Star(String name, double radius, double mass, String spectralClass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.spectralClass = spectralClass;
    }
    
    // Getters and setters for the properties
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getMass() {
        return mass;
    }
    
    public void setMass(double mass) {
        this.mass = mass;
    }
    
    public String getSpectralClass() {
        return spectralClass;
    }
    
    public void setSpectralClass(String spectralClass) {
        this.spectralClass = spectralClass;
    }
    
    
    public void displayInfo() {
        System.out.println("Star: " + name);
        System.out.println("\tRadius: " + radius + " km");
        System.out.println("\tMass: " + mass + " kg");
        System.out.println("\tSpectral Class: " + spectralClass);
    }
}
