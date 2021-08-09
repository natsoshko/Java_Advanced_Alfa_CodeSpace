package com.alfabank.work24;
import static java.lang.Math.*;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape implements Cloneable {
    private int radius;

    public Circle(String color, int iRadius) {
        super(color);
        this.radius = iRadius;
    }
     public Circle (Circle objcircle) {
         super(objcircle.getColor());
         this.radius = objcircle.getRadius();
     }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int iRadius) {
        this.radius = iRadius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\t radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.ceil(PI * pow(radius, 2) * 100) / 100;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
