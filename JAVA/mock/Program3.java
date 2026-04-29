package mock;

// WAP to print 1 to 10 numbers and print 7 is two times withour=t nesting
public class Program3 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==7)
                System.out.println(i);
            System.out.println(i);
        }
    }
}
