package com.learningpackage.JavaAdvance.oops.Abstraction.vehicle;

public class car extends vehicle {

    private final int speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelarate() {
        System.out.println("Paddling");
    }

    @Override
    public void brake() {
        System.out.println("Braking Cycle");
    }
}
