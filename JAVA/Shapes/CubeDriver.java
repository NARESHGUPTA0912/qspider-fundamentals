package Shapes;

class Cube{
    double side;

    public Cube(double side){
        this.side = side;
    }

    public void volume(){
        double calcVolume = side * side * side;
        System.out.println("Volume of Cube is " + calcVolume + " .");
    }

    public void lateralSurfaceArea(){
        double calcLateralSurfaceArea = 4 * side * side;
        System.out.println("Lateral Surface Area of Cube is " + calcLateralSurfaceArea + " .");
    }

    public void totalSurfaceArea(){
        double calcTotalSurfaceArea = 6 * side * side;
        System.out.println("Total Surface Area of Cube is " + calcTotalSurfaceArea + " .");
    }
}

public class CubeDriver {
    public static void main(String[] args) {
        Cube c = new Cube(5);
        c.volume();
        c.lateralSurfaceArea();
        c.totalSurfaceArea();
    }
}
