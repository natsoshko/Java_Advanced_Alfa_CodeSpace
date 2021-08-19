package com.alfabank.work3;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, Double width, Double height) {
        super(color);
        if(width>0 && height>0) {
            this.width = width;
            this.height = height;
        }
    }

    @Override
    public double calcArea() {
        return (double)(int)((height * width)*100)/100;
    }

    @Override
    public String toString() {
        return super.toString()+", Widht="+ width +
                ", Height=" +height;
    }

    // "Rectangle:RED:10,20"
    public static Rectangle parseRectangle(String rectangle) {
        String[] tokens = rectangle.split("[:,]");
        if (tokens.length != 4) {
            throw new InvalidShapeStringException("For Rectangle incorrect count of receive values.");
        }
        // \d+ one or more digits; \.? zero or one; \d* zero or more
        if (!tokens[2].matches("\\d+\\.?\\d*") || Double.parseDouble(tokens[2]) <= 0 ||
                !tokens[3].matches("\\d+\\.?\\d*") || Double.parseDouble(tokens[3]) <= 0) {
            throw new InvalidShapeStringException("Rectangle has wrong values of sides.");
        }
        return new Rectangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
    }
}