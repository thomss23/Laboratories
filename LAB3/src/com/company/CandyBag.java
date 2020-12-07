package com.company;

import java.util.ArrayList;

public class CandyBag {
    private String name;
    private ArrayList<CandyBox> bomboane;

    public CandyBag(String name) {
        this.name = name;
        this.bomboane = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<CandyBox> getBomboane() {
        return bomboane;
    }




}
