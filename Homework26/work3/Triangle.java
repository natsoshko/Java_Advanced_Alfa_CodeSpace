package com.alfabank.work3;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        if( (a+b>c && a+c>b && c+b>a) && a>0 && b>0 && c>0){
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    @Override
    public double calcArea(){
        double p = (a+b+c)/2;
        return (double)(int)((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*100)/100;
    }

    @Override
    public String toString(){
        return super.toString()+", a="+ a +
                ", b=" +b+
                ", c=" +c;
    }

    // "Triangle:GREEN:9,7,12".
    public static Triangle parseTriangle(String triangle) {
        String[] tokens = triangle.split("[:,]");
        if (tokens.length != 5) {
            throw new InvalidShapeStringException("For Triangle incorrect count of receive values.");
        }
        // \d+ one or more digits; \.? zero or one; \d* zero or more
        for (int i = 2; i <= 4; i++) {
            if (!tokens[i].matches("\\d+\\.?\\d*") || Double.parseDouble(tokens[i]) <= 0 ) {
                throw new InvalidShapeStringException("Triangle has wrong values of sides.");
            }
        }
        return new Triangle(tokens[1], Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]),
                Double.parseDouble(tokens[4]));
    }
}
