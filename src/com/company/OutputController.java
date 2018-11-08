package com.company;

public class OutputController {
    public  static void printTriangleAreAandPerimeter(Triangle triangle){
        triangle.getPerimeter();
        System.out.println("perimetrul este");
        System.out.println(triangle.getPerimeter());

        System.out.println("Aria triunghiului este");
        System.out.println(triangle.getArea());
    }

    public static void printDetails(Square square) {
        square.getSquarePerimeter();
        System.out.println("Square Perimeter is");
        System.out.println(square.getSquarePerimeter());

        System.out.println("Square Area is");
        System.out.println(square.getSquareArea());

    }

}
