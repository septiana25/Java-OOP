package com.belajar.oop.application;

import com.belajar.oop.data.Car;
import com.belajar.oop.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        Car car  = new Avanza();
        System.out.println(car.getTire());
        car.drive();

        car.hasBrand();
    }
}
