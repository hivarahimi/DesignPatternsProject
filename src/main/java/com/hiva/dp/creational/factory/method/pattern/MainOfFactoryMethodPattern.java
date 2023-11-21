package com.hiva.dp.creational.factory.method.pattern;

public class MainOfFactoryMethodPattern {

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        // Creating different types of vehicles using their factories
        Vehicle car = carFactory.manufactureVehicle();
        Vehicle truck = truckFactory.manufactureVehicle();
        Vehicle motorcycle = motorcycleFactory.manufactureVehicle();

        // Assembling and describing vehicles
        car.assemble();
        car.describeVehicle();

        truck.assemble();
        truck.describeVehicle();

        motorcycle.assemble();
        motorcycle.describeVehicle();
    }
}
