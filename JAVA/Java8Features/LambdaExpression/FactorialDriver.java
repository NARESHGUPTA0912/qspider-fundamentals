package Java8Features.LambdaExpression;

public class FactorialDriver {
    public static void main(String[] args) {
            Fact f = (num) -> {
                int p = 1;
                for(int i=1; i<=num; i++){
                    p = p*i;
                }
                return p;
            };
            System.out.println(f.factorial(5));
    }

}
