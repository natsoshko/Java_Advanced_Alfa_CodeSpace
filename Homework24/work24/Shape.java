package com.alfabank.work24;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

//    public Shape(Shape objshape) {
//        this.color = objshape.getColor();
//    }

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

    @Override
    public void draw() {
        System.out.println(this + ",\t AREA = " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (this.calcArea() > ((Shape)o).calcArea()) return 1;
        if (this.calcArea() < ((Shape)o).calcArea()) return -1;
        return 0;
        //return this.calcArea() > ((Shape)o).calcArea() ? 1 : (this.calcArea() < ((Shape)o).calcArea() ? -1 : 0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
        //return super.clone();
    }

    public abstract double calcArea ();
}
