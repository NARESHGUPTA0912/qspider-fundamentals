package Java8Features.MethodReference;
import java.util.stream.Stream;

class Even{
    boolean isEven(int num){
        return num % 2 == 0;
    }
}

class GetEvenObject{
    static Even getEven(){
        return new Even();
    }
}

public class Program4 {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(1,2,7,8,3,4,5,6);
        st.filter(GetEvenObject.getEven()::isEven).forEach(System.out::print);
    }
}
