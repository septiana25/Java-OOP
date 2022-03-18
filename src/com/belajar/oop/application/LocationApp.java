package com.belajar.oop.application;

import com.belajar.oop.data.City;

public class LocationApp {
    public static void main(String[] args) {
        var location = new City();
        location.name = "ian";
        System.out.println(location.name);
    }
}
