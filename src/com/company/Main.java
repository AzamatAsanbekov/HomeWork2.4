package com.company;

public class Main {

    public static void main(String[] args) {
        Stock stock=new Stock();
        Manufacturer manufacturer =new Manufacturer(stock);
        Consumer consumer =new Consumer(stock);
        Thread t =new Thread(manufacturer);
        Thread t1=new Thread(consumer);
        t.start();
        t1.start();




    }
}
