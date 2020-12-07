package com.company;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Dealership deal = new Dealership();

        Car logan = new Car(10000, Car.CarType.DACIA,1995);
        logan.setPrice(deal.getFinalPrice(logan));
        deal.negotiate(logan, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 600;
            }
        });
        System.out.println("=================================");

        Car scenic = new Car(9000, Car.CarType.RENAULT,2000);
        scenic.setPrice(deal.getFinalPrice(scenic));
        deal.negotiate(scenic, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 800;
            }
        });
        System.out.println("===================================");

        Car ferrari = new Car(20000, Car.CarType.FERRARI,2010);
        ferrari.setPrice(deal.getFinalPrice(ferrari));
        deal.negotiate(ferrari, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 1500;
            }
        });

        System.out.println("\nLambda Task 5 - elimina toate masinile cu pretu peste 15000");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(logan);
        cars.add(scenic);
        cars.add(ferrari);
        cars.removeIf((car) -> car.getPrice()>=15000);
        for(Car car : cars){
            System.out.println(car);
        }



















    }
}
