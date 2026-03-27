package Shapes;

class Triangle{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    public void area(){
        // Calculate semi-perimeter
        double s = (a + b + c) / 2 ;
        // Check  if the triangle is valid
        if(s < a || s < b || s < c){
            throw new ArithmeticException("Invalid triangle");
        }
        // Calculate area using Heron's formula
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of Triangle is " + area + " units.");
    }
    public void perimeter(){
        double perimeter = a+b+c;
        System.out.println("Perimeter of Triangle is " + perimeter + " units.");
    }
}


public class TriangleDriver {
    public static void main(String[] args) {
        Triangle t = new Triangle(4,5,3);
        t.area();
        t.perimeter();
    }
}
