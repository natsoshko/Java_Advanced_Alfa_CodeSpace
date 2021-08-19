package com.alfabank.work3;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, Double radius) {
        super(color);
        if(radius>0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString(){
        return super.toString()+", radius="+ radius;
    }

    @Override
    public double calcArea(){
        return (double)(int)((radius * radius * 2 * Math.PI)*100)/100;
    }

    // "Circle:GREEN:9".
    public static Circle parseCircle(String circle) {
        String[] tokens = circle.split(":");
            if (tokens.length != 3) {
                throw new InvalidShapeStringException("For Circle incorrect count of receive values.");
            }
            // \d+ one or more digits; \.? zero or one; \d* zero or more
            if (!tokens[2].matches("\\d+\\.?\\d*") || Double.parseDouble(tokens[2]) <= 0) {
                throw new InvalidShapeStringException("Circle has wrong radius value.");
            }
            return new Circle(tokens[1], Double.parseDouble(tokens[2]));
    }

    public static Circle parseShape(String circle) {
        String[] tokens = circle.split(":");
        return new Circle(tokens[1], Double.parseDouble(tokens[2]));
    }
}
