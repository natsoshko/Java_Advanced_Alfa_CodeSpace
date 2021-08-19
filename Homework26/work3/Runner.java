package com.alfabank.work3;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public void run() {
        Shape[] shapes = createShapes();
        viewShape(shapes);
    }

    public Shape[] createShapes() {
        System.out.println("Enter figures (Circle, Triangle, Rectangle) and their data: ");
        Scanner sc = new Scanner(System.in);
        Shape [] shapes = new Shape[2];
        int iCount = 0;
        for (int i = 0; i < shapes.length; i++) {
            boolean validInput = false;
            while (!validInput) {
                String sText = sc.nextLine();
                try {
                    Shape someShape = Shape.parseShape(sText);
                    shapes[i] = someShape;
                    validInput = true;
//                    Shape.parseShape("Rectangle:Red:10.5,21.4"),
//                    Shape.parseShape("Circle:Red:10.5"),
//                    Shape.parseShape("Triangle:Creen:10.5,12.0,8.9")

                } catch (InvalidShapeStringException exc) {
                    System.out.println("Error -> " + exc.getMessage());
                    System.out.println("Try again. Enter figures (Circle, Triangle, Rectangle) and their data: ");
                }
            }
        }
        return shapes;
    }

    public void viewShape(Shape[] arrShape){
        for (Shape shape: arrShape) {
            shape.draw();
        }
    }

    public double allArea(Shape[] obj){
        double sumArea=0.0;
        for (Shape area: obj) {
            sumArea+= area.calcArea();
        }
        return sumArea;
    }

    public double allArea(Shape[] obj, String type){
        double sumArea = 0.0;
        for(Shape area: obj) {
            if(type.equals(area.getClass().getSimpleName())){
                sumArea += area.calcArea();
            }
        }
        return sumArea;
    }
}

//import java.util.Scanner;
//
//public class SquareRootWhile {
//
//    public static void main(String args[]) {
//        System.out.print("Type a non-negative integer: ");
//        Scanner console = new Scanner(System.in);
//
//        double squareRoot = 0;
//        int num = console.nextInt();
//
//        while (num < 0) {
//            squareRoot = Math.sqrt(num);
//            System.out.println("Invalid number, try again: ");
//            num = console.nextInt();
//        }
//
//        System.out.println("The square root of " + num"is" + squareRoot)
//    }
//}