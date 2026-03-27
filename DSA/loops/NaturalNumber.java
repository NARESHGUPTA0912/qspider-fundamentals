import java.util.Scanner;

public class NaturalNumber {

    public static int getPower(int number, int power){
        int pow = 1;
        int i = 1;
        while(i<=power){
            pow = number*number;
        }
        return pow;
    }
    public static int getFactorial(int n){
        int i = 1;
        int fact = 1;
        while(i<=n){
            fact *= i;
            i++;
        }
        return fact;
    }
    public static int getSumOfNaturalNumbers(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        return sum;
    }
    public static int getSumOfSeries1(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum += (i*i+1);
            i++;
        }
        return sum;
    }
    public static double getSumOfSeries2(int n){
        double i = 1;
        double sum = 0;
        while(i<=n){
            sum += 1/i;
            i++;
        }
        return sum;
    }
    public static int getSumOfSquaresOfNaturalNumbers(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum += i*i;
            i++;
        }
        return sum;
    }
    public static int getSumOfNaturalEvenNumbers(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            if(i%2==0){
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int sum = getSumOfNaturalNumbers(x);
            System.out.println("The sum of Natural numbers upto " + x + " is: "+ sum);
            sum = getSumOfNaturalEvenNumbers(x);
            System.out.println("The sum of Natural Even numbers upto " + x + " is: "+ sum);
            sum = getSumOfSquaresOfNaturalNumbers(x);
            System.out.println("The Sum of Squares of Natural numbers upto " + x + " is: "+ sum);
            sum = getSumOfSeries1(x);
            System.out.println("The Sum of Series1 numbers upto " + x + " is: "+ sum);
            System.out.println("The Sum of Series2 numbers upto " + x + " is: "+ getSumOfSeries2(x));
            System.out.println("The Factorial of number upto " + x + " is: "+ getFactorial(x));
            System.out.println("The Power of given number " + x + " is: "+ getPower(6,3));
        }
    }
}
