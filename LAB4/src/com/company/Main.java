package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        PasswordMaker tom = new PasswordMaker("Thomas");

        //====Singleton fara block static===
//        PasswordMaker tom = PasswordMaker.getInstance();
//        System.out.println(tom.getPassword("thomas"));
//        PasswordMaker tom2 = PasswordMaker.getInstance();
//        PasswordMaker tom3 = PasswordMaker.getInstance();
//
//        System.out.println(PasswordMaker.count); // afiseaza 3 ca l am instantiat de 3 ori

        //========SINGLETON CU STATIC BLOCK=======
        PasswordMaker tom2 = PasswordMaker.getInstance();
        PasswordMaker tom3 = PasswordMaker.getInstance();

        System.out.println(PasswordMaker.count); // afiseaza 2 ca l am instantiat de 2 ori

        //taskul 3 si 4
        ArrayList<Integer> arr = new ArrayList<>();

        MyImmutableArray arrayulMeu = new MyImmutableArray(arr);

        arrayulMeu.getArray().add(4);
    }


}

