package com.company;

public class Point {

    private float x;
    private float y;

    public void changeCoords(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("(" + x + "," + y + ")");
    }
}
