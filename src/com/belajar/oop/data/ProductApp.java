package com.belajar.oop.data;

public class ProductApp {
    public static void main(String[] args) {
        Product produk = new Product("Mac Book Pro",30_000_000);
        System.out.println(produk.name);
        System.out.println(produk.price);

    }
}
