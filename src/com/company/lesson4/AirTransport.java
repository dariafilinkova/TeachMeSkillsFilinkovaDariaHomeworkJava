package com.company.lesson4;

abstract public class AirTransport extends Transport {
    double wingspan;
    double minTakeOffPathLength;

    public AirTransport(double power, double maxSpeed, double weight, String model, double wingspan,
                        double minTakeOffPathLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minTakeOffPathLength = minTakeOffPathLength;
    }

    abstract String getDescription();
}
