package com.practicing_inheritance;

public class Vehicle {
    private int gear;
    private int speed;
    private final double steer = 0.5f;

    public Vehicle() {
    }

    public Vehicle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private void steerLeft() {
        System.out.println("Steering left: initial position - " + steer);
    }

    private void steerRight() {
        System.out.println("Steering right: initial position + " + steer);
    }

    protected int increaseSpeed() {
        return this.speed++;
    }

    protected int decreaseSpeed() {
        return this.speed--;
    }

}
