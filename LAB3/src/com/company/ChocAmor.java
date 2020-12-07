package com.company;

public class ChocAmor extends CandyBox {
    float length;

    public ChocAmor() {
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length*length*length;
    }

    @Override
    public void printDimensions(){
        System.out.println(this.length);
    }
}
