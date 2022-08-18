package com.practicing_inheritance;

public class Car extends Vehicle {

    String color;
    boolean isBrake;

    public Car() {
    }

    public Car(int gear, int speed) {
        super(gear, speed);
    }

    public Car(String color, boolean isBrake) {
        this.color = color;
        this.isBrake = isBrake;
    }

}
