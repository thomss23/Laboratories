package com.company;

public class MyVector3 implements Sumabil {

    private Integer[] vector = new Integer[2];
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    @Override
    public void addValue(Sumabil value) {
        MyVector3 vector2 = (MyVector3) value;
        this.sum = this.sum + vector2.getSum();
    }
}
