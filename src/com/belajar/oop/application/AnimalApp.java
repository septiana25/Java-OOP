package com.belajar.oop.application;


import com.belajar.oop.data.Animal;
import com.belajar.oop.data.Cat;


public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Pusss";
        animal.run();
    }
}
