package com.milkyway.objects;

public class Planet {
    private String name;
    private double radius;
    private double mass;
    private String composition;
    
    public Planet(String name, double radius, double mass, String composition) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.composition = composition;
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
    
    public String getComposition() {
        return composition;
    }
    
    public void setComposition(String composition) {
        this.composition = composition;
    }
    
    // Other methods related to planets
    
    public void displayInfo() {
        System.out.println("Planet: " + name);
        System.out.println("\tRadius: " + radius + " km");
        System.out.println("\tMass: " + mass + " kg");
        System.out.println("\tComposition: " + composition);
    }
    

}
