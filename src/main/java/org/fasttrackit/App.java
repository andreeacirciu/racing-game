package org.fasttrackit;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        game.start();

        new Autovehicle(new Engine());






        System.out.println( "Welcome to the racing game!" );
        System.out.println("Enter your name: ");
        Scanner scanner  = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Entered name: " + userInput );

        Engine engine1 = new Engine();//varianta mai ok
        engine1.manufacturer="VW";
        engine1.capacity= 2000;

        Car carReference = new Car(engine1); // constructor, car este un tip de data cu variabila carReference
        carReference.name ="Audi"; //apelez variabilele din clasa Car
        carReference.color ="red";
        carReference.maxSpeed =260;
        carReference.mileage = 6.2;
        carReference.racingNumber = 123456;
        carReference.totalDistance = 0;
        carReference.damaged = true;
        carReference.fuelLevel= 380;

//        carReference.engine = new Engine; //= adaug un tip nou real de tip Engine
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;



//apelare metode
       double carReferenceDistance = carReference.accelerate(60, 1);
        System.out.println("Car distance " + carReferenceDistance);

        Mechanic mechanic =new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Is car damaged:" + carReference.damaged);


//one object with two references
        System.out.println("Engine details: " );
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity= 2100;
        System.out.println("Engine details: " );
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        System.out.println("Properties of " + carReference.name); //concatenare
        System.out.println("Color: " + carReference.color);
        System.out.println("Maximum Speed: " + carReference.maxSpeed);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Racing Number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println("Fuel Level: " + carReference.fuelLevel);

        carReference.name =null;
       // System.out.println(carReference.name);

        Car car2 = new Car(engine1);
        car2.name ="Ferrari";
        car2.damaged = true;
        car2.color= "blue";

        System.out.println("Properties of " + car2.name);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Color: " + car2.color);

//        System.out.println(4 % 2);
//        System.out.println(4 % 3);


    }
}
