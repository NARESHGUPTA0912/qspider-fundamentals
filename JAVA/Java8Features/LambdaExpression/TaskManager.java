package Java8Features.LambdaExpression;

public class TaskManager {
    public static void main(String[] args) {
        Countable c = (l)->{
            int m = 0;
            while(l!=0){
                l/=10;
                m++;
            }
            return m;
        };

        Power p = (m, n) -> {
            System.out.println(Math.pow(m, n.count(m)));
        };
        p.power(12, c);
    }
}
