package com.company.lesson4;

public class Main {
    public static void main(String[] args) {

        LightTransport car1 = new LightTransport(450, 230, 450, "Audi", 4,
                8, "sedan", 4);
        car1.getWay(2.5);
        System.out.println(car1.getDescription());

        CargoTransport cargo1 = new CargoTransport(500, 150, 500, "Mercedes", 4,
                10, 600.5);
        cargo1.loadTruck();

        CivilianTransport civilianPlane1 = new CivilianTransport(600, 140, 560, "Boeing",
                115.5, 500.25, 15, false);
        civilianPlane1.loadPassengers();

        MilitaryTransport militaryPlane1 = new MilitaryTransport(500, 300, 400, "MiG",
                140.3, 400.56, true, 3);
        militaryPlane1.shot();
        militaryPlane1.shot();
        militaryPlane1.shot();
        militaryPlane1.shot();
        militaryPlane1.ejection();

    }
}
