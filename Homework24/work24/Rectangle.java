package com.alfabank.work24;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle (Rectangle objrect) {
        super(objrect.getColor());
        this.width = objrect.getWidth();
        this.height = objrect.getHeight();
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
