package com.oop_pub.exceptions.ex2_3;

import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new DoubleOperations();
        List<Double> aList = null;


        System.out.println(calculator.add(2d, 3d));

        System.out.println(calculator.divide(9d, 3d));

        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        // TODO: Test edge cases that would throw exceptions


        try{
            calculator.add(Double.POSITIVE_INFINITY,3d);
        } catch (Calculator.OverflowException e){
            System.out.println("can't add to to infinity man");
        }

        try{
            calculator.divide(9d,0d);
        } catch(ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }

        try{
            calculator.add(Double.NEGATIVE_INFINITY,3d);
        } catch (Calculator.UnderflowException e){
            System.out.println("can't add to to infinity man");
        }

        try{
            calculator.average(aList);
        } catch (Calculator.NullParameterException e){
            System.out.println("List can't be empty");
        }

    }
}
