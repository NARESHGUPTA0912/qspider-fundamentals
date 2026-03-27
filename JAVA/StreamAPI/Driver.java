package StreamAPI;

public class Driver {
    public static void main(String[] args) {
        Calculate sq = n -> System.out.println(n +" square is " + n*n);
        Calculate factors = n -> {
            int fact = 1;
            for(int i=1; i<=n; i++){
                fact *= i;
            }
            System.out.println(n + " != " + fact);
        };
        sq.get(8);
        factors.get(5);

    }
}
