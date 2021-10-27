package com.company.lesson4;

abstract public class Transport {
    double power;
    double maxSpeed;
    double weight;
    String model;

    public Transport(double power, double maxSpeed, double weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public double getPowerInKw() {
        return power * 0.75;
    }
}
