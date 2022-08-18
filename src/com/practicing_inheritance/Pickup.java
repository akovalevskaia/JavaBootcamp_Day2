package com.practicing_inheritance;

public class Pickup extends Car {
    String name;
    int weight;
    int price;

    public Pickup(int gear, int speed) {
        super(gear, speed);
    }

    public Pickup(String name, int weight, int price) {
        super();
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    protected int changeGear(int speed) {
        if (getSpeed() >= 0 && getSpeed() <= 25) {
            setGear(1);
        } else if (getSpeed() >= 25 && getSpeed() <= 50) {
            setGear(2);
        } else if (getSpeed() >= 50 && getSpeed() <= 75) {
            setGear(3);
        } else {
            setGear(4);
        }
        return getGear();
    }

    public static void main(String[] args) {
        Pickup pickup1 = new Pickup("Isuzu D-Max", 1126, 30_000);

        while(pickup1.getSpeed() != 100) {
            pickup1.increaseSpeed();
        }
        System.out.printf("For now the speed of %s is %d%n", pickup1.name, pickup1.getSpeed());
        System.out.println("Gear: " + pickup1.changeGear(pickup1.getSpeed()));

        while(pickup1.getSpeed() != 56) {
            pickup1.decreaseSpeed();
        }
        System.out.printf("For now the speed of %s is %d%n", pickup1.name, pickup1.getSpeed());
        System.out.println("Gear: " + pickup1.changeGear(pickup1.getSpeed()));
    }
}
