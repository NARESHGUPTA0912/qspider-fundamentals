public class Program5 {
   public static void main(String[] args) {
    
    int a, b, temp;

    a = 10;
    b = 20;

    System.out.println("a & b before swapping: " +a+ " & " +b);

    temp = a;
    a = b;
    b = temp;

    System.out.println("a & b after swapping: " +a+ " & " +b);

   }
}
