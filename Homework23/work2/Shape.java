package com.alfabank.work2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName() +
                ":\t color = " + color;
    }

    public double calcArea () {
        return 0.0;
    }
}
