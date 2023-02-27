package com.softserve.edu07.Passengers;

abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passengers) {
        super(passengers);
    }
    abstract void isSailing();
}
