package com.company;

public class Car {
    private int price;
    private CarType type;
    private int fabYear;

    enum CarType {
        FERRARI,
        DACIA,
        RENAULT
    }

    public Car(int price, CarType type, int fabYear) {
        this.price = price;
        this.type = type;
        this.fabYear = fabYear;
    }

    public int getPrice() {
        return price;
    }

    public CarType getType() {
        return type;
    }

    public int getFabYear() {
        return fabYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", type=" + type +
                ", fabYear=" + fabYear +
                '}';
    }
}
