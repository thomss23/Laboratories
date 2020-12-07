package com.example.test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumerePare<Integer> extends HashSet<Integer> {

    @Override
    public boolean add(Integer number) {
        if((int) number%2==0)
            return super.add(number);
        return false;

    }

}
