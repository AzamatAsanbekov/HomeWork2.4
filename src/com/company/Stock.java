package com.company;

public class Stock extends Thread {
    private int stock = 0;


    public void put() {


        if (stock > 0) {
            try {
                sleep(1000);

            } catch (InterruptedException r) {
                r.printStackTrace();
            }
        }stock = stock + 5;
        System.out.println("Положим 5 товаров");
        System.out.println("В складе:"+stock+"товаров");

    }
    public void get() {
        if (stock < 0) {
            try {
                sleep(1000);

            } catch (InterruptedException r) {
                r.printStackTrace();
            }
        }stock = stock - 5;
        System.out.println("Возьмем 5 товаров");
        System.out.println("В складе:"+stock+"товаров");

    }
}


