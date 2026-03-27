package Shapes;

import javax.crypto.Cipher;

class Circle{
    double radius;
    double pi = 3.14;

    public void area(double radius){
        double area = pi * radius * radius;
        System.out.println("Area of Circle is " + area + " .");
    }

    public void perimeter(double radius){
        // this.radius = radius;
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle is " + perimeter + " .");
    }
}

public class CircleDriver {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(4);
        c.perimeter(4);
    }
}
