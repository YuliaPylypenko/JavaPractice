package com.softserve.edu07.Passengers;

abstract class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }
    abstract void drive();
}
