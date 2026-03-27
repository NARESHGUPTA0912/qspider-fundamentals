package Shapes;

class Square{
    double side;

    public void area(double side){
        double area = side * side;
        System.out.println("Area of Square is " + area + " sq units.");
    }
    public void perimeter(double side){
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square is " + perimeter + " sq units.");
    }
}

public class SquareDriver {
    public static void main(String[] args) {
        Square s = new Square();
        s.area(7);
        s.perimeter(7);
    }
}
