package com.alfabank.work24;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public void run() throws CloneNotSupportedException {
        Shape [] aShapes = createArr();
        System.out.println("-- Before sorting:");
        showArr(aShapes);

        // Homework 24 - Comparable
        System.out.println("\n-- After sorting with Comparable (ascending):");
        Arrays.sort(aShapes);
        showArr(aShapes);

        // Homework 24 - Comparator
        System.out.println("\n-- After sorting with Comparator (descending):");
        Arrays.sort(aShapes, new MyComparatorColor());
        showArr(aShapes);

        // Homework 24 - clone
        System.out.println("\n=== CLONE - SHALLOW COPY ===");
        copyShallow(aShapes);

        System.out.println("\n=== CLONE - DEEP COPY ===");
        copyDeep(aShapes);

        System.out.println("\n=== CLONE - CONSTRUCTOR COPY ===");
        copyConstructor(aShapes);
    }

    public Shape[] createArr() {
        Shape[] arrshapes = {
                new Rectangle("white", 4, 5),
                new Rectangle("grey", 6, 5),
                new Rectangle("black", 7, 5),
                new Rectangle("brown", 8, 5),
                new Circle("green", 3),
                new Circle("blue", 4),
                new Circle("red", 5),
                new Triangle("orange", 20, 15, 10),
                new Triangle("yellow", 45, 35, 25)
        };
        return arrshapes;
    }

    public void showArr(Shape... arrSh) {
        for (Shape sh : arrSh) {
            //System.out.println(sh + ",\t S = " + sh.calcArea());
            sh.draw();
        }
    }

    public void copyShallow(Shape [] obShape) {
        Shape[] aShapes2 = (Shape[]) obShape.clone();
        System.out.println("--- aShapes array:");
        showArr(obShape);
        System.out.println("--- aShapes2 - copy aShapes:");
        showArr(aShapes2);
        for (Shape sh : obShape) {
            sh.setColor("green");
        }
        System.out.println("\n--- changing color for all shapes in aShapes array on GREEN:");
        System.out.println("--- aShapes array:");
        showArr(obShape);
        System.out.println("--- aShapes2 - copy aShapes:");
        showArr(aShapes2);
    }

    public void copyDeep(Shape [] obShape) throws CloneNotSupportedException {
        Shape[] aShapes3 = (Shape[]) obShape.clone();
        for (int i = 0; i < aShapes3.length; i++) {
            aShapes3[i] = (Shape) aShapes3[i].clone();
        }
        System.out.println("--- changing color for all shapes in aShapes array on YELLOW:");
        for (Shape sh : obShape) {
            sh.setColor("yellow");
        }
        System.out.println("--- aShapes array:");
        showArr(obShape);
        System.out.println("--- aShapes3 - copy aShapes:");
        showArr(aShapes3);

    }

    public void copyConstructor(Shape [] obShape) {
        Shape[] aShapes4 = new Shape[obShape.length];
        for (int i = 0; i < obShape.length; i++) {
            if (obShape[i] instanceof Circle) {
                aShapes4[i] = new Circle((Circle) obShape[i]);
            } else if (obShape[i] instanceof Rectangle) {
                aShapes4[i] = new Rectangle ((Rectangle) obShape[i]);
            } else if (obShape[i] instanceof Triangle) {
                aShapes4[i] = new Triangle ((Triangle) obShape[i]);
            }
        }
        System.out.println("--- changing color for all shapes in aShapes array on ORANGE:");
        for (Shape sh : obShape) {
            sh.setColor("orange");
        }
        System.out.println("--- aShapes array:");
        showArr(obShape);
        System.out.println("--- aShapes4 - copy aShapes:");
        showArr(aShapes4);
    }

}
