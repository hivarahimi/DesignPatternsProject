package com.hiva.dp.creational.factory.method.pattern;

public class Motorcycle implements Vehicle{
    @Override
    public void assemble() {
        System.out.println("Assembling Motorcycle...");
        // Motorcycle assembly logic
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a Motorcycle.");
        // Motorcycle-specific description
    }
}
