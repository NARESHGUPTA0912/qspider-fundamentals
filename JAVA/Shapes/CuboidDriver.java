package Shapes;

class Cuboid{
    double length;
    double width;
    double height;

    public Cuboid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void volume(){
        double calcVolume = length*width*height;
        System.out.println("Volume of Cuboid is " + calcVolume + " .");
    }

    public void lateralSurfaceArea(){
        double calcLateralSurfaceArea = 2 * ((length * height) + (width * height));
        System.out.println("Lateral Surface Area of Cuboid is " + calcLateralSurfaceArea + " .");
    }

    public void totalSurfaceArea(){
        double calcTotalSurfaceArea = 2 * ((length*width)+(length*height)+(width*height));
        System.out.println("Total Surface Area of Cuboid is " + calcTotalSurfaceArea + " .");
    }
}

public class CuboidDriver {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(3,4,5);
        c.volume();
        c.lateralSurfaceArea();
        c.totalSurfaceArea();
    }
}
