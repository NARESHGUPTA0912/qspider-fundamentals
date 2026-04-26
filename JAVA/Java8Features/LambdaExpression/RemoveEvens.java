package Java8Features.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEvens {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 34, 56, 33, 22, 55, 78));
        list.removeIf((num) -> num%2 == 0);
        list.forEach((num) -> System.out.println(num));
    }
}
