package com.company;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox(){

    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandyBox)) return false;
        CandyBox candyBox = (CandyBox) o;
        return flavor.equals(candyBox.flavor) &&
                origin.equals(candyBox.origin);
    }

    public void printDimensions(){

    }

}
