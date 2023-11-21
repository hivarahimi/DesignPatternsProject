package com.hiva.dp.creational.factory.method.pattern;

public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle manufactureVehicle() {
        return new Motorcycle();
    }
}
