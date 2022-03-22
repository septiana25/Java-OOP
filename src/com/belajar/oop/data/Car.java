package com.belajar.oop.data;

/**
 * Interface Mirip seperti abstract class, yg membedakan semua method otomatis abstrak.
 */
public interface Car extends hasBrand, IsMaintenance{

    void drive();
    int getTire();

    //defalut method, tidak wajib di override
    default boolean isBig(){
        return false;
    }
}
