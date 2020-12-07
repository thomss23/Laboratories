package com.company;

public class MyMatrix implements Sumabil {

    private Integer[][] matrix;
    private int sum=0;

    public int getSum() {
        return sum;
    }

    public MyMatrix(Integer[][] matrix) {
        this.matrix = matrix;
    }

    public Integer[][] getMatrix() {
        return matrix;
    }

    @Override
    public void addValue(Sumabil value) {

        MyMatrix matrix2 = (MyMatrix) value;

        this.sum = this.sum + matrix2.getSum();
    }

    public static int sumTotal(Sumabil c){
        for(Integer num : ){

        }
    }
}
