package Shapes;

class Sphere{
    double radius;
    double pi = 3.14;

    public Sphere(double radius){
        this.radius = radius;
    }

    public void volume(){
        double calcVolume = (4/3) * pi * (radius * radius * radius);
        System.out.println("Volume of Sphere is " + calcVolume + " .");
    }

    public void totalSurfaceArea(){
        double calcTotalSurfaceArea = 4 * pi * radius * radius;
        System.out.println("Total Surface Area of Sphere is " + calcTotalSurfaceArea + " .");
    }
}

public class SphereDriver {
    public static void main(String[] args) {
        Sphere s = new Sphere(7);
        s.volume(); s.totalSurfaceArea();
    }
}
