package com.company.lesson4;

public class LightTransport extends GroundTransport {
    String bodyType;
    int passengerNumber;
    double way;

    public LightTransport(double power, double maxSpeed, double weight, String model,
                          int wheels, double fuelConsumption, String bodyType, int passengerNumber) {
        super(power, maxSpeed, weight, model, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }

    public void getWay(double time) {
        way = maxSpeed * time;
        System.out.println("\nDuring the time " + time + " h the car " + model + " moving with the maximum speed "
                + maxSpeed + "km/h will go " + way + " km and consume " + countFuelConsumption() + " liters of fuel\n");

    }

    private double countFuelConsumption() {
        return way * fuelConsumption / 100;
    }

    @Override
    public String getDescription() {
        return "Power : " + power + " horsepower" +
                "\nMax speed : " + maxSpeed + "km/h" +
                "\nWeight : " + weight + " kg" +
                "\nModel : " + model +
                "\nNumber of wheels :  " + wheels +
                "\nBody type : " + bodyType +
                "\nFuel consumption : " + fuelConsumption + " liters/100km" +
                "\nPower in kW : " + getPowerInKw() + " kW" +
                "\nNumber of passengers : " + passengerNumber + "\n";
    }

}
