package InbuiltMethods;

public class RandomNumber {
    public static void main(String[] args) {

        int min = 1001;
        int max = 9999;

        // int random = (int) (Math.random()*1000); // it'll print 0-1000 random no.
        int random = (int) (Math.random()*(max-min)); // it'll print random no in range.
        random += min;
        System.out.println(random);
    }
}
