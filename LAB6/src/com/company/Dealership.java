package com.company;

import java.util.Random;

public class Dealership  {
    class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            if (car.getType() == Car.CarType.DACIA) {
                double a=5;
                double b=100;
                return (int)(a/b * (double) car.getPrice());

            } else if (car.getType() == Car.CarType.FERRARI) {
                double a=10;
                double b=100;
                return (int)(a/b * (double) car.getPrice());

            } else if (car.getType() == Car.CarType.RENAULT) {
                double a=15;
                double b=100;
                return (int)(a/b * (double) car.getPrice());
            }
            return 0;
        }
        
    }
        class DealerOffer implements Offer{

            @Override
            public int getDiscount(Car car) {
                int discount = 2020-car.getFabYear();
                return 100*discount;
            }
        }
        class SpecialOffer implements Offer{

            @Override
            public int getDiscount(Car car) {
                return (int) ((Math.random() *300) + 0);
            }
        }
        public int getFinalPrice(Car car){
            System.out.println(car.getType());
            System.out.println("Initial price: " + car.getPrice());
            BrandOffer brand = new BrandOffer();
            int brandDiscount = brand.getDiscount(car);
            System.out.println("Applying Brand discount " + brandDiscount);
            DealerOffer deal = new DealerOffer();
            int dealerDiscount = deal.getDiscount(car);
            System.out.println("Applying Dealer discount: " + dealerDiscount );
            SpecialOffer special = new SpecialOffer();
            int specialDiscount = special.getDiscount(car);
            System.out.println("Applying Special discount: " + specialDiscount );

            System.out.println("Final Price: " + (car.getPrice()-brandDiscount-dealerDiscount-specialDiscount));
            return (car.getPrice()-brandDiscount-dealerDiscount-specialDiscount);

        }

        void negotiate(Car car, Offer offer){
            Dealership deal = new Dealership();
            if( (int) ( Math.random() * 2 + 1) == 1){
                int clientDiscount = offer.getDiscount(car);
                System.out.println("Applying Client discount: " + clientDiscount);
                System.out.println("Final price after negotiation: " + (car.getPrice() - clientDiscount));
            } else {
                System.out.println("No client discount applied. Price stays the same.");
            }


        }









}
