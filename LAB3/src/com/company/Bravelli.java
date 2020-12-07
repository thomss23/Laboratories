package com.company;

public class Bravelli extends CandyBox {
    float radius,height;

    public Bravelli() {
    }

    public Bravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) ((this.radius*this.radius)*Math.PI*this.height);
    }

    @Override
    public void printDimensions(){
        System.out.println(this.radius + " " + this.height);
    }

}
