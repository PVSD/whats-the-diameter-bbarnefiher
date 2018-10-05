package com.company;

public class Circle {
    public double radius;
    public Circle (double r){
        radius = r;
    }
    public double diameter(){

        double diameter = radius + radius;
        return diameter;
    }
}
