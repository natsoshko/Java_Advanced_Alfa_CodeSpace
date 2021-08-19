package com.alfabank.work3;

public abstract class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ": color=" +color;
    }

    @Override
    public void draw() {
        System.out.println(this +", Area=" + calcArea());
    }

    // "Triangle:GREEN:9,7,12".
    public static Shape parseShape(String figure) {
        String nameShape = figure.split(":")[0];
        switch (nameShape) {
            case "Circle":
                return Circle.parseCircle(figure);
                //return Circle.parseShape(figure);
            case "Rectangle":
                return Rectangle.parseRectangle(figure);
            case "Triangle":
                return Triangle.parseTriangle(figure);
            default:
                throw new InvalidShapeStringException ("It isn't type of our shapes");
        }
    }
}