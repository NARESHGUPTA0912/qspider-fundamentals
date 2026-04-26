package Java8Features.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertUpperCase {

    public static void main(String[] args) {
        // Stream<Character> list = Stream.of('w','e','d','f','a','#','r','c');
        //     list.map();

        List<Character> list = new ArrayList<>(
                Arrays.asList('w', 'e', 'd', 'f', 'a', '#', 'r', 'c'));
        // way-1
        list.stream().map(c -> Character.toUpperCase(c)).forEach((c) -> System.out.println(c));

        // way-2
        list.stream().map(n -> {
            if (Character.isLowerCase(n)) {
                return (char) (n - 32); 
            }else {
                return n;
            }
        }).forEach(c -> System.out.println(c));
    }
}
