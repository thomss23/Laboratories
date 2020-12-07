package com.company;

import java.util.ArrayList;

public class Area {
    private CandyBag punga;
    private int number;
    private String street;

    public Area() {
    }

    public Area(CandyBag punga, int number, String street) {
        this.punga = punga;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard(){
        System.out.println("Adresa este " + street + " numarul " + number);
        System.out.println("La multi ani!");
        for(int i=0;i<punga.getBomboane().size();i++){
            System.out.println(punga.getBomboane().get(i).toString());
        }
    }


    public void printBag(){
        for(int i=0;i<punga.getBomboane().size();i++){
            System.out.println(punga.getBomboane().get(i).getClass() + " are urmatorul volum");
            System.out.println(punga.getBomboane().get(i).getVolume());
            System.out.println(punga.getBomboane().get(i).getClass() + " are urmatoarele dimensiuni");
           punga.getBomboane().get(i).printDimensions();
        }
    }
}
