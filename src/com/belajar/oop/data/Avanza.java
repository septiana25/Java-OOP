package com.belajar.oop.data;

public class Avanza implements Car{

   public void drive(){
        System.out.println("Car is drive");
    }

    public int getTire() {
        return 4;
    }

    public String hasBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
