public class Program3 {
    public static void main(String[] args) {
        int n = 5783;
        int digit1 = n%10;
        System.out.println(digit1);
        int digit2 = (n/10)%10;
        System.out.println(digit2);
        int digit3 = (n/100)%10;
        System.out.println(digit3);
        int digit4 = (n/1000)%10;
        System.out.println(digit4);

    }
}
