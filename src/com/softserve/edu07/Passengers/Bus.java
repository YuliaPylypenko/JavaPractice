package com.softserve.edu07.Passengers;

public class Bus extends GroundVehicle {
    private String rout;

    public Bus(int passengers, String rout) {
        super(passengers);
        this.rout = rout;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    @Override
    void drive() {
        System.out.println("Bus is driving");
    }
}
