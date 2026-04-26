package Java8Features.Optional;
import java.util.Optional;

public class Program1 {
    
    public static Optional<Integer> val(){
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        Integer a;
        Optional<Integer> i = val();
        System.out.println(i);
        Integer b = 20;

        if(i.isPresent()){
            
            a = i.get();
            Integer result = Integer.compare(a, b);
            System.out.println(result);

            Optional op = val();
            System.out.println(op.get());
        }
    }
}
