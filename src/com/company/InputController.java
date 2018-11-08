package com.company;

import java.util.Scanner;

public class InputController {

    public static Triangle createTriangle() {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side3");
        double side3 = scanner.nextDouble();



        Triangle triangle = new Triangle(side1, side2, side3);
        return new Triangle(side1, side2, side3);
    }


    public static Square createSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square side");
        double side = scanner.nextDouble();
        return new Square(side);

    }
}