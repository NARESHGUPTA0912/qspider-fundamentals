package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestCricketers {

    static class SortsCricketer implements Comparator<Cricketers>{

        @Override
        public int compare(Cricketers c1, Cricketers c2){
            return (Integer) (c1.strikeRate - c2.strikeRate) ;
        }
    }

    static class Runs implements Comparator<Cricketers>{
        @Override
        public int compare(Cricketers c1, Cricketers c2){
            return (Integer) (c1.runs - c2.runs) ;
        }
    }

    public static void main(String[] args){
        List<Cricketers> list = Arrays.asList(
            new Cricketers("Rohit", 1234, 189.00),
            new Cricketers("Virat", 2192, 167.00),
            new Cricketers("Hardik", 1331, 162.00),
            new Cricketers("Sachin", 1479, 143.00),
            new Cricketers("Abhishek", 1584, 179.00)

            System.out.println(list);

        );
    }
}
