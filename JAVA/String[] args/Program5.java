public class Program5 {
    public static void main(String[] args) {

        String s = "Prince is Here";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);

        // dierect use length() fun with string
        System.out.println("Prince".length());

        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException
        System.out.println(s.charAt(20));
    }
}
