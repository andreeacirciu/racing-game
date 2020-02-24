package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game!" );

        Car carReference = new Car(); // constructor, car este un tip de data cu variabila carReference
        carReference.name ="Audi"; //apelez variabilele din clasa Car
        carReference.color ="red";
        carReference.maxSpeed =260;
        carReference.mileage = 6.2;
        carReference.racingNumber = 123456;
        //carReference.damaged;
       // carReference.fuelLevel= 12.2;

        System.out.println("Properties of " + carReference.name); //concatenare
        System.out.println("Color: " + carReference.color);
        System.out.println("Maximum Speed: " + carReference.maxSpeed);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Racing Number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Fuel Level: " + carReference.fuelLevel);

        carReference.name =null;
       // System.out.println(carReference.name);

        Car car2 = new Car();
        car2.name ="Ferrari";
        car2.damaged = true;
        car2.color= "blue";

        System.out.println("Properties of " + car2.name);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Color: " + car2.color);

    }
}
