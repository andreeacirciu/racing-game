package org.fasttrackit;

public class Vehicle {
    int racingNumber;
    int maxSpeed;
    String name;
    String color;
    double mileage;
    double fuelLevel;
    double totalDistance;
    boolean damaged;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + "is accelerating with " + speed + "km/h for" + durationInHours);

        //local variables
        double traveledDistance = speed * durationInHours ;
        System.out.println("Traveled distance" + traveledDistance);

        totalDistance +=traveledDistance;
        System.out.println("Total traveled distance"+ totalDistance);

        double usedFuel = traveledDistance * mileage;
        System.out.println("Used fuel" + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel" + fuelLevel);

        return traveledDistance;
    }

}
