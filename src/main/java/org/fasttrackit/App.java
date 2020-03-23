package org.fasttrackit;

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


//        //method implementation taken from object class not from variable's class
//        Vehicle cheater = new CheatingVehicle();
//        cheater.setName("Cheater");
//        cheater.accelerate(60, 1);
//        System.out.println("Total distance:" + cheater.getTotalDistance());
//
//        //variable type decided what methods can be invoked
//        //type casting
//        ( (CheatingVehicle) cheater).fly();
//
//        Vehicle vehicle1 =new Vehicle();
//        //vehicle1.totalVehicleCount =1 ;
//
//        Vehicle vehicle2 =new Vehicle();
//     //   vehicle2.totalVehicleCount = 2;
//
//       // Vehicle.totalVehicleCount = 50;
//
//        System.out.println("Total count from vehicle1: "+ vehicle1.getTotalVehicleCount());
//        System.out.println("Total count from vehicle2: "+ vehicle2.getTotalVehicleCount());
//        System.out.println("Total count from vehicle class: "+ Vehicle.getTotalVehicleCount());
//
//
//        System.out.println( "Welcome to the racing game!" );
//        System.out.println("Enter your name: ");
//        Scanner scanner  = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        System.out.println("Entered name: " + userInput );
//
//        Engine engine1 = new Engine();//varianta mai ok
//        engine1.manufacturer="VW";
//        engine1.capacity= 2000;
//
//        Car carReference = new Car(engine1); // constructor, car este un tip de data cu variabila carReference
//        carReference.setName("Audi"); //apelez variabilele din clasa Car
//        carReference.setColor("red");
//        carReference.setMaxSpeed(260);
//        carReference.setMileage(6.2);
//        carReference.setRacingNumber(123456);
//        carReference.setTotalDistance(0);
//        carReference.setDamaged(true);
//        carReference.setFuelLevel(380);
//
////        carReference.engine = new Engine; //= adaug un tip nou real de tip Engine
////        carReference.engine.manufacturer = "VW";
////        carReference.engine.capacity = 2000;
//
//new Car();
//
////apelare metode
//       double carReferenceDistance = carReference.accelerate(60, 1);
//        System.out.println("Car distance " + carReferenceDistance);
//
//        Mechanic mechanic =new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Is car damaged:" + carReference.isDamaged());
//
//
////one object with two references
//        System.out.println("Engine details: " );
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        engine1.capacity= 2100;
//        System.out.println("Engine details: " );
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        System.out.println("Properties of " + carReference.getName()); //concatenare
//        System.out.println("Color: " + carReference.getColor());
//        System.out.println("Maximum Speed: " + carReference.getMaxSpeed());
//        System.out.println("Mileage: " + carReference.getMileage());
//        System.out.println("Racing Number: " + carReference.getRacingNumber());
//        System.out.println("Damaged: " + carReference.isDamaged());
//        System.out.println("Fuel Level: " + carReference.getFuelLevel());

//        carReference.name =null;
//       // System.out.println(carReference.name);
//
//        Car car2 = new Car(engine1);
//        car2.name ="Ferrari";
//        car2.damaged = true;
//        car2.color= "blue";
//
//        System.out.println("Properties of " + car2.name);
//        System.out.println("Damaged: " + car2.damaged);
//        System.out.println("Color: " + car2.color);
//
////        System.out.println(4 % 2);
////        System.out.println(4 % 3);
//

    }
}
