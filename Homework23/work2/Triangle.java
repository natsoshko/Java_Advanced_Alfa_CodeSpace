package com.alfabank.work2;
import static java.lang.Math.*;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\t a=  " + a +
                ",\t b = " + b +
                ",\t c = " + c;
    }

    @Override
    public double calcArea() {
        double dPer = (a + b + c) / 2;
        return Math.ceil(sqrt(dPer * (dPer - a) * (dPer - b) * (dPer - c)) * 100) / 100;
    }
}
