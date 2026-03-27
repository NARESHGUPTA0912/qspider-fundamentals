package Shapes;

class Rectangle{
    double length;
    double width;

    public void area(double length, double width){
        // this.length = length;
        // this.width = width;
        double area = length*width;
        System.out.println("Area of Rectangle is " + area + " sq units.");
    }

    public void perimeter(double length, double width){
        // this.length = length;
        // this.width = width;
        double perimeter = 2*(length+width);
        System.out.println("Perimeter of Rectangle is " + perimeter + " units.");
    }
}

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.area(12,13); r1.perimeter(12,13);
        r2.area(14,15); r2.perimeter(14,15);
    }
}
