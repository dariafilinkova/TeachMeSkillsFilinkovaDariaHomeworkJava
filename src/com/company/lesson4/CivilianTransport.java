package com.company.lesson4;

import java.util.Scanner;

public class CivilianTransport extends AirTransport {
    int passengerNumber;
    boolean hasBusinessClass;

    public CivilianTransport(double power, double maxSpeed, double weight, String model, double wingspan,
                             double minTakeOffPathLength, int passengerNumber, boolean hasBusinessClass) {
        super(power, maxSpeed, weight, model, wingspan, minTakeOffPathLength);
        this.passengerNumber = passengerNumber;
        this.hasBusinessClass = hasBusinessClass;
    }


    @Override
    public String getDescription() {
        return "Power : " + power + " horsepower" +
                "\nMax speed : " + maxSpeed + "km/h" +
                "\nWeight : " + weight + " kg" +
                "\nModel : " + model +
                "\nMinTakeOffPathLength :  " + minTakeOffPathLength +
                "\nWingspan : " + wingspan +
                "\npassengerNumber : " + minTakeOffPathLength + " liters/100km" +
                "\nPower in kW : " + getPowerInKw() + " kW" +
                "\nHas business class : " + hasBusinessClass + "\n";
    }

    public void loadPassengers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of passengers that you want to load : ");
        int passengers = sc.nextInt();

        if (passengers <= passengerNumber) System.out.println("Civilian transport loaded\n");
        else System.out.println("You need civilian transport with more available passenger numbers\n");
    }
}
