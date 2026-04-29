package Java8Features.Stream_API;
import java.util.Arrays;
import java.util.stream.Stream;

// Sort Students based on their id and name using stream Api.
public class SortStudent {

    String name;
    int id;

    public SortStudent(int id, String name) {
        this.id  = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "StudentID: " + id + ", Student Name: " + name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SortStudent s = (SortStudent) o;
        return this.id == s.id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }

    public static void main(String[] args) {
        SortStudent s1 = new SortStudent(1, "Prince");
        SortStudent s2 = new SortStudent(3, "Alice");
        SortStudent s3 = new SortStudent(2, "Eve");
        SortStudent s4 = new SortStudent(6, "Kelly");
        SortStudent s5 = new SortStudent(7, "Shivam");
        SortStudent s6 = new SortStudent(5, "BEerBiceps");
        SortStudent s7 = new SortStudent(4, "Shobhit");

        Arrays.asList(s1, s2, s3, s4, s5, s6, s7).stream().sorted((a,b) -> b.id - a.id).forEach(System.out::println);
        System.out.println("-----------------------------------");
        Stream.of(s1, s2, s3, s4, s5, s6, s7).sorted((a,b) -> a.name.compareTo(b.name)).forEach(System.out::println);
    }
}