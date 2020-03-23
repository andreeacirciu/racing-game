package org.fasttrackit;

public class Mechanic {
    public void repair( Vehicle vehicle){
        System.out.println("Repairing vehicle " + vehicle.getName());

       //vehicle.setTotalDistance() = vehicle.setTotalDistance() - 1;
        vehicle.setDamaged(false);
    }
}
