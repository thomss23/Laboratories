package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyImmutableArray {
    private ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> immutableArray) {
        this.immutableArray = immutableArray;
    }

    public List<Integer> getArray(){
        return Collections.unmodifiableList(immutableArray);
    }

}
