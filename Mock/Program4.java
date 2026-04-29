public class Program4 {
    public static void main(String[] args) {
        printSquareRoot(1);
    }

    public static void printSquareRoot(int num) {
        if (num <= 100) {
            System.out.println("√" + num + " = " + sqrt((double) num));
            printSquareRoot(num + 1);
        }
    }

    public static double sqrt(double x) {
        if (x < 0) return Double.NaN;
        if (x == 0) return 0;

        double guess = x;  // initial guess

        // iterate until convergence
        while (Math.abs(guess - x / guess) > 1e-12) {
            guess = (guess + x / guess) / 2;
        }

        return guess;
    }

}