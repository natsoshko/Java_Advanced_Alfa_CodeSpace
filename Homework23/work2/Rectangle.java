package com.alfabank.work2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\t width = " + width +
                ",\t height = " + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
