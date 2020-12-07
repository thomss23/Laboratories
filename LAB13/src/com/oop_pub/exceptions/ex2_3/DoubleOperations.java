package com.oop_pub.exceptions.ex2_3;

import java.util.Collection;

public class DoubleOperations implements Calculator {

    @Override
    public Double add(Double nr1, Double nr2) throws OverflowException,UnderflowException {
        if(nr1+nr2 == Double.POSITIVE_INFINITY){
            throw new OverflowException();
        };
        if(nr1+nr2 == Double.NEGATIVE_INFINITY){
            throw new UnderflowException();
        }
        return nr1+nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) throws ArithmeticException {
        if(nr2==0){
            throw new ArithmeticException();
        }
        return nr1/nr2;
    }

    @Override
    public Double average(Collection<Double> numbers) throws NullParameterException {
        DoubleOperations calculate = new DoubleOperations();
        double sum=0;
        if(numbers==null){
            throw new NullParameterException();
        }

        for(Double number : numbers){
            sum=calculate.add(sum,number);
        }

        return(calculate.divide(sum, (double) numbers.size()));
    }
}
