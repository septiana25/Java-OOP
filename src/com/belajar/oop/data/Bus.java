package com.belajar.oop.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Bus is drive");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public boolean isBig() {
        return true;
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public String hasBrand() {
        return "HINO";
    }
}
