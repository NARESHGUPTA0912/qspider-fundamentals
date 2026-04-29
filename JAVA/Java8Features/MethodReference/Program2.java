package Java8Features.MethodReference;
interface PrintClone {
    void printClone(String s);
}
// Method Reference to Static Method
public class Program2 {
    public static void main(String[] args) {
        PrintClone pc = System.out::println;
        pc.printClone("Println Clone");
    }
}
