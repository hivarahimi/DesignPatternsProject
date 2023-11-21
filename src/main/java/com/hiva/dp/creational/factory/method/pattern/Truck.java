package com.hiva.dp.creational.factory.method.pattern;

public class Truck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling Truck...");
        // Truck assembly logic
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a Truck.");
        // Truck-specific description
    }
}
