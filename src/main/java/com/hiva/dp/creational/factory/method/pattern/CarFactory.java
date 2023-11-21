package com.hiva.dp.creational.factory.method.pattern;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle manufactureVehicle() {
        return new Car();
    }
}
