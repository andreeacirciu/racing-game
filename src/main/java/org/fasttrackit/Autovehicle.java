package org.fasttrackit;

public class Autovehicle extends Vehicle {

    Engine engine; //has a relationship - aggregation (variabila engine de tipul Engine din clasa Engine)

    public Autovehicle(Engine engine) {
        this.engine = engine;
    }
}

