package com.hiva.dp.creational.factory.method.pattern;

public class Car implements Vehicle{
    @Override
    public void assemble() {
        System.out.println("Assembling Car...");
        // Car assembly logic
    }

    @Override
    public void describeVehicle() {
        System.out.println("This is a Car.");
        // Car-specific description
    }
}
