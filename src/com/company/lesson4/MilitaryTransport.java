package com.company.lesson4;

public class MilitaryTransport extends AirTransport {
    boolean hasEjectionSystem;
    int missilesNumber;

    public MilitaryTransport(double power, double maxSpeed, double weight, String model, double wingspan,
                             double minTakeOffPathLength, boolean hasEjectionSystem, int missilesNumber) {
        super(power, maxSpeed, weight, model, wingspan, minTakeOffPathLength);
        this.hasEjectionSystem = hasEjectionSystem;
        this.missilesNumber = missilesNumber;
    }

    @Override
    String getDescription() {
        return "Power : " + power + " horsepower" +
                "\nMax speed : " + maxSpeed + "km/h" +
                "\nWeight : " + weight + " kg" +
                "\nModel : " + model +
                "\nNumber of wingspan :  " + wingspan +
                "\nBody minimum take off path length : " + minTakeOffPathLength +
                "\nhasEjectionSystem : " + hasEjectionSystem +
                "\nPower in kW : " + getPowerInKw() + " kW" +
                "\nNumber of missiles : " + missilesNumber + "\n";
    }

    public void shot() {

        if (missilesNumber != 0 && missilesNumber > 0) {
            System.out.println("Missile went\n");
        } else System.out.println("No ammunition\n");
        missilesNumber--;
    }

    public String ejection() {
        return (hasEjectionSystem) ? "Ejection was successful\n" : "You don't have such a system\n";
    }

}
