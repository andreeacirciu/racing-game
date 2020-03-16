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

        double mileageMultiplier = speed * durationInHours;
        if(speed > 120){
            mileageMultiplier = speed /100;
        }
        System.out.println(name + "is accelerating with " + speed + "km/h for" + durationInHours);

        //local variable
        double traveledDistance = speed * durationInHours ;
        System.out.println("Traveled distance" + traveledDistance);

        totalDistance +=traveledDistance;
        System.out.println("Total traveled distance"+ totalDistance);

        double usedFuel = traveledDistance * mileage;
        System.out.println("Used fuel" + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel" + fuelLevel);

        if(fuelLevel ==0)
        {
            System.out.println("Not enough fuel!");
        return 0;
        }

        if(speed > maxSpeed)
        {
            System.out.println("Max speed exceeded");
            return 0;
        }
        else if (speed == maxSpeed)
        {
            System.out.println("Be careful! Max speed reach");
        }

        //TODO use more fuel if speed > 120 , direct proportional
        return traveledDistance;
    }

    public void decelerate(){

        //TODO implement this
        System.out.println("This a demo method!");

    }
}
