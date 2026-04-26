package Java8Features.Optional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

 // create a array of string and calc. l of everyone(If null is present then avoid nullpointeerexception using optional class)

public class Program2{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(Arrays.asList("Rohit", null, "Shivam", "Prince", "Shiva", null));
        for(String s: list){
            Optional<String> len = getLength(s);
            if(len.isPresent())
                System.out.println(len.get().length());
            else
                System.out.println("Length Cannot Calculate");
        }
    }

    public static Optional<String> getLength(String name){
        return Optional.ofNullable(name);
    }
}


// WAP to written the first even no of two digit from a set using stream