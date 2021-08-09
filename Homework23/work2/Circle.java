package com.alfabank.work2;
import static java.lang.Math.*;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, int iRadius) {
        super(color);
        this.radius = iRadius;
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
}
