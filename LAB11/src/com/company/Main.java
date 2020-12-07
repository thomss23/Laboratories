package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        MyHashMap<Integer,String> map = new MyHashMap(100);
        map.put(1,"hi");
        map.put(2,"pizza");

        System.out.println(map.get(1));



    }
}
