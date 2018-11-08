package com.company;

public class Triangle {

    public double side1;
    public double side2;
    public double side3;


    public Triangle (double side1, double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

void print(){
    System.out.println("Triangle");
    System.out.println(side1 +", "+ side2+", "+ side3);
}

double getPerimeter(){
        return side1+side2+side3;
}

double getArea(){
        double p = getPerimeter()/2;
        double area = Math.sqrt(p*(p - side1)*(p -side2)*(p - side3));
        return area;
}

}
