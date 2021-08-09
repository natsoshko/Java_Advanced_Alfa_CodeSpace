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

        // Homework 25 - clone
        System.out.println("\n=== CLONE - SHALLOW COPY ===");
        Shape[] aShapes2 = (Shape[]) aShapes.clone();
        System.out.println("--- aShapes array:");
        showArr(aShapes);
        System.out.println("--- aShapes2 - copy aShapes:");
        showArr(aShapes2);
        for (Shape sh : aShapes) {
            sh.setColor("green");
        }
        System.out.println("\n--- changing color for all shapes in aShapes array on GREEN:");
        System.out.println("--- aShapes array:");
        showArr(aShapes);
        System.out.println("--- aShapes2 - copy aShapes:");
        showArr(aShapes2);

        System.out.println("\n=== CLONE - DEEP COPY ===");
        Shape[] aShapes3 = (Shape[]) aShapes.clone();
        for (int i = 0; i < aShapes3.length; i++) {
            aShapes3[i] = (Shape) aShapes3[i].clone();
        }
        System.out.println("--- changing color for all shapes in aShapes array on YELLOW:");
        for (Shape sh : aShapes) {
            sh.setColor("yellow");
        }
        System.out.println("--- aShapes array:");
        showArr(aShapes);
        System.out.println("--- aShapes3 - copy aShapes:");
        showArr(aShapes3);

        System.out.println("\n=== CLONE - CONSTRUCTOR COPY ===");
        Shape[] aShapes4 = new Shape[aShapes.length];
        for (int i = 0; i < aShapes.length; i++) {
            if (aShapes[i] instanceof Circle) aShapes4[i] = new Circle ((Circle) aShapes[i]);
            else if (aShapes[i] instanceof Rectangle) {
                aShapes4[i] = new Rectangle ((Rectangle) aShapes[i]);
            } else if (aShapes[i] instanceof Triangle) {
                aShapes4[i] = new Triangle ((Triangle) aShapes[i]);
            }
        }
        System.out.println("--- changing color for all shapes in aShapes array on ORANGE:");
        for (Shape sh : aShapes) {
            sh.setColor("orange");
        }
        System.out.println("--- aShapes array:");
        showArr(aShapes);
        System.out.println("--- aShapes4 - copy aShapes:");
        showArr(aShapes4);

//            Circle shape1 = new Circle("violet", 25);
//            Circle shape2 = (Circle) shape1.clone();
//            System.out.println("-- shape1: " + shape1);
//            System.out.println("-- shape2: ") + shape2);
//            System.out.println("-- after changing in shape1 color from violet to orange and radius from 25 to 30:");
//            shape1.setColor("green");
//            shape1.setRadius(30);
//            System.out.println("-- shape1: " + shape1);
//            System.out.println("-- shape2: " + shape2);

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



//    public void sumSquareShapes(Shape... arrSh) {
//        double totalSum = 0.0;
//        for (Shape sh : arrSh) {
//            totalSum += sh.calcArea();
//        }
//        System.out.println("Total S all shapes = " + Math.ceil(totalSum * 100) / 100);
//    }
//
//    public void sumSquareByType(String sType, Shape... arrSh) {
//        double totalSum = 0.0;
//        for (Shape sh : arrSh) {
//            if (sh.getClass().getSimpleName().equals(sType)) {
//                totalSum += sh.calcArea();
//            }
//        }
//        System.out.println("Total S of type " + sType + " = " + Math.ceil(totalSum * 100) / 100);
//    }
//
//    public void sumSquareGroupByType(Shape... arrSh) {
//        double totalSumCircle = 0.0;
//        double totalSumRectangle = 0.0;
//        double totalSumTriangle = 0.0;
//        for (Shape sh : arrSh) {
//            if (sh instanceof Circle) {
//                totalSumCircle += sh.calcArea();
//            } else if (sh instanceof Rectangle) {
//                totalSumRectangle += sh.calcArea();
//            } else if (sh instanceof Triangle) {
//                totalSumTriangle += sh.calcArea();
//            }
//        }
//        System.out.println("Type Rectangle: total S = " + Math.ceil(totalSumRectangle * 100) / 100);
//        System.out.println("Type Circle: total S = " + Math.ceil(totalSumCircle * 100) / 100);
//        System.out.println("Type Triangle: total S = " + Math.ceil(totalSumTriangle * 100) / 100);
//    }

}
