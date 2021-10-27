package com.company.lesson4;

abstract public class GroundTransport extends Transport {
    int wheels;
    double fuelConsumption;

    public GroundTransport(double power, double maxSpeed, double weight, String model, int wheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    abstract String getDescription();
}
