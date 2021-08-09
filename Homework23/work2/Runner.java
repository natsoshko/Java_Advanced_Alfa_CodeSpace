package com.alfabank.work2;

import java.util.Scanner;

public class Runner {
    public void run() {
        Shape [] aShapes = createArr();
        showArr(aShapes);
        sumSquareShapes(aShapes);
        System.out.println("Enter the type of shape: ");
        Scanner sc = new Scanner(System.in);
        String sType = sc.nextLine();
        sumSquareByType(sType, aShapes);
        sumSquareGroupByType(aShapes);
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
            System.out.println(sh + ",\t S = " + sh.calcArea());
        }
    }

    public void sumSquareShapes(Shape... arrSh) {
        double totalSum = 0.0;
        for (Shape sh : arrSh) {
            totalSum += sh.calcArea();
        }
        System.out.println("Total S all shapes = " + Math.ceil(totalSum * 100) / 100);
    }

    public void sumSquareByType(String sType, Shape... arrSh) {
        double totalSum = 0.0;
        for (Shape sh : arrSh) {
            if (sh.getClass().getSimpleName().equals(sType)) {
                totalSum += sh.calcArea();
            }
        }
        System.out.println("Total S of type " + sType + " = " + Math.ceil(totalSum * 100) / 100);
    }

    public void sumSquareGroupByType(Shape... arrSh) {
        double totalSumCircle = 0.0;
        double totalSumRectangle = 0.0;
        double totalSumTriangle = 0.0;
        for (Shape sh : arrSh) {
            if (sh instanceof Circle) {
                totalSumCircle += sh.calcArea();
            } else if (sh instanceof Rectangle) {
                totalSumRectangle += sh.calcArea();
            } else if (sh instanceof Triangle) {
                totalSumTriangle += sh.calcArea();
            }
        }
        System.out.println("Type Rectangle: total S = " + Math.ceil(totalSumRectangle * 100) / 100);
        System.out.println("Type Circle: total S = " + Math.ceil(totalSumCircle * 100) / 100);
        System.out.println("Type Triangle: total S = " + Math.ceil(totalSumTriangle * 100) / 100);
    }
}
