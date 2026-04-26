package Java8Features.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// mix ques of O
// Create a collection of names and print the name which startswith uppercase(Collection may contains null so use Optional class).

public class Program5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Rohit", null, "shivam", "Prince", "shiva", null, "Shobhit", "Rajeev"));

        for(String s: names){
            Optional<String> item = get(s);
            // if(item.isPresent() && s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
            //     System.out.println(s);
            // }else{
            //     System.out.println("Name not startswith uppercase");
            // }
            item.ifPresent((name) -> System.out.print((name.charAt(0) >= 'A' && name.charAt(0) <= 'Z' ) ? name+" " : ""));
        }
    }

    public static Optional<String> get(String name){
        return Optional.ofNullable(name);
    }
}
