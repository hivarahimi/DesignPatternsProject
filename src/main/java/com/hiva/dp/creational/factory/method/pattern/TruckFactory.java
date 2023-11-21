package com.hiva.dp.creational.factory.method.pattern;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle manufactureVehicle() {
        return new Truck();
    }
}
