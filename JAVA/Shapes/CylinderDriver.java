package Shapes;

class Cylinder{
    double radius;
    double height;
    double pi = 3.14;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public void volume(){
        double calcVolume = pi * radius * radius * height;
        System.out.println("Volume of Cylinder is " + calcVolume + " .");
    }
    public void lateralSurfaceArea(){
        double calcLateralSurfaceArea = 2 * pi * radius * height;
        System.out.println("Lareral Surface Area of Cylinder is " + calcLateralSurfaceArea + " .");
    }
    public void totalSurfaceArea(){
        double calcTotalSurfaceArea = 2 * pi * radius * (radius + height);
        System.out.println("Total Surface Area of Cylinder is " + calcTotalSurfaceArea + " .");
    }
}

public class CylinderDriver {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(4,6);
        cyl.volume();
        cyl.lateralSurfaceArea();
        cyl.totalSurfaceArea();
    }
}
