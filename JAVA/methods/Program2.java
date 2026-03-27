public class Program2 {
    public static void add(double a, double b){
        double sum = a+b;
        System.out.println("Sum of " +a+ " and " +b+ " is: " +sum );
    }
    public static void add(double a, double b, double c){
        double sum = a+b+c;
        System.out.println("Sum of " +a+ ", " +b+ " and " +c+ " is: " +sum );
    }
    public static void main(String[] args) {
        System.out.println("Program starts....");
        add(12, 15);
        add(12, 15, 23);
        add(20.5, 27.3, 2.2);
        System.out.println("Program Ends.");
    }
}
