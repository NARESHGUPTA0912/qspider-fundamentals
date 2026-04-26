package Java8Features.MethodReference;

// 
interface SquareRoot{
    double squareRoot(double d);
}

public class Program3 {
    public static void main(String[] args) {
        SquareRoot sr = Math::sqrt;
        double sq = sr.squareRoot(25);
        System.out.println(sq);
    }
}
