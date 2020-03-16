package org.fasttrackit;

public class Car extends Autovehicle { //inheritance
    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    /*constructor overloading (constructor fara parametru) cel putin o
     diferenta intre constructori sa nu fie la fel */
    public Car(){
        super(new Engine());
    }
}
