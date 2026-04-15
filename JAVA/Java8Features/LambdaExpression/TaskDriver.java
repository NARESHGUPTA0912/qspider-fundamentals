package Java8Features.LambdaExpression;

public class TaskDriver {
    public static void main(String[] args) {
        Task t = () -> System.out.println("Hello");

        t.value();
    }
}
