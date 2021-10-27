package com.company.lesson4;

import java.util.Scanner;

public class CargoTransport extends GroundTransport {
    double carryingCapacity;

    public CargoTransport(double power, double maxSpeed, double weight, String model, int wheels,
                          double fuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, weight, model, wheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String getDescription() {
        return "Power : " + power + " horsepower" +
                "\nMax speed : " + maxSpeed + "km/h" +
                "\nWeight : " + weight + " kg" +
                "\nModel : " + model +
                "\nNumber of wheels :  " + wheels +
                "\nFuel consumption : " + fuelConsumption + " liters/100km" +
                "\nPower in kW : " + getPowerInKw() + " kW" +
                "\nCarrying capacity : " + carryingCapacity + " kg\n";
    }

    public void loadTruck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of cargo in kg : ");
        int cargo = sc.nextInt();

        if (cargo <= carryingCapacity) System.out.println("Truck loaded\n");
        else System.out.println("You need truck with more carrying capacity\n");
    }
}
